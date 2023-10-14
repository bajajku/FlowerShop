package sheridan.bajajku.flowershop.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import sheridan.bajajku.flowershop.ui.flower_list.FlowerListScreen

import sheridan.bajajku.flowershop.ui.flower_list.FlowerListViewModel


@Composable
fun AppScreen(){
    val viewModel: FlowerListViewModel = viewModel()

    FlowerListScreen(viewModel)
}