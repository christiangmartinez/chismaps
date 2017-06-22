package io.xtian.chismaps.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.xtian.chismaps.R;

public class NewCommentActivity extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.newCommentText) EditText mNewCommentText;
    @Bind(R.id.newCommentButton) Button mNewCommentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_comment);
        ButterKnife.bind(this);
        mNewCommentButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mNewCommentButton) {
            String comment = mNewCommentText.getText().toString();
            Intent intent = new Intent(NewCommentActivity.this, FeedActivity.class);
            intent.putExtra("comment", comment);
            startActivity(intent);
        }
    }
}
