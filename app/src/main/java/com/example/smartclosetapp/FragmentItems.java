package com.example.smartclosetapp;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentItems extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_items, container, false);
        return rootView;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        System.out.println("Starting Parser");



        Activity parentActivity = this.getActivity();


        // Adapter stuff
        RecyclerView itemsRV = getView().findViewById(R.id.itemsRV);

        ItemsAdapter itemsAdapter = new ItemsAdapter();
        itemsRV.setAdapter(itemsAdapter);
        itemsRV.setLayoutManager(new LinearLayoutManager(getActivity()));






    }

}
