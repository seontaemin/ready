package com.example.sooksook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sooksook2.databinding.ActivitySunny1Binding
import kotlin.math.log

class sunnyActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySunny1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySunny1Binding.inflate((layoutInflater))
        setContentView(binding.root)



    }
}