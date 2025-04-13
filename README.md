# Algortimo para encontrar fatorial de um Numero

## Descrição:

<p> Algoritmo abaixo tem por finalidade encontrar o fatorial de um numero que é solicitado pelo usuário - entrada de dado. Mas como que calcula-se o fatorial de um numero ? 

```
!6 = 5 * 4 * 3 * 2 * 1  = 720
```

<p>A lógica por detras dessa sentença é simples. O numero informado pelo usuário, no caso acima <b> 6 </b> é decrementando em <b> - 1 </b> e esse valor é multiplicado pelo numero anterior, ou seja, se o usuário informou 6 ele será a) decrementado em -1 e multiplicado pelo seu antecessdor no caso 5, portanto nessa situação se pararmos para analisar a multiplicação desses valores seria <b> 30 </b>, mas sabemos que para o calculo correto de um fatorial ele tem que chegar a seu menor numero, no caso 1, logo, ele irá continuar a decrementar a si mesmo e multiplicar pelo numero anterior. 

## Código Java.

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   
     System.out.println("*****************************");
     System.out.println("*   Calculando Fatorial 2   *");
     System.out.println("*****************************");
   
     Scanner scan = new Scanner(System.in);
       
      boolean continuar = true;
      int totalFatorial = 1;
      int userNumber = 0; 
        
      do {
         
         try {
                
             System.out.println("-> Informe um numero inteiro positivo até 16");
             userNumber = scan.nextInt();

             if(userNumber < 0 || userNumber > 16) {
               System.out.println("-> Entrada invalida ... ");
                   
             } else { 
                 
               totalFatorial = 1; 

               for(int i = userNumber; i > 0; i--) {
                    
                totalFatorial = totalFatorial * i;
                System.out.println("Agora o valor de i é: " + i);
                   
               }
        
               System.out.println("O fatorial de " + userNumber +  " é: " + totalFatorial);
                  
               System.out.println("-> Voce deseja continuar: S / N");
               String optionQuestion = scan.next();

               if(!optionQuestion.equalsIgnoreCase("s")) {
                   continuar = false;
                  }
                }
            
            } catch (InputMismatchException e) {
               
                System.out.println("-> ERROR: ..." + e.getMessage());
                scan.nextLine();
            }            

        } while (continuar);
  
        System.out.println("-> Obrigado por usar o App");
        scan.close();
    }
}
```

## Analise: 

<p> O trecho do algoritmo em java mais importante e que se aplica a logica do calculo do fatorial é: </p>

```java
totalFatorial = 1; 

    for(int i = userNumber; i > 0; i--) {
                    
      totalFatorial = totalFatorial * i;
      System.out.println("Agora o valor de i é: " + i);
    }
        
    System.out.println("O fatorial de " + userNumber +  " é: " + totalFatorial);
```

- criamos uma variavel para armazenar o total da multiplicação: <b>totalFatorial = 1 </b>

- criamos um looping <b> for </b> para fazer o controle dos valores que serão decrementados a partir do valor informado pelo usuário. 

```java
 for(int i = userNumber; i > 0; i--) {
      totalFatorial = totalFatorial * i;
```

- a varivel <b> i </b> recebe o valor informado na variavel userNumber, após temos a nossa primeira avaliação, <b> i > 0 </b>, ou seja, enquanto o valor informado e agora repassado a <b> i </b> for maior que 0, o valor de i será decrementado em -1.

```
userNumber = 6;

!6 = 5 * 4 * 3 * 2 * 1 = 720

-> 6 * 5 = 30
-> 30 * 4 = 120
-> 120 * 3 = 360
-> 360 * 2 = 720
-> 720 * 1 = 720
```

<p> Esse valor ficará armazenado na variavel <b>totalFatorial</b>. Portanto o valor de saida após a entrada antes feita pelo usuário sera todo armazenado nessa variavel. Fiz questão de deixar claro o valor de i para mostrar as passagens a cada decrementação do numero informado pelo usuário.



