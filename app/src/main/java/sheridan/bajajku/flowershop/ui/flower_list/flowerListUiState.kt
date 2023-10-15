package sheridan.bajajku.flowershop.ui.flower_list

import sheridan.bajajku.flowershop.domain.Flower

sealed interface flowerListUiState{

    data class Loaded(val flowers: List<Flower>):flowerListUiState

    object Loading: flowerListUiState
    object Error: flowerListUiState

}