package gestor;

import java.util.Scanner;

public class ContactoApp {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ContactoService contactoService = new ContactoService();

        int opcion = 0;

        while (opcion != 6){
            System.out.println("¿QUE DECEAS HACER? ELIJE ALGUNA DE LAS 5 OPCIONES:");
            System.out.println("1.- Agregar Contacto:");
            System.out.println("2.- Mostrar Contactos:");
            System.out.println("3.- Buscar Contacto Por ID:");
            System.out.println("4.- Editar numero de Telefono:");
            System.out.println("5.- Eliminar un contacto por ID: ");
            System.out.println("6.- Salir");

            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Agrega el Nombre del Contacto: ");
                    scanner.nextLine();
                    String agregarNombre = scanner.nextLine();

                    System.out.print("Agrega el Numero del contacto: ");
                    long agregarNumero = scanner.nextLong();


                    contactoService.agregarContacto(agregarNombre, agregarNumero);
                        break;
                case 2:
                    System.out.println("Lista de contactos: ");
                        contactoService.mostrarContactos();
                        break;
                case 3:
                    System.out.print("Escribe el id que deceas buscar: ");
                    int idBuscar = scanner.nextInt();
                    Contacto encontrado = contactoService.buscarContactoPorId(idBuscar);
                    scanner.nextLine();

                    if (encontrado != null){
                        System.out.println("ID : " + encontrado.getId() +
                                " | Nombre: " + encontrado.getNombre() + " | Numero: " + encontrado.getNumero());
                    }

                    break;
                case 4:
                    System.out.print("Escribe el ID del numero que deseas actualizar: ");
                    int idActualizar = scanner.nextInt();
                    contactoService.buscarContactoPorId(idActualizar);
                    scanner.nextLine();

                    System.out.print("Dijite el numero nuevo a actualizar: ");
                    long numeroActualizar = scanner.nextLong();
                    scanner.nextLine();
                    contactoService.actualizarNumero(idActualizar, numeroActualizar);
                    break;
                case 5:
                    System.out.print("Elige el ID que deseas eliminar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    contactoService.borrarPorId(id);
                    break;

                case 6:
                    System.out.println("Hasta pronto: ");

            }



        }


    }
}


