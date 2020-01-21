package me.aluceps.skeleton.ui.util

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import me.aluceps.skeleton.R

fun <T : ViewDataBinding> Activity.setContentView(layoutId: Int) =
        DataBindingUtil.setContentView<T>(this, layoutId)


fun AppCompatActivity.replaceFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction()
            .replace(R.id.content, fragment)
            .commit()
}