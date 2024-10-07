import java.util.ArrayList;
import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException;
public class VistaMenu extends javax.swing.JFrame {
    private ArrayList<Lugar> lugares;
    
    // Constructor de la ventana
    public VistaMenu(ArrayList<Lugar> lugares) {
        this.lugares = lugares;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelBienvenido = new javax.swing.JLabel();
        LabelPregunta = new javax.swing.JLabel();
        LabelAgregarLugar = new javax.swing.JLabel();
        LabelListaLugares = new javax.swing.JLabel();
        LabelAgregarEvento = new javax.swing.JLabel();
        LabelMostrarEventos = new javax.swing.JLabel();
        LabelSalir = new javax.swing.JLabel();
        btnAgregarLugar = new javax.swing.JButton();
        btnListaLugares = new javax.swing.JButton();
        btnAgregarEvento = new javax.swing.JButton();
        btnMostrarEventos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        LabelModificarEvento = new javax.swing.JLabel();
        btnModificarEvento = new javax.swing.JButton();
        labelEliiminarEvento = new javax.swing.JLabel();
        btnEliminarEvento = new javax.swing.JButton();
        labelImportar = new javax.swing.JLabel();
        btnImportar = new javax.swing.JButton();
        labelExportar = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelBienvenido.setText("Bienvenido");

        LabelPregunta.setText("¿Qué quieres hacer?");

        LabelAgregarLugar.setText("1.- Agregar lugar");

        LabelListaLugares.setText("2.- Lista de lugares");

        LabelAgregarEvento.setText("3.- Agregar evento");

        LabelMostrarEventos.setText("4.- Mostrar eventos por lugar");

        LabelSalir.setText("0.- Salir");

        btnAgregarLugar.setText("                ");
        btnAgregarLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLugarActionPerformed(evt);
            }
        });

        btnListaLugares.setText("                ");
        btnListaLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaLugaresActionPerformed(evt);
            }
        });

        btnAgregarEvento.setText("                ");
        btnAgregarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEventoActionPerformed(evt);
            }
        });

        btnMostrarEventos.setText("                ");
        btnMostrarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEventosActionPerformed(evt);
            }
        });

        btnSalir.setText("                ");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        LabelModificarEvento.setText("5.- Modificar evento");

        btnModificarEvento.setText("                ");
        btnModificarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEventoActionPerformed(evt);
            }
        });

        labelEliiminarEvento.setText("6.- Eliminar evento");

        btnEliminarEvento.setText("                ");
        btnEliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEventoActionPerformed(evt);
            }
        });

        labelImportar.setText("7.- Importar");

        btnImportar.setText("                ");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        labelExportar.setText("8.- Exportar");

        btnExportar.setText("                ");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPregunta)
                    .addComponent(LabelBienvenido)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelAgregarLugar)
                            .addComponent(LabelListaLugares)
                            .addComponent(LabelAgregarEvento)
                            .addComponent(LabelMostrarEventos)
                            .addComponent(LabelSalir)
                            .addComponent(LabelModificarEvento)
                            .addComponent(labelEliiminarEvento)
                            .addComponent(labelImportar)
                            .addComponent(labelExportar))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExportar)
                            .addComponent(btnImportar)
                            .addComponent(btnModificarEvento)
                            .addComponent(btnSalir)
                            .addComponent(btnMostrarEventos)
                            .addComponent(btnAgregarEvento)
                            .addComponent(btnListaLugares)
                            .addComponent(btnAgregarLugar)
                            .addComponent(btnEliminarEvento))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelPregunta)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAgregarLugar)
                    .addComponent(btnAgregarLugar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelListaLugares)
                    .addComponent(btnListaLugares))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAgregarEvento)
                    .addComponent(btnAgregarEvento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelMostrarEventos)
                    .addComponent(btnMostrarEventos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelModificarEvento)
                    .addComponent(btnModificarEvento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEliiminarEvento)
                    .addComponent(btnEliminarEvento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelImportar)
                    .addComponent(btnImportar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelExportar)
                    .addComponent(btnExportar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSalir)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLugarActionPerformed
        // TODO add your handling code here:
        // Se abre una ventana extra al presionar el boton de la opcion "Agregar lugar"
        VistaAgregarLugar viewAgregarLugar = new VistaAgregarLugar(lugares); 
        viewAgregarLugar.setAlwaysOnTop(true);
        viewAgregarLugar.setLocationRelativeTo(null);
        viewAgregarLugar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        viewAgregarLugar.setVisible(true);
    }//GEN-LAST:event_btnAgregarLugarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        // Finaliza el programa al apretar el boton
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnListaLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaLugaresActionPerformed
        // TODO add your handling code here:
        // Se crea una ventana extra al presionar el boton de la opcion "Mostrar lugares"
        VistaMostrarLugares viewMLugar = new VistaMostrarLugares(lugares);
        viewMLugar.setAlwaysOnTop(true);
        viewMLugar.setLocationRelativeTo(null);
        viewMLugar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        viewMLugar.setVisible(true);
    }//GEN-LAST:event_btnListaLugaresActionPerformed

    private void btnAgregarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEventoActionPerformed
        // TODO add your handling code here:
        // Se crea una ventana extra al presionar el boton de la opcion "Agregar evento"
        VistaAgregarEvento viewAEvento = new VistaAgregarEvento(lugares);
        viewAEvento.setAlwaysOnTop(true);
        viewAEvento.setLocationRelativeTo(null);
        viewAEvento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        viewAEvento.setVisible(true);
        
    }//GEN-LAST:event_btnAgregarEventoActionPerformed

    private void btnMostrarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEventosActionPerformed
        // TODO add your handling code here:
        // Se crea una ventana extra al presionar el boton de la opcion "Mostrar eventos"
        VistaMostrarEventos viewMEvento = new VistaMostrarEventos(lugares);
        viewMEvento.setAlwaysOnTop(true);
        viewMEvento.setLocationRelativeTo(null);
        viewMEvento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        viewMEvento.setVisible(true);
    }//GEN-LAST:event_btnMostrarEventosActionPerformed

    private void btnModificarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEventoActionPerformed
        // TODO add your handling code here:
        // Se crea una ventana extra al presionar el boton de la opcion "Modificar evento"
        VistaModificarEvento viewMoEvento = new VistaModificarEvento(lugares);
        viewMoEvento.setAlwaysOnTop(true);
        viewMoEvento.setLocationRelativeTo(null);
        viewMoEvento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        viewMoEvento.setVisible(true);
        
    }//GEN-LAST:event_btnModificarEventoActionPerformed

    private void btnEliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEventoActionPerformed
        // TODO add your handling code here:
        // Se crea una ventana extra al presionar el boton de la opcion "Eliminar evento"
        VistaEliminarEvento viewEEvento = new VistaEliminarEvento(lugares);
        viewEEvento.setAlwaysOnTop(true);
        viewEEvento.setLocationRelativeTo(null);
        viewEEvento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        viewEEvento.setVisible(true);
    }//GEN-LAST:event_btnEliminarEventoActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImportarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:{
        // Al presionar el boton de la opcion exportar, se crea un CSV en la ubicacion del proyecto
        
        String csvFile = "data.csv"; // Nombre del csv
        String[] headers = {"Nombre lugar", "Direccion lugar", "Maxima Asistentes"}; // "Parametros" del CSV

 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))) { 
            // Se escriben los parametros
            writer.write(String.join(",", headers)); 
            writer.newLine(); 
 
            // Se escriben los datos del lugar
            for (int i = 0; i < lugares.size(); i++) { 
                writer.write(String.join(",", lugares.get(i).getNombre())+ " ");
                writer.write(String.join(",", lugares.get(i).getDireccion())+ " "); 
                writer.write(String.join(",", String.valueOf(lugares.get(i).getCapacidad()))); 
                writer.newLine(); 
            }
            
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    }//GEN-LAST:event_btnExportarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAgregarEvento;
    private javax.swing.JLabel LabelAgregarLugar;
    private javax.swing.JLabel LabelBienvenido;
    private javax.swing.JLabel LabelListaLugares;
    private javax.swing.JLabel LabelModificarEvento;
    private javax.swing.JLabel LabelMostrarEventos;
    private javax.swing.JLabel LabelPregunta;
    private javax.swing.JLabel LabelSalir;
    public javax.swing.JButton btnAgregarEvento;
    public javax.swing.JButton btnAgregarLugar;
    private javax.swing.JButton btnEliminarEvento;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImportar;
    public javax.swing.JButton btnListaLugares;
    private javax.swing.JButton btnModificarEvento;
    public javax.swing.JButton btnMostrarEventos;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel labelEliiminarEvento;
    private javax.swing.JLabel labelExportar;
    private javax.swing.JLabel labelImportar;
    // End of variables declaration//GEN-END:variables
}
