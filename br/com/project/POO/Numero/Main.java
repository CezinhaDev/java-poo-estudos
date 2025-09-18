package br.com.project.POO.Numero;

public class Main {
    public static void main(String[] args) {
        // Implemente um programa que leia 10 números e mostre o maior e o menor.
        int[] numeros =     {34, 12, 5, 67, 23, 89, 1, 45, 78, 9};
        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
