package com.example.haider.geo_calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Selection extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        button = (Button) findViewById(R.id.Line_btn);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v){
                openActivity_linear_selection();
            }
        });

        button = (Button) findViewById(R.id.Shape_2d);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v){
                openActivity_selection2d();
            }
        });

        button = (Button) findViewById(R.id.calc_btn);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v){
               openActivity_calculator();
            }
        });

        button = (Button) findViewById(R.id.Shape_3d);
        button.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v){
                openActivity_shapes3d();
            }
        });
    }

    public void openActivity_selection2d(){
        Intent intent = new Intent(this, selection2d.class);
        startActivity(intent);
    }
    public void openActivity_calculator(){
        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }
    public void openActivity_shapes3d() {
        Intent intent = new Intent(this, Shapes3d.class);
        startActivity(intent);

    }

    public void openActivity_linear_selection() {
        Intent intent = new Intent(this, Linear_selection.class);
        startActivity(intent);

    }



}
