package com.example.killmonstr;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class LoseFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lose, container, false);

        // Найти кнопку по имени
        Button backButton = view.findViewById(R.id.backButton);

        //обработчик нажатия
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Вернуться на MainActivity
                onBackPressed();
            }
        });

        return view;
    }

    //Метод для возвращения в Activity
    private void onBackPressed() {
        // Вернуться на MainActivity
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
        getActivity().finish();
    }
}


