package com.example.projetofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetofragments.fragments.PrimeiroFragment
import com.example.projetofragments.fragments.SegundoFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

            supportFragmentManager.beginTransaction()
                .replace(R.id.container1, PrimeiroFragment())
                .commitNow()


        supportFragmentManager.beginTransaction()
            .replace(R.id.container2, SegundoFragment())
            .commitNow()

        
    }
}