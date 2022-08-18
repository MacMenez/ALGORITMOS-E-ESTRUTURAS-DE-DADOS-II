import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        int tamanhoVetor, digitoFibonacci = 1;
        Scanner sc = new Scanner(System.in);
            System.out.print("Informe quantos dígitos terá a Sequência Fibonacci: ");
            tamanhoVetor = sc.nextInt();

            //fibonacci(tamanhoVetor);

            int vetorFibonacci[];
            vetorFibonacci = new int[tamanhoVetor];
            for (int i = 0; i < vetorFibonacci.length; i++) {
                vetorFibonacci[i] = digitoFibonacci + digitoFibonacci;
                System.out.print(vetorFibonacci);
            }

        sc.close();
        

    }
}
