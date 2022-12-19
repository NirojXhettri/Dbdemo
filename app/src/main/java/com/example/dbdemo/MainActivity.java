package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import data.MyDbHandler;
import model.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDbHandler db=new MyDbHandler(MainActivity.this);
        //Adding a contact to the db
        Contact niroj =new Contact();
        niroj.setPhoneNumber("9862769975");
        niroj.setName("Niroj");
        db.addContact(niroj);
    }
}