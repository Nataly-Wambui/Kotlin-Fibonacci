package com.example.fibonaccinumbers

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fibonaccinumbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val numerics = fibonacciNumbers(100)
        binding.rvNumbers.layoutManager = GridLayoutManager(this, 2)
        val numericAdapter = Fibonacci(numerics)
        binding.rvNumbers.adapter = numericAdapter

    }
    fun fibonacciNumbers(number:Int):List<Int>{
        val numerics = mutableListOf(0, 1)
        while (numerics.size<number){
            numerics.add(numerics[numerics.lastIndex] + numerics[numerics.lastIndex-1])
        }
        return numerics
    }

}