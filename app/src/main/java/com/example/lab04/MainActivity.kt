package com.example.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab04.ui.theme.LAB04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LAB04Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ViewHolaCurso()
                }
            }
        }
    }
}

@Composable
fun ViewHolaCurso() {
    Box(modifier = Modifier.fillMaxSize()) {
        // Fondo espacial
        Image(
            painter = painterResource(id = R.drawable.julio23),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Títulos solicitados en la guía
            Text(
                text = "Welcome to the Course!",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = androidx.compose.ui.graphics.Color.White
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Hello, Student!",
                fontSize = 20.sp,
                color = androidx.compose.ui.graphics.Color.White
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Tu imagen del cohete
            Image(
                painter = painterResource(id = R.drawable.julio23),
                contentDescription = null,
                modifier = Modifier.size(200.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Botón de contacto
            Button(onClick = { }) {
                Text("Contactarse con TIERRA")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHolaCurso() {
    LAB04Theme {
        ViewHolaCurso()
    }
}