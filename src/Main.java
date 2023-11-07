import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        // Contar la cantidad de caracteres
        int cantidadCaracteres = frase.length();
        System.out.println("Cantidad de caracteres: " + cantidadCaracteres);

        // Verificar si contiene una palabra específica (ejemplo: "hola")
        String palabraBuscada = "hola";
        boolean contienePalabra = frase.toLowerCase().contains(palabraBuscada);
        System.out.println("¿La frase contiene la palabra 'hola'? " + contienePalabra);

        // Convertir la frase a minúsculas y mayúsculas
        String enMinusculas = frase.toLowerCase();
        String enMayusculas = frase.toUpperCase();
        System.out.println("Frase en minúsculas: " + enMinusculas);
        System.out.println("Frase en mayúsculas: " + enMayusculas);

        // Imprimir solo la primera palabra
        int indiceEspacio = frase.indexOf(" ");
        String primeraPalabra = frase.substring(0, indiceEspacio);
        System.out.println("Primera palabra: " + primeraPalabra);

        // Agregar dos o más palabras en cualquier punto de la frase
        String fraseModificada = frase + " adicionando más palabras.";
        System.out.println("Frase modificada: " + fraseModificada);

        scanner.close();
    }
}