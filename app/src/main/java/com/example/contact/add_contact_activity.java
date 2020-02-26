package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class add_contact_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact_activity);

        final EditText name = (EditText)findViewById(R.id.name);
        final EditText phn = (EditText)findViewById(R.id.phn);
        final EditText mail = (EditText)findViewById(R.id.email);

        Button add = (Button)findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Toast.makeText(add_contact_activity.this,"Name: "+name.getText().toString()+" Phn : "+
                         phn.getText().toString()+ " Email: "+mail.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
