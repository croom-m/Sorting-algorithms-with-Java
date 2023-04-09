public class BubleSort {
  public static void bubleSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      for (int j = 1; j < arr.length; j++) {
        if (arr[j] < arr[j - 1]) {
          Main.swap(arr, j, j - 1);
        }
      }
    }
  }
}