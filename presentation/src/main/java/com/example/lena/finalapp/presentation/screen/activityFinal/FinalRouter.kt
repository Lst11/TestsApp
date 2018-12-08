package com.example.lena.finalapp.presentation.screen.activityTest

import android.content.Intent
import com.example.lena.finalapp.presentation.base.BaseRouter
import com.example.lena.finalapp.presentation.screen.MainActivity

class FinalRouter(activity: FinalActivity) : BaseRouter<FinalActivity>(activity) {

//    fun goToMenuItem(selectedFragment: Fragment) {
//
//        val fragmentTransition = activity.supportFragmentManager.beginTransaction()
//        fragmentTransition.replace(R.id.container, selectedFragment)
//        fragmentTransition.commit()
//    }

    fun goToMain(){
        val intent = Intent(activity, MainActivity::class.java)
//        myIntent.putExtra("key", value)
        activity.startActivity(intent)
    }
}