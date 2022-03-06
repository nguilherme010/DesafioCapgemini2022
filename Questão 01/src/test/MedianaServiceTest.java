package test;

import domínio.Mediana;
import service.MedianaService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

class MedianaServiceTest {

    int[] arr = {9, 2, 1, 4, 6};
    int[] arrEven = {9, 2, 1, 4, 6, 7};

    @Test
    @DisplayName("O exemplo do enunciado é correspondido.")
    void finder_ExampleCorresponds() throws Exception{
        Mediana mediana = new Mediana(arr);
        MedianaService medianaService = new MedianaService();

        int actual = medianaService.Finder(mediana);
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Retorna Exception quando array tem um n[umero par de inteiros.")
    void finder_WhenArrayLengthIsEven() throws Exception {
        Mediana mediana = new Mediana(arrEven);
        MedianaService medianaService = new MedianaService();

        Assertions.assertThrows(Exception.class, ()->{
            medianaService.Finder(mediana);
        });
    }
}