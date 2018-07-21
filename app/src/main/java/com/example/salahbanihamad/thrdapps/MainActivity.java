package com.example.salahbanihamad.thrdapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tap(View view) {

        EditText txtu=(EditText)findViewById(R.id.editTextu);
        EditText txtp=(EditText)findViewById(R.id.editTextp);

        Intent myIntent= new Intent(this,Main2Activity.class);
        Bundle b=new Bundle();
        b.putString("Username",txtu.getText().toString());
        b.putString("Password",txtp.getText().toString());
        myIntent.putExtras(b);
        startActivity(myIntent);

    }
}
