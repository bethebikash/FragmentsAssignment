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
public class SwapFragment extends Fragment implements View.OnClickListener {

    private EditText etFirstNum, etSecondNum;
    private Button btnSwap;

    public SwapFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_swap, container, false);
        etFirstNum = view.findViewById(R.id.etFirstNum);
        etSecondNum = view.findViewById(R.id.etSecondNum);
        btnSwap = view.findViewById(R.id.btnSwap);

        btnSwap.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int fNum = Integer.parseInt(etFirstNum.getText().toString());
        int sNum = Integer.parseInt(etSecondNum.getText().toString());

        fNum=fNum+sNum;//a=30 (10+20)
        sNum=fNum-sNum;//b=10 (30-20)
        fNum=fNum-sNum;//a=20 (30-10)

        Toast.makeText(getActivity(), "First number is :"+fNum+" Second number is : "+sNum, Toast.LENGTH_SHORT).show();
    }
}
