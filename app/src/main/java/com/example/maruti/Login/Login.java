package com.example.maruti.Login;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.maruti.MainActivity;
import com.example.maruti.databinding.ActivityLoginBinding;
import com.ncorti.slidetoact.SlideToActView;

public class Login extends AppCompatActivity {
    ActivityLoginBinding binding;
    TextWatcher mTextEditorWatcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextEditorWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count > 5) {

                } else {

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };

        binding.passwordEt.addTextChangedListener(mTextEditorWatcher);


        binding.loginBtn.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                Toast.makeText(Login.this, "जय श्री राम", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Login.this, MainActivity.class));
            }
        });
    }
}