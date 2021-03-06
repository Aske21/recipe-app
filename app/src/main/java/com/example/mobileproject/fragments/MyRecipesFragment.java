package com.example.mobileproject.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.mobileproject.R;
import com.example.mobileproject.activities.AddingScreen;
import com.example.mobileproject.adapters.ListViewAdapter;
import com.example.mobileproject.room.entities.Ingredient;
import com.example.mobileproject.room.entities.RecipeDatabase;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class MyRecipesFragment extends Fragment implements View.OnClickListener {
    private ListView listView;

    FloatingActionButton myButton;

    public MyRecipesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View CurrentView = inflater.inflate(R.layout.fragment_my_recipes, container, false);
        myButton = (FloatingActionButton) CurrentView.findViewById(R.id.AddButton);
        myButton.setOnClickListener(this);
        return CurrentView;
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(getActivity(), AddingScreen.class);
        startActivity(i);
    }


}