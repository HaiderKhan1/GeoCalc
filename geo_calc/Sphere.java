package com.example.haider.geo_calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Sphere extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);
        final Button RectAnswer=(Button) findViewById(R.id. SphereAnswer);
        RectAnswer. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText SphereHeight = (EditText) findViewById(R.id.SphereHeight);
                EditText SphereRadius= (EditText) findViewById(R.id.SphereRadius);
                TextView SphereSurfaceArea = (TextView) findViewById(R.id.SphereSurfaceArea);
                TextView SphereVolume= (TextView) findViewById(R.id.SphereVolume);
                int Sphereheight = Integer.parseInt(SphereHeight.getText().toString());
                int Sphereradius = Integer.parseInt(SphereRadius.getText().toString());
                int SurfaceArea = (4*3*Sphereradius*Sphereheight);
                int Volume = 4*3*Sphereradius*Sphereradius*Sphereradius;
                SphereSurfaceArea.setText(SurfaceArea + "");
                SphereVolume.setText(Volume + "");
            }
        });
    }
}

