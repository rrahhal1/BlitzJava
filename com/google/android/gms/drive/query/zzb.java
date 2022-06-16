package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;

public class zzb
  implements Parcelable.Creator<SortOrder>
{
  static void zza(SortOrder paramSortOrder, Parcel paramParcel, int paramInt)
  {
    paramInt = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1000, paramSortOrder.mVersionCode);
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, paramSortOrder.zzarX, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, paramSortOrder.zzarY);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, paramInt);
  }
  
  public SortOrder zzcg(Parcel paramParcel)
  {
    boolean bool = false;
    int j = zza.zzau(paramParcel);
    ArrayList localArrayList = null;
    int i = 0;
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
        localArrayList = zza.zzc(paramParcel, k, FieldWithSortOrder.CREATOR);
        break;
      case 2: 
        bool = zza.zzc(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new SortOrder(i, localArrayList, bool);
  }
  
  public SortOrder[] zzeb(int paramInt)
  {
    return new SortOrder[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/drive/query/zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */