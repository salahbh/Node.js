package com.example.salahbanihamad.thrdapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tx=(TextView)findViewById(R.id.text);

        Bundle p=getIntent().getExtras();

        String user=p.getString("Username");
        String pass=p.getString("Password");
        tx.setText("user : "+user+"\npass : "+pass);




    }
}
