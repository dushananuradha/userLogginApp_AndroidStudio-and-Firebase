package com.example.dbtestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private EditText fName;
    private Button signUp;

    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fName = findViewById(R.id.editFirstName);
        signUp = findViewById(R.id.btn_Signup);

        signUp.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = fName.getText().toString();
                root.setValue(name);
            }
        }));
    }
}