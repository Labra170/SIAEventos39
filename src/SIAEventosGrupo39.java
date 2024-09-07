import java.io.*;
import java.util.*;
public class SIAEventosGrupo39 {
    public static void main(String[] args) throws IOException
    {
        ArrayList<Lugar> lugares = new ArrayList<>();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String ingresado;
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
            if (opcion == 0) {System.out.println("Hasta la proxima");break;}
            switch (opcion)
            {
                case 1 -> // Agregar lugar
                {
                    Lugar lugar = new Lugar();
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
                case 4 ->
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