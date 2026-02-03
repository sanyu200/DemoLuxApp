package com.example.luxeapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.luxeapp.Screens.CheckoutScreen
import com.example.luxeapp.Screens.LoginScreen
import com.example.luxeapp.Screens.PaymentFailedScreen
import com.example.luxeapp.Screens.PaymentSuccessScreen
import com.example.luxeapp.Screens.ProductInfo
import com.example.luxeapp.Screens.ProductListScreen
import com.example.luxeapp.Screens.RegisterScreen
import com.example.luxeapp.Screens.WelcomeScreen

@Composable
fun AppNavigate() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "welcome") {

        composable("welcome") {
            WelcomeScreen(navController)
        }

        composable("login") {
            LoginScreen(navController)
        }

        composable("register") {
            RegisterScreen(navController)
        }

        composable("products_list") {
            ProductListScreen(navController)
        }

        composable(
            "product_details/{productId}",
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("productId") ?: 0
            ProductInfo(navController, id)
        }

        composable("checkout") {
            CheckoutScreen(navController)
        }

        composable("payment_failed") {
            PaymentFailedScreen(navController)
        }

        composable("payment_success") {
            PaymentSuccessScreen()
        }
    }
}
