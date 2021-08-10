package com.example.projetofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.projetofragments.fragments.PrimeiroFragment
import com.example.projetofragments.fragments.SegundoFragment

class MainActivity : AppCompatActivity() {

    private var tipoFragment = TipoFragment.PRIMEIRO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

           findViewById<Button>(R.id.buttonChangeFrag).apply{
               setOnClickListener{
                   if (tipoFragment == TipoFragment.PRIMEIRO){
                       replaceFrag(PrimeiroFragment())
                       tipoFragment = TipoFragment.SEGUNDO
                   }else if(tipoFragment == TipoFragment.SEGUNDO){
                       replaceFrag(SegundoFragment())
                       tipoFragment = TipoFragment.PRIMEIRO
                   }
               }
           }

    }
    private fun replaceFrag(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}

enum class TipoFragment{
    PRIMEIRO,
    SEGUNDO
}