package com.google.android.gms.drive.query;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;
import com.google.android.gms.drive.query.internal.HasFilter;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.NotFilter;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.query.internal.OwnedByMeFilter;

public class Filters
{
  public static Filter and(Filter paramFilter, Filter... paramVarArgs)
  {
    return new LogicalFilter(Operator.zzasw, paramFilter, paramVarArgs);
  }
  
  public static Filter and(Iterable<Filter> paramIterable)
  {
    return new LogicalFilter(Operator.zzasw, paramIterable);
  }
  
  public static Filter contains(SearchableMetadataField<String> paramSearchableMetadataField, String paramString)
  {
    return new ComparisonFilter(Operator.zzasz, paramSearchableMetadataField, paramString);
  }
  
  public static Filter eq(CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    if (paramString != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Custom property value may not be null.");
      return new HasFilter(SearchableField.zzarW, new AppVisibleCustomProperties.zza().zza(paramCustomPropertyKey, paramString).zztb());
    }
  }
  
  public static <T> Filter eq(SearchableMetadataField<T> paramSearchableMetadataField, T paramT)
  {
    return new ComparisonFilter(Operator.zzasr, paramSearchableMetadataField, paramT);
  }
  
  public static <T extends Comparable<T>> Filter greaterThan(SearchableOrderedMetadataField<T> paramSearchableOrderedMetadataField, T paramT)
  {
    return new ComparisonFilter(Operator.zzasu, paramSearchableOrderedMetadataField, paramT);
  }
  
  public static <T extends Comparable<T>> Filter greaterThanEquals(SearchableOrderedMetadataField<T> paramSearchableOrderedMetadataField, T paramT)
  {
    return new ComparisonFilter(Operator.zzasv, paramSearchableOrderedMetadataField, paramT);
  }
  
  public static <T> Filter in(SearchableCollectionMetadataField<T> paramSearchableCollectionMetadataField, T paramT)
  {
    return new InFilter(paramSearchableCollectionMetadataField, paramT);
  }
  
  public static <T extends Comparable<T>> Filter lessThan(SearchableOrderedMetadataField<T> paramSearchableOrderedMetadataField, T paramT)
  {
    return new ComparisonFilter(Operator.zzass, paramSearchableOrderedMetadataField, paramT);
  }
  
  public static <T extends Comparable<T>> Filter lessThanEquals(SearchableOrderedMetadataField<T> paramSearchableOrderedMetadataField, T paramT)
  {
    return new ComparisonFilter(Operator.zzast, paramSearchableOrderedMetadataField, paramT);
  }
  
  public static Filter not(Filter paramFilter)
  {
    return new NotFilter(paramFilter);
  }
  
  public static Filter openedByMe()
  {
    return new FieldOnlyFilter(SearchableField.LAST_VIEWED_BY_ME);
  }
  
  public static Filter or(Filter paramFilter, Filter... paramVarArgs)
  {
    return new LogicalFilter(Operator.zzasx, paramFilter, paramVarArgs);
  }
  
  public static Filter or(Iterable<Filter> paramIterable)
  {
    return new LogicalFilter(Operator.zzasx, paramIterable);
  }
  
  public static Filter ownedByMe()
  {
    return new OwnedByMeFilter();
  }
  
  public static Filter sharedWithMe()
  {
    return new FieldOnlyFilter(SearchableField.zzarV);
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/drive/query/Filters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */