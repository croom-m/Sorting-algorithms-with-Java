public class QuickSort {
  public static void quickSort(int[] arr) {
    quickSortHelper(arr, 0, arr.length);
  }

  public static void quickSortHelper(int[] arr, int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      quickSortHelper(arr, low, pi);
      quickSortHelper(arr, pi + 1, high);
    }
  }

  public static int partition(int[] arr, int low, int high) {
    int mid = high - 1;
    for (int i = high - 1; i > low; i--) {
      if (arr[i] > arr[low]) {
        Main.swap(arr, i, mid);
        mid--;
      }
    }
    Main.swap(arr, low, mid);
    return mid;
  }
}