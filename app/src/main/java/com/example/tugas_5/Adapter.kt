package com.example.tugas_5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.menu.view.*
import kotlinx.android.synthetic.main.menu.view.*
import java.nio.file.Files.list
import java.util.Collections.list

class HeroAdapter(private val heroes: List<hero>,
                  private val adapterOnClick: (hero) -> Unit) : RecyclerView.Adapter<HeroAdapter.HeroHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): HeroHolder {
        return HeroHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.menu, viewGroup, false))
    }

    override fun getItemCount(): Int = heroes.size

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.bindHero(heroes[position])
    }

    inner class HeroHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindHero(hero: hero) {
            itemView.apply {
                lbList.text = hero.name
                Picasso.get().load(hero.image).into(imageHero)

                setOnClickListener {
                    adapterOnClick(hero)
                }
            }
        }
    }
}