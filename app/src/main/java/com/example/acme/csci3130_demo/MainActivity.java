package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView textView = findViewById(R.id.textView);
                EditText editText = findViewById(R.id.editText);
                Editable contents = editText.getText();
                textView.setText(contents);
            }
        });


    }


}
