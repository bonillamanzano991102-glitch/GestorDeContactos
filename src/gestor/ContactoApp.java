package gestor;

import java.util.Scanner;

public class ContactoApp {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ContactoService contactoService = new ContactoService();

    int opcion = 0;

    while (opcion != 5){
        System.out.println("¿QUE DECEAS HACER? ELIJE ALGUNA DE LAS 5 OPCIONES:");
        System.out.println("1.- Agregar Contacto:");
        System.out.println("2.- Mostrar Contactos:");
        System.out.println("3.- Buscar Contacto Por ID:");
        System.out.println("4.- Editar numero de Telefono:");
        System.out.println("5.- Salir");

        switch (opcion){
            case 1:
            System.out.println("Agrega el Nombre del Contacto: ");
            String agregarNombre = scanner.nextLine();
            
            System.out.println("Agrega el Numero del contacto: ");
            long agregarNumero = scanner.nextLong();
            scanner.nextLine();

            contactoService.agregarContacto(agregarNombre, agregarNumero);


      
            
        }


    }


    }
}

