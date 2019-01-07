package fina.com.simplesubmission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ToDoDetailActivity extends AppCompatActivity {

    private static final String TODO_INDEX = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_detail);
        int todoIndex = getIntent().getIntExtra(TODO_INDEX, 0);

    }
}
