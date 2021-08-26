package com.hefesto.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)  // OnCreate inicia uma activity //
        setContentView(R.layout.activity_main)
        shouldDisplayEmptyView(isEmpty = false) //função
    }

    fun shouldDisplayEmptyView(isEmpty: Boolean) {

    //    val visibility:Int = if (isEmpty) View.VISIBLE else View.GONE
        //    emptyView.visibility = visibility

    } //iteração com layout imagem e texto

    class PokemonAdapter(private val pokemons: List<String>): RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {
        class PokemonViewHolder(ItemViewer: View): RecyclerView.ViewHolder(ItemViewer)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
            TODO("Not yet implemented")
        }

        override fun getItemCount(): Int {

            return pokemons.size
        }

        override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
            TODO("Not yet implemented")
        }
    }

}

