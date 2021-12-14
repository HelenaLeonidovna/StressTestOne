package main.com.slice.sortarray;

import java.util.Arrays;

public class SortArray {

        // Cортировка выбором (Select)

        public String Select(int[] mas) {

        for (int i = 0; i < mas.length; i++) {
            int z = i;
            int minimal = mas[i];
            for (int x = i + 1; x < mas.length; x++) {
                if (mas[x] < minimal) {
                    z = x;
                    minimal = mas[x];
                }
            }
            mas[z] = mas[i];
            mas[i] = minimal;
        }
        return Arrays.toString(mas);
    }


}
