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

        final TextView output = (TextView) findViewById(R.id.textViewOutput);
        final Button checkPalindrome = (Button) findViewById(R.id.buttonCheckPalindrome);
        final EditText input = (EditText) findViewById(R.id.editTextInput);

        checkPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               output.setText(checkPalindrome(input.getText().toString()));
            }
        });
    }

    public String checkPalindrome (String palindrome) {
        if(palindrome.equals(new StringBuilder(palindrome).reverse().toString())) {
            return "Wow ein Palindrom :)";
        }
        else {
            return "Leider ist es kein Palindrome :(";
        }
    }
}
