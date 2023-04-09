public class InsertionSort {
  public static void insertionSort(int[] arr) {
    int i = 1;
    while (i < arr.length) {
      int j = i;
      while ((j > 0) && (arr[j] < arr[j - 1])) {
        Main.swap(arr, j, j - 1);
        j = j - 1;
      }
      i++;
    }
  }
}