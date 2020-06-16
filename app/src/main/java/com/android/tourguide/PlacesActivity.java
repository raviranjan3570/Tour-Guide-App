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
        list.add(new Location("Mountain View", "This is the description", "California", "8:00 - 17:00", R.drawable.container));

        LocationAdapter adapter = new LocationAdapter(this, list);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
