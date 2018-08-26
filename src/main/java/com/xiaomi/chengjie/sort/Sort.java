/*
 * Copyright [2018] [chengjie]
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xiaomi.chengjie.sort;

/*
 * author：chengjie
 * date：18-8-25
 * email：chengjie.jlu@qq.com
 */


public class Sort {

    public static void bubbleSort(int[] arr) {

        int length = arr.length, temp;

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++)
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        }
    }


    public static void quickSort(int[] arr, int l, int r) {

        if (l >= r)
            return;
        int temp = arr[l];
        int i = l, j = r;
        while (i < j) {
            //find first element smart than temp
            while (i < j && arr[j] >= temp) j--;
            //find first element bigger than temp
            while (i < j && arr[i] <= temp) i++;
            if (i < j) {
                int a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
        }
        arr[l] = arr[i];
        arr[i] = temp;

        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }


}
