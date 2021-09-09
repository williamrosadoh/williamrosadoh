package com.company;

public class Main {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int numero = 21;
        int numeroRotadoDerecha = numero >> 1;
        int numeroRotadoIzquierda = numero << 1;

        if (num1 > num2)
            System.out.println("El primer numero es mayor que el segundo numero");

        if (num1 < num2)
            System.out.println("El primer numero es menor que el segundo numero\n");

        if (num1 >= num2)
            System.out.println("El primer numero es mayor o igual que el segundo numero 2");

        if (num1 <= num2)
            System.out.println("El primer numero es menor o igual que el segundo numero\n");

        System.out.println("Número original en binario: " + Integer.toBinaryString(numero));
        System.out.println("Número rotado en binario hacia la derecha " + Integer.toBinaryString(numeroRotadoDerecha));
        System.out.println("\nNúmero original en binario: " + Integer.toBinaryString(numero));
        System.out.println("Número rotado en binario izquierda:  " + Integer.toBinaryString(numeroRotadoIzquierda));
    }
}
