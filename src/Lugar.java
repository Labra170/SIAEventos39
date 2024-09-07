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
    
}
