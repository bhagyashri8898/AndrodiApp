package com.example.fragments7;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BtnpanFragment extends Fragment {


    public BtnpanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final  View view=inflater.inflate(R.layout.fragment_btnpan2,container,false);
      view.findViewById(R.id.btnBike).setOnClickListener(v ->(
              (MainActivity)getActivity()).loadfragment(new BikeFragment()));
        view.findViewById(R.id.btnPlane).setOnClickListener(v ->(
                (MainActivity)getActivity()).loadfragment(new PlaneFragment()));
        view.findViewById(R.id.btnRail).setOnClickListener(v ->(
                (MainActivity)getActivity()).loadfragment(new RailFragment()));
        return view;
    }

        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_btnpan2, container, false);
    }



