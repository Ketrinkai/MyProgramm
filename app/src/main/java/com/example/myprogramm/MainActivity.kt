package com.example.myprogramm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun replaceFragment(fragment: Fragment) {
            supportFragmentManager.beginTransaction().add(R.id.container, fragment).commit()
        }

        findViewById<Button>(R.id.btn_1).setOnClickListener {
            replaceFragment(Fragment1())
        }

        findViewById<Button>(R.id.btn_2).setOnClickListener {
            replaceFragment(Fragment3())
        }
    }


}
