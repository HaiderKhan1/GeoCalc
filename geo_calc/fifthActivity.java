package com.example.haider.geo_calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class fifthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        Button Manswer= (Button) findViewById(R.id.Manswer);
        Manswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Text1 = (EditText) findViewById(R.id.Text1);
                EditText Text2 = (EditText) findViewById(R.id.Text2);
                EditText Text3 = (EditText) findViewById(R.id.Text3);
                EditText Text4 = (EditText) findViewById(R.id.Text4);
                TextView resultTextView= (TextView) findViewById(R.id.resultTextView);
                int num1= Integer.parseInt(Text1.getText().toString());
                int num2= Integer.parseInt(Text2.getText().toString());
                int num3= Integer.parseInt(Text3.getText().toString());
                int num4= Integer.parseInt(Text4.getText().toString());
                double result= (double) (num3-num1)/(num4-num2);
                resultTextView.setText("Slope = " + result);
            }
        });
    }
}
