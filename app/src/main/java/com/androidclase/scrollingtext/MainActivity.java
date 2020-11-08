package com.androidclase.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showComment(View view) {
        EditText appearComment = findViewById(R.id.comment);
        appearComment.setVisibility(view.VISIBLE);
    }
}