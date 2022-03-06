package service;
import java.util.Objects;

import domínio.Vetor;

public class VetorService
{
 public int difference(Vetor vetor) {
    //Requerindo objeto não-nulo.
    Objects.requireNonNull(vetor);
    
    //Variável para armazenarmos quantos pares foram encontrados.
    int result = 0;

    //Variável com o array de vetor.
    int[] arr = vetor.getArr();

    //Variável com a int x de vetor.
    int x = vetor.getX();

    //Sistema de 2 loops concatenados.
    for (int i = 0; i < arr.length; i++) {//1º loop: passa pelo primeiro item
        for (int j = 0; j < arr.length; j++) {//1º loop: compara um segundo item do array
            
        /*Comparamos os dois itens e colocamos uma segunda condição:
              não comparar um item com ele mesmo.*/
            if (arr[i] - arr[j] == x && j != i) {
                result++;
            }
        }
    }

    //Retornamos o resultado.
    return result;
 }
}
