package com.example.haider.geo_calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Cylinder extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);
        final Button RectAnswer=(Button) findViewById(R.id. CylinderAnswer);
        RectAnswer. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText CylinderHeight = (EditText) findViewById(R.id.CylinderHeight);
                EditText CylinderRadius= (EditText) findViewById(R.id.CylinderRadius);
                TextView CylinderSurfaceArea = (TextView) findViewById(R.id.CylinderSufaceArea);
                TextView CylinderVolume= (TextView) findViewById(R.id.CylinderVolume);
                int Cylinderheight = Integer.parseInt(CylinderHeight.getText().toString());
                int Cylinderradius = Integer.parseInt(CylinderRadius.getText().toString());
              //  int SurfaceArea = Integer.parseInt(Cylinderradius*Cylinderheight).getText().toString())+(2*3*(Cylinderradius*Cylinderradius).getText().toString());
                int Volume = 3*(Cylinderheight*(Cylinderradius*Cylinderradius));
              //  CylinderSurfaceArea.setText(SurfaceArea + "");
                CylinderVolume.setText(Volume + "");
            }
        });
    }
}

