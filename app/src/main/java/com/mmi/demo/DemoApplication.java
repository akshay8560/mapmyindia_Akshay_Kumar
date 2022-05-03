package com.mmi.demo;

import android.app.Application;

import com.mmi.services.account.MapmyIndiaAccountManager;

/**
 * Created by CE on 29/09/15.
 */
public class DemoApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    MapmyIndiaAccountManager.getInstance().setRestAPIKey(getRestAPIKey());
    MapmyIndiaAccountManager.getInstance().setMapSDKKey(getMapSDKKey());
    MapmyIndiaAccountManager.getInstance().setAtlasClientId(getAtlasClientId());
    MapmyIndiaAccountManager.getInstance().setAtlasClientSecret(getAtlasClientSecret());
    MapmyIndiaAccountManager.getInstance().setAtlasGrantType(getAtlasGrantType());


  }

  private String getAtlasGrantType() {
    return  "";
  }

  private String getAtlasClientSecret() {
    return "lrFxI-iSEg-ROSyPL8K7Gjlk8_LsQEWxACW7UG16Qu5tnsW600OXtgcAahg2dhO-sUotBdIrBQqrOqsj1FsnZRsgQS2Lre3c";
  }

  private String getAtlasClientId() {
    return "33OkryzDZsIi4qL4uSUNF3-A4CX37Hf3UrfPxZTVfoiuDFpbp19eufkvy308RHjhCuLRNiXbeD7jw6j7_R3-Cw==";
  }

  private String getMapSDKKey() {
    return "d7fcf647770ff526805e5674b4be1c57";
  }

  private String getRestAPIKey() {
    return "";
  }


}
