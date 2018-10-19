
## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Requirement
The project requires minimum Android API 16+ (4.1 JellyBean) SDK to test. And you can use any development software of your choice, I used Android Studio making this.

### Test Run
Try rebuilding the project on your programming environment, once you are done fixing any error (incase if one came up), you'll be ready to look into the project.

### Permissions
You can remove any of the following requests if you do not need them or you can disable any feature using easy setup variables.
```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
<uses-permission android:name="android.permission.CAMERA"/>
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.VIBRATE" />
```
`INTERNET` permission is required if you are requesting a weburl or webpage and `WRITE_EXTERNAL_STORAGE` is required for camera photo creation, if you have enabled `ASWP_FUPLOAD` and `ASWP_CAMUPLOAD` to upload image files.

### Easy Setup
Once your project is ready here are some static variables you can change as per your Apps requirement.

#### Permission variables

```java
static boolean ASWP_JSCRIPT     = true;     //enable JavaScript for webview
static boolean ASWP_FUPLOAD     = true;     //upload file from webview
static boolean ASWP_CAMUPLOAD   = true;     //enable upload from camera for photos
static boolean ASWP_LOCATION    = true;     //track GPS locations
static boolean ASWP_RATINGS     = true;     //show ratings dialog; auto configured, edit method get_rating() for customizations
static boolean ASWP_PBAR        = true;     //show progress bar in app
static boolean ASWP_ZOOM        = false;    //zoom in webview
static boolean ASWP_SFORM       = false;    //save form cache and auto-fill information
static boolean ASWP_OFFLINE		= false;	//whether the loading webpages are offline or online
static boolean ASWP_EXTURL		= true;		//open external url with default browser instead of app webview
```

#### Configuration variables
Complete URL of your website, landing page or local file as (file:///android_res/dir/file.html)
```java
ASWV_URL      = "http://awanto.cf";	//domain, or directory or locating to any root file
```
If file upload enabled, you can define its extention type, default is "\*/\*" for all file types;

Use "image/*" for image types; check file type references on web for more
```java
ASWV_F_TYPE   = "*/*";
```

## Getting GPS Location
If `ASWP_LOCATION = true` then the app will start requesting GPS locations of the device on regular basis and all of the recorded data will be sent to the webpage in terms of cookies, updating along with locations.
```java
COOKIE "lat" for latitude
COOKIE "long" for longitude
```