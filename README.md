
## Setup your project

Follow these steps to add the SDK to your project –

-   Create a new project in Android Studio
-   Add MapmyIndia repository in your project level ``build.gradle``
```groovy
allprojects {  
    repositories {  
    
        maven {  
            url 'https://maven.mapmyindia.com/repository/mapmyindia/'  
  }  
    }  
}
```
-   Add below dependency in your app-level ``build.gradle``
```groovy
implementation 'com.mapmyindia.sdk:mapmyindia-android-raster-sdk:2.5.1'
```
-   Add the following permissions to your AndroidManifest.xml file

```xml
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/> 
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" /> 
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" /> 
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
```
- Add these permissions in your project

**Add Java 8 support in your project**
_Add following lines in your app module's ``build.gradle``_
```groovy
compileOptions {
      sourceCompatibility 1.8
      targetCompatibility 1.8
}
```
### Add your API keys to the SDK -  
The grant type is "client_credentials" (without quotes).
#### Java
```java
MapmyIndiaAccountManager.getInstance().setRestAPIKey(getRestAPIKey());  
MapmyIndiaAccountManager.getInstance().setMapSDKKey(getMapSDKKey());  
MapmyIndiaAccountManager.getInstance().setAtlasGrantType(getAtlasGrantType());  
MapmyIndiaAccountManager.getInstance().setAtlasClientId(getAtlasClientId());  
MapmyIndiaAccountManager.getInstance().setAtlasClientSecret(getAtlasClientSecret());  
```
#### Kotlin
```kotlin
MapmyIndiaAccountManager.getInstance().restAPIKey = getRestAPIKey()  
MapmyIndiaAccountManager.getInstance().mapSDKKey = getMapSDKKey()  
MapmyIndiaAccountManager.getInstance().atlasGrantType = getAtlasGrantType()  
MapmyIndiaAccountManager.getInstance().atlasClientId = getAtlasClientId()  
MapmyIndiaAccountManager.getInstance().atlasClientSecret = getAtlasClientSecret()
```


