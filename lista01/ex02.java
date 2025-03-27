/*
E2) Faça um programa que apresente os números de 1 a 15 na forma de um triangulo, como
apresentado a seguir:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
Utilize nesse exercício apenas 1 laço

Alteração: permite que o tamanho da pirâmide seja alterado e preenche as casas faltando com X caso a pirâmide não tenha números suficientes para completar a base

*/


public class Lista1Ex2 {

   public static void main(String[] args) {
        
        int max = 250;
        int linha = 1;
        int casa = 0;
        int padding = 0;
        
        for (int i = 1; i <= max; i ++) {
            
            System.out.print(i + " ");
            casa++;
            
            if (casa == linha) {
                System.out.println();
                linha++;
                casa = 0;
            } 
        }
        
        if (casa < linha) {   
            max++;
            for (; casa < linha; casa++) {
                padding = String.valueOf(max).length();
                System.out.print("X" + " ".repeat(padding));
            }
        }
        
    }
}
