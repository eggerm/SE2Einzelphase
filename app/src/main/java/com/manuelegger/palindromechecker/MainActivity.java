package com.manuelegger.palindromechecker;

import android.content.Context;
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

        //create toast parameters
        Toast toast;
        Context context = getApplicationContext();
        CharSequence message = "";

        //get lower case letters without spaces
        palindrome = palindrome.toLowerCase().trim();

        if(palindrome.isEmpty()) {
            message = "Enter a word";
        }
        else if(palindrome.length() <= 5) {
            message = "word must be longer than 5 characters";
        }

        if (message.toString() != "") {
            toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            if (palindrome.equals(new StringBuilder(palindrome).reverse().toString())) {
                return "Wow ein Palindrom :)";
            } else {
                return "Leider ist es kein Palindrome :(";
            }
        }
        return "";
    }
}
