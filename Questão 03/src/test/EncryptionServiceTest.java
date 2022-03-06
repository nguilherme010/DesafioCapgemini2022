package test;

import domínio.Encryption;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import service.EncryptionService;

class EncryptionServiceTest {

    @Test
    @DisplayName("Exemplo 1 corresponde com o esperado.")
    void encrypt_Example1Corresponds() {
        Encryption encryption = new Encryption("tenha um bom dia");
        EncryptionService encryptionService = new EncryptionService();

        String actual = encryptionService.Encrypt(encryption);
        String expected = "taoa eum nmd hbi";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Exemplo 2 corresponde com o esperado.")
    void encrypt_Example2Corresponds() {
        Encryption encryption = new Encryption("ola mundo");
        EncryptionService encryptionService = new EncryptionService();

        String actual = encryptionService.Encrypt(encryption);
        String expected = "omd luo an";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Caso com a raiz quadrada com arredondamento para baixo.")
    void encrypt_SquareRootRoundedDownCase() {
        Encryption encryption = new Encryption("voce tenha um bom dia");
        EncryptionService encryptionService = new EncryptionService();

        String actual = encryptionService.Encrypt(encryption);
        String expected = "vemi onba cho eam tud";

        Assertions.assertEquals(expected, actual);
    }
}