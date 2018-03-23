package in.creativelizard.androidpermission;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by siddhartha on 27/10/16.
 */

public class CreativePermission {
    Context context;
    private int permission_code;
    private String[] permission;
    private ArrayList<String> permisionList;

    public Manifest.permission cPermissionType;
    public CreativePermission(Context context, int permission_code) {
        this.context = context;
        this.permission_code = permission_code;
        permisionList = new ArrayList<>();
    }

    public boolean hasPermissions() {

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && context != null && allPermissions() != null) {
            for (String permission : allPermissions()) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }

    public void reqPermisions(){

        permission = allPermissions().toArray(new String[0]);
        Log.e("noOfPermission",String.valueOf(permission.length));
        ActivityCompat.requestPermissions((Activity) context, permission, permission_code);
    }

    public ArrayList<String> allPermissions()
    {
        try {
            PackageInfo info = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.GET_PERMISSIONS);
            if (info.requestedPermissions != null) {
                for (String p : info.requestedPermissions) {
                    //permission = new String[]{p};
                    permisionList.add(p);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return permisionList;
    }

}