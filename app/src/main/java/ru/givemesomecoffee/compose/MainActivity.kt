package ru.givemesomecoffee.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainLayout()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainLayout(){
    val mainNavController = rememberNavController()
    Column {
        Text(text = "hello world")
        createNavHost(navController = mainNavController)

    }
}

@Composable
fun createNavHost(navController: NavHostController){
    NavHost(navController = navController, startDestination = Screens.MAIN_SCREEN) {
        composable(Screens.MAIN_SCREEN) { MainScreen(navController) }
    }
}