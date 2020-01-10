package com.example.haider.geo_calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class fourthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        Button Banswer= (Button) findViewById(R.id.Banswer);
        Banswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstEditText= (EditText) findViewById(R.id.firstEditText);
                EditText secondEditText= (EditText) findViewById(R.id.secondEditText);
                EditText thirdEditText= (EditText) findViewById(R.id.thirdEditText);
                TextView resultTextView= (TextView) findViewById(R.id.resultTextView);
                int num1= Integer.parseInt(firstEditText.getText().toString());
                int num2= Integer.parseInt(secondEditText.getText().toString());
                int num3= Integer.parseInt(thirdEditText.getText().toString());
                double result= (double) num1-(num2*num3);
                resultTextView.setText("B = " + result);
            }
        });
    }
}
