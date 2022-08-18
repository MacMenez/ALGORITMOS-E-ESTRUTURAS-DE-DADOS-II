import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            //Saber o tamanho do vetor
            int tamanhoVetor;
            System.out.print("Informe quantos dígitos terá a Sequência Fibonacci: ");
            tamanhoVetor = sc.nextInt();

            //Criar um vetor
            int vetorFibonacci[];
            vetorFibonacci = new int[tamanhoVetor];
            
            //Calcular Fibonacci
            int digitoAnterior1 = 0, digitoAnterior2= 1, digitoFibonacci = 0;
            for (int i = 0; i < vetorFibonacci.length; i++) {
                digitoAnterior1 = 1;
                digitoFibonacci =  digitoAnterior1 + digitoAnterior2;
            }
            
            //Inserir os digitos Fibonacci no vetor através de uma função
            //vetorFibonacci[i] = fibonacci(tamanhoVetor);

            //Exibir o resultado
            System.out.println(Arrays.toString(vetorFibonacci));

            //Somatório das 10 primeiras posições do vetor
            if (tamanhoVetor >= 10) {
                //somatorioVetor();
                System.out.print("O somatório dos 10 primeiros dígitos do vetor equivale a: ");
            } else {
                System.out.println("O vetor possui menos de 10 digitos, seu somatório equivale a: ");
            }
            //Metodo que recebe um vetor e um valor
            //Criar um novo vetor com os divisores do número informado
            //Retorna o novo vetor com os elementos dos multiplos do número informado 
        sc.close();
        

    }
}
