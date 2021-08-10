package com.example.projetofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.projetofragments.fragments.ListaFragment
import com.example.projetofragments.fragments.PrimeiroFragment
import com.example.projetofragments.fragments.SegundoFragment
import com.example.projetofragments.model.AdapterList
import com.example.projetofragments.model.Produto

class MainActivity : AppCompatActivity() {

    private var tipoFragment = TipoFragment.PRIMEIRO


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        findViewById<Button>(R.id.buttonChangeFrag).apply {
            setOnClickListener {
                if (tipoFragment == TipoFragment.PRIMEIRO) {
                    replaceFrag(PrimeiroFragment())
                    tipoFragment = TipoFragment.SEGUNDO
                } else if (tipoFragment == TipoFragment.SEGUNDO) {
                    replaceFrag(SegundoFragment())
                    tipoFragment = TipoFragment.PRIMEIRO
                }
            }
        }
        findViewById<Button>(R.id.buttonChangeLista).apply{
            setOnClickListener{
                replaceFrag(ListaFragment())
            }
        }


    }

    private fun replaceFrag(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }

}

enum class TipoFragment {
    PRIMEIRO,
    SEGUNDO
}