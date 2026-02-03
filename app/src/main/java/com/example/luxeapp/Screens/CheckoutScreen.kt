package com.example.luxeapp.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CheckoutScreen(navController: NavController) {
    var name by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var cardNumber by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Shipping Information", style = MaterialTheme.typography.titleMedium)

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Full Name") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = address,
            onValueChange = { address = it },
            label = { Text("Shipping Address") },
            modifier = Modifier.fillMaxWidth()
        )

        Text("Payment Details", style = MaterialTheme.typography.titleMedium)

        OutlinedTextField(
            value = cardNumber,
            onValueChange = { cardNumber = it },
            label = { Text("Card Number") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                if (name.isNotBlank() && address.isNotBlank() && cardNumber.isNotBlank()) {
                    navController.navigate("payment_success")
                } else {
                    navController.navigate("payment_failed")
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Pay")
        }

    }
}
