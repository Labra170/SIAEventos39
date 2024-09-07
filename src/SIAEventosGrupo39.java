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
        }
    }
}