package hysh.nicky.sender;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ToBoardCast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_board_cast);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String name = getIntent().getStringExtra("Name");
        TextView tv = new TextView(ToBoardCast.this);
        tv.setText("name="+name);


        Intent intent = new Intent("nickyboardcast");
        //intent.setAction("nicky.boardcast");
        intent.putExtra("boardcast_Name", name);
        sendBroadcast(intent);

        setContentView(tv);
    }

}
