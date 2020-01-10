package com.example.haider.geo_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Nonogon extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonogon);
        final Button NonogonAnswer=(Button) findViewById(R.id. NonogonAnswer);
        NonogonAnswer. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText NonogonA = (EditText) findViewById(R.id.NonogonA);
                TextView NonogonPerimeter = (TextView) findViewById(R.id.NonogonPerimeter);
                int Nonogona = Integer.parseInt(NonogonA.getText().toString());
                int Perimeter = 9*Nonogona;
                NonogonPerimeter.setText(Perimeter + "");
            }
        });
    }
}

