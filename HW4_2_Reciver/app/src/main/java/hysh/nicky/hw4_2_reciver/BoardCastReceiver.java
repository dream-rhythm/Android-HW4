package hysh.nicky.hw4_2_reciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BoardCastReceiver extends BroadcastReceiver {
    public BoardCastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String msg = intent.getStringExtra("boardcast_Name");

        /*Toast.makeText(context, "Received message: " + msg,
                Toast.LENGTH_SHORT).show();*/
        Toast.makeText(context, "广播来了", Toast.LENGTH_SHORT).show();

        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
