package ru.givemesomecoffee.compose

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun MainScreen(navController: NavController){
    val viewModel: MainViewModel = viewModel()
    val text by viewModel.uiState.collectAsState()
    Box{
        Text(text.data ?: "")
    }
    viewModel.refreshState()
    Log.d("custom", text.data.toString())
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun MainScreenPreview(){
    MainScreen(navController = rememberNavController())
}