package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                BusinessCardScreen()
            }
        }
    }
}

@Composable
fun BusinessCardScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.businesscard),
                contentDescription = "Business Card Background",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "MengXiao Zhu",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Yellow
                )
                Text(
                    text = "Mobile Application",
                    fontSize = 24.sp,
                    color = Color.DarkGray
                )
                Text(
                    text = "Email: Mengxiao.Zhu@cix.csi.cuny.edu",
                    fontSize = 20.sp,
                    color = Color.Gray
                )
                Text(
                    text = "Phone: (929) 289-7698",
                    fontSize = 20.sp,
                    color = Color.Gray
                )
            }
        }
    }
}
