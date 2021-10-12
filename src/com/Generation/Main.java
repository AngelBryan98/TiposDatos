package com.Generation;

public class Main {

    public static void main(String[] args) {
	// const edad: 31;
        String nombre = "Ángel Bryan";
        System.out.println(nombre);
        byte num1 = 10;
        short num2 = 10;
        int num3 = 10;
        long num4 = 10;

        // Datos primitivos decimales
        float decimal1 = 10.1212323f;
        double decimal2 = 20.218341823721738f;

        // Dato primitivo char
        char caracter = 'f';

        // Dato primitivo boolean
        boolean verdadero = true;

        short numShort1 = num1;
        int numInt = numShort1;
        short numShort2 = (short) numInt;

        System.out.println(numInt);
        System.out.println(numShort2);

        byte numByte1 = 120;
        byte numByte2 = 120;
        short suma = (short) (numByte1 + numByte2);

        System.out.println(suma);
        System.out.println(numShort2);

        // Operadores aritmeticos en Java
        // - restar
        // * multiplicar
        // / dividir
        // % residuo

        int numero1 = 5;
        int numero2 = 2;

        int suma2 = (int) (numero1 + numero2);
        int resta = (int) (numero1 - numero2);
        int multiplicar = (int) (numero1 * numero2);
        int dividir = (int) (numero1 / numero2);

        System.out.println(suma2);
        System.out.println(resta);
        System.out.println(multiplicar);
        System.out.println(dividir);
    }
}
