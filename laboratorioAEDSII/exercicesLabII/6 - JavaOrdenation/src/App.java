import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        //Calcular Tempo de Execução
        Long gerar_dados_tempoInicial = System.currentTimeMillis();
            //Função que gere 1 milhão de dados
            int tamanhoVetor = 10;//1000000
            double [] vetorNumeroAleatorio = vetorRandom(tamanhoVetor);
        Long gerar_dados_tempoFinal = System.currentTimeMillis();

        System.out.println(Arrays.toString(vetorNumeroAleatorio));
        System.out.printf("Vetor Aleatório - Tempo total em Segundos: %.5f segundos \n", (gerar_dados_tempoFinal - gerar_dados_tempoInicial)/1000.0);

        Long quickSort_tempoInicial = System.currentTimeMillis();
            //Ordenação do vetor com QuickSort
            ordenarQuickSort(vetorNumeroAleatorio, 0, vetorNumeroAleatorio.length-1);
        Long quickSort_tempoFinal = System.currentTimeMillis();

        System.out.println(Arrays.toString(vetorNumeroAleatorio)); //Como mostrar o vetor ordenado?
        System.out.printf("QuickSort - Tempo total em Segundos: %.5f segundos \n", (quickSort_tempoFinal - quickSort_tempoInicial)/1000.0);
            /*

        Long heapSort_tempoInicial = System.currentTimeMillis();
            //Ordenação do vetor com HeapSort
            ordenarHeapSort();
        Long heapSort_tempoFinal = System.currentTimeMillis();

        System.out.println(Arrays.toString()); //Como mostrar o vetor ordenado?
        System.out.printf("HeapSort - Tempo total em Segundos: %.5f segundos \n", (heapSort_tempoFinal - heapSort_tempoInicial)/1000.0);

        //Comparativo de Algoritmos de Ordenações
        vetorNumeroAleatorio = vetorRandom(tamanhoVetor);
        Long tempoComparacao_inicioQuickSort = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                System.out.printf("Total de Execuções do QuickSort: %d \n", i);
                vetor
                ordenarQuickSort(vetorNumeroAleatorio);
            }
        Long tempoComparacao_fimQuickSort = System.currentTimeMillis();
        System.out.println(Arrays.toString());//Como mostrar o vetor ordenado?
        double tempoQuick;
        System.out.printf("Tempo total em Segundos: %.5f segundos \n", tempoQuick = ((heapSort_tempoFinal - heapSort_tempoInicial)/1000.0));
        
        vetorNumeroAleatorio = vetorRandom(tamanhoVetor);
        Long tempoComparacao_inicioHeapSort = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                System.out.printf("Total de Execuções do HeapSort: %d \n", i);
                ordenarHeapSort();
            }
        Long tempoComparacao_fimHeapSort = System.currentTimeMillis();
        System.out.println(Arrays.toString());//Como mostrar o vetor ordenado?
        double tempoHeap;
        System.out.printf("Tempo total em Segundos: %.5f segundos \n", tempoHeap = ((heapSort_tempoFinal - heapSort_tempoInicial)/1000.0));
        */ }

    public static double [] vetorRandom(int tamanhoVetor) {
        double [] vetorNumeroAleatorio;
        vetorNumeroAleatorio = new  double [tamanhoVetor];

        Random numeroAleatorio = new Random();

        for (int i = 0; i < vetorNumeroAleatorio.length; i++) {
            vetorNumeroAleatorio[i] = numeroAleatorio.nextDouble();
        }
        return vetorNumeroAleatorio;
    }

    public static double [] ordenarQuickSort (double[] vetorNumeroAleatorio, int esquerda, int direita) {
        int i = esquerda, j = direita;

        double pivo = vetorNumeroAleatorio[(esquerda+direita)/2];
        
        while (i <= j) {
            while (vetorNumeroAleatorio[i] < pivo){
                i++;
                while (vetorNumeroAleatorio[j] > pivo){
                    j--;
                    if (i <= j){
                        //swap(i, j);
                        i++;
                        j--; 
                    }
                }
                
            }
        }
        if (esquerda < j){
            ordenarQuickSort(vetorNumeroAleatorio, esquerda, j);
        }
        
        if (i < direita){
            ordenarQuickSort(vetorNumeroAleatorio, i, direita);
        }

        return vetorNumeroAleatorio;
    }
    /*
    public static double [] ordenarHeapSort (double[] vetorNumeroAleatorio) {
        double vetorHeapSort[];

        //Contrução do heap
        for (int tam = 2; tam <= n; tam++){
            construir(tam);
        }
        
        //Ordenacao propriamente dita
        int tam = n;
        while (tam > 1){
        swap(1, tam--);
        reconstruir(tam);
        }

        return vetorHeapSort;
    } */
}