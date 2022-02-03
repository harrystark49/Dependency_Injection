package com.example.dependency_injection

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
//installIn is similar to scope
//SingletonComponent is alive as long as application is alive
@InstallIn(SingletonComponent::class)
object AppModules {

    @Provides
    @Singleton
    @Named("getdata")
    fun getdata():String="String2 Dependency Injection data"


}
