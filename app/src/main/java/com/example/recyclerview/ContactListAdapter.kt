package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactListAdapter (
    private val listOfContacts : List<ContactItem>
) : RecyclerView.Adapter<ContactListAdapter.ContactListViewHolder>(){
    class ContactListViewHolder(
        view : View
    ) : RecyclerView.ViewHolder(view){
        val image : ImageView = view.findViewById(R.id.image)
        val heading : TextView = view.findViewById(R.id.text_heading)
        val subheading : TextView = view.findViewById(R.id.text_subheading)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_rv_item,parent,false)
        return ContactListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listOfContacts.size
    }

    override fun onBindViewHolder(holder: ContactListViewHolder, position: Int) {
        holder.image.setImageResource(listOfContacts[position].imageRes)
        holder.heading.text = listOfContacts[position].headingText
        holder.subheading.text = listOfContacts[position].subheadingText
    }
}