package com.example.haider.geo_calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Cuboid extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);
        final Button RectAnswer=(Button) findViewById(R.id. CuboidAnswer);
        RectAnswer. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText CuboidHeight = (EditText) findViewById(R.id.CuboidHeight);
                EditText CuboidBase= (EditText) findViewById(R.id.CuboidBase);
                EditText CuboidLength= (EditText) findViewById(R.id.CuboidLength);
                TextView CuboidSurfaceArea = (TextView) findViewById(R.id.CuboidSurfaceArea);
                TextView CuboidVolume= (TextView) findViewById(R.id.CuboidVolume);
                int Cuboidlength = Integer.parseInt(CuboidLength.getText().toString());
                int Cuboidbase = Integer.parseInt(CuboidBase.getText().toString());
                int Cuboidheight = Integer.parseInt(CuboidHeight.getText().toString());
                int SurfaceArea = (2*Cuboidheight*Cuboidlength)+(2*Cuboidheight*Cuboidbase)+(2*Cuboidbase*Cuboidlength);
                int Volume =Cuboidbase*Cuboidheight*Cuboidlength;
                CuboidSurfaceArea.setText(SurfaceArea + "");
                CuboidVolume.setText(Volume + "");
            }
        });
    }
}
