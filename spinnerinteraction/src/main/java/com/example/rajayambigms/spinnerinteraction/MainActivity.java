package com.example.rajayambigms.spinnerinteraction;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] countryName ={"India","United States","Australia","Canada","Russia","China","Japan","Iran","Iraq","Koria","Newzealand","Mexico"};
    int[] flags ={R.drawable.india,R.drawable.usa,R.drawable.australia,R.drawable.canada,R.drawable.russia,R.drawable.china,R.drawable.japan,R.drawable.iran,R.drawable.iraq,R.drawable.koria,R.drawable.newzealand,R.drawable.mexico};
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
         imageView = (ImageView)findViewById(R.id.imageView);

        spinner.setOnItemSelectedListener(this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,countryName);
        spinner.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        imageView.setImageResource(flags[position]);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
