package com.example.dependency_injection

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object MainModule {
    //to get data from string xml
    @Provides
    @Singleton
    @Named("getdata2")
    fun getdata2(
        @ApplicationContext context: Context,
        @Named("getdata1") data:String
    ):String{
       var s:String=" ${context.getString(R.string.String2)} - ${data}"
        return s
    }
}