package com.example.myfirstappbp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val rg_jenia_kelamin: RadioGroup = findViewById(R.id.rg_jenis_kelamin)
        val sp_domisili: Spinner = findViewById(R.id.sp_domisili)
        val cb_setuju: CheckBox = findViewById(R.id.cb_setuju)
        val btn_registrasi: Button = findViewById(R.id.btn_submit_register)
        val btn_kembali: Button = findViewById(R.id.btn_kembali)

        btn_registrasi.setOnClickListener {
            val gender_terpililh = rg_jenia_kelamin.checkedRadioButtonId
            val jenis_kelamin = when (gender_terpililh){
                R.id.rb_pria -> "Pria"
                R.id.rb_wanita -> "Wanita"
                else -> "Jenis Kelamin belum dipilih"
            }

            val user_setuju = cb_setuju.isChecked
            val domisili = sp_domisili.selectedItem.toString()

            Toast.makeText(
                this, "Jenis Kelamin : $jenis_kelamin, Domisili : $domisili, Setuju : $user_setuju", Toast.LENGTH_SHORT
            ).show()
        }

        btn_kembali.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}