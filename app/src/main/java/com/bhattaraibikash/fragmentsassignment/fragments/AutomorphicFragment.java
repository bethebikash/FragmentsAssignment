package com.bhattaraibikash.fragmentsassignment.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.bhattaraibikash.fragmentsassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutomorphicFragment extends Fragment implements View.OnClickListener {

    private EditText etNumberAu;
    private Button btnCheckAutomorphic;

    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        etNumberAu = view.findViewById(R.id.etNumberAu);
        btnCheckAutomorphic = view.findViewById(R.id.btnCheckAutomorphic);

        btnCheckAutomorphic.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int num = Integer.parseInt(etNumberAu.getText().toString());
        int sqNum = num * num;

        String strNum = Integer.toString(num);
        String strSqNumber = Integer.toString(sqNum);

        if (strSqNumber.endsWith(strNum)) {
            Toast.makeText(getActivity(), "It an Automorphic Number", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "Not an Automorphic Number", Toast.LENGTH_SHORT).show();
        }

    }
}
