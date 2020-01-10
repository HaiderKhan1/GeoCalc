package com.example.haider.geo_calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button = (Button) findViewById(R.id.start_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_selection();
            }
        });

        button = (Button) findViewById(R.id.menu_btn);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v){
                openActivity_menu();
            }
        });
    }

    public void openActivity_selection(){
        Intent intent = new Intent(this, Selection.class);
        startActivity(intent);
    }

    public void openActivity_menu() {
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);

    }
}
