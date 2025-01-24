package Tuan3;

public class QuickSort {
    public int arr[];

    public QuickSort(int x) {
        this.arr = new int[x];
    }

    public void generate() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
    }

    public void quicksort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quicksort(low, pi-1);
            quicksort(pi + 1, high);
        }
    }

    public int partition(int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
