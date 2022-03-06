package test;

import domínio.Vetor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.VetorService;

class VetorServiceTest {

    int[] arrExample = {1, 5, 3, 4, 2};

    @Test
    @DisplayName("Exemplo do enunciado corresponde!")
    void difference_exampleCorresponds() {
        Vetor vetor = new Vetor(arrExample, 2);
        VetorService VetorService = new VetorService();

        int actual = VetorService.difference(vetor);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("No caso de x = 0, não se deve comparar um item com ele mesmo.")
    void difference_IfXEqualsZero() {
        Vetor vetor = new Vetor(arrExample, 0);
        VetorService VetorService = new VetorService();

        int actual = VetorService.difference(vetor);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}