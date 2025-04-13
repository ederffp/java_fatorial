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

                // - Caso de valores invalidos  
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
