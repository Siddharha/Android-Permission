package in.creativelizard.androidpermission;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;

/**
 * Created by siddhartha on 27/10/16.
 */

public class CreativePermission {
    private static Context context;

    int permissionType;
    String[] permission;
    public CreativePermission(Context context, String[] permission, int permissionType) {
        this.context = context;
        this.permission = permission;
        this.permissionType = permissionType;
    }

    public static boolean hasPermissions(String... permissions) {
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && context != null && permissions != null) {
            for (String permission : permissions) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }

    public void reqPermisions(){
        ActivityCompat.requestPermissions((Activity) context, permission, permissionType);
    }

}