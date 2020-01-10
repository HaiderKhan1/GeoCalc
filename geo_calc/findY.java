package com.example.haider.geo_calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class findY extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_y);
        Button Yanswer = (Button) findViewById(R.id.Yanswer);
        Yanswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                EditText thirdNumEditText = (EditText) findViewById(R.id.thirdNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id. resultTextView);
                int num1= Integer.parseInt(firstNumEditText.getText().toString());
                int num2= Integer.parseInt(secondNumEditText.getText().toString());
                int num3= Integer.parseInt(thirdNumEditText.getText().toString());
                double result=(double) (num3*num2) + num1;
                resultTextView.setText("Y = " + result);
            }
        });
    }
}
