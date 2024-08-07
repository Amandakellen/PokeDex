package com.example.pokedex.presentation.navigation

sealed class NavTarget(val label: String) {
    object Onboarding: NavTarget(ModuleRoutes.OnboardingScreen.label)
    object RootModule : NavTarget(ModuleRoutes.RootModule.label)
    object Test: NavTarget(ModuleRoutes.TestScreen.label)
    object TestRoute: NavTarget(ModuleRoutes.TestRoute.label)
}

enum class ModuleRoutes(val label: String){
    RootModule("rootmodule"),
    OnboardingScreen("onboarding"),
    TestScreen("test"),
    TestRoute("route")
}