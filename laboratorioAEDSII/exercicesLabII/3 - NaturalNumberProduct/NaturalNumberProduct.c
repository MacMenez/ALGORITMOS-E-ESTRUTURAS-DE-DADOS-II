#include <stdio.h>

//1 - Faça uma função recursiva que retorne o produto entre 2 números naturais
int produtoNumeroNatural(int x, int y){
  int produto;
  if(y == 0){
    return y;
  }
  else{
    return x + produtoNumeroNatural(x, (y - 1));
  }
}

//2 - Faça uma função recursiva que retorne o valor do somatório de um vetor de números naturais.
int somatorioNumeroNatural(int vetorNumeroNatural[], int tamanhoVetor){
  if(tamanhoVetor == 0){
    return 0;
  }
  else{
    return vetorNumeroNatural[tamanhoVetor - 1] + somatorioNumeroNatural(vetorNumeroNatural, tamanhoVetor);
  }
}
//
int main() {
  int x = 940, y = 15;
  
  printf("%d \n \n", produtoNumeroNatural(x, y));

  int tamanhoVetor = 4;
  int vetorNumeroNatural[tamanhoVetor];
  
  for(int i = 0; i < tamanhoVetor; i = i + 1){
    vetorNumeroNatural[i] = ((5*i)+tamanhoVetor);
    printf("%d ", vetorNumeroNatural[i]);
  }
  printf("%d \n", somatorioNumeroNatural(vetorNumeroNatural, tamanhoVetor));
  return 0;
}