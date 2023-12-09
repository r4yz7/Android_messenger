package com.example.meeting3_chat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            if (!isLogin()){
                buttonClickLogin(null);
            }
            else{
                val intent = Intent(this,ChatActivity::class.java);
                startActivity(intent);
                finish();
            }
        },3000);


    }

    fun buttonClickRegister(view: View){
        val intent = Intent(this,RegisterActivity::class.java);
        startActivity(intent);
        finish();
    }
    fun buttonClickLogin(view: View?){
        val intent = Intent(this, LoginActivity::class.java);
        startActivity(intent);
        finish();
    }

    fun isLogin():Boolean{
        return true;
    }
}