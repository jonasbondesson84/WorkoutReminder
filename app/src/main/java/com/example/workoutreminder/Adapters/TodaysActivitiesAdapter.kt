package com.example.workoutreminder.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.workoutreminder.Models.Activity
import com.example.workoutreminder.R

class TodaysActivitiesAdapter(val context: Context, private val todaysActivities: MutableList<Activity>): RecyclerView.Adapter<TodaysActivitiesAdapter.ViewHolder>() {

    val layoutInflater = LayoutInflater.from(context)
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.activity_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return todaysActivities.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val activity = todaysActivities[position]
        holder.tvTitle.text = activity.title

    }
}