package com.example.baitap_tuan1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                ProfileScreen()
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Avatar tròn
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = "Avatar",
            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Tên
        Text(
            text = "Hoang Phuc",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF222222)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Địa điểm
        Text(
            text = "082205012379",
            fontSize = 16.sp,
            color = Color(0xFF6B6B6B)
        )
    }
}