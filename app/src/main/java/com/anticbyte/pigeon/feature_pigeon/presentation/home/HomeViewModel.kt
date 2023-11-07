package com.anticbyte.pigeon.feature_pigeon.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anticbyte.pigeon.feature_pigeon.domain.use_case.PigeonUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val pigeonUseCases: PigeonUseCases
) : ViewModel() {
    private val _homeUiState = MutableStateFlow(HomeUiState())
    val homeUiState: StateFlow<HomeUiState> = _homeUiState.asStateFlow()


    init {
        viewModelScope.launch {
            getSomeNews()
        }
    }

    private suspend fun getSomeNews() {
        _homeUiState.update {
            it.copy(news = pigeonUseCases.getAllNews(), status = false)
        }
    }


//    init {
//        viewModelScope.launch {
//
//            getAllNews()
//        }
//    }
//
//    private suspend fun getAllNews() {
//        viewModelScope.launch {
//            _homeUiState.update {
//                it.copy(news = pigeonUseCases.getAllNews(), status = false)
//            }
//        }
//    }
}