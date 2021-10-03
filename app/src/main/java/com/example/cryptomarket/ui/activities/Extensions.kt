package com.example.cryptomarket

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.addFragmentToStack(@IdRes containerId: Int, fragment: Fragment){
    val ft = supportFragmentManager.beginTransaction()
    ft.add(containerId, fragment)
    ft.addToBackStack("test")
    ft.commit()
}

fun AppCompatActivity.replaceFragment(@IdRes containerId: Int, fragment: Fragment){
    val ft = supportFragmentManager.beginTransaction()
    ft.replace(containerId, fragment)
    ft.commit()
}