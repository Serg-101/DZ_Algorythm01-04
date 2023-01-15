package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //        4. Реализовать сдвиг элементов в массиве на n влево или вправо.
        // [1, 2, 3, 4], n = 1 => [4, 1, 2, 3]
        //        public void shift(int[] array)
        int[] in = new int[]{0, 1, 2, 3, 4, 5};
        int direction = -1; // 1 - right;   -1 - left;
        int count = 6; // how many of scrolls do you want
        System.out.println(Arrays.toString(scroll(in, direction, count)));
    }

    public static int[] scroll(int[] val, int direction, int count) {
        int l = val.length;
        int t;
        for (int c = 0; c < count; c++) {
            if (direction < 0) {
                t = val[0];
                for (int i = 0; i < l - 1; i++) {
                    val[i] = val[i + 1];
                }
                val[l - 1] = t;
            } else {
                t = val[l - 1];
                for (int i = l - 1; i > 0; i--) {
                    val[i] = val[i - 1];
                }
                val[0] = t;
            }
        }
        return val;
    }
}