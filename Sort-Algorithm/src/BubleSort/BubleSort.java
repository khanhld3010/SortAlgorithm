package BubleSort;

import java.util.Arrays;

public class BubleSort {
    static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubleSort(list);
        System.out.println(Arrays.toString(list));
    }

    static void bubleSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = list.length - 1; j > i; j--) {
                if (list[j] < list[j - 1]){
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
        }
    }
}
