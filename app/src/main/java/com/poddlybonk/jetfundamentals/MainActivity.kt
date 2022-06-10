package com.poddlybonk.jetfundamentals

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.poddlybonk.jetfundamentals.app.JetFundamentalsApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)

        setContent {
            JetFundamentalsApp()
        }
    }
}
