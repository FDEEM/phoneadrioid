package com.example.gaidziai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText this.username = (EditText) findViewById(R.id.username);
        EditText this.password = (EditText) findViewById(R.id.password);

        Button this.submit = (Button) findViewById(R.id.submit);


        Toast.makeText(MainActivity.this, "baksteltas mygtukas",
                Toast.LENGTH_LONG).show();
    }
}