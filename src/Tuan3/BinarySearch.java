package Tuan3;

public class BinarySearch {
    public int arr[];

    public BinarySearch(int x) {
        this.arr = new int[x];
    }

    public void generate() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        quicksort(0, arr.length-1);
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


    public void binarySearch(int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                System.out.println("Found at index " + m);
                return;
            }
            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        System.out.println("Not found");
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
