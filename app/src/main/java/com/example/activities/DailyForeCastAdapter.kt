package com.example.activities

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

/// Item passed to list adapter
/// view Holder to bind the item to layout

class DailyForeCastAdapter(): ListAdapter<DailyForecast, DailyForecastViewHolder>(DIFF_CONFIG) {

    /// class method
    companion object{
        val DIFF_CONFIG = object :DiffUtil.ItemCallback<DailyForecast>(){
            override fun areItemsTheSame(oldItem: DailyForecast, newItem: DailyForecast): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(
                oldItem: DailyForecast,
                newItem: DailyForecast
            ): Boolean {
                return oldItem == newItem
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyForecastViewHolder {
        /// create new viewHolder
        // Create new view to repsent each item in list
    }

    override fun onBindViewHolder(holder: DailyForecastViewHolder, position: Int) {
        /// each item  is passed to viewHolder
    }
}
/// take view and pass to parent class
class DailyForecastViewHolder(view: View): RecyclerView.ViewHolder(view){

}