package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

public class PreviewActivity
  extends Activity
{
  private void zzk(String paramString1, String paramString2, String paramString3)
  {
    AlertDialog localAlertDialog = new AlertDialog.Builder(this).create();
    localAlertDialog.setTitle(paramString1);
    localAlertDialog.setMessage(paramString2);
    localAlertDialog.setButton(-1, paramString3, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    localAlertDialog.show();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    try
    {
      super.onCreate(paramBundle);
      zzbg.zzaG("Preview activity");
      paramBundle = getIntent().getData();
      if (!TagManager.getInstance(this).zzp(paramBundle))
      {
        paramBundle = "Cannot preview the app with the uri: " + paramBundle + ". Launching current version instead.";
        zzbg.zzaH(paramBundle);
        zzk("Preview failure", paramBundle, "Continue");
      }
      paramBundle = getPackageManager().getLaunchIntentForPackage(getPackageName());
      if (paramBundle != null)
      {
        zzbg.zzaG("Invoke the launch activity for package name: " + getPackageName());
        startActivity(paramBundle);
        return;
      }
      zzbg.zzaG("No launch activity found for package name: " + getPackageName());
      return;
    }
    catch (Exception paramBundle)
    {
      zzbg.e("Calling preview threw an exception: " + paramBundle.getMessage());
    }
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/tagmanager/PreviewActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */