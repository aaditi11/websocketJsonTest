package com.example.aaditi.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.aaditi.helloworld.customerData;
import com.google.gson.Gson;

import com.google.gson.*;
import org.json.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView obj = (TextView)findViewById(R.id.textview1);

        customerData d1= new customerData("aaditi",33);
        customerData d2= new customerData("Mayank",34);



        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String d1Str = gson.toJson( d1 ) + gson.toJson( d2 ) ;




        obj.setText(d1Str);
    }
}
