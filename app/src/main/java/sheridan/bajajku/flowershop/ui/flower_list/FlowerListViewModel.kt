package sheridan.bajajku.flowershop.ui.flower_list

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import sheridan.bajajku.flowershop.data.local.fakeFlowerList
import sheridan.bajajku.flowershop.data.repository.FlowerDataRepository
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class FlowerListViewModel @Inject constructor(
    private val repository: FlowerDataRepository
) : ViewModel() {

    private val _uiState: MutableState<flowerListUiState> =
        mutableStateOf(flowerListUiState.Loading)
    val uiState: State<flowerListUiState> = _uiState

    init {
        loadPetList()
    }

    private fun loadPetList() = viewModelScope.launch {
        //fake loading delay, 2 seconds
        delay(2000)
        try {
            val pets = repository.getAllFlowers()
            _uiState.value = flowerListUiState.Loaded(pets)
        } catch (e: IOException) {
            _uiState.value = flowerListUiState.Error
            e.printStackTrace()
        }
    }

    fun reloadFlowerList() {
        _uiState.value = flowerListUiState.Loading
        loadPetList()
    }

}
