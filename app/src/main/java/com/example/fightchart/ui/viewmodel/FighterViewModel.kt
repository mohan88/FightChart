package com.example.fightchart.ui.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.example.fightchart.data.UfcRepository
import com.example.fightchart.model.Fighter
import com.example.fightchart.util.NonNullMediatorLiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class FighterViewModel : ViewModel() {

    private val _fighters = NonNullMediatorLiveData<List<Fighter>>()
    val _error = NonNullMediatorLiveData<String>()

    val fighters: LiveData<List<Fighter>> get() = _fighters
    val error: LiveData<String> get() = _error


    private var fightersJob: Job? = null

    init {
        initGetFightersCall()
    }

    // 3
    private fun initGetFightersCall() {
        fightersJob = GlobalScope.launch(Dispatchers.IO) {
            try {
                val result = UfcRepository.getFighters()
                _fighters.postValue(result)
            } catch (exception: Throwable) {
                _error.postValue(exception.message)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        fightersJob?.cancel()
    }
}