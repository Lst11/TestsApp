package com.example.lena.finalapp.presentation.screen

import com.example.lena.finalapp.presentation.base.BaseRouter
import android.content.Intent
import com.example.lena.finalapp.presentation.screen.activityTest.FinalActivity


class MainRouter(activity: MainActivity) : BaseRouter<MainActivity>(activity) {

//    fun goToMenuItem(selectedFragment: Fragment) {
//
//        val fragmentTransition = activity.supportFragmentManager.beginTransaction()
//        fragmentTransition.replace(R.id.container, selectedFragment)
//        fragmentTransition.commit()
//    }

    fun goToTest(){
        val intent = Intent(activity, FinalActivity::class.java)
//        myIntent.putExtra("key", value)
        activity.startActivity(intent)
    }
}