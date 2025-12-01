package gestor;

public class Contacto {
    private int id;
    private String nombre;
    private long numero;


    public Contacto(int id, String nombre, long numero){
        this.id = id;
        this.nombre = nombre;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
}
