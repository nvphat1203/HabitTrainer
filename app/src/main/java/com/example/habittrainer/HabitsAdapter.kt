package com.example.habittrainer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_card.view.*

class HabitsAdapter(private val habits: List<Habit>): RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>() {
    class HabitViewHolder(val iv: View): RecyclerView.ViewHolder(iv)

    // Create a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card, parent, false)
        return HabitViewHolder(view)
    }

    override fun getItemCount() = habits.size

    // Specifies the contents for the shown items/habits
    override fun onBindViewHolder(holder: HabitViewHolder, position: Int) {
        if (holder != null) {
            holder.iv.tv_title.text = habits[position].title
            holder.iv.tv_description.text = habits[position].description
            holder.iv.iv_icon.setImageBitmap(habits[position].image)
        }
    }
}