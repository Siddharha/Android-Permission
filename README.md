# Android-Permission 
Easily handle permission in your Android app by "Android-Permission". It's easier than you think.
##Steps:

###1. Define:
** Define permission in Android Manifest:
# uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"
 
private static final int PERMISSION_ALL = 100; </br>
private CreativePermission myPermission;
private String[] PERMISSIONS = { Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE};
            
###2. Initialize:
myPermission = new CreativePermission(this,PERMISSIONS,PERMISSION_ALL);

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

## License

    Copyright 2016 Siddhartha Maji

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
