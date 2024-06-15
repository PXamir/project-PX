/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Pantallas;

import java.awt.Color;

/**
 *
 * @author SAMIR
 */
public class administrar extends javax.swing.JPanel {

    /**
     * Creates new form administrar
     */
    public administrar() {
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

        BG = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        Panel2 = new javax.swing.JPanel();
        ingresarPanel = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JLabel();

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(94, 94, 96));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("ADMIN");
        Header.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 60));

        BG.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 60));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        BG.add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 70, 50));

        txtUser.setForeground(new java.awt.Color(111, 111, 111));
        txtUser.setText("Ingrese su DNI");
        txtUser.setToolTipText("");
        txtUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUser.setSelectionColor(new java.awt.Color(0, 153, 204));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        BG.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 330, 50));

        txtPass.setForeground(new java.awt.Color(111, 111, 111));
        txtPass.setText("********");
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPass.setSelectionColor(new java.awt.Color(0, 153, 204));
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        BG.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 330, 50));

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        BG.add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 70, 50));

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

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if (txtUser.getText().equals("Ingrese su DNI")){
            txtUser.setText("");
            txtUser.setForeground(Color.black);
        }
        if(String.valueOf(txtPass.getPassword()).isEmpty()){
            txtPass.setText("********");
            txtPass.setForeground(new Color(111, 111, 111));
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        if(String.valueOf(txtPass.getPassword()).equals("********")){
            txtPass.setText("");
            txtPass.setForeground(Color.black);
        }
        if (txtUser.getText().isEmpty()){
            txtUser.setText("Ingrese su DNI");
            txtUser.setForeground(new Color(111, 111, 111));
        }
    }//GEN-LAST:event_txtPassMousePressed

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        String Usuario = "admin";
        String password= "123";

        String Pass = new String(txtPass.getPassword());

        if(txtUser.getText().equals(Usuario) && Pass.equals(password)){

        }
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        ingresarPanel.setBackground(new Color(0, 150, 94));
    }//GEN-LAST:event_btnIngresarMouseExited

    private void btnIngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMousePressed
        ingresarPanel.setBackground(new Color(0, 102, 51));
    }//GEN-LAST:event_btnIngresarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JLabel btnIngresar;
    private javax.swing.JPanel ingresarPanel;
    private javax.swing.JLabel title;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
