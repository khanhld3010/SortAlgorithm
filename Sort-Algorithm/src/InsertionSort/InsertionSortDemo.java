package InsertionSort;

import java.util.Arrays;

public class InsertionSortDemo {
    static void main(String[] args) {
        int[] data = {9, 5, 1, 4, 3};
        System.out.println("Mảng ban đầu: " + Arrays.toString(data));
        insertionSort(data);
        System.out.println("\n--- Kết quả cuối cùng ---");
        System.out.println("Mảng đã sắp xếp: " + Arrays.toString(data));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // Bắt đầu từ phần tử thứ hai (index 1)
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            System.out.println("\nBước " + i + ": Đang xét giá trị key = " + key);
            // Di chuyển các phần tử lớn hơn key sang phải
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                System.out.println("  Dịch chuyển: " + Arrays.toString(arr));
            }
            // Chèn key vào vị trí trống
            arr[j + 1] = key;
            System.out.println("  => Sau khi chèn " + key + ": " + Arrays.toString(arr));
        }
    }
}
