public class SelectionSort {
  public static void selectionSort(int[] mess) {
    for (int i = 0; i < mess.length; i++) {
      int min_index = i;
      int j;
      for (j = i + 1; j < mess.length; j++) {
        if (mess[j] < mess[min_index]) {
          min_index = j;
        }
      }
      Main.swap(mess, i, j);
    }
  }
}