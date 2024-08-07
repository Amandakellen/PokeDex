package com.example.pokedex.presentation.navigation.onboarding

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.pokedex.presentation.navigation.NavTarget
import com.example.pokedex.presentation.screen.views.onboarding.OnboardingScreen

fun NavGraphBuilder.OnboardingGraph(popBackStack: () -> Unit) {
    navigation(
        startDestination = NavTarget.Onboarding.label,
        route = NavTarget.RootModule.label
    ) {
        composable(NavTarget.Onboarding.label) {
            OnboardingScreen()
        }
    }
}