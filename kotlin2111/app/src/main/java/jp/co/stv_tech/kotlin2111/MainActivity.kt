package jp.co.stv_tech.kotlin2111


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var gAdapter: GazouAdapter
    lateinit var gGazouList: ArrayList<Gazou>

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("GazouAdapter", "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val map = Gazou("地図",  R.drawable.map_2)
        val money = Gazou("お金",  R.drawable.money_2)
        val noimage = Gazou("ノーイメージ",  R.drawable.noimage_2)
        val refresh = Gazou("リフレッシュ",  R.drawable.refresh_2)
        val time = Gazou("時間",  R.drawable.time_2)
        val train = Gazou("電車",  R.drawable.train_2)
        gGazouList = arrayListOf(map, money, noimage, refresh, time, train)

        val recyclerView = findViewById<RecyclerView>(R.id.lvGazou)

        recyclerView.layoutManager = LinearLayoutManager(this)

        gAdapter = GazouAdapter(gGazouList)
        recyclerView.adapter = gAdapter
    }
}
