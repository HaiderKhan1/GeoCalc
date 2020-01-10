package com.example.haider.geo_calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Square extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        final Button SquareAnswer=(Button) findViewById(R.id. SquareAnswer);
        SquareAnswer. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText SquareA = (EditText) findViewById(R.id.SquareA);
                TextView SquareArea = (TextView) findViewById(R.id.SquareArea);
                TextView SquarePerimeter = (TextView) findViewById(R.id.SquarePerimeter);
                int Squarea = Integer.parseInt(SquareA.getText().toString());
                int Area = Squarea*Squarea;
                int Perimeter = 2*Squarea;
                SquareArea.setText(Area + "");
                SquarePerimeter.setText(Perimeter + "");
            }
        });
    }
}
