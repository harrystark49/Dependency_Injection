package com.example.dependency_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


//if any error comes regarding AndroidstartingPoint check build gradle properties

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    @Named("getdata")
    lateinit var data:String

    private val viewmodel:TestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("data","$data")
        viewmodel
    }
}