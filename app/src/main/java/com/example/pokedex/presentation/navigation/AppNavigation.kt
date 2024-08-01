package com.example.pokedex.presentation.navigation

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pokedex.presentation.screen.views.onboarding.OnboardingScreen

@Composable
fun AppNavigation(
    navController: NavHostController
) {
    Surface {
        NavHost(navController = navController, startDestination = OnboardingScreen.Start.route) {
            composable(OnboardingScreen.Start.route) {
                    OnboardingScreen()
//            }
//            composable(
//                route = "${Screen.Suggestion.route}/?productName={productName}&productDescription={productDescription}&imageUri={imageUri}",
//                arguments = listOf(
//                    navArgument("productName") {
//                        type = NavType.StringType
//                        nullable = true
//                        defaultValue = ""
//                    },
//                    navArgument("productDescription") {
//                        type = NavType.StringType
//                        nullable = true
//                        defaultValue = ""
//                    },
//                    navArgument("imageUri") {
//                        type = NavType.StringType
//                        nullable = true
//                        defaultValue = ""
//                    }
//                )
//            ) { backStackEntry ->
//                val productName = backStackEntry.arguments?.getString("productName", "") ?: ""
//                val productDescription =
//                    backStackEntry.arguments?.getString("productDescription", "") ?: ""
//                val imageUriString = backStackEntry.arguments?.getString("imageUri", "") ?: ""
//                val imageUri = Uri.parse(imageUriString)
//
//                SuggestionScreen(productName, productDescription, imageUri, navController)
//            }
//
//            composable(Screen.ConfirmRegister.route) {
//                ConfirmScreen()
//            }

            }
        }
    }
}


sealed class OnboardingScreen(val route: String) {
    object Start : OnboardingScreen("start")
}