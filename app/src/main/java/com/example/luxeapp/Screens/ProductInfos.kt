package com.example.luxeapp.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.luxeapp.data.ProductsData

@Composable
fun ProductInfo(navController: NavController, productId: Int) {

    val product = ProductsData.productList.first { it.id == productId }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = product.imageRes),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(product.name, style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text("Price: ${product.price} MAD")

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = product.description
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = { navController.navigate("checkout") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Buy Now")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Back to products",
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.clickable {
                navController.popBackStack()
            }
        )
    }
}