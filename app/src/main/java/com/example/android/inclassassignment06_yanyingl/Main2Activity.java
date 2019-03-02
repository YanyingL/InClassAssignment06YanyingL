package com.example.android.inclassassignment06_yanyingl;

import android.app.Person;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.security.Key;

public class Main2Activity extends AppCompatActivity {

    public TextView result_view;
    String r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        result_view=(TextView)findViewById(R.id.show_message);

        Intent intent = getIntent();
        MainActivity per = (MainActivity) intent.getSerializableExtra(Keys.animal);
        String name=per.getName();
        String leg=per.getlegs();
        String info=per.getInfo();
        boolean fur=per.getfur();
        if (fur) {r="True";}
        else {r="False";}
        String result="Animal Type Name: "+ name+"\n"+"Number of Legs"+leg+"\n"+"Does it has fur?"+ r+"\n"+"Any Additional Information"+info;
        //  intent.putExtra(Keys.STRING, result);
      //  String result = intent.getStringExtra(Keys.STRING);
        result_view.setText(result);
    }


}
