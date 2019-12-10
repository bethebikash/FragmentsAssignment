package com.bhattaraibikash.fragmentsassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bhattaraibikash.fragmentsassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArmstrongFragment extends Fragment implements View.OnClickListener {

    private EditText etNumberAr;
    private Button btnCheckArmstrong;

    public ArmstrongFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_armstrong, container, false);
        etNumberAr = view.findViewById(R.id.etNumberAr);
        btnCheckArmstrong = view.findViewById(R.id.btnCheckArmstrong);

        btnCheckArmstrong.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int num = Integer.parseInt(etNumberAr.getText().toString());
        int initialNum = num;
        int r;
        int sum = 0;
        while(num > 0)
        {
            r=num%10;
            sum = sum+(r*r*r);
            num = num/10;
        }
        if(initialNum == sum) {
            Toast.makeText(getActivity(), "The number is Armstrong Number", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "The number is not Armstrong Number", Toast.LENGTH_SHORT).show();
        }
    }
}
