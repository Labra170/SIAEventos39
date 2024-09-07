import java.util.*;
import java.io.*;
public class Lugar {
    // Atributos Clase Lugar
    private String nombre;
    private String direccion;
    private int capacidad;
    private HashMap<String, Evento> eventos;
    
    // Constructor
    public Lugar()
    {
        direccion = "";
        capacidad = 0;
        eventos = new HashMap<>();
    }
    
    public void anadirEvento() throws IOException
    {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String ingresado;
        Evento evento = new Evento();
        
        System.out.print("Ingresa el nombre del evento: ");
        evento.setNombre(lector.readLine());
        System.out.print("Ingresa la cantidad de asistentes al evento: ");
        evento.setAsistentes(lector.readLine());
        System.out.print("Ingresa el tipo de evento: ");
        evento.setTipo(lector.readLine());
        eventos.put(evento.getNombre(), evento);
        
        System.out.println("Evento agregado");
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
