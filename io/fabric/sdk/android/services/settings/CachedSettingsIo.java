package io.fabric.sdk.android.services.settings;

import org.json.JSONObject;

public abstract interface CachedSettingsIo
{
  public abstract JSONObject readCachedSettings();
  
  public abstract void writeCachedSettings(long paramLong, JSONObject paramJSONObject);
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/io/fabric/sdk/android/services/settings/CachedSettingsIo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */