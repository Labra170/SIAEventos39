import java.util.*;
import javax.swing.JFrame;
public class SIAEventosGrupo39{
    public static void main(String[] args)
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
        
        //Ejecucion ventana Menu
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VistaMenu viewMenu = new VistaMenu(lugares);
                viewMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                viewMenu.setLocationRelativeTo(null);
                viewMenu.setVisible(true);
            }
        });
    }
}
