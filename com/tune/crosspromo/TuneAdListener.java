package com.tune.crosspromo;

public abstract interface TuneAdListener
{
  public abstract void onAdClick(TuneAd paramTuneAd);
  
  public abstract void onAdLoad(TuneAd paramTuneAd);
  
  public abstract void onAdLoadFailed(TuneAd paramTuneAd, String paramString);
  
  public abstract void onAdShown(TuneAd paramTuneAd);
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/tune/crosspromo/TuneAdListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */