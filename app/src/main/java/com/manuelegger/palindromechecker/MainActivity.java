package com.manuelegger.palindromechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button checkPalindrome = (Button) findViewById(R.id.buttonCheckPalindrome);
        EditText input = (EditText) findViewById(R.id.editTextInput);
        final TextView output = (TextView) findViewById(R.id.textViewOutput);

        checkPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText("Button klicked");
            }
        });

    }
}
