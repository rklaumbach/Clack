package com.example.clack.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.clack.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginLoginBtnClicked (view: View){

    }

    fun loginSignUpBtnClicked (view: View){
        val createUserIntent = Intent(this, CreateUserActivity::class.java)
        startActivity(createUserIntent)

    }
}
