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
public class PalindromeFragment extends Fragment implements View.OnClickListener {


    private Button btnCheckPalindrome;
    private EditText etNumberPal;

    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);

        etNumberPal = view.findViewById(R.id.etNumberPal);
        btnCheckPalindrome = view.findViewById(R.id.btnCheckPalindrome);

        btnCheckPalindrome.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        int num = Integer.parseInt(etNumberPal.getText().toString());

        int i = 0;
        int r = 0;

        int initialNum = num;

        for (i = 0; i <= num; i++) {
            r = r * 10;
            r = r + num % 10;
            num = num / 10;
            i = 0;
        }

        if (r == initialNum) {
            Toast.makeText(getActivity(),"The number is a Palindrome number", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(),"The number is not a Palindrome number", Toast.LENGTH_SHORT).show();
        }
    }

}
