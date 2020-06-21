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
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        List<Location> list = new ArrayList<>();
        list.add(new Location(R.string.radisson_blu, R.string.radisson_blu_description, R.string.radisson_blu_location, R.string.radisson_blu_number, R.drawable.radisson_blu));
        list.add(new Location(R.string.roseate_house, R.string.roseate_house_description, R.string.roseate_house_location, R.string.roseate_house_number, R.drawable.roseate_house_exterior));
        list.add(new Location(R.string.leela_palace, R.string.leela_palace_description, R.string.leela_palace_location, R.string.leela_palace_number, R.drawable.the_leela_ambience_convention));
        list.add(new Location(R.string.the_lodhi, R.string.the_lodhi_description, R.string.the_lodhi_location, R.string.the_lodhi_number, R.drawable.the_lodhi));
        list.add(new Location(R.string.taj_palace, R.string.taj_palace_description, R.string.taj_palace_location, R.string.taj_palace_number, R.drawable.taj_palace));

        HotelRestaurantAdapter adapter = new HotelRestaurantAdapter(Objects.requireNonNull(getActivity()), list);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
