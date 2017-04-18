package hysh.nicky.hw4_2_reciver;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BoardCastReceiver extends BroadcastReceiver {
    public BoardCastReceiver() {
    }
    int MesID = 54321;
    @Override
    public void onReceive(Context context, Intent intent) {
        String name = intent.getStringExtra("UserName");



        Intent sender = new Intent();
        sender.setClass(context, MainActivity.class);
        sender.putExtra("Name",name);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, sender,PendingIntent.FLAG_UPDATE_CURRENT);

        Notification notify = null;
        notify = newNotification(context, pendingIntent, "Hello", name);

        NotificationManager notificationManager =
                (NotificationManager)context.
                        getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(MesID++, notify);
        //Toast.makeText(context, "广播来了", Toast.LENGTH_SHORT).show();

        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");
    }
    private Notification newNotification(
            Context context, PendingIntent pi,
            String title, String msg) {

        Notification.Builder builder =
                new Notification.Builder(context);
        builder.setContentTitle(title);
        builder.setContentText(msg);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentIntent(pi);
        builder.setTicker(msg);
        builder.setWhen(System.currentTimeMillis());
        Notification notify = builder.build();
        return notify;
    }
}
