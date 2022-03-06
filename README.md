<p>
  <img src="https://user-images.githubusercontent.com/79665665/154409190-de18a9c6-9941-472a-8362-25b2685ccd88.png">
</p>
<h1> Desafio dos programadores! </h1>
<p> Programas  para o desafio de programação  da Academia Técnica da empresa Capgemini, um dos processos seletivos da empresa.</p>
    
<h3>Status: Pronto! :heavy_check_mark: </h3>

<h1>:artificial_satellite: Tecnologias utilizadas</h1>

   - **IDE**: IntelliJ IDEA Community Edition 2021<br/>
   - **JDK**: 17.0.2 (Requerido)<br/>
   - **Apache Maven**: 3.8.4 (Requerido)<br/>
   - **JUnit Jupiter**: 5.8.1, **platform**: 1.8.1 (Dependência)

<h1>:technologist: Instruções para execução e testes</h1>

1. Acesse os [Releases](https://github.com/nguilherme010/DesafioCapgemini2022/releases)<br/>
2. Faça o download do release (.zip), contendo o projeto.<br/>
3. Extraia o arquivo e, numa IDE de sua escolha, abra a pasta de alguma das questões (e.g. "Desafio Capgemini/Questão 01").

<h1>:card_file_box: Packages</h1>

   - **Package _domínio_**: contém a declaração de variáveis, setters e getters.
   - **Package _service_**: contém o programa referente aos enunciados, recebendo e retornando os valores requeridos.
   - **Package _test_**: contém testes unitários, que testam se os programa correspondem com as entradas e saídas requeridas.

<h1>Sobre a Questão 1</h1>

Questão simples, divertida para testar o método de organização de packages.

  - Além dos testes de correspondência com os exemplos do enunciado, o projeto contém um teste para o caso de o array inserido ter um número par de inteiros.

Toda o passo-a-passo do código está documentado no próprio código, através dos comentários.

<h1>Sobre a Questão 2</h1>

Uma simples exploração de concatenação de 2 loops.

  - Além dos testes de correspondência com os exemplos do enunciado, o projeto contém um teste para o caso de o valor de x inserido seja 0, que testa se o sistema não compara um número consigo mesmo, e somente compara se existem itens diferentes com valores iguais.

Toda o passo-a-passo do código está documentado no próprio código, através dos comentários.

<h1>Sobre a Questão 3</h1>

Com certeza, a __questão mais difícil__ das três: </br>Temos de criar um __sistema de criptografia__ baseado na __raiz quadrada de length da string__ em questão.

> Um fato curioso é que neste sistema, quando a raiz quadrada de length equivale a um número cujo o valor decimal é menor que 0,5 (ou seja, seria arredondado para baixo),
o sistema tem de usar o valor arredondado para baixo, assim como arredondado para cima. Isso não ocorre em casos onde o arredondamento já ocorre para cima, pois o sistema acaba não precisando do valor arredondado para baixo.
Nos dois exemplos dos enunciados, este arredondamento é para cima, fazendo com que, caso testemos somente com estes exemplos, passemos despercebidos por este outro padrão.</br>

  - Além dos testes de correspondência com os exemplos do enunciado, o projeto contém um teste para o caso de haver uma string cujo a raiz quadrada de sua length tenha seu valor decimal menor que 0,5, ou seja, se fosse arredondada para baixo.

Toda o passo-a-passo do código está documentado no próprio código, através dos comentários.

<h1> Considerações finais </h1>
Comecei em Java somente para o desafio, 3 semanas atrás, e já fico muito grato pelo aprendizado que essa experiência me proporcionou. </br>
Agradeço à todos da Capgemini, e em especial, ao Douglas, que me indicou e me ajudou durante o processo.</br>
Estou com grandes expectativas, e espero muito poder fazer parte da equipe! 😉

