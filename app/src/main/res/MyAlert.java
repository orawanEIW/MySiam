import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Admin on 18/6/2560.
 */

public class MyAlert {
    private Context context;

    public MyAlert(Context context) {
        this.context = context;
    }

    public void myDialog(String strTitle, String strMessage){
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
        builder.setCancelable(false);
        builder.setIcon(android.R.mipmap.ic_name);
        builder.srtTitle(strTitle);
        builder.setMessage(strMessage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }

}   //Main Class
