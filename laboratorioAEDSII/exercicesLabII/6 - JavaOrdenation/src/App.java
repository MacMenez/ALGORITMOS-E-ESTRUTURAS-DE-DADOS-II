import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        //Calcular tempo de execução
        Long tempoInicial = System.currentTimeMillis();
            //Função que gere 1 milhão de dados
            double [] vetorNumeroAleatorio = vetorRandom();
        Long tempoFinal = System.currentTimeMillis();

        System.out.println(Arrays.toString(vetorNumeroAleatorio));
        System.out.printf("Tempo total em Segundos: %.5f segundos \n", (tempoFinal - tempoInicial)/1000.0);

        //Ordenação do vetor com QuickSort
        quickSortY(vetorNumeroAleatorio, 0, vetorNumeroAleatorio.length-1);

        //Ordenação do vetor com HeapSort
    }

    public static double [] vetorRandom() {
        double [] vetorNumeroAleatorio;
        vetorNumeroAleatorio = new  double [2];//1000000

        Random numeroAleatorio = new Random();

        for (int i = 0; i < vetorNumeroAleatorio.length; i++) {
            vetorNumeroAleatorio[i] = numeroAleatorio.nextDouble();
        }
        return vetorNumeroAleatorio;
    }

    public static void quickSortY(double[] vetorNumeroAleatorio, int inicio, int finalL) {
        
    }
}
