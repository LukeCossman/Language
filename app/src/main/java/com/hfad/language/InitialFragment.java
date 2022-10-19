package com.hfad.language;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InitialFragment} factory method to
 * create an instance of this fragment.
 */
public class InitialFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_initial, container, false);
        Button btn_english = view.findViewById(R.id.btn_english);
        Button btn_french = view.findViewById(R.id.btn_french);
        Button btn_italian = view.findViewById(R.id.btn_italian);

        btn_english.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_initialFragment_to_englishFragment));
        btn_french.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_initialFragment_to_frenchFragment));
        btn_italian.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_initialFragment_to_italianFragment));

        return view;
    }
}