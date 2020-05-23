package jp.co.stv_tech.test2113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentList = arrayListOf<Fragment>(
            test1Fragment(),
            test2Fragment(),
            test3Fragment()
        )
        val adapter = testAdapter(supportFragmentManager, fragmentList)

        viewPager.adapter = adapter
    }
}
