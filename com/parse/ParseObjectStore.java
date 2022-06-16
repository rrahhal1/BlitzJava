package com.parse;

import bolts.Task;

abstract interface ParseObjectStore<T extends ParseObject>
{
  public abstract Task<Void> deleteAsync();
  
  public abstract Task<Boolean> existsAsync();
  
  public abstract Task<T> getAsync();
  
  public abstract Task<Void> setAsync(T paramT);
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/parse/ParseObjectStore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */