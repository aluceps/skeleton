package me.aluceps.skeleton.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.aluceps.skeleton.R
import me.aluceps.skeleton.databinding.ActivityMainBinding
import me.aluceps.skeleton.ui.util.replaceFragment
import me.aluceps.skeleton.ui.util.setContentView

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        setContentView<ActivityMainBinding>(R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(false)
            title = "Skeleton App"
        }
        replaceFragment(MainFragment.newInstance())
    }
}
