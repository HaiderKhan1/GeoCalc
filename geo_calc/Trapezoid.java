package com.example.haider.geo_calc;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
public class Trapezoid extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoid);
        final Button TrapAnswer=(Button) findViewById(R.id. TrapAnswer);
        TrapAnswer. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText TrapA = (EditText) findViewById(R.id.TrapA);
                EditText TrapB = (EditText) findViewById(R.id.TrapB);
                EditText TrapC = (EditText) findViewById(R.id.TrapC);
                EditText TrapD = (EditText) findViewById(R.id.TrapD);
                EditText TrapHeight = (EditText) findViewById(R.id.TrapHeight);
                TextView TrapArea = (TextView) findViewById(R.id.TrapArea);
                TextView TrapPerimeter = (TextView) findViewById(R.id.TrapPerimeter);
                int Trapa = Integer.parseInt(TrapA.getText().toString());
                int Trapb = Integer.parseInt(TrapB.getText().toString());
                int Trapc = Integer.parseInt(TrapC.getText().toString());
                int Trapd = Integer.parseInt(TrapD.getText().toString());
                int Trapheight = Integer.parseInt(TrapHeight.getText().toString());
                int Area = ((Trapa+Trapb)/2)*Trapheight;
                int Perimeter = Trapa+Trapb+Trapc+Trapd;
                TrapArea.setText(Area + "");
                TrapPerimeter.setText(Perimeter + "");
            }
        });
    }
}


