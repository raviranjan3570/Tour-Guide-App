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
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        List<Location> list = new ArrayList<>();
        list.add(new Location(R.string.select_city, R.string.select_city_description, R.string.select_city_location, R.string.select_city_timing, R.drawable.select_city));
        list.add(new Location(R.string.dlf_emporio, R.string.dlf_emporio_description, R.string.dlf_emporio_location, R.string.dlf_emporio_timing, R.drawable.dlf_emporio));
        list.add(new Location(R.string.dlf_promenade, R.string.dlf_promenade_description, R.string.dlf_promenade_location, R.string.dlf_promenade_timing, R.drawable.dlf_promenade));
        list.add(new Location(R.string.pacific_mall, R.string.pacific_mall_description, R.string.pacific_mall_location, R.string.pacific_mall_timing, R.drawable.pacific));
        list.add(new Location(R.string.city_square, R.string.city_square_description, R.string.city_square_location, R.string.city_square_timing, R.drawable.city_square));

        PlaceShoppingAdapter adapter = new PlaceShoppingAdapter(getActivity(), list);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
