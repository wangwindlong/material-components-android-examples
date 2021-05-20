package io.material.materialthemebuilder.ui.toolbar

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import io.material.materialthemebuilder.R


class ToolbarActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toolbar_activity)
        val toolbar:Toolbar = findViewById(R.id.material_toolbar)
        setSupportActionBar(toolbar)
        toolbar.title = "你好啊"
        toolbar.setNavigationOnClickListener { finish() }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.top_app_bar_menu, menu);
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Log.d("aaa", "onOptionsItemSelected item=$item")
        Toast.makeText(this, item.title, Toast.LENGTH_LONG).show()
        return when (item.itemId) {
            R.id.top_app_bar_menu_share -> {
                Log.d("aaa", "onOptionsItemSelected top_app_bar_menu_share")
                true
            }
            R.id.top_app_bar_menu_bookmark -> {
                Log.d("aaa", "onOptionsItemSelected top_app_bar_menu_bookmark")
                true
            }
            R.id.top_app_bar_menu_search -> {
                Log.d("aaa", "onOptionsItemSelected top_app_bar_menu_search")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}