package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class zzx
  extends zzdd
{
  private static final String ID = zzad.zzbX.toString();
  private static final String VALUE = zzae.zzhY.toString();
  private static final String zzbdE = zzae.zzej.toString();
  private final DataLayer zzbcG;
  
  public zzx(DataLayer paramDataLayer)
  {
    super(ID, new String[] { VALUE });
    this.zzbcG = paramDataLayer;
  }
  
  private void zza(zzag.zza paramzza)
  {
    if ((paramzza == null) || (paramzza == zzdf.zzFD())) {}
    do
    {
      return;
      paramzza = zzdf.zzg(paramzza);
    } while (paramzza == zzdf.zzFI());
    this.zzbcG.zzfj(paramzza);
  }
  
  private void zzb(zzag.zza paramzza)
  {
    if ((paramzza == null) || (paramzza == zzdf.zzFD())) {}
    for (;;)
    {
      return;
      paramzza = zzdf.zzl(paramzza);
      if ((paramzza instanceof List))
      {
        paramzza = ((List)paramzza).iterator();
        while (paramzza.hasNext())
        {
          Object localObject = paramzza.next();
          if ((localObject instanceof Map))
          {
            localObject = (Map)localObject;
            this.zzbcG.push((Map)localObject);
          }
        }
      }
    }
  }
  
  public void zzK(Map<String, zzag.zza> paramMap)
  {
    zzb((zzag.zza)paramMap.get(VALUE));
    zza((zzag.zza)paramMap.get(zzbdE));
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/tagmanager/zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */