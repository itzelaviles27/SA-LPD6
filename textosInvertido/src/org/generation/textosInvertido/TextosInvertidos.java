package org.generation.textosInvertido;
import java.util.Scanner;

//Se declara una clase 
public class TextosInvertidos {
 public static void main(String[] args) {
     // Es para leer la entrada 
     Scanner scanner = new Scanner(System.in);
     
     // Se imprime un mensaje para que lo vea el usuario
     System.out.println("Ingresa una palabra o frase:");
     
     // Se declara una variable entrada de tipo String para que lo que escriba el usuario se guarde
     String frase = scanner.nextLine();
     
     // Se llama a la funcion reverso como parametro la frase
     System.out.println("El texto al revés es: " + reverso(frase));
     
     // Cerrar scanner
     scanner.close();
 }
 
 // Funcion de reverso
 public static String reverso(String texto) {
     // StringBuilder se utiliza como objeto para invertir el texto y convertirlo en String
     return new StringBuilder(texto).reverse().toString();
 }
}

