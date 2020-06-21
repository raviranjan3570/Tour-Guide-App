package com.android.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        list.add(new Location(R.string.pind_balluchi, R.string.pind_balluchi_description, R.string.pind_balluchi_location, R.string.pind_balluchi_number, R.drawable.pind_baluchi));
        list.add(new Location(R.string.jamun, R.string.jama_masjid_description, R.string.jamun_location, R.string.jamun_number, R.drawable.jamun));
        list.add(new Location(R.string.beeryani, R.string.beeryani_description, R.string.beeryani_location, R.string.beeryani_number, R.drawable.beeryani));
        list.add(new Location(R.string.indian_accent, R.string.indian_accent_description, R.string.indian_accent_location, R.string.indian_accent_number, R.drawable.indian_accent));
        list.add(new Location(R.string.diggin, R.string.diggin_description, R.string.diggin_location, R.string.diggin_number, R.drawable.diggin));

        HotelRestaurantAdapter adapter = new HotelRestaurantAdapter(Objects.requireNonNull(getActivity()), list);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
