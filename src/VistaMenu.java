import java.util.ArrayList;
public class VistaMenu extends javax.swing.JFrame {
    private ArrayList<Lugar> lugares;
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
                            .addComponent(LabelSalir))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir)
                            .addComponent(btnMostrarEventos)
                            .addComponent(btnAgregarEvento)
                            .addComponent(btnListaLugares)
                            .addComponent(btnAgregarLugar))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSalir)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLugarActionPerformed
        // TODO add your handling code here:
        VistaAgregarLugar viewAgregarLugar = new VistaAgregarLugar(lugares); 
        viewAgregarLugar.setAlwaysOnTop(true);
        viewAgregarLugar.setLocationRelativeTo(null);
        viewAgregarLugar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        viewAgregarLugar.setVisible(true);
    }//GEN-LAST:event_btnAgregarLugarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnListaLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaLugaresActionPerformed
        // TODO add your handling code here:
        VistaMostrarLugares viewMLugar = new VistaMostrarLugares(lugares);
        viewMLugar.setAlwaysOnTop(true);
        viewMLugar.setLocationRelativeTo(null);
        viewMLugar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        viewMLugar.setVisible(true);
    }//GEN-LAST:event_btnListaLugaresActionPerformed

    private void btnAgregarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEventoActionPerformed
        // TODO add your handling code here:
        VistaAgregarEvento viewAEvento = new VistaAgregarEvento(lugares);
        viewAEvento.setAlwaysOnTop(true);
        viewAEvento.setLocationRelativeTo(null);
        viewAEvento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        viewAEvento.setVisible(true);
        
    }//GEN-LAST:event_btnAgregarEventoActionPerformed

    private void btnMostrarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEventosActionPerformed
        // TODO add your handling code here:
        VistaMostrarEventos viewMEvento = new VistaMostrarEventos(lugares);
        viewMEvento.setAlwaysOnTop(true);
        viewMEvento.setLocationRelativeTo(null);
        viewMEvento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        viewMEvento.setVisible(true);
    }//GEN-LAST:event_btnMostrarEventosActionPerformed

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
    private javax.swing.JLabel LabelMostrarEventos;
    private javax.swing.JLabel LabelPregunta;
    private javax.swing.JLabel LabelSalir;
    public javax.swing.JButton btnAgregarEvento;
    public javax.swing.JButton btnAgregarLugar;
    public javax.swing.JButton btnListaLugares;
    public javax.swing.JButton btnMostrarEventos;
    public javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
