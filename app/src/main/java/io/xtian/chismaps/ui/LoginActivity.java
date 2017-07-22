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

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.loginEmail) EditText loginEmail;
    @Bind(R.id.loginPassword) EditText loginPassword;
    @Bind(R.id.loginButton) Button loginButton;
    @Bind(R.id.createNewAccount) TextView createNewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        createNewAccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == createNewAccount) {
            Intent intent = new Intent (LoginActivity.this, CreateAccountActivity.class);
            startActivity(intent);
        }
    }
}
