package com.example.helloandrew;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView4)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                findViewById(R.id.relativeLayout).setBackgroundColor(getResources().getColor(R.color.orange));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // grab the text that the user inputted
                // put the text into our text view once the 'change text' button is clicked
                // OLD: ((TextView) findViewById(R.id.textView4)).setText("Goodbye.");
                String newText = ((EditText) findViewById(R.id.EditText)).getText().toString();
                if (TextUtils.isEmpty(newText)){
                    ((TextView) findViewById(R.id.textView4)).setText("Hello from Andrew");
                } else {
                    ((TextView) findViewById(R.id.textView4)).setText(newText);
                }

            }
        });

        findViewById(R.id.relativeLayout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // reset the text color back to original (black)
                ((TextView) findViewById(R.id.textView4)).setTextColor(getResources().getColor(R.color.black));
                // reset the background color back to the original (colorAccent)
                findViewById(R.id.relativeLayout).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                // reset the text back to 'Hello from Andrew'
                ((TextView) findViewById(R.id.textView4)).setText("Hello from Andrew");
            }
        });

    }
}
