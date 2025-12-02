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

        }
    }




}
