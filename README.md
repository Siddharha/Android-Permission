# Android-Permission 
Easily handle permission in your Android app by "Android-Permission". It's easier than you think.
##Steps:

###1. Define:
** Define permission in Android Manifest:
    
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>

 # And Then Follow Steps:
 
    private static final int PERMISSION_ALL = 100;
    private CreativePermission myPermission;
            
### 2. Initialize:
    myPermission = new CreativePermission(this,PERMISSION_ALL);

### 3. Check Permission:
     if (!myPermission.hasPermissions()) {//TODO:// IMPLEMENT CODE.}
        
### 4. Request permission:
    myPermission.reqPermisions();

### 5. Request Permission Result:
    @Override
       public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
           super.onRequestPermissionsResult(requestCode, permissions, grantResults); </br>

           if(requestCode == PERMISSION_ALL) {
    //Implement Your Code

           }
       }
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
