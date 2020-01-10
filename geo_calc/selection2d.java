package com.example.haider.geo_calc;

import android.support.constraint.solver.widgets.Rectangle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class selection2d extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection2d);
        //Code for clicking The name of the buttons (declaring the buttons)

        Button rectangle=(Button) findViewById(R.id.Rectangle);
        Button trapezoid = (Button) findViewById(R.id.Trapezoid);
        Button heptagon = (Button) findViewById(R.id.Heptagon);
        Button triangle=(Button) findViewById(R.id.Triangle);
        Button nonogon=(Button) findViewById(R.id.Nonogon);
        Button square=(Button) findViewById(R.id.Square);
//the buttons

        trapezoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trapezoid = new Intent(selection2d.this, Trapezoid.class);
                startActivity(trapezoid);
            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent square = new Intent(selection2d.this, com.example.haider.geo_calc.Rectangle.class);
                startActivity(square);
            }
        });
        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rectangle = new Intent(selection2d.this, Square.class);
                startActivity(rectangle);
            }
        });

        heptagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent heptagon = new Intent(selection2d.this, Heptagon.class);
                startActivity(heptagon);
            }
        });
        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent triangle = new Intent(selection2d.this, Triangle.class);
                startActivity(triangle);
            }
        });
        nonogon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nonogon = new Intent(selection2d.this, Nonogon.class);
                startActivity(nonogon);
            }
        });
    }
}
