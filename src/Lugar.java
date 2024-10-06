import java.util.*;
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
    public String listarEventos()
    {
        ret = "";
        eventos.forEach((k, v) ->
            {
                ret += v.toString();
            });
        return ret;
    }
    public String listarEventosNombre()
    {
        ret = "";
        eventos.forEach((k, v) ->
            {
                ret += v.getNombre()+"\n";
            });
        return ret;
    }
    public void modificarEvento(String nombreEvento, int asistentesEvento, String tipoEvento, String nOriginal)
    {
        Evento evento = new Evento(nombreEvento, asistentesEvento, tipoEvento);
        eventos.remove(nOriginal);
        eventos.put(nombreEvento, evento);
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
    public Evento getEvento(String nombre)
    {
        Evento evento = eventos.get(nombre);
        return evento;
    }
}
