package com.example.davaleba_8_elizbar_kheladze

import android.content.Context
import android.widget.ArrayAdapter
import com.example.davaleba_8_elizbar_kheladze.R
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

class ListAdapter(context: Context?, userArrayList: ArrayList<User?>?) : ArrayAdapter<User?>(
    context!!, R.layout.list_cell, userArrayList!!
) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val user = getItem(position)
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_cell, parent, false)
        }
        val imageView = convertView!!.findViewById<ImageView>(R.id.pic)
        val userName = convertView.findViewById<TextView>(R.id.nameOfPerson)
        val email = convertView.findViewById<TextView>(R.id.email)
        imageView.setImageResource(user!!.imageId)
        userName.text = user.name
        email.text = user.email
        return super.getView(position, convertView, parent)
    }
}