package ru.givemesomecoffee.compose

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.*

class MainViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(UiState(null))
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    fun refreshState(){
        _uiState.update{it.copy(data = "test")}
    }
}