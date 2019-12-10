package com.bhattaraibikash.fragmentsassignment.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.bhattaraibikash.fragmentsassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PalindromeFragment extends Fragment implements View.OnClickListener {


    private Button btnCheckPalindrome;
    private TextView tvPalindrome;
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
        tvPalindrome = view.findViewById(R.id.tvPalindrome);
        btnCheckPalindrome = view.findViewById(R.id.btnCheckPalindrome);

        btnCheckPalindrome.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (etNumberPal.getText().toString().isEmpty()) {
            etNumberPal.setError("enter the number");
        } else {
            int num = Integer.parseInt(etNumberPal.getText().toString());

            int i;
            int r = 0;

            int initialNum = num;

            for (i = 0; i <= num; i++) {
                r = r * 10;
                r = r + num % 10;
                num = num / 10;
                i = 0;
            }

            if (r == initialNum) {
                tvPalindrome.setText(initialNum+" is a Palindrome Number");
            } else {
                tvPalindrome.setText(initialNum+" is not a Palindrome Number");
            }
        }
    }
}
