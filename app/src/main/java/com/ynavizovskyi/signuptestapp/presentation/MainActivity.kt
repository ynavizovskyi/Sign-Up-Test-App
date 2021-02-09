package com.ynavizovskyi.signuptestapp.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ynavizovskyi.signuptestapp.R
import com.ynavizovskyi.signuptestapp.presentation.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

    }

}