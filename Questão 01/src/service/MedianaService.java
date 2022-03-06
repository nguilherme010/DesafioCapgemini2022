package service;

import domínio.Mediana;

import java.util.Arrays;

public class MedianaService {
    public int Finder(Mediana mediana) throws Exception {
        if (mediana.getArr().length % 2 == 0) {
            throw new Exception("Array length can't be even.");
        }

        int[] arr = mediana.getArr();

        Arrays.sort(arr);

        int index = arr.length / 2;

        return arr[index];
    }
}
