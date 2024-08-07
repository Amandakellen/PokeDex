package com.example.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.pokedex.presentation.navigation.NavigationComponent
import com.example.pokedex.presentation.navigation.Navigator
import com.example.pokedex.ui.theme.PokedexTheme
import org.koin.android.ext.android.get


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {
                val navigator = get<Navigator>()
                val navController = rememberNavController()
                //AppNavigation(navController)
                NavigationComponent(navController = navController, navigator = navigator)
            }
        }
    }
}
