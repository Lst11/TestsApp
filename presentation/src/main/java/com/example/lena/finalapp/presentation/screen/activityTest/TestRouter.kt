package com.example.lena.finalapp.presentation.screen.activityTest

import android.content.Intent
import com.example.lena.finalapp.presentation.base.BaseRouter
import com.example.lena.finalapp.presentation.screen.MainActivity

class TestRouter(activity: TestActivity) : BaseRouter<TestActivity>(activity) {

//    fun goToMenuItem(selectedFragment: Fragment) {
//
//        val fragmentTransition = activity.supportFragmentManager.beginTransaction()
//        fragmentTransition.replace(R.id.container, selectedFragment)
//        fragmentTransition.commit()
//    }

    fun goToFinish(){
        val intent = Intent(activity, FinalActivity::class.java)
//        myIntent.putExtra("key", value)
        activity.startActivity(intent)
    }
}