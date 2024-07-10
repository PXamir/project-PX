package Inicio;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author SAMIR
 */
public class ini extends javax.swing.JFrame {

    /**
     * Creates new form ini
     */
    public ini() {
        initComponents();
        ingresar p1 = new ingresar();
        ShowPanel(p1);
        this.setLocationRelativeTo(null);
    }
private void ShowPanel (JPanel p){
        p.setSize(600, 440);
        p.setLocation(0, 0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JLabel();
        Filtro = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setResizable(false);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Plataforma Digital de Reserva de Cancha");
        BG.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SJL.png"))); // NOI18N
        BG.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, -1, -1));

        content.setBackground(new java.awt.Color(255, 255, 255));
        this.setLocationRelativeTo(null);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        BG.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 600, 440));

        barra.setBackground(new java.awt.Color(255, 255, 255));

        btnIngresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 153, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIngresarMousePressed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 150, 94));
        btnRegistrar.setText("Registrarse");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistrarMousePressed(evt);
            }
        });

        btnAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(0, 150, 94));
        btnAdmin.setText("Administrador");
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAdminMousePressed(evt);
            }
        });
        btnAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAdminKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(105, 105, 105)
                .addComponent(btnAdmin)
                .addGap(43, 43, 43))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnIngresar)
                    .addComponent(btnAdmin))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        BG.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 600, -1));

        Filtro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Filtro.png"))); // NOI18N
        BG.add(Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 680));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo.png"))); // NOI18N
        BG.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMousePressed
        ingresar p1 = new ingresar();
        ShowPanel(p1);
        btnIngresar.setForeground(new Color(0, 153, 255));
        btnRegistrar.setForeground(new Color(0, 150, 94));
        btnAdmin.setForeground(new Color(0, 150, 94));
    }//GEN-LAST:event_btnIngresarMousePressed

    private void btnRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMousePressed
        registrar p2 = new registrar();
        ShowPanel(p2);
        btnIngresar.setForeground(new Color(0, 150, 94));
        btnRegistrar.setForeground(new Color(0, 153, 255));
        btnAdmin.setForeground(new Color(0, 150, 94));
    }//GEN-LAST:event_btnRegistrarMousePressed

    private void btnAdminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAdminKeyPressed
      
    }//GEN-LAST:event_btnAdminKeyPressed

    private void btnAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMousePressed
         administrar p3 = new administrar();
        ShowPanel(p3);
        btnIngresar.setForeground(new Color(0, 150, 94));
        btnRegistrar.setForeground(new Color(0, 150, 94));
        btnAdmin.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnAdminMousePressed

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
            java.util.logging.Logger.getLogger(ini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ini().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel Filtro;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel barra;
    private javax.swing.JLabel btnAdmin;
    private javax.swing.JLabel btnIngresar;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JPanel content;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
