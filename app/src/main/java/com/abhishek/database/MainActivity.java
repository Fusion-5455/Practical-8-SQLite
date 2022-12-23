package com.abhishek.database;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHelper db = new DatabaseHelper(this);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText nameET = (EditText) findViewById(R.id.name);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText numberET = findViewById(R.id.number);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btn = findViewById(R.id.button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button show = findViewById(R.id.showButton);
        // Inserting Contacts
//        Log.d("Insert: ", "Inserting ..");
//        db.addContact(new Contact("Ravi", "9100000000"));
//        db.addContact(new Contact("Srinivas", "9199999999"));
//        db.addContact(new Contact("Tommy", "9522222222"));
//        db.addContact(new Contact("Karthik", "9533333333"));

        String name = nameET.getText().toString();
        String number = nameET.getText().toString();

        btn.setOnClickListener(view -> {
            db.addContact(new Contact(name , number));
            nameET.setText("");
            numberET.setText("");

            Log.d("added : ", "new contact added");
        });

        show.setOnClickListener(view -> {
            Log.d("Reading: ", "Reading all contacts..");
            List<Contact> contacts = db.getAllContacts();

            for (Contact cn : contacts) {
                String log = "Id: " + cn.id + " ,Name: " + cn.name + " ,Phone: " + cn.contactNumber;

                // Writing Contacts to log
                Log.d("Name: ", log);
            }
        });


    }
}