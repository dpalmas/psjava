# Java Language Fundamentals

<h2 align="center">
  Java Course by PluralSight :book: :computer: :rocket:
</h2>

<p align="justified">O curso aborda desde a introdução básica ao nível avançado da linguagem Java e como trabalhar efetivamente com a linguagem. Aqui estão algumas anotações que estou fazendo durante o curso e acredito que sejam de grande importância no aprendizado.🎓
</p>

<p align="center">
  
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/dpalmas/psjava?color=0000FF">

  <img alt="License" src="https://img.shields.io/github/license/dpalmas/psjava?color=0000FF&logo=MIT">
  
  <a href="https://github.com/dpalmas/psjava/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/dpalmas/psjava?color=0000FF">
  </a>
</p>

## Principais acrônimos em Java

- JRE
- JDK 
- IDE

> **JRE - Java Runtime Enviroment**
ambiente em tempo de execução é o que permite que nosso código Java seja executado.

**Nota**: O problema com o Java é que como o Java é um ambiente de plataforma cruzada quando você cria seu aplicativo de trabalho ele não contém o código nativo que pode ser executado no ambiente host. Contém os byte codes esses byte codes traduzem de alguma forma para ser executado
em um ambiente host específico.

> **JDK - Java Development Kit**
forneçe as ferramentas necessárias para criar aplicativos Java.
- JDK é fornecido pela Oracle Corporation;
- Há versão OpenJDK que é OpenSource.

Fundamentalmente, eles se comportam de maneira muito semelhante, a principal diferença é o licenciamento para o JDK é licenciado pela
Oracle já o OpenJDK é OpenSource.

> **IDE - Integrated Development Enviroment**
ferramenta qual utilizamos para editar, construir, executar, depurar nossos aplicativos.

