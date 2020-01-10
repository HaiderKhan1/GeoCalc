package com.example.haider.geo_calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Rp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rp);
        final Button RectAnswer=(Button) findViewById(R.id. RpAnswer);
        RectAnswer. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText RpHeight = (EditText) findViewById(R.id.RpHeight);
                EditText RpBase= (EditText) findViewById(R.id.RpBase);
                EditText RpLength= (EditText) findViewById(R.id.RpLength);
                TextView RpVolume= (TextView) findViewById(R.id.RpVolume);
                TextView RpSurfaceArea= (TextView) findViewById(R.id.RpSurfaceArea);
                int Rplength = Integer.parseInt(RpLength.getText().toString());
                int Rpbase = Integer.parseInt(RpBase.getText().toString());
                int Rpheight = Integer.parseInt(RpHeight.getText().toString());
                int Volume =(Rpheight*Rpbase+Rplength);
                int SurfaceArea= (Rpheight*Rpbase+Rpheight*Rplength+Rplength*Rpbase)*2;
                RpSurfaceArea.setText(Volume + "");
                RpVolume.setText(SurfaceArea + "");
            }
        });
    }
}

