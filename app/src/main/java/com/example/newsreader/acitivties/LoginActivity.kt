package com.example.newsreader.acitivties

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsreader.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_submit.setOnClickListener {
            intent = Intent(this, ListAcitivity::class.java)
            startActivity(intent)
        }
    }
}
