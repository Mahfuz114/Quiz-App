package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {
    lateinit var binding: ActivityPlayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)



        }
    }
