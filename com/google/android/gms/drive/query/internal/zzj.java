package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zzj
  implements Parcelable.Creator<InFilter>
{
  static void zza(InFilter paramInFilter, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1000, paramInFilter.mVersionCode);
    zzb.zza(paramParcel, 1, paramInFilter.zzasb, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public InFilter zzcn(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    int i = 0;
    MetadataBundle localMetadataBundle = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzcc(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 1: 
        localMetadataBundle = (MetadataBundle)zza.zza(paramParcel, k, MetadataBundle.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new InFilter(i, localMetadataBundle);
  }
  
  public InFilter[] zzei(int paramInt)
  {
    return new InFilter[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/drive/query/internal/zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */