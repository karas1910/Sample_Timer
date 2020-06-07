package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.util.Timer
import java.util.TimerTask
import kotlin.concurrent.scheduleAtFixedRate

class MainViewModel : ViewModel() {
    private val timer = Timer()
    private val timerTask: TimerTask.() -> Unit = {
        viewModelScope.launch {

        }
    }
    private val _time = MutableLiveData<Int>(0)
    val time: LiveData<Int>
        get() = _time



    fun startTimer() {
        timer.scheduleAtFixedRate(0, 100, timerTask)
    }
}