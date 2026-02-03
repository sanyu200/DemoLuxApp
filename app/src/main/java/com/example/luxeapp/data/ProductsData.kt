package com.example.luxeapp.data

import com.example.luxeapp.R
import com.example.luxeapp.models.Product

object ProductsData {

    val productList = listOf(

        Product(
            id = 1,
            brand = "Brand",
            name = "Luxury Leather Crossbody Bag",
            price = 199.0,
            imageRes = R.drawable.img1,
            description = "A premium leather crossbody bag crafted with meticulous attention to detail. Perfect for daily elegance with a timeless silhouette."
        ),

        Product(
            id = 2,
            brand = "Brand",
            name = "Elegant Silk Scarf",
            price = 123.0,
            imageRes = R.drawable.img2,
            description = "A soft and luxurious silk scarf featuring refined patterns. Light, smooth, and perfect for enhancing any look."
        ),

        // 3️⃣ MONTRE (Watch)
        Product(
            id = 3,
            brand = "Brand",
            name = "Classic Gold Watch",
            price = 234.0,
            imageRes = R.drawable.img3,
            description = "A timeless gold watch with a minimalist face design. A perfect blend of sophistication and daily practicality."
        ),

        Product(
            id = 4,
            brand = "Brand",
            name = "Premium Leather Belt",
            price = 125.0,
            imageRes = R.drawable.img4,
            description = "A high-quality leather belt with a polished buckle. Durable, stylish, and designed to elevate any outfit."
        ),

        Product(
            id = 5,
            brand = "Brand",
            name = "Designer Tote Bag",
            price = 345.0,
            imageRes = R.drawable.img5,
            description = "A spacious and structured tote bag crafted from fine materials. Perfect for work, travel, or sophisticated day-to-day wear."
        ),

        Product(
            id = 6,
            brand = "Brand",
            name = "Luxury Leather Gloves",
            price = 125.0,
            imageRes = R.drawable.img6,
            description = "Elegant leather gloves offering comfort and warmth. Soft inner lining and a smooth finish for a classy winter touch."
        )
    )
}
