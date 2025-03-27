/*
E1) Faça um programa que apresente os números de 1 a 10, sendo que cada número deve ser
impresso em uma linha e os números ímpares deslocados (\t) a direita.
*/

public class Lista1Ex1 {

    public static void main(String[] args) {
        int max = 15;
        for (int i = 1; i < max; i ++) {
            
            System.out.println((i % 2 != 0 ? "\t" : "") + i);
            
        }
    }
}
