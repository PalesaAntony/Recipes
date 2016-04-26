package com.devstudio.mlabsa.recipes;

import android.app.ActionBar;
import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ListViewAdapter adapter;
    int[] rImage;
    TypedArray images;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from listview_main.xml
        setContentView(R.layout.activity_main);

        images = getResources().obtainTypedArray(R.array.images);

        rImage = new int[] {R.drawable.slow_beef_stew, R.drawable.choc_cake, R.drawable.choc_cornstarch,R.drawable.herb_dumpling,
                R.drawable.instant_berry_yogurt,R.drawable.omelette,R.drawable.peanut_butter_cookies,R.drawable.pumpkin_chess_pie};

        // Locate the ListView in listview_main.xml
        list = (ListView) findViewById(R.id.lstView);

        // Pass results to ListViewAdapter Class
        adapter = new ListViewAdapter(this, getResources().getStringArray(R.array.recipes), getResources().getStringArray(R.array.type_of_course   ), getResources().getStringArray(R.array.steps_to_make), images);
        // Binds the Adapter to the ListView
        list.setAdapter(adapter);
        // Capture ListView item click
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(MainActivity.this, SingleItemView.class);
                // Pass all data rank
                i.putExtra("name", getResources().getStringArray(R.array.recipes));
                // Pass all data country
                i.putExtra("type", getResources().getStringArray(R.array.type_of_course));
                // Pass all data population
                i.putExtra("step", getResources().getStringArray(R.array.steps_to_make));
                // Pass all data flag
                i.putExtra("image", rImage);
                // Pass a single position
                i.putExtra("position", position);
                // Open SingleItemView.java Activity
                startActivity(i);
            }

        });
    }

}
