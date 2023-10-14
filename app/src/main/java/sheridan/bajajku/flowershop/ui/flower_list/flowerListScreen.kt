package sheridan.bajajku.flowershop.ui.flower_list

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import sheridan.bajajku.flowershop.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FlowerListScreen(
    viewModel: FlowerListViewModel,
    modifier: Modifier = Modifier
){
    val state: State<flowerListUiState> = viewModel.uiState
    val uiState: flowerListUiState = state.value

    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()

    Scaffold(modifier = modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            FlowerDataTopAppBar(
                title = stringResource(R.string.list_title),
                canNavigateBack = false,
                scrollBehavior = scrollBehavior
            )
        }
    ) { innerPadding ->
        when (uiState) {
            is flowerListUiState.Loaded -> ListBody(
                flowerList = uiState.flowers,
                modifier = modifier.padding(innerPadding)
            )
        }
    }
}