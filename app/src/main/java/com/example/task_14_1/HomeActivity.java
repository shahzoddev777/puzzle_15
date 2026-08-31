package com.example.task_14_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


public class HomeActivity extends AppCompatActivity {
    AppCompatButton contino;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        EditText nameInput = findViewById(R.id.sozlar);
        Button button = findViewById(R.id.startbtn);
        button.setOnClickListener(v -> {
            String username = nameInput.getText().toString().trim();
            if (!username.isEmpty()) {

                getSharedPreferences("PUZZLE_SAVE", MODE_PRIVATE).edit().clear().apply();
                Intent intent = new Intent(this, GameActivity.class);
                intent.putExtra("uernameMain", username);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Ismingizni kiriting!", Toast.LENGTH_SHORT).show();
            }
        });
        AppCompatButton info = findViewById(R.id.infon);
        info.setOnClickListener(view -> {
            Intent intent = new Intent(this, InfoActivity.class);
            startActivity(intent);
        });
        contino = findViewById(R.id.continio);
        contino.setOnClickListener(view -> {
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onResume() {
        if (getSharedPreferences("PUZZLE_SAVE", MODE_PRIVATE).getBoolean("saved",false)){
            contino.setVisibility(View.VISIBLE);
        }else {
            contino.setVisibility(View.INVISIBLE);
        }
        super.onResume();
    }
}
