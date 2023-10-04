package com.example.viewmodeldeepdive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.viewmodeldeepdive.ui.theme.ViewModelDeepDiveTheme

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<ContactsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewModelDeepDiveTheme {
                /*
                val viewModel = viewModel<ContactsViewModel>(
                factory = object: ViewModelFactory.Factory {
                    override fun create
                    return HelloWorld = "Hello"
                    ) as T

                 }
                */
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = viewModel.backgroundColor
                ) {
                   
                    Button(onClick = {
                        viewModel.changeBackground()
                    }) {
                            Text("Change color")
                    }
                }
            }
        }
    }
}
// We need the ViewModel Factory when we declare a class that extends a ViewModel class of android
//and have the constructors.
//
// Code is written above.
