import java.io.*;
import java.util.*;
public class SIAEventosGrupo39 {
    public static void main(String[] args) throws IOException
    {
        // Creacion inicial
        ArrayList<Lugar> lugares = new ArrayList<>();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String ingresado;
        
        // Datos iniciales
        Lugar lugar = new Lugar("IBC", "Brasil 2241", 128);
        Evento evento = new Evento("Graduacion ICI", 64, "Graduacion");
        lugar.anadirEvento(evento);
        lugares.add(lugar);
        lugar = new Lugar("Casa Central", "Brasil 2950", 256);
        evento = new Evento("Claustro Pleno 2024", 128, "Conferencia");
        lugar.anadirEvento(evento);
        lugares.add(lugar);
        
        
        // Menu
        int opcion;
        while (true)
        {
            System.out.println();
            System.out.println("Que deseas hacer?");
            System.out.println("1.- Agregar lugar");
            System.out.println("2.- Lista de lugares");
            System.out.println("3.- Agregar Evento");
            System.out.println("4.- Lista de eventos en el lugar");
            System.out.println("0.- Salir");
            System.out.print("Opcion seleccionada: ");
            ingresado = lector.readLine();
            System.out.println();
            opcion = Integer.parseInt( ingresado );
            if (opcion == 0) {System.out.println("Hasta la proxima");break;} // Salir del programa
            switch (opcion)
            {
                case 1 -> // Agregar lugar
                {
                    lugar = new Lugar();
                    System.out.print("Ingresa el nombre: ");
                    lugar.setNombre(lector.readLine());
                    System.out.print("Ingresa la direccion: ");
                    lugar.setDireccion(lector.readLine());
                    System.out.print("Ingresa la capacidad de asistentes: ");
                    lugar.setCapacidad(lector.readLine());
                    lugares.add(lugar);
                }

                case 2 -> // Mostrar lugares
                {
                    for (int i = 0; i < lugares.size(); i++)
                    {
                        System.out.println("Nombre: " + lugares.get(i).getNombre() + " Direccion: " + lugares.get(i).getDireccion());
                    }
                }
                case 3 -> // Agregar evento
                {
                    int i = 0;
                    while (true)
                    {
                        if (i == 0)
                        {
                        System.out.print("En donde quieres agregar el evento? ");
                        ingresado = lector.readLine();
                        }
                        if (lugares.get(i).getNombre().equals(ingresado))
                        {
                            lugares.get(i).anadirEvento();
                            break;
                        }
                        if (i == lugares.size()-1)
                        {
                            System.out.println("El lugar no existe! Intenta nuevamente");
                            i = 0;
                        }
                        else i++;
                    }
                }
                case 4 -> // Mostrar eventos en el lugar
                {
                    int i = 0;
                    while (true)
                    {
                        if (i == 0)
                        {
                            System.out.print("De que lugar quieres ver la lista? ");
                            ingresado = lector.readLine();
                        }
                        if (lugares.get(i).getNombre().equals(ingresado))
                        {
                            lugares.get(i).mostrarEventos();
                            break;
                        }
                        if (i == lugares.size()-1)
                        {
                            System.out.println("El lugar no existe! Intenta nuevamente");
                            i = 0;
                        }
                        else i++;
                    }
                }
            }
        }
    }
}