Neste curso foi utilizado o [Intellij IDEA](https://www.jetbrains.com/idea/promo/?&msclkid=9d71793e069c13d7179d1938f153162f&gclid=9d71793e069c13d7179d1938f153162f&gclsrc=3p.ds).

### **A Experiência do Desenvolvedor Java**

Quando estamos programando a IDE executa, depura, constroi, porém a IDE não faz todo o trabalho sozinha. Há uma cooperação da IDE com a JDK para produzir a aplicação Java, quando tentamos executar essa aplicação em um ambiente por exemplo Linux, Mac OS ou Windows ou outro ambiente host, a aplicação Java não pode ser executada diretamente, porque esses ambientes host já possuem plataforma independente do byte code. O que permite a execução é a JRE que esta cooperando com a JDK.

### **A Experiência do Usuário Java**

E os usuários que desejam executar meus aplicativos?

Para o usuário a configuração é muito mais simples, é claro o usuário terá um ambiente host, neste ambiente é só instalar o JRE.
Quando o JRE esta instalado os aplicativos Java tornam-se apenas outros aplicativos para o usuário.

**Importante!** Quando executamos nossa aplicação Java o nome do arquivo da Class é Case Sensitive.

### **Declaração de Estrutura**

- Programas são feitos de declarações;
- Declarações terminam com ponto e vírgula;
- Partes separadas por zero ou espaços em branco (espaço, tab, e nova linha).

Declarações com espaços em branco não tem efeito quando o código é executado, por exemplo:

```java
System.out.println( "PluralSight" ) ;

System.out.println("PluralSight");

System.out.println(       "PluralSight" ) ;

System.out.println
    (
        "PluralSight"
    )
    ;
```

### **Comentários**

Java nos permite colocar comentários em nosso código fonte.

> **Comentário** é simplesmente uma sequência de texto que é ignorada pelo compilador.

E há alguns motivos comuns pelos quais usamos comentários.

- Colocar notas legíveis para humanos dentro do nosso código fonte;
- Permite ter uma idéia dentro do código fonte o trabalho que estamos tentando fazer para ser útil para mim e para 
a pessoa que criou, pois posso voltar e lembrar o que eu fiz;
- É muito útil também para manutenção do código fonte.

Java suporta três tipos de comentários:

> **// ... Line comment** - O texto é ignorado até o final da linha atual.

> __/**/ Block comment__ - O texto é ignorado dentro do bloco. Não é possível colocar um bloco de comentário dentro de outro o compilador não reconhece, apenas comentário em linha.

> __/**...*/ Javadoc comment__ - O compilador trata similar ao comentário em bloco. Pode ser usado para gerar documentação. Detalhes sobre esse tipo de documentação esta fora do escopo deste curso.

### **Pacotes**

> **Pacotes** possuem vários recursos importantes.
Fornecem organizações, seguem um padrão para convenção de nomes que são únicas, afeta a estrutura do código fonte,
por convenção nomes de pacotes começam com letra minúscula,
usa notação de nome de domínio reverso para garantir a singularidade global.

Se pesquisarmos o site pluralsight.com é um domínio adquirido pela **PluralSight** e possui autoridade que ninguém pode comprar esse nome.

Tipos de nomes são qualificados pelo seu pacote e nomes de pacotes afetam a organização do código fonte, por exemplo:

```bash
src 
 └── com
      └── pluralsight
               └── example
```

## Variáveis, Tipos de Dados e Operadores Matemáticos

> **Variável** é um local nomeado na memória ao qual pode ser atribuído um valor.

Além disso, o valor de uma variável pode ser alterado durante a execução de um programa. Isto é, o conteúdo de uma variável é alterável e não fixo. 

### **Nomeação de Variável**

- Usar somente letras e números;
- Primeiro caracter não pode ser um número;

Por exemplo: 

```java
int total;
int grade4;
int 2much; // não usar
```

> **Nota**:
Por convenção, nomes de variáveis consistem de somente letras e números. Tecnicamente o compilador Java permite usar alguns símbolos
especiais, mas na prática nós usamos letras e números.

### **Nomes de estilo usando Camel Case**

Inicia cada palavra depois da primeira com maiúscula, todas as outras letras são minúsculas, por exemplo:

```java
int sum;
int studentCount;
int bankAccountBalance;
```

### **Variáveis podem ser declaradas como Final**

- Usa modificador final;
- O valor não pode ser alterado uma vez definido;
- Ajuda a evitar erros causados por alterações de variáveis inadvertidas.

Exemplo:

```java
final int maxStudentes = 25;
final int someVariable;
int someAnotherVariable = 100;
someVariable = someAnotherVariable;
```

### **Tipos de Dados Primitivos**

- Construída na linguagem;
- Base de todos os outros tipos;
- Quatro categorias: Inteiro, Ponto Flutuante, Character e Booleano.

A diferença entre cada um é o tamanho dos dados que podem ser armazenados, por exemplo:

```java
byte numberOfEnglishLetters = 26;
short feetInAMile = 5280;
int milesToSun = 92960000;
long milesInALightYear = 5879000000000L;
```

### **Tipos Inteiros**

| Tipo | Bits | Valor Min | Valor Máx | Forma Literal|
| ---- | ---- | --------- | --------- | ------------ |
| byte |  8   |    -128   |     127   |       0      |
| short|  16  |    -32768 |     32767 |       0      |
| int  |  32  |-2147483648|2147483647 |       0      |
|long|64|-9223372036854775808|9223372036854775807|0L |

### **Tipos Ponto Flutuante**

Armazena valores contendo uma porção fracionada.

```java
float kilometersInAMarathon = 42.195f;
float absoluteZeroInCelsius = -273.15f;
double atomWidthInMeters = 0.0000000001d;
```

| Tipo | Bits | Menor Valor Positivo| Maior Valor Positivo | Forma Literal |
| ---- | ---- | --------- | --------- | ------------ |
| float | 32   |    1.4 x 10<sup>-45</sup>   |     3.4 x 10<sup>38</sup>   |       0.0f      |
| double |  64  | 4.9 x 10<sup>-324</sup> | 1.7 x 10<sup>308</sup> |       0.0 or 0.0d      |

### **Tipos de Caracteres**

- Armazena um único caractere Unicode;
- Valores literais colocados entre aspas únicas;
- Para pontos de código Unicode, use u seguido por valor hexadecimal de 4 dígitos.

```java
char regularU = 'U';
char accentedU = '\u00DA'; // Ú
```

### **Tipo Booleano**

- Armazena valores true/false;
- Valores literais são true/false.

```java
boolean iLoveJava = true;
```

### **Tipos primitivos são armazenados por valor**

A chave para entender tipos primitivos em Java, cada valor de variável é independente para qualquer outro valor de variável.

### **Operadores Aritiméticos**

> **Básico** produz um resultado sem impacto sobre os valores utilizados na operação.

> **Prefixo/posfixo** - Aumenta um valor, substitui o valor original.

> **Atribuição composta** - opera em um valor, substitui o valor original.

### **Operadores Básicos**

| Operação | Operador | Equação | Resultado | Equação | Resultado | 
| ---- | ---- | --------- | --- | ------ |-------|
| Adição | +  | 1.0 + 2.0 | 3.0 | 1 + 2  | 3
| Subtração| -| 5.0 - 4.0 | 1.0 | 5 - 4  | 1
| Multiplicação  |  *  |4.0 * 2.0| 8.0 | 4 * 2 | 8 |
| Divisão|/| 13.0 / 5.0| 2.6 | 13 / 5 | 2
| Módulo|%| 13.0 % 5.0 | 3.0 | 13 % 5 | 3

### **Operadores Prefixo e Posfixo**

 - ++ Incrementa valor por 1;
 - -- Decrementa valor por 1;
 - A ordem tem grade importância.

> **Prefixo** aplica operação antes de devolver o valor.

> **Posfixo** aplica operação após devolver o valor.

Exemplo:

```java
int someValue = 5;

System.out.println(++someValue); // 6
System.out.println(someValue); // 6 de novo porque o operador aplica a operação e armazena na variável

int someOtherValue = 5;

System.out.println(someOtherValue++); // 5
System.out.println(++someOtherValue); // 6
```

> **Nota**: Quando o operador esta antes da variável obtém-se o resultado da operação.
Quando o operador esta depois da variável obtém-se o valor anterior da operação, mas a operação ainda é realizada.

### **Operadores compostos de atribuição**

- Combine uma operação e atribui;
- Aplica o valor do lado direito para o lado esquerdo;
- Armazena o resultado na variável do lado esquerdo.

Disponível para 5 operações básicas de matemática:
- += -= *= /= %=

Exemplo: 

```java
int myOtherValue = 100;

int val1 = 5;
int val2 = 10;

myOtherValue /= val1 * val2;

System.out.println(myOtherValue);
```

### **Precedência do operador**

| Posfixo | Prefixo | Multiplicativo  | Aditivo | 
| ------- | ------- | --------------- | ------- |
| X++ X-- | ++X --X |     * / %       |   + -   | 

- -> Operadores de igual avaliados da esquerda para a direita

- ( ) Podem substituir a precedência com parênteses

- <-> Parênteses aninhados avaliados de dentro para fora

### **Tipos de Conversão**

> **Conversão do tipo implícita** conversão realizada automaticamente pelo compilador.

Exemplo:

```java
int intValueOne = 50;
long longValueOne = intValueOne;
```

> **Conversão do tipo explícita** a conversão foi feita explicitamente em código com operador **cast**.

Exemplo:

```java
long longValueTwo = 50;
int intValueTwo = (int) longValueTwo;
```

### **Conversão do Tipo Implícita**

- As conversões de ampliação são realizadas automaticamente;
- Tamanhos inteiros mistos **->** Usa maior inteiro na equação;
- Tamanhos de pontos flutuantes mistos **->** Usa double;
- Inteiro misto e ponto flutuante **->** Usa o maior ponto flutuante.

### **Conversão do Tipo Explícita**

- Pode realizar conversões de ampliação ou estreitamento;
- Esteja ciente de potenciais efeitos colaterais;
- Estreitando conversões **->** Bits significativos podem ser descartados;
- Ponto flutuante para inteiro **->** Porção fracionária é descartada;
- Inteiro para ponto flutuante **->** A precisão pode ser perdida.

## Lógica Condicional e Declarações em Bloco

 > **Lógica condicional** é uma parte essencial da construção de qualquer aplicação que faça qualquer coisa interessante. Sem a condição lógica há somente um caminho linear para execução de um programa.

 A lógica condicional pode ser resumida em duas partes:

 - Realizar o teste;
 - Realizar ação com base no resultado do teste.

### **Operadores Relacionais**

|         | Operador| Inteiro, Ponto Flutuante | Caracter | Booleano| 
| ------- | ------- | --------------- | ------- | --------|
| Maior que | > | 5 > 4 | 'c' > 'a' | N/A 
| Maior ou igual | >= | 5 >= 4 | 'c' >= 'a' | N/A
| Menor que | < | 4 < 5 |   'a' < 'c'   | N/A
| Menor ou igual | <= | 4 <= 5 |  'a' <= 'c'   | N/A 
| Igual | == | 5 == 5 | 'c' == 'c' | true == true
| Não é igual a | != | 4 != 5 | 'a' != 'c' | true != false

### **Atribuição Condicional**

Retorna um valor baseado no resultado de uma condição.

```java
result = condition ? true-value : false-value;
```

```java
int value1 = 7;
int value2 = 5;
int maxValue = value1 > value2 ? value1 : value2;

System.out.println(maxValue); // mostra 7
```

### **If-else**

- Uma declaração **if** condicional executa uma declaração.
- Cláusula **else** executa uma declaração quando a condição é **false**.
- A cláusula **else** é opcional.

> **Nota**: Só precisamos colocar uma clásula **else** se desejamos executar diferentes linhas do código no caso da condição ser falsa.

```java
if (condition)
  true-statement;
else
  false-statement;
```

### **Encadeamento If-else**

- Analisado em ordem de cima para baixo;
- O primeiro a testar true é executado;

```java
if (condition-1)
  true-statement-1;
else if (condition-2)
  true-statement-2
      .
      .
      .
else if (condition-N)
  true-statement-N;
else
  false-statement;
```

### **Operadores Lógicos**

- Produzir um único resultado **true** ou **false** de dois valores **true** ou **false**;
- Pode combinar dois testes relacionais;
- Pode combinar duas variáveis Booleanas.

|         | Operador| O que resolve true | 
| ------- | ------- | -------------------| 
| And     | &       | true & true   | 
| Or      | \|       | false \| true true \| false true \| true  | 
| Exclusive or (XOR) | ^       | false ^ true true ^false| 
| Negation    | !       | false   | 

### **Operadores Lógicos Condicionais**

Similar para o padrão de operadores lógicos.

|         | Operador| O que resolve true | 
| ------- | ------- | -------------------| 
| And     | &&       | true & true   | 
| Or      | \| \|       | false \| \| true true \| ----| 

Lado direito executa somente quando necessário:

- **&&** executa a direita somente quando a esquerda é **true**;
- **| |** executa a direita somente quando a esquerda é **false**.

### **Declarações em Bloco**

> **Um bloco de código** é um agrupamento de duas ou mais intruções.

- Cria uma declaração composta;
- Inclusão das instruções entre chaves de abertura e fechamento.

```java
{
  statement-1;
  statement-2;
      .
      .
      .
  statement-N;
}
```

### **Declarações em Bloco e Escopo de Variável**

> **Variável de Escopo** descreve a faixa de visibilidade.

Variável declarada dentro de uma declaração de bloco.

- O escopo é limitado a esse bloco;
- Em outras palavras, a variável não é visível fora deste bloco.
  
Exemplo:

```java
double students = 30.0d, rooms =  4.0d;

if(rooms > 0.0d) {
  System.out.println(students);
  System.out.println(rooms);
  double avg = students / rooms;
}
System.out.println(avg); // Compile time error (a variável não é visível fora do bloco)
```

### **Switch**

- Testa valor sobre múltiplos valores coincidentes.
- Transfere o controle baseado em valores coincidentes.
  
```java
switch (value-to-test) {
  case matching-value-1:
    statements
    break;
  .
  .
  .
  case matching-value-N:
    statements
    break;
    default:
      statements
}
```

> **Nota**: a palavra chave **break** indica que 'pulamos' fora do **switch**. A palavra chave **default** é executada quando nenhuma constante **case** coincide com a expressão.

### **Usando Switch**

**Switch** pode ser usado somente com certos tipos de dados:

- Suporte para tipos de dados primitivos (byte, short, int, long e char);
- Uma expressão pode ter múltiplas declarações;
- Termina cada expressão com **break**;
- Caso contrário, 'cairá' para próxima expressão.

## Looping e Arrays

Java possui os seguintes laços de repetição:

- While loop;
- Do-while loop;
- For loop;
- Arrays;
- For-each loop.
  
### **Loops**

> **Loop** executa repetidamente uma declaração enquanto a condição fornecida for verdadeira.

> **While-loop** laço de repetição básico, que fornece um comportamento de looping mais básico.

> **Do-while loop** fornece um comportamento de looping, mas difere quando a condição para esse loop for verificada.

> **For-loop** é similar ao **while**, porém com notação simplificada para caso de uso comum.

### **While Loop**

- A condição é verificada no início do laço de repetição;
- Por padrão é repetida somente uma declaração no laço de repetição, se desejarmos mais devemos colocar chaves no inicio e final do laço de repetição;
- Pode acontecer de o corpo do laço de repetição nunca ser executado (nesse caso a condição dentro do laço é **false**);

```java
while (condition)
  statement;
```

### **Do-while Loop**

- A condição é verificada no final do laço de repetição;
- O corpo do laço de repetição sempre executa pelo menos uma vez;
- É uma boa escolha para cenários onde sempre queremos executar o corpo do laço de repetição pelo menos uma vez.

```java
do
  statement;
while (condition)
```

### **For Loop**

- A condição é verificada no início do laço de repetição;
- Similar ao laço de repetição **while**;
- Notação simplificada para valores de controle do laço de repetição;
- Pode acontecer de o corpo do laço de repetição nunca ser executado (nesse caso a condição dentro do laço é **false**).
  
```java
for (initialize; condition; update)
  statement;
```

### **Arrays**

- Fornecer uma coleção ordenada de elementos;
- Cada valor individual é conhecido como elemento;
- Cada elemento é acessado por índice;
- O índice inicia na posição 0, ou seja, o número de elementos menos um;
- O número de elementos pode ser através do valor de comprimento da matriz.

```java
float[] theVals = new float[3];
theVals[0] = 10.0f;
theVals[1] = 20.0f;
theVals[2] = 15.0f;
```

### **For-each Loop**

- Ajuda a simplificar o trabalho com arrays em laços de repetição;
- Executa o corpo do laço de repetição uma vez para cada membro do array;
- Manipula o comprimento da coleção;
- Manipula o acesso de cada valor.

```java
for(loop-variable : array)
  statement;
```

## Entendendo Métodos

- Métodos são uma parte importante de desenvolvimento de aplicativos Java;
- Permitem organizar nosso código para que nossas aplicações sejam mais mantidas;
- Facilitam a reutilização do código em todo um aplicativo.

> **Métodos** é um mecanismo para organizar nosso código, também permite a criação de blocos de código reutilizáveis, recebe e retorna dados.

```java
return-type name (type-parameter-list) {
  statements
}
```

Para ficar claro como o método funciona, vamos dividir em partes:

- Precisamos declarar um nome para o método, porque é a forma como vamos acessar esse método (as regras e convenções de nomes são as mesmas das variáveis);
- Passar uma lista de tipo de parâmetro, porque como o Java possui forte tipagem cada parametro terá uma tipo de dado específico associado a ele(é possível passar uma lista de parâmetros vazia).
- O corpo do método pode conter 0 ou mais declarações, deve iniciar com abertura e fechamento de chaves;
- O retorno do método indica o tipo de dado retornado para o método(usa-se **void** quando não há retorno de dados).

### **Usando simples método:**

```java
System.out.println("Before method call");
doSomething();
System.out.println("After method call");

static void doSomething() {
  System.out.println("Inside method");
  System.out.println("Still inside");
}
```

### **Dados no método**

- O escopo de uma variável é limitado para o método onde é declarada;
- Parâmetros permitem passar valores aos dados de um método;

### **Usando Parâmetros**

```java
static void showSum(float x, float y, int count) {
  float sum = x + y;
  for(int i = 0; i < count; i++) 
    System.out.println(sum);
}
```

### **Passando Parâmetros**

- Em Java, parâmetros são passados por valor, o que significa que o parâmetro recebe uma cópia do valor original;
- Métodos alteram o valor dos parâmetros e isto estará visível dentro deste método;

### **Razões para um método existir**

- Uma das razões é o fim do método, isso significa que não há mais código dentro do método para ser executado;
- Pode haver uma saída explícita, podemos usar o que é chamado de declaração de retorno, e quando acertarmos uma declaração de retorno, sairemos do método no momento em que chamarmos a declaração de retorno;
- Em caso de erro, saímos abruptamente  do método por causa desse erro e Java usa um mecanismo conhecido como **exceções**.

### **Retornando um valor**

- Um método pode retornar um simples valor, este valor retornado com declaração de retorno;
- O tipo do retorno do método pode conter dados primitivos ou mais complexo como um array.

### **Argumentos de Linha de Comando**

- É uma maneira de passar informação dentro do nosso programa, uma parte da execução do programa;
- Um aplicação se inicia com o método **main** que serve como porta de entrada no programa;
- O método **main** aceita um parâmetro, e este parâmetro é um **array** que recebe qualquer argumentos de linha de comando passado para o programa;

## Trabalhando com Strings

A maioria das aplicações que desenvolvemos precisamos trabalhar com algum tipo de texto e muitas vezes precisamos fazer um grande trabalho com texto. Nós precisamos saber como trabalhar efetivamente e eficientemente com texto e para Java possui as **strings**.

### **Classe String**

- Armazena uma sequência de caracteres unicode;
- Tipo de armazenamento é que conhecemos como formato UTF-16;
- Literais são fechados por aspas duplas;
- Suporta concatenação usando + ou +=.

### **Strings são imutáveis**

- Variáveis de string não seguram diretamente seu valor de string;
- Mantém uma referência para uma instância de uma string;
- O valor de uma string não pode ser diretamente alterado, qualquer valor alterado cria uma nova instância dessa string.

### **Igualdade de Strings**

- O operador de igualdade não verifica o valor da string instânciado, verifica simplesmente se ambos variáveis são strings de referência para mesma string instânciada;
- O método **equals** compara letra por letra de duas strings;
- O método **equals** é a melhor escolha na maioria dos casos para verificação de igualdade de strings;
- O método **intern** fornece um valor canonizado, permite comparação confiável no operador **==** e melhora performance de comparação de strings frequentes.
- Devemos utilizar o método **intern** se o cenário frequente for comparação com strings.

### **Selecionando Métodos e Classes de Strings**

| Operador| Métodos | 
| ------- | ------- |  
| Length  | length  |
| Criar novas sequências de string(s) | concat, replace, toLowerCase, toUpperCase, trim, split  |
| Extrair substring  | charAt, substring |
| Testar substring  | contains, endsWith, startsWith, indexOf, lastIndexOf | 
| Comparação  | equals, equalsIgnoreCase, isEmpty, compareTo, compareToIgnoreCase |
| Formatação  | format |
| String para não-string  | valueOf |

### **Convertendo Tipos Não-String para String**

- Virtualmente todos os tipos de dados podem ser convertidos para uma **String**;
- Pode ser usado **String.valueOf**;
- Geralmente a conversão acontece implicitamente.

### **StringBuilder**

- Fornece um buffer de string mutável;
- Provém uma maneira eficiente de construir valores com string;
- Adiciona um novo conteúdo no final da string;
- Permite inserir conteúdo dentro do buffer da string;
- Não é uma cadeia de caracteres, depois de criar o conteúdo de nosso interesse precisamos extrair um string da instância do construtor de string usando **toString**.

## Formatação de String

Especificadores de formato:

- Foco em resolver o resultado desejado;
- Pode controlar muitos aspectos de aparência;
- Suporta uma variedade de métodos(String.format, System.out.printf).

### **Partes de um Especificador de Formato**

```bash
Decimal places to display
├───────────────────────────────────│ 
                                    │    
%[argument index][flags][width][precision]conversion
                           │
├──────────────────────────│
Minimum characters to display
(Space-padded, right-justified by default)
```

### **Conversões de formato comum**

| | Significado| Tipo | Exemplo Valor | Resultado| 
|-| -----------| ---- | ------------- | -------- |   
|d| Decimal    |Integral| 32 | 32 |
|x X| Hex    | Integral | 32 | 20 |
|f| Decimal  | Float point | 123.0 | 123.000000 |
|e E|Scientific notation|Float point|123.0|1.230000e+02|          
|s| String  | General | "Hello" | Hello |

### **Formato de Flags**

|Flag | Significado |
|-----| ----------- | 
|  #  |Incluí base|
|  0  |Preenchimento de zero|
|  -  |Justificar a esquerda|
|  ,  |Incluí grupo separador
|space|Espaço de liderança quando o número é positivo|
|  +  |Sempre exibe o sinal|
|  (  |Incluí valores negativos entre parênteses|

### **Índice de Argumentos**

|Índice | Significado |
|-----| ----------- | 
| Não especificado |Corresponde sequencialmente ao argumento|
|  index$  |Índice de argumento para uso (1-based)|
|  <  |Corresponde ao mesmo argumento para formato especificador anterior|

## Mais Sobre Tipo de Dados

### **Hora e Data**

Que horas são?
- Não é uma pergunta simples como parece.

Detalhes de hora podem ser complexos:
- A melhor maneira de representar tempo depende o que estamos procurando fazer com ele.

Nesse caso temos três cenários que precisamos analisar:

> **Hora de eventos** primeiramente interessado em sequência de timestamp.

> **Hora/local amigável dos humanos** data e hora do dia.

> **Hora/local global amigável dos humanos** data e hora do dia e entender o fuso horário.

### **Rastreamento de Hora de Eventos**

**Instant Class**
- Faz otimização de eventos time-stapimg;
- Trabalha bem para comparações de tempos relativos;
- Pode ser convertido dentro de complexos tipos de datas/horas.

**Convertendo data/valores de hora/para string**

- Por padrão cada tipo é limitado a um único formato de string.

**DateTimeFormatter**

- Descreve formatação de data/hora;
- Incluí muitos formatos pré-definidos;
- Pode ser usado quando convertido para string;
- Pode ser usado quando transforma para string.

**Classes wrapper primitivas**

- Pode conter dados de valores primitivos;
- Fornece métodos;
- Habilita compatibilidade com aspectos ricos do tipo de sistema Java.

**Cada tipo primitivo tem uma classe wrapper**

- Byte, Short, Integer, Long;
- Float, Double;
- Character;
- Boolean.

**Métodos lidam com operações comuns**

- Convertendo para outros tipos;
- Extraindo valores de strings;
- Encontrando valores min/max.

## Classes e Interfaces

Para seguirmos para o próximo nível e construírmos aplicações Java mais sofisticadas e modernas entender o conceito de classes e interfaces é fundamental, além disso é a base essencial para se trabalhar com a linguagem Java.

> **Classe** contém um estado, contém código para manipular o estado e nos permite criar tipos de dados personalizados.

> **Interface** modela o comportamento dos tipos de dados e cria contratos entre tipos de dados.