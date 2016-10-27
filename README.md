# Android-Permission
Easily handle permission in your Android app by "Android-Permission". It's easier than you think.

##Steps:

###1. Define:
private static final int PERMISSION_ALL = 100; </br>
private CreativePermission myPermission;
private String[] PERMISSIONS = { Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE};
            
###2. Initialize:
nmyPermission = new CreativePermission(this,PERMISSIONS,PERMISSION_ALL);

###3. Check Permission:
 if(!myPermission.hasPermissions(PERMISSIONS))
        {
            //Call Permission..
        }
        
###4. Request permission:
myPermission.reqPermisions();

____________________________________________________________________________________________________________

#Download JAR (.jar):
Download jar library file from this link: 
https://raw.githubusercontent.com/Siddharha/Android-Permission/master/app/release/android_permission.jar
