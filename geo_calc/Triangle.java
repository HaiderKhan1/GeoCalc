package com.example.haider.geo_calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Triangle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        final Button TriangleAnswer=(Button) findViewById(R.id. TriangleAnswer);
        TriangleAnswer. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText TriangleA = (EditText) findViewById(R.id.TriangleA);
                EditText TriangleB = (EditText) findViewById(R.id.TriangleB);
                EditText TriangleC = (EditText) findViewById(R.id.TriangleC);
                EditText TriangleMiddleHeight = (EditText) findViewById(R.id.TriangleMiddleHeight);
                TextView TriangleArea = (TextView) findViewById(R.id.TriangleArea);
                TextView TrianglePerimeter = (TextView) findViewById(R.id.TrianglePerimeter);
                int Trianglea = Integer.parseInt(TriangleA.getText().toString());
                int Triangleb = Integer.parseInt(TriangleB.getText().toString());
                int Trianglec=Integer.parseInt(TriangleC.getText().toString());
                int Trianglemiddleheight = Integer.parseInt(TriangleMiddleHeight.getText().toString());
                int Area = (Trianglemiddleheight*Triangleb)/2;
                int Perimeter = Triangleb+Trianglea+Trianglec;
                TriangleArea.setText(Area + "");
                TrianglePerimeter.setText(Perimeter + "");
            }
        });
    }
}

