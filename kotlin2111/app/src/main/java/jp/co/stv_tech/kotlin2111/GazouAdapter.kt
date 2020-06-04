package jp.co.stv_tech.kotlin2111

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class GazouAdapter(private val gazouList: ArrayList<Gazou>): RecyclerView.Adapter<GazouAdapter.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val lvGazouView: ImageView
        val tvGazouName: TextView

        init {
            lvGazouView = view.findViewById(R.id.lvGazouView)
            tvGazouName = view.findViewById(R.id.tvGazouName)

        }
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.row, viewGroup, false)
        return ViewHolder(view)
        Log.i("GazouAdapter", "onCreateViewHolder")
    }


    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        Log.i("GazouAdapter", "onBindViewHolder")
        val gazou = gazouList[position]

        viewHolder.lvGazouView.setImageResource(gazou.imageId)
        viewHolder.tvGazouName.text = gazou.name

    }


    override fun getItemCount() = gazouList.size

}