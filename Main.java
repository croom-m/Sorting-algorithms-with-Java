public class Main {
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String a[]) {
    int[] arr = { 5, 4, 3, 2, 1 };
    // BubleSort.bubleSort(arr);
    // InsertionSort.insertionSort(arr);
    // SelectionSort.selectionSort(arr);
    // MergeSort.mergeSort(arr);
    QuickSort.quickSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      System.out.print(" ");
    }
  }
}