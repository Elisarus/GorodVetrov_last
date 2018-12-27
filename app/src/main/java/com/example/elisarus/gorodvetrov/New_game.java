package com.example.elisarus.gorodvetrov;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.elisarus.gorodvetrov.Fragments.Button_fragment;

import java.util.Arrays;
import java.util.Random;

public class New_game extends AppCompatActivity {

    final String[] day_array = {"gsdgsgdsdg", "sdgsdgsdgsgd22", "sdgsdgsdgs213gd", "sdgsdgsdg145sgd", "sdgsdgsdgs125gd", "sdgsdgsdgs215gd", "sdgsdgs`241dgsgd", "sdgsdgsdg215sgd", "sdgsd643gsdgsgd", "sdgsd547gsdgsgd"};









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        Button btn_next_day = findViewById(R.id.btn_next_day);
        Button btn_resources = findViewById(R.id.btn_resources);


       final TextView day_description = findViewById(R.id.day_description);

      final   Random random = new Random();


        btn_next_day.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                int rnd = random.nextInt(10);
                day_description.setText(day_array[rnd]);
            }

        });




        btn_resources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(New_game.this, Resource_page.class);
              String day_desc =  day_description.getText().toString();

              int day_number = 0;

              for(int i=0; i<10; i++) {

                  if (day_desc.equalsIgnoreCase(day_array[i])) {
                      day_number = i;

                  } else{

                  }

              }

              String day_number_string = Integer.toString(day_number);


                intent.putExtra("day_number", day_number_string);
                startActivity(intent);

            }
        });










       /* Day_text day_text = new Day_text();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.new_Fragment, day_text, day_text.getTag())
                .commit();

        Button_fragment button_fragment = new Button_fragment();
        manager.beginTransaction()
                .replace(R.id.button_fragment, button_fragment, button_fragment.getTag())
                .commit();
*/




    }


}
