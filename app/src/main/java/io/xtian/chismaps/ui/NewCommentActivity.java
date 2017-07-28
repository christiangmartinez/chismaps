package io.xtian.chismaps.ui;

import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.xtian.chismaps.Constants;
import io.xtian.chismaps.R;
import io.xtian.chismaps.models.Comment;
import io.xtian.chismaps.models.User;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class NewCommentActivity extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.newCommentText) EditText mNewCommentText;
    @Bind(R.id.newCommentButton) Button mNewCommentButton;
    private String userLat;
    private String userLong;
    Comment newComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_comment);
        ButterKnife.bind(this);
        mNewCommentButton.setOnClickListener(this);
        Bundle b = getIntent().getExtras();
        userLat = Double.toString(b.getDouble("userLat"));
        userLong = Double.toString(b.getDouble("userLong"));
    }

    @Override
    public void onClick(View v) {
        if (v == mNewCommentButton) {
            String commentText = mNewCommentText.getText().toString();
            newComment = new Comment(userLat, userLong, commentText);
            DatabaseReference commentRef = FirebaseDatabase
                    .getInstance()
                    .getReference(Constants.FIREBASE_CHILD_COMMENTS);
            commentRef.push().setValue(newComment);
            Intent intent = new Intent(NewCommentActivity.this, MainActivity.class);
            intent.putExtra("commentText", commentText);
            startActivity(intent);

        }
    }
}
