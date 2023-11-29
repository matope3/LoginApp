package com.example.loginapp.ui.login

import android.app.Activity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.Toast
import com.example.loginapp.databinding.ActivityLoginBinding

import android.widget.Button
import android.widget.TextView

import com.example.loginapp.R

class LoginActivity : AppCompatActivity() {

    private lateinit var emailText: EditText
    private lateinit var passwordText: EditText
    private lateinit var loginBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        emailText = findViewById(R.id.username)
        passwordText = findViewById(R.id.password)
        loginBtn = findViewById(R.id.login)
        loginBtn.setOnClickListener {
            val email = emailText.text.toString()
            val password = passwordText.text.toString()
            if (isValidCredential(email, password)) {
                Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun isValidCredential(email: String, password: String): Boolean {
        return email == "exampleEmail123@gmail.com" && password == "1234567"
    }

}