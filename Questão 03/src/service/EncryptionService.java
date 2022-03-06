package service;

import domínio.Encryption;

import java.util.Arrays;
import java.util.Objects;

public class EncryptionService {
    
    public String Encrypt(Encryption encryption) {
        //Requerindo objeto não-nulo.
        Objects.requireNonNull(encryption);

        //Criamos uma variável para a string de entrada, retirando os espaços da mesma.
        String str = encryption.getStr().replaceAll(" ", "");

        /* Array de strings que conterá as substrings da string original,
        do qual o valor é retornado pelo método firstDivison. */
        String[] strings = firstDivision(str);

        
        /* String com a criptografia final, da qual o valor
        é retornado pelo método secondDivison. */
        String result = secondDivison(strings);

        //Retornamos a criptografia.
        return result;
    }

    public String[] firstDivision(String str) {
        
        //Calculamos a raiz quadrada de str.length(), arredondada para cima e para baixo.
        int sqrtCeil = (int) Math.ceil(Math.sqrt(str.length()));
        //Array strings a ser retornado no final do método.
        String[] strings = new String[sqrtCeil];

        //Index descendente de quantos chars faltam na string.
        int charsLeft = str.length(); 
        
        //Index adicional para sistema.
        int index = 0; 

        //Divisão da string a cada (sqrtCeil) caracteres.
        for (int i = 0; i < strings.length; i++) {
            if (index < str.length()){
                strings[i] = str.substring(index, Math.min(index+sqrtCeil, str.length())); //<-- Excessão da última linha feita por Math.min
                
                //Enquanto os caracteres restantes forem maiores que sqrtCeil, o diminuimos.
                if(charsLeft > sqrtCeil) {
                    charsLeft = charsLeft - sqrtCeil;
                }
                //Quando se torna menor, o mantemos e seguimos à exceção no próximo loop.
                else;

                //Index aumentando a cada loop.
                index = index + sqrtCeil;
            }

            /* Else capturando o momento onde index é maior que tamanho da string,
            assim inserindo os últimos caracteres restantes no array.*/
            else{
                strings[i] = str.substring(str.length()-charsLeft);
            }
        }
        
        System.out.println(strings[strings.length-1]);

        if (strings[strings.length-1].equals(strings[strings.length-2])) {
            String[] temp = new String[strings.length-1];
            for (int i = 0; i < strings.length-1; i++) {
                temp[i] = strings[i];
            }
            strings = temp;
            System.out.println("string sem rep: " + Arrays.toString(strings));
        }

        //Retornamos o resultado.
        return strings;
    }


    public String secondDivison(String[] strings) {
        /*
        Definimos novamente as variáveis em relação à string inicial,
        mas agora a partir do array da 1ª divisão,
        assim criando independência entre os dois métodos utilizados.*/
        int length = 0;


        for (int i = 0; i < strings.length; i++) {
            length += strings[i].length();
        }

        System.out.println("strings.length(): " + length);

        //Raizes quadradas arredondadas para cima e para baixo;
        int sqrtCeil = (int) Math.ceil(Math.sqrt(length));
        int sqrtRound = (int) Math.round(Math.sqrt(length));
        System.out.println("sqrtCeil: " + sqrtCeil);
        System.out.println("sqrtRound: " + sqrtRound);
        
        /* Variável stringEnum, que nos diz se a quantidade de últimos caracteres
        é diferente da raiz quadrada. */
        int stringEnum = length % sqrtCeil;

        //Variável result, que será retornada no final do método.
        String result = "";

        /*
        Início da criptografia, 2 loops concatenados.
        */
        for (int j = 0; j < sqrtCeil; j++) { //1º loop: Transita entre cada item do Array.
            System.out.println("result: " + result);
            System.out.println("j: " + j);
            for (int i = 0; i < sqrtRound; i++) { //2º loop: Transita entre cada caractere.

                //If statement que inclui a excessão dos últimos caracteres da string.
                if (strings[i].length() < sqrtRound && j <= strings[i].length()-stringEnum) {
                    result += strings[i].charAt(strings[i].length()-stringEnum);
                    if (stringEnum > 1){
                        stringEnum--;
                    }
                    else;
                }
                //Incluindo casos onde strings[i] tem menos caracteres do que os outros.
                else if (strings[i].length() < sqrtCeil) {
                    continue;
                }
                //Caso restante (o mais comum), onde somente coletamos cada char.
                else {
                    result += strings[i].charAt(j);
                }
            }
            
            //Adicionando espaços a cada (sqrtCeil) caracteres.
            if (j < sqrtCeil-1){
                result += " ";
            }
            //Quando chegamos nos últimos caracteres, não fazemos nada.
            else {continue;}
        }

        //Retornando o resultado.
        return result;
    }
}

