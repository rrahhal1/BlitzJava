package com.google.android.gms.location.places;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class zza
{
  static <E> List<E> zzf(Collection<E> paramCollection)
  {
    if ((paramCollection == null) || (paramCollection.isEmpty())) {
      return Collections.emptyList();
    }
    return new ArrayList(paramCollection);
  }
  
  static <E> Set<E> zzu(List<E> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return Collections.emptySet();
    }
    return Collections.unmodifiableSet(new HashSet(paramList));
  }
  
  public abstract Set<String> getPlaceIds();
  
  public boolean isRestrictedToPlacesOpenNow()
  {
    return false;
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/location/places/zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */