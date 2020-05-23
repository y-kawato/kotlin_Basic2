package jp.co.stv_tech.test2113

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class testAdapter(fm: FragmentManager, private val fragmentList: List<Fragment>) :
    FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {


    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }


    override fun getCount(): Int {
        return fragmentList.size
    }
}