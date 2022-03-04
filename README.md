<p>
  <img src="https://user-images.githubusercontent.com/79665665/154409190-de18a9c6-9941-472a-8362-25b2685ccd88.png">
</p>
<h1> Desafio dos programadores! </h1>
<p> Programas  para o desafio de programação da Academia Técnica da empresa Capgemini, um dos processos seletivos da empresa.</p>
    
<h3>Status: Em desenvolvimento :seedling:</h3>

<h1>Tecnologias utilizadas</h1>

   - **IDE**: IntelliJ IDEA Community Edition 2021<br/>
   - **JDK**: 17.0.2 (Requerido)<br/>
   - **Apache Maven** 3.8.4 (Requerido)

 >Para verificar se contém o Java instalado, abra o cmd (Win+R, e digite 'cmd'). No CMD, digite 'java -version'.<br/>
 
 >Para verificar se contém o Maven instalado, digite 'mvn -v' no CMD.


<h1>Instruções para execução e testes</h1>

1. Acesse os [Releases](https://github.com/nguilherme010/Desafio-Capgemini-2022/releases)<br/>
2. Faça o download do release (.zip), contendo o projeto.<br/>
3. Extraia o arquivo e, numa IDE de sua escolha, abra a pasta de alguma das questões (e.g. "Desafio Capgemini/Questão 01").
---
4. Os três programas estão organizados com o seguinte padrão:
    - Package 'domínio': contém a declaração de variáveis, setters e getters.
    - Package 'service': contém o programa referente aos enunciados, recebendo e retornando os valores requeridos.
    - Package 'test': contém testes unitários, que testam se o programa corresponde com a saída dos exemplos no enunciado, assim como outros testes.
    
5. Você pode manipular e executar cada teste individualmente, assim como executar toda a classe de 'ServiceTest' para executar todos os testes.


<h2>Sobre a Questão 3</h2>

Com certeza, a __questão mais difícil__ das três: </br>Temos de criar um __sistema de criptografia__ baseado na __raiz quadrada de length da string__ em questão.

> Um fato curioso é que os dois __exemplos do enunciado não testam com perfeição__ as possíveis variações do sistema, pela seguinte razão:
Neste sistema, quando a raiz quadrada de length equivale a um número cujo o valor decimal é menor que 0,5 (ou seja, seria arredondado para baixo),
o sistema tem de usar o valor arredondado para baixo, assim como arredondado para cima. Isso não ocorre em casos onde o arredondamento já ocorre para cima,
pois o sistema acaba não precisando do valor arredondado para baixo.
Nos dois exemplos dos enunciados, o arredondamento é para cima, fazendo com que, caso testemos somente com estes exemplos, passemos despercebidos pelo outro padrão.</br>
Talvez tenha sido proposital, mas gostaria de deixar aqui esta minha observação.

Toda o passo-a-passo do código está documentado no próprio código, através dos comentários.

