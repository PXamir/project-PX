/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Inicio;

import OBJETS.UsuarioDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SAMIR
 */
public class ingresar extends javax.swing.JPanel {

    private UsuarioDAO usuarioDAO;
    
    public ingresar() {
        usuarioDAO = new UsuarioDAO();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        User_Icon = new javax.swing.JPanel();
        User_Field = new javax.swing.JPanel();
        txtPass = new javax.swing.JPasswordField();
        User_Field1 = new javax.swing.JPanel();
        txtDNI = new javax.swing.JTextField();
        Pass_Icon = new javax.swing.JPanel();
        ingresarPanel = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JLabel();

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(94, 94, 96));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("INGRESAR");
        Header.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 60));

        BG.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 60));

        User_Icon.setBackground(java.awt.Color.gray);

        javax.swing.GroupLayout User_IconLayout = new javax.swing.GroupLayout(User_Icon);
        User_Icon.setLayout(User_IconLayout);
        User_IconLayout.setHorizontalGroup(
            User_IconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );
        User_IconLayout.setVerticalGroup(
            User_IconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        BG.add(User_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 70, 50));

        User_Field.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPass.setBackground(new java.awt.Color(242, 242, 242));
        txtPass.setForeground(new java.awt.Color(111, 111, 111));
        txtPass.setText("********");
        txtPass.setBorder(null);
        txtPass.setSelectionColor(new java.awt.Color(0, 153, 204));
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        User_Field.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 50));

        BG.add(User_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 340, 50));

        User_Field1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDNI.setBackground(new java.awt.Color(242, 242, 242));
        txtDNI.setForeground(new java.awt.Color(111, 111, 111));
        txtDNI.setText("Ingrese su DNI");
        txtDNI.setToolTipText("");
        txtDNI.setBorder(null);
        txtDNI.setSelectionColor(new java.awt.Color(0, 153, 204));
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDNIKeyPressed(evt);
            }
        });
        User_Field1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 50));

        BG.add(User_Field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 340, 50));

        Pass_Icon.setBackground(java.awt.Color.gray);

        javax.swing.GroupLayout Pass_IconLayout = new javax.swing.GroupLayout(Pass_Icon);
        Pass_Icon.setLayout(Pass_IconLayout);
        Pass_IconLayout.setHorizontalGroup(
            Pass_IconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        Pass_IconLayout.setVerticalGroup(
            Pass_IconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        BG.add(Pass_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 70, 50));

        ingresarPanel.setBackground(new java.awt.Color(0, 150, 94));
        ingresarPanel.setPreferredSize(new java.awt.Dimension(200, 50));

        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIngresarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ingresarPanelLayout = new javax.swing.GroupLayout(ingresarPanel);
        ingresarPanel.setLayout(ingresarPanelLayout);
        ingresarPanelLayout.setHorizontalGroup(
            ingresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        ingresarPanelLayout.setVerticalGroup(
            ingresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        BG.add(ingresarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 400, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    JPanel panel;
    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        
                String dni = txtDNI.getText();
                String password = new String(txtPass.getPassword());

                try {
                    if (usuarioDAO.loginUsuario(dni, password)) {
                        Menu menu = new Menu();
                        menu.setVisible(true);
                        
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(panel, "DNI o contraseña incorrectos.");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(panel, "Error al iniciar sesión.");
                }        
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnIngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMousePressed
        ingresarPanel.setBackground(new Color(0, 102, 51));
    }//GEN-LAST:event_btnIngresarMousePressed

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        ingresarPanel.setBackground(new Color(0, 150, 94));
    }//GEN-LAST:event_btnIngresarMouseExited

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        if(String.valueOf(txtPass.getPassword()).equals("********")){
            txtPass.setText("");
            txtPass.setForeground(Color.black);
        }
        if (txtDNI.getText().isEmpty()){
            txtDNI.setText("Ingrese su DNI");
            txtDNI.setForeground(new Color(111, 111, 111));
        }
    }//GEN-LAST:event_txtPassMousePressed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyPressed
        if (txtDNI.getText().equals("Ingrese su DNI")){
            txtDNI.setText("");
            txtDNI.setForeground(Color.black);
        }
        if(String.valueOf(txtPass.getPassword()).isEmpty()){
            txtPass.setText("********");
            txtPass.setForeground(new Color(111, 111, 111));
        }
    }//GEN-LAST:event_txtDNIKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Pass_Icon;
    private javax.swing.JPanel User_Field;
    private javax.swing.JPanel User_Field1;
    private javax.swing.JPanel User_Icon;
    private javax.swing.JLabel btnIngresar;
    private javax.swing.JPanel ingresarPanel;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
