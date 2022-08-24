import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    static int funcaoVetorFiboniacci(int tamanhoVetorInformado){
        //Criar um vetor
        int vetorFibonacci[];
        vetorFibonacci = new int[tamanhoVetorInformado];

        //Calcular Fibonacci
        int digito1 = 0, digito2= 1, novoDigitoFibonacci = 0;
        
        for (int i = 0; i < vetorFibonacci.length; i++) {
            novoDigitoFibonacci = digito1 + digito2;
            digito1 = digito2;
            digito2++;;
            vetorFibonacci[i] = novoDigitoFibonacci;
        }
        System.out.println(Arrays.toString(vetorFibonacci));
        return x;
    }
        
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            //PARTE 1
            //-----------------------------------------------------------------------------
            //Saber o tamanho do vetor
            int tamanhoVetor;
            System.out.print("Informe quantos dígitos terá a Sequência Fibonacci: ");
            tamanhoVetor = sc.nextInt();

            funcaoVetorFiboniacci(tamanhoVetor);
            /* 
            //Inserir os digitos Fibonacci no vetor através de uma função
            vetorFibonacci[] = calculoFibonacci(tamanhoVetor);

            //Exibir o resultado
            System.out.println(Arrays.toString(vetorFibonacci));

            //PARTE 2
            //-----------------------------------------------------------------------------
            //Somatório das N primeiras posições do vetor
            if (tamanhoVetor >= N) {
                //somatorioVetor();
                System.out.print("O somatório dos 10 primeiros dígitos do vetor equivale a: ");
            } else {
                System.out.println("O vetor possui menos de N digitos, seu somatório de todos os dígitos equivale a: ");
            }

            //PARTE 3
            //-----------------------------------------------------------------------------
            //Metodo que recebe um vetor e um valor
            //Criar um novo vetor com os divisores do número informado
            //Retorna o novo vetor com os elementos dos multiplos do número informado 
            */
        sc.close();
        

    }
}
