package com.example.myfirstappbp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername:EditText = findViewById(R.id.et_email)
        val btnLogin:Button = findViewById(R.id.btn_login)
        val btnDaftar:Button = findViewById(R.id.btn_daftar)

        btnLogin.setOnClickListener {
            // 1. Mengambil data dari EditText
            val username = etUsername.text.toString()

            // 2. Membuat Intent untuk pindah ke HomeActivity
            val intent = Intent(this, HomeActivity::class.java)

            // 3. Menambahkan data ke Intent
            intent.putExtra("EXTRA_USERNAME", username)

            // 4. Menjalankan Intent
            startActivity(intent)
        }

        btnDaftar.setOnClickListener {
            // 1. Membuat Intent untuk pindah ke RegisterActivity
            val intent = Intent(this, RegisterActivity::class.java)

            // 2. Menjalankan Intent
            startActivity(intent)
        }

    }
}