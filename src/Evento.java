public class Evento 
{
    private String nombre;
    private int asistentes;
    private String tipo;

    public Evento() {
        nombre = "Pred";
        asistentes = 0;
        tipo = "Pred";
    }
    public Evento(String nombre, int asistentes, String tipo)
    {
        this.nombre = nombre;
        this.asistentes = asistentes;
        this.tipo = tipo;
    }
    public String toString()
    {
        return nombre+", "+Integer.toString(asistentes)+", "+tipo+"\n";
    }
    
    // Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }
    public void setAsistentes(String asistentes) // Sobrecarga setter, en caso de tener caracteres invalidos para el atributo
    {
        asistentes = asistentes.replaceAll("[^0-9]", " ");
        asistentes = asistentes.replaceAll(" +", "");
        this.asistentes = Integer.parseInt(asistentes);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
