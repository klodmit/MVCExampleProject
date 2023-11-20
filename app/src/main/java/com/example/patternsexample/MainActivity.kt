package com.example.patternsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.patternsexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val model = TextData()
        binding.submitButton.setOnClickListener {
            val printedText = binding.editText.text.toString()
            model.save(printedText)
        }

        binding.viewTextButton.setOnClickListener {
            val viewedText = model.showSaved()
            if (viewedText.isEmpty())
                Toast.makeText(this, "No texts before showed!", Toast.LENGTH_LONG).show()
            else {
                Toast.makeText(this, viewedText, Toast.LENGTH_LONG).show()
            }
        }

        val view = binding.root
        setContentView(view)

    }
}