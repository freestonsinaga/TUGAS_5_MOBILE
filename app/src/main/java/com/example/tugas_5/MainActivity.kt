package com.example.tugas_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listHeroes = listOf(
            hero(name = "Black Panther", image = "https://i.annihil.us/u/prod/marvel/i/mg/1/c0/537ba2bfd6bab/standard_xlarge.jpg"),
            hero(name = "Captain America", image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.FRUo-1Y8ZS5e-_sn8OeJRwHaIV%26pid%3DApi&f=1"),
            hero(name = "Iron Man", image = "https://i.annihil.us/u/prod/marvel/i/mg/6/a0/55b6a25e654e6/standard_xlarge.jpg"),
            hero(name = "Spider-Man", image = "https://i.annihil.us/u/prod/marvel/i/mg/9/30/538cd33e15ab7/standard_xlarge.jpg"),
            hero(name = "Dead Pool", image = "https://i.annihil.us/u/prod/marvel/i/mg/5/c0/537ba730e05e0/standard_xlarge.jpg"),
            hero(name = "Captain Marvel", image = "https://i.annihil.us/u/prod/marvel/i/mg/c/10/537ba5ff07aa4/standard_xlarge.jpg"),
            hero(name = "Ant Man", image = "https://i.annihil.us/u/prod/marvel/i/mg/6/90/54ad7297b0a59/standard_xlarge.jpg"),
            hero(name = "Hulk", image = "https://seeklogo.com/images/H/hulk-logo-B465FF52A2-seeklogo.com.png"),
            hero(name = "Black Widow", image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.M_pLTaqXPjb4MpRIQXDSJAAAAA%26pid%3DApi&f=1"),
            hero(name = "Doctor Strange", image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.CpqjG9gTB8fsIsOw-JUlngHaIi%26pid%3DApi&f=1"),
            hero(name = "", image = ""),
            hero(name = "", image = "")
        )

        val heroesAdapter = HeroAdapter(listHeroes) { hero ->
            Toast.makeText(this, "Anda memilih ${hero.name}", Toast.LENGTH_SHORT).show()
        }

        mRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = heroesAdapter
        }
    }

}