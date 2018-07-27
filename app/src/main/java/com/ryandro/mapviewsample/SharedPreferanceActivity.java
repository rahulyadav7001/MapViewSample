package com.ryandro.mapviewsample;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SharedPreferanceActivity extends AppCompatActivity {
    private Preferance preferance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferance);
        preferance = new Preferance(SharedPreferanceActivity.this);
    }

    public void saveData(View view) {

//        SharedPreferences preferences = getSharedPreferences("MyData",Context.MODE_PRIVATE);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(SharedPreferanceActivity.this);

        SharedPreferences.Editor editor = preferences.edit();

        editor.putString("NAME", "AdvanSoft");
        editor.putString("PASSWORD", "pass123");
        editor.commit();

      /* preferance.SaveString("NAME", "AdvanSoft");
        preferance.SaveString("PASSWORD", "pass123");*/
        Toast.makeText(SharedPreferanceActivity.this, "Data Saved", Toast.LENGTH_SHORT).show();
    }

    public void LoadData(View view) {
        startActivity(new Intent(SharedPreferanceActivity.this, DisplayActivity.class));

      /*  SharedPreferences preferences = getPreferences(Context.MODE_PRIVATE);

        String name = preferences.getString("NAME", "N/A");
        String pass = preferences.getString("PASSWORD", "N/A");
        if (name.equalsIgnoreCase("N/A") && pass.equalsIgnoreCase("N/A")) {
            Toast.makeText(SharedPreferanceActivity.this, "No data Found" , Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(SharedPreferanceActivity.this, "Name : " + name + " Password : " + pass, Toast.LENGTH_SHORT).show();

        }*/
    }


}
