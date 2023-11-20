package com.example.patternsexample

import android.widget.Toast

class TextData {
    /** data **/
    private val savedTextsArray = mutableListOf<String>()

    /** logic **/
    private var currentIndex = 0
    private var isFirstValue = true

    fun save(str:String) {
        if (str.isNotEmpty())
            savedTextsArray.add(str)
    }

    fun showSaved(): String {
        var result = ""
        if (isFirstValue) {
            result = savedTextsArray[0]
            isFirstValue = false
        }
        if (currentIndex < savedTextsArray.lastIndex) {
            currentIndex++
            result = savedTextsArray[currentIndex]
        }
        return result
    }
}