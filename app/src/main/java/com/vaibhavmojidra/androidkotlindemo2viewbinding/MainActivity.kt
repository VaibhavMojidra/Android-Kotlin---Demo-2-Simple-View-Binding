package com.vaibhavmojidra.androidkotlindemo2viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vaibhavmojidra.androidkotlindemo2viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addButton.setOnClickListener {
            val num1=binding.num1EditTextNumber.text.toString().toInt()
            val num2=binding.num2EditTextNumber.text.toString().toInt()
            binding.resultTextView.text="Result: ${num1+num2}"
        }
    }
}