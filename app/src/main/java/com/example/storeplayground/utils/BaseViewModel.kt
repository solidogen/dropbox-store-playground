package com.example.storeplayground.utils

import android.util.Log
import androidx.lifecycle.ViewModel

val Any.TAG: String
    get() = this::class.java.simpleName

abstract class BaseViewModel : ViewModel() {

    init {
        Log.d(TAG, "vm init")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "vm cleared")
    }
}