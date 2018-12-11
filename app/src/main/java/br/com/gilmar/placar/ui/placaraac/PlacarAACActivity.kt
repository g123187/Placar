package br.com.gilmar.placar.ui.placaraac

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.gilmar.placar.R
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarAACActivity : AppCompatActivity() {

   lateinit var placarAACAViewModel: PlacarAACViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placaraac)

        placarAACAViewModel = ViewModelProviders
                .of(this).get(PlacarAACViewModel::class.java)

        registraObservers()
        bt3PontosTimeB.setOnClickListener {
            placarAACAViewModel.adicionaPontoTimeB(ponto = 3)
        }
        bt2PontosTimeB.setOnClickListener {
            placarAACAViewModel.adicionaPontoTimeB(ponto = 2)

        }
        bt1PontoTimeB.setOnClickListener {
            placarAACAViewModel.adicionaPontoTimeB(ponto = 1)

        }

        bt3PontosTimeA.setOnClickListener {
            placarAACAViewModel.adicionaPontoTimeB(ponto = 3)
        }
        bt2PontosTimeA.setOnClickListener {
            placarAACAViewModel.adicionaPontoTimeB(ponto = 2)

        }
        bt1PontoTimeA.setOnClickListener {
            placarAACAViewModel.adicionaPontoTimeB(ponto = 1)

        }

    }
    private fun registraObservers(){
        placarAACAViewModel.placarA.observe(this, Observer {
            tvPlacarTimeA.text = it.toString()
        })
        placarAACAViewModel.placarB.observe(this, Observer {
            tvPlacarTimeB.text = it.toString()
        })

    }
}