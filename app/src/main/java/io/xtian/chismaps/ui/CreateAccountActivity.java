package io.xtian.chismaps.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.xtian.chismaps.R;

public class CreateAccountActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.newEmail) EditText newEmail;
    @Bind(R.id.newUsername) EditText newUsername;
    @Bind(R.id.newPassword) EditText newPassword;
    @Bind(R.id.newConfirmPassword) EditText newConfirmPassword;
    @Bind(R.id.startButton) Button  startButton;
    @Bind(R.id.goLogin) TextView goLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        ButterKnife.bind(this);
        startButton.setOnClickListener(this);
        goLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mGoLogin) {
            Intent intent = new Intent(CreateAccountActivity.this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        }

        if (v == startButton) {
            createAccount();
        }
    }

    private void createAccount() {
        final String email = newEmail.getText().toString().trim();
        final String username = newUsername.getText().toString().trim();
        final String password = newPassword.getText().toString().trim();
        final String confirmPassword = newConfirmPassword.getText().toString().trim();
    }
}
