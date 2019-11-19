package com.injila.clonewhatsap.ui.main;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.injila.clonewhatsap.R;


public class CallsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View clone =  inflater.inflate(R.layout.fragment_calls, container, false);
        return clone;
    }

}
