package com.example.haider.geo_calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class sixthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        Button MPanswer= (Button) findViewById(R.id.MPanswer);
        MPanswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText EditText1= (EditText) findViewById(R.id.EditText1);
                EditText EditText2= (EditText) findViewById(R.id.EditText2);
                EditText EditText3= (EditText) findViewById(R.id.EditText3);
                EditText EditText4= (EditText) findViewById(R.id.EditText4);
                TextView resultTextView= (TextView) findViewById(R.id.resultTextView);
                int num1= Integer.parseInt(EditText1.getText().toString());
                int num2= Integer.parseInt(EditText2.getText().toString());
                int num3= Integer.parseInt(EditText3.getText().toString());
                int num4= Integer.parseInt(EditText4.getText().toString());
                double result= (double) (num1+num3)/2;
                double result2= (double) (num2+num4)/2;
                resultTextView.setText("Midpoint = (" + result+","+result2+")");
            }
        });
    }
}

