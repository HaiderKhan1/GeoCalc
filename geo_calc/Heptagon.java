package com.example.haider.geo_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Heptagon extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heptagon);
        final Button RectAnswer=(Button) findViewById(R.id. HeptagonAnswer);
        RectAnswer. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText HeptagonA = (EditText) findViewById(R.id.HeptagonA);
                TextView HeptagonPerimeter = (TextView) findViewById(R.id.HeptagonPerimeter);
                int Heptagona = Integer.parseInt(HeptagonA.getText().toString());
                int Perimeter = 7*Heptagona;
                HeptagonPerimeter.setText(Perimeter + "");
            }
        });
    }
}

