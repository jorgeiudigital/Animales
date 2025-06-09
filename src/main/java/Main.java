import Services.ServiceAnimal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ServiceAnimal gestor = new ServiceAnimal();
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Ingrese el nombre del animal:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el tipo del animal (terrestre, aéreo, acuático):");
            String tipo = scanner.nextLine();

            System.out.println("Ingrese el género del animal (masculino, femenino):");
            String genero = scanner.nextLine();

            gestor.agregarAnimal(nombre, tipo, genero);

            System.out.println("¿Desea ingresar otro animal? (si/no):");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("si"));

        gestor.mostrarClasificacion();
    }
}

