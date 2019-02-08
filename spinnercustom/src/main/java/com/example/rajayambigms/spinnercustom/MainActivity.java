package com.example.rajayambigms.spinnercustom;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner)findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(this);
       // ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,countryName);
       // arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
       // spinner.setAdapter(arrayAdapter);

        CustomAdapter customAdapter=new CustomAdapter(this,flags,countryName);
        spinner.setAdapter(customAdapter);

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}
