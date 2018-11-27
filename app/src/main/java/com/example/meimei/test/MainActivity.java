package com.example.meimei.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        edt = (EditText) findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText("helloWorld,hhhhhhhhhhh");

            }
        });
    }

}
