package com.ilham.kuliner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ilham.kuliner.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvMenu: RecyclerView
    private var list: ArrayList<MenuMakanan> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMenu = findViewById(R.id.rv_menu)
        rvMenu.setHasFixedSize(true)

        list.addAll(MenuMakananData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvMenu.layoutManager = LinearLayoutManager(this)
        val listMenuAdapter = ListMenuAdapter(list)
        rvMenu.adapter = listMenuAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }
            R.id.action_grid -> {
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
                showRecyclerCardView()
            }
        }
    }

    private fun showRecyclerGrid() {
        rvMenu.layoutManager = GridLayoutManager(this, 2)
        val gridFilmAdapter = GridMenuAdapter(list)
        rvMenu.adapter = gridFilmAdapter
    }

    private fun showRecyclerCardView() {
        rvMenu.layoutManager = LinearLayoutManager(this)
        val cardViewFilmAdapter = CardViewMenuMakananAdapter(list)
        rvMenu.adapter = cardViewFilmAdapter
    }


}