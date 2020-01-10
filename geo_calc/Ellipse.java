package com.example.haider.geo_calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Ellipse extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ellipse);
        final Button RectAnswer=(Button) findViewById(R.id. EllipseAnswer);
        RectAnswer. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText EllipseHeight = (EditText) findViewById(R.id.EllipseHeight);
                EditText EllipseBase= (EditText) findViewById(R.id.EllipseBase);
                EditText EllipseLength= (EditText) findViewById(R.id.EllipseLength);
                TextView EllipseVolume= (TextView) findViewById(R.id.EllipseVolume);
                int Ellipselength = Integer.parseInt(EllipseLength.getText().toString());
                int Ellipsebase = Integer.parseInt(EllipseBase.getText().toString());
                int Ellipseheight = Integer.parseInt(EllipseHeight.getText().toString());
                int Volume =3*(Ellipseheight*Ellipsebase*Ellipselength);
                EllipseVolume.setText(Volume + "");
            }
        });
    }
}

