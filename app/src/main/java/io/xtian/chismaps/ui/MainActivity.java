package io.xtian.chismaps.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.xtian.chismaps.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.newComment) ImageView mNewComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mNewComment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mNewComment) {
            Intent intent = new Intent(MainActivity.this, NewCommentActivity.class);
            startActivity(intent);
        }
    }
}
