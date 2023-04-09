import java.util.Arrays;

public class MergeSort {
  public static void mergeSort(int[] arr) {
    System.arraycopy(mergeSortHelper(arr), 0, arr, 0, arr.length);
  }

  static int[] mergeSortHelper(int[] arr) {
    if (arr.length > 1) {
      int size = arr.length / 2;
      int[] left = mergeSortHelper(Arrays.copyOfRange(arr, 0, size));
      int[] right = mergeSortHelper(Arrays.copyOfRange(arr, size, arr.length));
      System.arraycopy(merge(left, right), 0, arr, 0, arr.length);
    }
    return arr;
  }

  static int[] merge(int[] left, int[] right) {
    int l = 0;
    int r = 0;
    int j = 0;
    int[] merged = new int[left.length + right.length];
    while ((l < left.length) && (r < right.length)) {
      if (left[l] < right[r]) {
        merged[j] = left[l];
        l++;
      } else {
        merged[j] = right[r];
        r++;
      }
      j++;
    }
    for (int i = l; i < left.length; i++) {
      merged[j] = left[i];
      j++;
    }
    for (int i = r; i < right.length; i++) {
      merged[j] = right[i];
      j++;
    }
    return merged;
  }
}