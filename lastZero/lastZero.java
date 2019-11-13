public class lastZero
{
  /**
  * Find LAST index of zero
  *
  * @param x array to search
  * @return index of last 0 in x; -1 if absent
  * @throws NullPointerException if x is null
  */
  public static int lastZero (int[] x)
  {
    for (int i = x.length - 1; i >= 0; i--) //hacemos que el for vaya en orden inverso
    {
      if (x[i] == 0)
      {
        return i;
      }
    }
    return -1;
  }
}
