import java.io.*;
import java.util.*;
import javax.swing.JFrame;
public class SIAEventosGrupo39{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Lugar> lugares = new ArrayList<>();
        // Datos iniciales
        Lugar lugar = new Lugar("IBC", "Brasil 2241", 128);
        Evento evento = new Evento("Graduacion ICI", 64, "Graduacion");
        lugar.anadirEvento(evento);
        lugares.add(lugar);
        lugar = new Lugar("Casa Central", "Brasil 2950", 256);
        evento = new Evento("Claustro Pleno 2024", 128, "Conferencia");
        lugar.anadirEvento(evento);
        lugares.add(lugar);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VistaMenu viewMenu = new VistaMenu(lugares);
                viewMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                viewMenu.setLocationRelativeTo(null);
                viewMenu.setVisible(true);
            }
        });
        
        
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
