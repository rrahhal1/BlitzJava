package com.crashlytics.android.core;

class CreateReportRequest
{
  public final String apiKey;
  public final Report report;
  
  public CreateReportRequest(String paramString, Report paramReport)
  {
    this.apiKey = paramString;
    this.report = paramReport;
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/crashlytics/android/core/CreateReportRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */