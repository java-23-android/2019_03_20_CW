package com.sheygam.java_23_20_03_19_cw;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.next_btn) {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("NAME", "Vasya");
//            startActivity(intent);
            startActivityForResult(intent, 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode == RESULT_OK && requestCode == 1) {
            Toast.makeText(this,
                    data.getStringExtra("DATA"),
                    Toast.LENGTH_SHORT)
                    .show();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
