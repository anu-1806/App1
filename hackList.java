package com.example.maurya.hacksociety;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hackList extends AppCompatActivity {
    int[] images = {R.drawable.hit,R.drawable.hacks,R.drawable.run};

    String[] items = new String [] {"HITSATHON V2.0","MS HACKS 2.0","RUN IO"};

    String[] descriptions = {"Hindustan Institute of Technology and Science, OMR, Chennai 603 103","LPU,Phagwara,Punjab","TIIR Building, NIT Rourkela"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hack_list);

        ListView listView =(ListView) findViewById(R.id.listView);
        CustomListView customListView=new CustomListView(this,items,descriptions,images);
        listView.setAdapter(customListView);
    }
}
