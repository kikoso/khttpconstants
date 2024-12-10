package com.enrique.khttpconstants

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                KHttpConstantsTesterApp()
            }
        }
    }
}

@Composable
fun KHttpConstantsTesterApp() {
    val httpHeaders = HttpHeaders::class.java.fields.map { field ->
        field.name to (field.get(null)?.toString() ?: "null")
    }
    val httpStatusCodes = HttpStatusCodes::class.java.fields.map { field ->
        field.name to (field.get(null)?.toString() ?: "null")
    }

    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        // HTTP Headers Section
        item { SectionHeader("HTTP Headers") }
        items(httpHeaders, key = { it.first }) { (name, value) ->
            ListItem(name = name, value = value)
        }

        // HTTP Status Codes Section
        item { SectionHeader("HTTP Status Codes") }
        items(httpStatusCodes, key = { it.first }) { (name, value) ->
            ListItem(name = name, value = value)
        }
    }
}




@Composable
fun SectionHeader(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.h5,
        modifier = Modifier.padding(vertical = 8.dp)
    )
}

@Composable
fun ListItem(name: String, value: String) {
    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
        Text(
            text = name,
            modifier = Modifier.weight(1f),
            style = MaterialTheme.typography.body1
        )
        Text(
            text = value,
            modifier = Modifier.weight(1f),
            style = MaterialTheme.typography.body2
        )
    }
}
