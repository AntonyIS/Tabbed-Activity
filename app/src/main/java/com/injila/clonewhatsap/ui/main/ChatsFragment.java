package com.injila.clonewhatsap.ui.main;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.injila.clonewhatsap.R;


public class ChatsFragment extends Fragment {


    ListView carList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        create an inflater object
        View cars =  inflater.inflate(R.layout.fragment_chats, container, false);
        carList = cars.findViewById(R.id.lvcarlist);

        carList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getContext(), item, Toast.LENGTH_SHORT).show();
            }
        });
        return cars;

    }

}
