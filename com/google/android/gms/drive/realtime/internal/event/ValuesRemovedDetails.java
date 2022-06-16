package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValuesRemovedDetails
  implements SafeParcelable
{
  public static final Parcelable.Creator<ValuesRemovedDetails> CREATOR = new zzj();
  final int mIndex;
  final int mVersionCode;
  final int zzasJ;
  final int zzasK;
  final String zzatk;
  final int zzatl;
  
  ValuesRemovedDetails(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, int paramInt5)
  {
    this.mVersionCode = paramInt1;
    this.mIndex = paramInt2;
    this.zzasJ = paramInt3;
    this.zzasK = paramInt4;
    this.zzatk = paramString;
    this.zzatl = paramInt5;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */