package com.example.pokedex.presentation.navigation.onboarding

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.pokedex.presentation.navigation.NavTarget
import com.example.pokedex.presentation.navigation.OnboardingScreen
import com.example.pokedex.presentation.screen.views.onboarding.OnboardingScreen
import com.example.pokedex.presentation.screen.views.onboarding.test

fun NavGraphBuilder.TestGraph(popBackStack: () -> Unit) {
    navigation(
        startDestination = NavTarget.Test.label,
        route =  NavTarget.TestRoute.label
    ) {
        composable(NavTarget.Test.label) {
//            val viewModel: ThirdFeatureViewModel = getViewModel()
//            ThirdFeatureView(viewModel, popBackStack)
            test()
        }
    }
}

sealed class TesScreen(val route: String) {
    object Test : TesScreen("test")
}