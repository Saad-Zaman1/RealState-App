package com.example.myapplication.dataStorage

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import androidx.appcompat.app.AppCompatActivity

class SharedPrefs(context: Context) {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
    private val editer: Editor = sharedPreferences.edit()

    fun saveString(key: String, value: String) {
        editer.putString(key, value).apply()
    }

    fun saveBoolean(key: String, value: Boolean) {
        editer.putBoolean(key, value).apply()
    }

    fun saveBundle(key: String) {
        
    }


    //Getting Prefs values

    fun getString(key: String, value: String): String {
        return sharedPreferences.getString(key, value) ?: value
    }

//    fun getBoolean(key: String, value: Boolean): Boolean {
//        return sharedPreferences.getBoolean(key, value) ?: value
//    }

    fun clearPrefs() {
        sharedPreferences.edit().clear().apply()
    }
}