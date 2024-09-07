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
        System.out.println(asistentes);
        this.asistentes = Integer.parseInt(asistentes);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
