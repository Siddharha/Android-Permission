package in.creativelizard.androidpermission;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final int PERMISSION_ALL = 100;
    private CreativePermission myPermission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

        CheckPermission();
    }

    private void CheckPermission() {
        if (!myPermission.hasPermissions()) {
            myPermission.reqPermisions();
        } else {
            Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9564751914"));
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            startActivity(intent);
        }
    }

    private void initialize() {
        myPermission = new CreativePermission(this,PERMISSION_ALL);
    }
}
