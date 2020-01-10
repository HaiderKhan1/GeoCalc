package com.example.haider.geo_calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Cube extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
        final Button RectAnswer=(Button) findViewById(R.id. CubeAnswer);
        RectAnswer. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText CubeA = (EditText) findViewById(R.id.CubeA);
                TextView CubeSurfaceArea = (TextView) findViewById(R.id.CubeSurfaceArea);
                TextView CubeVolume = (TextView) findViewById(R.id.CubeVolume);
                int Cubea = Integer.parseInt(CubeA.getText().toString());
                int SurfaceArea = 6*(Cubea*Cubea);
                int Volume = Cubea*Cubea*Cubea ;
                CubeSurfaceArea.setText(SurfaceArea + "");
                CubeVolume.setText(Volume + "");
            }
        });
    }
}
