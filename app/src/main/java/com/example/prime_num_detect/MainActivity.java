package com.example.prime_num_detect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView, text;
    private EditText editText;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView) findViewById(R.id.tt);
        textView = (TextView) findViewById(R.id.et1);
        editText = (EditText) findViewById(R.id.et2);
        button = (Button) findViewById(R.id.btn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num= editText.getText().toString();
                long n= Long.parseLong(num);
                int f=0;
                editText.setText("");
                if (n==1){
                    textView.setText("1\nNot Prime Number ");
                }
                else if(n==2){
                    textView.setText("2\nPrime Number ");
                }

                for (long i=2; i<n; i++){
                    long r=n%i;
                    if(r==0){
                        textView.setText(n+"\nNot Prime Number ");
                        f=1;
                        break;
                    }
                    else if(f==0){
                        textView.setText(n+"\nPrime Number");

                    }
                }

            }
        });
    }
}