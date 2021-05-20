package io.material.materialthemebuilder.ui.toolbar

import android.os.Bundle
import android.os.PersistableBundle
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
    }

}