package sheridan.bajajku.flowershop.ui.flower_list

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import sheridan.bajajku.flowershop.data.local.fakeFlowerList

class FlowerListViewModel: ViewModel()
{
    private val _uiState: MutableState<flowerListUiState> = mutableStateOf(flowerListUiState.Loaded( fakeFlowerList))

    val uiState: State<flowerListUiState> = _uiState
}