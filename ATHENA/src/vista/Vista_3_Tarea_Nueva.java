package vista;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import controlador.PersonalDeCoordinacion;

public class Vista_3_Tarea_Nueva extends javax.swing.JFrame
{
    private PersonalDeCoordinacion personalDeCoordinacion;
    private Vista_2_Actividad_Detalles vAnterior;
    
    public Vista_3_Tarea_Nueva(PersonalDeCoordinacion personalDeCoordinacion, Vista_2_Actividad_Detalles vAnterior) {
        initComponents();
        this.personalDeCoordinacion = personalDeCoordinacion;
        this.vAnterior = vAnterior;
        
        this.responsable_jComboBox.setEnabled(false);
        this.btn_Crear.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Titulo_Creacion_Tareas = new javax.swing.JLabel();
        nombre_TextField = new javax.swing.JTextField();
        label_Nombre_Tarea = new javax.swing.JLabel();
        equipo_ComboBox = new javax.swing.JComboBox<>();
        label_Equipo = new javax.swing.JLabel();
        responsable_jComboBox = new javax.swing.JComboBox<>();
        responsable_jLabel = new javax.swing.JLabel();
        label_Fecha_Maxima_Realizacion_Tarea = new javax.swing.JLabel();
        fechaMax_DatePicker = new com.toedter.calendar.JDateChooser();
        btn_Crear = new javax.swing.JButton();
        btn_Atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tarea Nueva");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Titulo_Creacion_Tareas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Titulo_Creacion_Tareas.setText("Crear Tarea");

        nombre_TextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        label_Nombre_Tarea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Nombre_Tarea.setText("Nombre de la Tarea");

        equipo_ComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                equipo_ComboBoxPopupMenuWillBecomeVisible(evt);
            }
        });

        label_Equipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Equipo.setText("Equipo");

        responsable_jComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                responsable_jComboBoxPopupMenuWillBecomeVisible(evt);
            }
        });

        responsable_jLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        responsable_jLabel.setText("Responsable");

        label_Fecha_Maxima_Realizacion_Tarea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Fecha_Maxima_Realizacion_Tarea.setText("Fecha Maxima Realizacion");

        btn_Crear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_Crear.setForeground(new java.awt.Color(0, 204, 51));
        btn_Crear.setText("Crear Tarea");
        btn_Crear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));
        btn_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearActionPerformed(evt);
            }
        });

        btn_Atras.setBackground(new java.awt.Color(102, 0, 102));
        btn_Atras.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_Atras.setForeground(new java.awt.Color(255, 255, 255));
        btn_Atras.setText("ATRAS");
        btn_Atras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(btn_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_Titulo_Creacion_Tareas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 137, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_Nombre_Tarea)
                                .addComponent(responsable_jLabel)
                                .addComponent(label_Equipo)
                                .addComponent(label_Fecha_Maxima_Realizacion_Tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fechaMax_DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(responsable_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equipo_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(nombre_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Titulo_Creacion_Tareas)
                .addGap(14, 14, 14)
                .addComponent(label_Nombre_Tarea)
                .addGap(18, 18, 18)
                .addComponent(nombre_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(label_Equipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipo_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(responsable_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(responsable_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_Fecha_Maxima_Realizacion_Tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaMax_DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btn_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btn_Atras)
                .addContainerGap())
        );

        btn_Atras.getAccessibleContext().setAccessibleName("btn_Atras");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void equipo_ComboBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_equipo_ComboBoxPopupMenuWillBecomeVisible
        // 2.- DIOS Consultar Equipos
        carga_combos(this.equipo_ComboBox, this.personalDeCoordinacion.consultarEquipos());
        this.responsable_jComboBox.setEnabled(true);
    }//GEN-LAST:event_equipo_ComboBoxPopupMenuWillBecomeVisible

    private void responsable_jComboBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_responsable_jComboBoxPopupMenuWillBecomeVisible
       // 3.- DIOS Consultar Miembros del Equipo
       carga_combos(this.responsable_jComboBox, this.personalDeCoordinacion.consultarMiembrosDelEquipo(this.equipo_ComboBox.getSelectedItem()));
       this.btn_Crear.setEnabled(true);
    }//GEN-LAST:event_responsable_jComboBoxPopupMenuWillBecomeVisible

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        this.setVisible(false);
        this.vAnterior.setVisible(true);
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void btn_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearActionPerformed
        // 4.- DIOS Alta Tarea
        if(this.nombre_TextField.getText() == null)
            JOptionPane.showMessageDialog(this, "Debes rellenar el nombre");
        else if(this.fechaMax_DatePicker.getDate() == null)
            JOptionPane.showMessageDialog(this, "Debes rellenar la Fecha Máxima Realizacion");
        else{
            Object tarea = this.personalDeCoordinacion.altaTarea(
                this.nombre_TextField.getText(),
                this.fechaMax_DatePicker.getDate(),
                this.equipo_ComboBox.getSelectedItem(),
                this.responsable_jComboBox.getSelectedItem()
            );
            if(tarea == null)
                JOptionPane.showMessageDialog(this, "No se ha creado la tarea - La Actividad esta En Curso");
            else
                this.vAnterior.altaTarea(tarea);
            
            this.setVisible(false);
            this.vAnterior.setVisible(true);
        }
    }//GEN-LAST:event_btn_CrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atras;
    private javax.swing.JButton btn_Crear;
    private javax.swing.JComboBox<String> equipo_ComboBox;
    private com.toedter.calendar.JDateChooser fechaMax_DatePicker;
    private javax.swing.JLabel jLabel_Titulo_Creacion_Tareas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_Equipo;
    private javax.swing.JLabel label_Fecha_Maxima_Realizacion_Tarea;
    private javax.swing.JLabel label_Nombre_Tarea;
    private javax.swing.JTextField nombre_TextField;
    private javax.swing.JComboBox<String> responsable_jComboBox;
    private javax.swing.JLabel responsable_jLabel;
    // End of variables declaration//GEN-END:variables

    private void carga_combos(JComboBox<String> comboBox, ArrayList array) {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for(Object object: array){
            modelo.addElement(object);
        }
        comboBox.setModel(modelo);
    }
}
