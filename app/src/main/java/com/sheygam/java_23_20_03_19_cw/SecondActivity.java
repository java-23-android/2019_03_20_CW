package com.sheygam.java_23_20_03_19_cw;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    EditText userInput;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button nextBtn = findViewById(R.id.next_btn);
        userInput = findViewById(R.id.user_input);
        nextBtn.setOnClickListener(this);
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.next_btn) {
//            Intent intent = new Intent(this, SecondActivity.class);
//
//            startActivity(intent);
            String str = String.valueOf(userInput.getText());
            Intent intent = new Intent();
            intent.putExtra("DATA",str);
            setResult(RESULT_OK,intent);
            finish();
        }

    }
}
