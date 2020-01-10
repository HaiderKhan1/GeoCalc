package com.example.haider.geo_calc;
        import android.app.Activity;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
public class Linear_selection extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_selection);
        Button but1= (Button) findViewById(R.id.but1);
        Button but2= (Button) findViewById(R.id.but2);
        Button but3= (Button) findViewById(R.id.but3);
        Button but4= (Button) findViewById(R.id.but4);
        Button but5= (Button) findViewById(R.id.but5);
        Button but6= (Button) findViewById(R.id.but6);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent= new Intent(getApplicationContext(),findY.class);
                startActivity(startIntent);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent= new Intent(getApplicationContext(), thirdActivity.class);
                startActivity(startIntent);
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent= new Intent(getApplicationContext(), fourthActivity.class);
                startActivity(startIntent);
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent= new Intent(getApplicationContext(), fifthActivity.class);
                startActivity(startIntent);
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent= new Intent(getApplicationContext(), sixthActivity.class);
                startActivity(startIntent);
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent= new Intent(getApplicationContext(), seventhActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
