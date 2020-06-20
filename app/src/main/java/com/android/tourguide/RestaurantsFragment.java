package com.android.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        List<Location> list = new ArrayList<>();
        list.add(new Location(R.string.red_fort, R.string.red_fort_description, R.string.red_fort_location, R.string.red_fort_timing, R.drawable.red_fort));
        list.add(new Location(R.string.red_fort, R.string.red_fort_description, R.string.red_fort_location, R.string.red_fort_timing, R.drawable.humayun_tomb));
        list.add(new Location(R.string.red_fort, R.string.red_fort_description, R.string.red_fort_location, R.string.red_fort_timing, R.drawable.images));
        list.add(new Location(R.string.red_fort, R.string.red_fort_description, R.string.red_fort_location, R.string.red_fort_timing, R.drawable.jama_masjid));
        list.add(new Location(R.string.red_fort, R.string.red_fort_description, R.string.red_fort_location, R.string.red_fort_timing, R.drawable.lotus_temple));

        LocationAdapter adapter = new LocationAdapter(getActivity(), list);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
