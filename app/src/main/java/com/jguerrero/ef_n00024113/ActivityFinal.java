package com.jguerrero.ef_n00024113;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class ActivityFinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Button listar = findViewById(R.id.myList);
        Button crear = findViewById(R.id.capture);
        Button registrar = findViewById(R.id.register);
        ImageView image = findViewById(R.id.logo);
        Picasso.get().load("https://elcomercio.pe/resizer/pqoIxl4h3_Xe7ChCxxDQP8GUykk=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/66AM3SSB3ZGSJNU2TQAVJNHIWE.jpg").into(image);

        listar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityFinal.this,ListaPokemons.class);
                startActivity(intent);
            }
        });
        crear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        registrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityFinal.this,NewPokemon.class);
                startActivity(intent);
            }
        });

    }
}
