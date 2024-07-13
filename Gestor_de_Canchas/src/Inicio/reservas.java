package Inicio;

import OBJETS.RESERVA;
import OBJETS.ReservaDAO;
import OBJETS.USUARIO;
import com.toedter.calendar.JCalendar;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;



/**
 *
 * @author SAMIR
 */
public class reservas extends javax.swing.JPanel {

        private ReservaDAO reservaDAO;
        private JCalendar calendar;
    
    public reservas() {
        reservaDAO = new ReservaDAO();
        
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jCalendarView = new com.toedter.calendar.JCalendar();
        btnReservar = new javax.swing.JLabel();
        horaComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        title.setText("RESERVAS DE CANCHA");
        BG.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        header.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        BG.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));
        BG.add(jCalendarView, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 920, 510));

        btnReservar.setBackground(new java.awt.Color(0, 150, 94));
        btnReservar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReservar.setForeground(new java.awt.Color(255, 255, 255));
        btnReservar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReservar.setText("Reservar");
        btnReservar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)));
        btnReservar.setOpaque(true);
        btnReservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReservarMouseClicked(evt);
            }
        });
        BG.add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 160, 60));

        horaComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        horaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 - 9:50", "10:00 - 10:50", "11:00 - 11:50", "12:00 - 12:50", "13:00 - 13:50", "14:00 - 14:50", "15:00 - 15:50", "16:00 - 16:50", "17:00 -  17:50" }));
        BG.add(horaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 140, 60));

        jLabel1.setText("HORA:");
        BG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
        
    private void realizarReserva() {
        Calendar selectedDate = jCalendarView.getCalendar();
        java.util.Date utilDate = selectedDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        String selectedHora = (String) horaComboBox.getSelectedItem();

        String dni = JOptionPane.showInputDialog("Ingrese su DNI:");
        if (dni != null && !dni.isEmpty()) {
            try {
                reservaDAO.registerReserva(new RESERVA(dni, (java.sql.Date) sqlDate, selectedHora));
                JOptionPane.showMessageDialog(null, "Reserva exitosa!");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al registrar la reserva.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El DNI no puede estar vacío.");
        }
    }
    
    
    private void btnReservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservarMouseClicked
                realizarReserva();
    }//GEN-LAST:event_btnReservarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel btnReservar;
    private javax.swing.JPanel header;
    private javax.swing.JComboBox<String> horaComboBox;
    private com.toedter.calendar.JCalendar jCalendarView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
