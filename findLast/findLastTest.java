import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class findLastTest
{
   // this test passes
   @Test public void normalCase()
   {
      int arr[] = {2, 7, 0, 3};
      assertEquals("Index 1", 1, findLast.findLast(arr, 7));
   }

   @Test public void firstIndex()
   {
      int arr[] = {2, 7, 0, 3};
      assertEquals("Index first", 0, findLast.findLast(arr, 2));
   }

   @Test public void lastIndex()
   {
      int arr[] = {2, 7, 0, 3};
      assertEquals("Index last", 3, findLast.findLast(arr, 3));
   }

   @Test public void twoIndex()
   {
      int arr[] = {2, 7, 0, 7, 9};
      assertEquals("Two index", 3, findLast.findLast(arr, 7));
   }

   @Test public void onlyOne()
   {
      int arr[] = {7};
      assertEquals("Only one", 0, findLast.findLast(arr, 7));
   }

   @Test public void notFound()
   {
      int arr[] = {7, 4, 2, 0};
      assertEquals("not found", -1, findLast.findLast(arr, 5));
   }

   @Test (expected = NullPointerException.class)
   public void nullList()
   {
      int arr[] = null;
      findLast.findLast(arr, 3);
   }
 }
