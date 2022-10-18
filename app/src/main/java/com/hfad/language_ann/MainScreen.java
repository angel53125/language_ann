package com.hfad.language_ann;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.navigation.Navigation;
/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class MainScreen extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       View view = inflater.inflate(R.layout.fragment_main_screen, container, false);
       Button btnEnglish = view.findViewById((R.id.btn_English));
       Button btnSpanish = view.findViewById((R.id.btn_spanish));
       Button btnFrench = view.findViewById((R.id.btn_french));

       btnEnglish.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Navigation.findNavController(view).navigate(R.id.action_mainScreen_to_english);
           }
       });

        btnSpanish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_mainScreen_to_spanish);
            }
        });

        btnFrench.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_mainScreen_to_french);
            }
        });



       return view;
    }
}