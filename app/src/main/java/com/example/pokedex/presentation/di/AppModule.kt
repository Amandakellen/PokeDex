package com.example.pokedex.presentation.di

import com.example.pokedex.presentation.navigation.Navigator
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule  = module{
    single { Navigator() }
//    single<DallEApi> {
//        getDallEClient()
//    }
//
//    single<GeminiApi> {
//        getGeminiClient()
//    }
//
//    viewModel {
//        ProductViewModel(dallEApi = get(), geminiApi = get())
//    }
}