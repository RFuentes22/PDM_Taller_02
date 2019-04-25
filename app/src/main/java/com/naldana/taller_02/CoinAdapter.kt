package com.naldana.taller_02

import android.os.AsyncTask
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.naldana.taller_02.models.Coin
import com.naldana.taller_02.utilities.NetworkUtils
import kotlinx.android.synthetic.main.list_item_coin.view.*
import java.io.IOException


class CoinAdapter(val items: List<Coin>) : RecyclerView.Adapter<CoinAdapter.ViewHolder>() {

    // TODO: Para contar elementos creados
    private var countViews: Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.app_bar_main, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Coin) = with(itemView) {


        }
    }

    private inner class FetchCoinTask : AsyncTask<String, Void, String>() {

        override fun doInBackground(vararg params: String?): String? {


            val coinAPI = NetworkUtils.buildUrl()

            try {


                return NetworkUtils.getResponseFromHttpUrl(coinAPI!!)
            } catch (e: IOException) {
                e.printStackTrace()
                return ""
            }

        }


        override fun onPostExecute(coinInfo: String?) {


            if (coinInfo != null || coinInfo != "") {
                if (coinInfo != null) {
                   // println(coinInfo)
                }


            }

        }

    }


}