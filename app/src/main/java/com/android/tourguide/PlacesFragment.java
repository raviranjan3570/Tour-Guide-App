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
public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        List<Location> list = new ArrayList<>();
        list.add(new Location(R.string.red_fort, R.string.red_fort_description, R.string.red_fort_location, R.string.red_fort_timing, R.drawable.red_fort));
        list.add(new Location(R.string.humayun_tomb, R.string.humayun_tomb_description, R.string.humayun_tomb_location, R.string.humayun_tomb_timing, R.drawable.humayun_tomb));
        list.add(new Location(R.string.india_gate, R.string.india_gate_description, R.string.india_gate_location, R.string.india_gate_timing, R.drawable.india_gate));
        list.add(new Location(R.string.jama_masjid, R.string.jama_masjid_description, R.string.jama_masjid_location, R.string.jama_masjid_timing, R.drawable.jama_masjid));
        list.add(new Location(R.string.lotus_temple, R.string.lotus_temple_description, R.string.lotus_temple_location, R.string.lotus_temple_timing, R.drawable.lotus_temple));

        PlaceShoppingAdapter adapter = new PlaceShoppingAdapter(getActivity(), list);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
