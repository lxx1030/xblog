package com.yx1030.xblog.arithmetic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sotr {

    public static void bubbleSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < data.length - i; j++) {
                System.out.println(data[j]+"和"+data[j+1]+"比较");
                if (data[j] > data[j + 1]) {
                    int tem =data[j];
                    data[j]=data[j+1];
                    data[j+1]=tem;
                }
                //        {3, 44, 38, 5}
//        [3, 38, 5, 44]
//        [3, 5, 38, 44]
//        [3, 5, 38, 44]

            }
            System.out.println(Arrays.toString(data));

        }

    }


    public static void main(String[] args) {
        int[] data = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] data2 = {3, 44, 38, 5};

        bubbleSort(data2);

    }
}
