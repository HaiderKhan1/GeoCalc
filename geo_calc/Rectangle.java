package com.example.haider.geo_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Rectangle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        final Button RectAnswer = (Button) findViewById(R.id.RectangleAnswer);
        RectAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText RectangleLength = (EditText) findViewById(R.id.RectangleLength);
                EditText RectangleWidth = (EditText) findViewById(R.id.RectangleWidth);
                TextView RectangLeArea = (TextView) findViewById(R.id.RectangleArea);
                TextView RectangLePerimeter = (TextView) findViewById(R.id.RectanglePerimeter);
                int Rectanglength = Integer.parseInt(RectangleLength.getText().toString());
                int Rectanglewidth = Integer.parseInt(RectangleWidth.getText().toString());
                int Area = Rectanglength * Rectanglewidth;
                int Perimeter = 2 *(Rectanglewidth * Rectanglength);
                RectangLeArea.setText(Area + "");
                RectangLePerimeter.setText(Perimeter + "");
            }
        });
    }
}