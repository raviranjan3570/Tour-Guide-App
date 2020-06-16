package com.android.tourguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        List<Location> list = new ArrayList<>();
        list.add(new Location(R.string.red_fort, R.string.red_fort_description, R.string.red_fort_location, R.string.red_fort_timing, R.drawable.red_fort));
        list.add(new Location(R.string.red_fort, R.string.red_fort_description, R.string.red_fort_location, R.string.red_fort_timing, R.drawable.humayun_tomb));
        list.add(new Location(R.string.red_fort, R.string.red_fort_description, R.string.red_fort_location, R.string.red_fort_timing, R.drawable.images));
        list.add(new Location(R.string.red_fort, R.string.red_fort_description, R.string.red_fort_location, R.string.red_fort_timing, R.drawable.jama_masjid));
        list.add(new Location(R.string.red_fort, R.string.red_fort_description, R.string.red_fort_location, R.string.red_fort_timing, R.drawable.lotus_temple));

        LocationAdapter adapter = new LocationAdapter(this, list);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
