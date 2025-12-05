package gestor;

import java.util.ArrayList;
import java.util.List;

public class ContactoService {

    private List<Contacto> contacto = new ArrayList<>();
    private int contador = 1;

    public void agregarContacto(String nombre, long numero){
        int id = contador;

        Contacto nuevoContacto = new Contacto(id, nombre, numero);
        contacto.add(nuevoContacto);

        contador ++;
    }

    public void mostrarContactos(){
        for(Contacto c : contacto){
            System.out.println("ID: " + c.getId() + " | Nombre: " + c.getNombre()
            + " | Telefono: " + c.getNumero());
        }
    }

    public Contacto  buscarContactoPorId(int id){
        for (Contacto c : contacto){
            if (c.getId() == id){
                return c;
            }
        }

        return null;


    }

    public void actualizarNumero(int id, long numeroNuevo){
        for (Contacto c : contacto){
            if (c.getId() == id){
          if (!validarNumero(numeroNuevo)){
              System.out.println("El numero no es valido, debe tener 10 digitos!");
              return;
          }
          c.setNumero(numeroNuevo);
                System.out.println("Numero actualizado con exito!!!!!");
                return;
            }
        }
        System.out.println("No se encontro el ID que busca :(");




        }
        public void borrarPorId(int id) {
        for (Contacto c : contacto){
            if (c.getId() == id){
                contacto.remove(c);
                System.out.println("Numero eliminado correctamente");
                return;
            }
        }
            System.out.println("No se encontro el ID del numero que desea eliminar");
    }
    public static boolean validarNumero(long numero){
        String validarNumero = String.valueOf(numero);
        if (validarNumero.length() != 10) {
            return false;

        }return true;
    }



}
