package com.example.pokedex.presentation.screen.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.R
import com.example.pokedex.ui.theme.PokedexTheme
import com.example.pokedex.ui.theme.lightScheme

@Composable
fun OnboardingScreen() {

    Scaffold(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = lightScheme.primaryContainer)
                .padding(it),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Image(
                modifier = Modifier.size(200.dp),
                painter = painterResource(R.drawable.pokedex),
                contentDescription = null
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview() {
    PokedexTheme {
        OnboardingScreen()
    }
}



