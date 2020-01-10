package com.example.haider.geo_calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class Shapes3d extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes3d);
        //The name of the buttons (declaring the buttons)
        Button cube = (Button) findViewById(R.id.Cube);
        Button cylinder = (Button) findViewById(R.id.Cylinder);
        Button cuboid = (Button) findViewById(R.id.Cuboid);
        Button sbt = (Button) findViewById(R.id.Sbt);
        Button ellipse = (Button) findViewById(R.id.ellipse);
        Button rp = (Button) findViewById(R.id.rp);
        Button sphere = (Button) findViewById(R.id.sphere);
//Code for clicking the buttons
        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Rectangle = new Intent(Shapes3d.this, Cube.class);
                startActivity(Rectangle);
            }
        });
        cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Rectangle = new Intent(Shapes3d.this, Cylinder.class);
                startActivity(Rectangle);
            }
        });
        cuboid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Rectangle = new Intent(Shapes3d.this, Cuboid.class);
                startActivity(Rectangle);
            }
        });
        sbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Rectangle = new Intent(Shapes3d.this, sbt.class);
                startActivity(Rectangle);
            }
        });
        ellipse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Rectangle = new Intent(Shapes3d.this, Ellipse.class);
                startActivity(Rectangle);
            }
        });
        rp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Rectangle = new Intent(Shapes3d.this, Rp.class);
                startActivity(Rectangle);
            }
        });
        sphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Rectangle = new Intent(Shapes3d.this, Sphere.class);
                startActivity(Rectangle);
            }
        });
    }
}
