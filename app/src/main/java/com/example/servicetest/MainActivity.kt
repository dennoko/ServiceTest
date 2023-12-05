package com.example.servicetest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.servicetest.ui.theme.ServiceTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("lifeCycleTest","MainActivity onCreate() called")

        // AppService starts when the app is launched
        startService(Intent(this, AppService::class.java))

        setContent {
            ServiceTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("lifeCycleTest","MainActivity onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifeCycleTest","MainActivity onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lifeCycleTest","MainActivity onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifeCycleTest","MainActivity onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifeCycleTest","MainActivity onDestroy() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifeCycleTest","MainActivity onRestart() called")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ServiceTestTheme {
        Greeting("Android")
    }
}