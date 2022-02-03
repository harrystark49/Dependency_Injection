package com.example.dependency_injection

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("getdata")data:String
):ViewModel() {
    init {
        Log.d("testviewmodel","test for viewmodel $data")
    }
}