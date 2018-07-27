package com.ryandro.mapviewsample;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class DisplayActivity extends AppCompatActivity {
    Preferance preferance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        preferance = new Preferance(DisplayActivity.this);
    }

    public void LoadData(View view) {

//        SharedPreferences preferences = getSharedPreferences("MyData",Context.MODE_PRIVATE);
//        SharedPreferences preferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(DisplayActivity.this);


        String name = preferences.getString("NAME", "N/A");
        String pass = preferences.getString("PASSWORD", "N/A");

       /* String name = preferance.getStringValue("NAME");
        String pass = preferance.getStringValue("PASSWORD");*/

        if (name.equalsIgnoreCase("N/A") && pass.equalsIgnoreCase("N/A")) {
            Toast.makeText(DisplayActivity.this, "No data Found", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(DisplayActivity.this, "Name : " + name + " Password : " + pass, Toast.LENGTH_SHORT).show();

        }
    }
}
