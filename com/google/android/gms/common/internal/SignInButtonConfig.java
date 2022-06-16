package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SignInButtonConfig
  implements SafeParcelable
{
  public static final Parcelable.Creator<SignInButtonConfig> CREATOR = new zzaa();
  final int mVersionCode;
  private final Scope[] zzaem;
  private final int zzakD;
  private final int zzakE;
  
  SignInButtonConfig(int paramInt1, int paramInt2, int paramInt3, Scope[] paramArrayOfScope)
  {
    this.mVersionCode = paramInt1;
    this.zzakD = paramInt2;
    this.zzakE = paramInt3;
    this.zzaem = paramArrayOfScope;
  }
  
  public SignInButtonConfig(int paramInt1, int paramInt2, Scope[] paramArrayOfScope)
  {
    this(1, paramInt1, paramInt2, paramArrayOfScope);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaa.zza(this, paramParcel, paramInt);
  }
  
  public int zzqL()
  {
    return this.zzakD;
  }
  
  public int zzqM()
  {
    return this.zzakE;
  }
  
  public Scope[] zzqN()
  {
    return this.zzaem;
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/common/internal/SignInButtonConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */