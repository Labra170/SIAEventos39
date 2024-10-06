import java.util.*;
import java.io.*;
public class Lugar {
    // Atributos Clase Lugar
    private String nombre;
    private String direccion;
    private int capacidad;
    private String ret;
    private HashMap<String, Evento> eventos;
    
    // Constructor
    public Lugar()
    {
        direccion = "";
        capacidad = 0;
        eventos = new HashMap<>();
    }
    public Lugar(String nombre, String direccion, int capacidad)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
        eventos = new HashMap<>();
    }
    
    public void anadirEvento(Evento evento)
    {
        eventos.put(evento.getNombre(), evento);
    }
    
    public void mostrarEventos() throws IOException
    {
        eventos.forEach((k, v) ->
        {
            System.out.println();
            System.out.print("Nombre: " + v.getNombre());
            System.out.print(" Cantidad de asistente: " + v.getAsistentes());
            System.out.println(" Tipo de evento: " + v.getTipo());
        });
    }
    public String listarEventos()
    {
        ret = "";
        eventos.forEach((k, v) ->
                {
                    ret += v.toString();
                });
        return ret;
    }
    public int cantidadEventos()
    {
        return eventos.size();
    }
    
    // Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void setCapacidad(String capacidad) // Sobrecarga, por si el string contiene caracteres no validos
    {
        capacidad = capacidad.replaceAll("[^0-9]", " ");
        capacidad = capacidad.replaceAll(" +", "");
        System.out.println(capacidad);
        this.capacidad = Integer.parseInt(capacidad);
    }
}
