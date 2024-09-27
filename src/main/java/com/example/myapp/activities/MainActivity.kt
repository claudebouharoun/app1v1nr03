
package com.example.myapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Navigate to Customer Management screen
        button_login.setOnClickListener {
            val intent = Intent(this, CustomerActivity::class.java)
            startActivity(intent)
        }
    }
}
