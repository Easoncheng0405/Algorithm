/*
 * Copyright [2018] [chengjie]
 *
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

package com.xiaomi.chengjie;

/*
 * author：chengjie
 * date：18-8-25
 * email：chengjie.jlu@qq.com
 */


import com.xiaomi.chengjie.sort.Sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int a[] = {1, 3, 2, 4, 6, 5};
        Sort.quickSort(a, 0, 5);
        System.out.println(Arrays.toString(a));
    }
}
