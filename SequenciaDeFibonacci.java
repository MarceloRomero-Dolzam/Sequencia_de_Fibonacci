import java.util.InputMismatchException;
import java.util.Scanner;

public class SequenciaDeFibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int antecessor = 0;
        int atual = 1;
        int proximo;


        try{

            System.out.print("Digite em que casa a sequência de Fibonacci deve parar:");
            int NumFibonacci = scanner.nextInt();

            if(NumFibonacci <= 0){

                System.out.print("Por favor, Digite um número maior que ZERO.");

            }
            else if(NumFibonacci == 1){

                System.out.println(antecessor);

            }
            else{

                System.out.print(antecessor+", "+ atual);
                for(int i = 3;i <= NumFibonacci; i++){

                    proximo = antecessor + atual;
                    System.out.print(", "+ proximo);
                    antecessor = atual;
                    atual = proximo;

                }
                System.out.print("\n");
                
            }

        } catch(InputMismatchException e){

            System.out.println("O sistema só aceita números no prompt!");

        }
        scanner.close();

    }
    
}
