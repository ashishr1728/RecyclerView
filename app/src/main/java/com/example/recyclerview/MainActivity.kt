package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv : RecyclerView = findViewById(R.id.rv)

        val listOfContact = mutableListOf<ContactItem>()
        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.coffee,
                headingText = "Ashish Rajput",
                subheadingText = "This is message from Ashish...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.fruits,
                headingText = "Aman Rajput",
                subheadingText = "This is message from Aman...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.heartrate,
                headingText = "Akash Rajput",
                subheadingText = "This is message from Akash...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.salad,
                headingText = "Ankit Rajput",
                subheadingText = "This is message from Ankit...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.coffee,
                headingText = "Ashish Rajput",
                subheadingText = "This is message from Ashish...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.fruits,
                headingText = "Aman Rajput",
                subheadingText = "This is message from Aman...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.heartrate,
                headingText = "Akash Rajput",
                subheadingText = "This is message from Akash...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.salad,
                headingText = "Ankit Rajput",
                subheadingText = "This is message from Ankit...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.coffee,
                headingText = "Ashish Rajput",
                subheadingText = "This is message from Ashish...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.fruits,
                headingText = "Aman Rajput",
                subheadingText = "This is message from Aman...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.heartrate,
                headingText = "Akash Rajput",
                subheadingText = "This is message from Akash...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.salad,
                headingText = "Ankit Rajput",
                subheadingText = "This is message from Ankit...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.coffee,
                headingText = "Ashish Rajput",
                subheadingText = "This is message from Ashish...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.fruits,
                headingText = "Aman Rajput",
                subheadingText = "This is message from Aman...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.heartrate,
                headingText = "Akash Rajput",
                subheadingText = "This is message from Akash...."
            )
        )

        listOfContact.add(
            ContactItem(
                imageRes = R.drawable.salad,
                headingText = "Ankit Rajput",
                subheadingText = "This is message from Ankit...."
            )
        )

        val adapter = ContactListAdapter(listOfContact)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = adapter
    }
}