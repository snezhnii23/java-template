package edu.spbu.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by artemaliev on 07/09/15.
 */
public class IntSort {
  public static void sort(int array[])
  {
    int k = array.length;
    if (k == 1) return;
    int k1 = k/2;
    if (k % 2 == 1) k1++;
    int k2 = k - k1;
    int arr1[] = new int[k1];
    int arr2[] = new int[k2];
    for (int i = 0; i < k1; i++)
    {
      arr1[i] = array[i];
    }
    for (int i = k1; i < k; i++)
    {
      arr2[i - k1] = array[i];
    }
    sort(arr1);
    sort(arr2);
    int i = 0, j = 0, z = 0;
    while (z < k)
    {
      if (i < k1 && j < k2)
      {
        if (arr1[i] <= arr2[j]) {
          array[z] = arr1[i];
          i++;
          z++;
        }
        else {
          array[z] = arr2[j];
          j++;
          z++;
        }
      }
      if (i < k1 && j == k2)
      {
        array[z] = arr1[i];
        i++;
        z++;
      }
      if (i == k1 && j < k2)
      {
        array[z] = arr2[j];
        j++;
        z++;
      }
    }
  }


  public static void sort (List<Integer> list) {
    Collections.sort(list);
  }
}
