package vista;

import javax.swing.JFrame;
import controlador.PersonalDeCoordinacion;

public class Vista_Gestion_Usuarios extends javax.swing.JFrame {

    public Vista_Gestion_Usuarios(PersonalDeCoordinacion personalDeCoordinacion, JFrame vAnterior) {
        initComponents();
        
        this.personalDeCoordinacion = personalDeCoordinacion;
        this.vAnterior = vAnterior;
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
        jPanel_datos_usuario = new javax.swing.JPanel();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_dni = new javax.swing.JTextField();
        jTextField_correo = new javax.swing.JTextField();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_apellidos = new javax.swing.JLabel();
        jLabel_telefono = new javax.swing.JLabel();
        jLabel_correo = new javax.swing.JLabel();
        jLabel_coordinador = new javax.swing.JLabel();
        jTextField_telefono = new javax.swing.JTextField();
        jTextField_apellidos = new javax.swing.JTextField();
        jLabel_dni = new javax.swing.JLabel();
        jComboBox_coordinador = new javax.swing.JComboBox<>();
        jLabel_datos_usuario = new javax.swing.JLabel();
        jButton_consultar = new javax.swing.JButton();
        jButton_modificar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jButton_crear = new javax.swing.JButton();
        jPanel_usuarios = new javax.swing.JPanel();
        jLabel_usuarios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_usuarios = new javax.swing.JList<>();
        JButton_atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Usuarios");

        jPanel_datos_usuario.setBackground(new java.awt.Color(204, 204, 204));

        jTextField_nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_nombre.setText("Nombre");
        jTextField_nombre.setPreferredSize(new java.awt.Dimension(50, 20));
        jTextField_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombreActionPerformed(evt);
            }
        });

        jTextField_dni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_dni.setText("DNI");
        jTextField_dni.setPreferredSize(new java.awt.Dimension(50, 20));

        jTextField_correo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_correo.setText("Correo");
        jTextField_correo.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel_nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_nombre.setText("Nombre");

        jLabel_apellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_apellidos.setText("Apellidos");

        jLabel_telefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_telefono.setText("Teléfono");

        jLabel_correo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_correo.setText("Correo");

        jLabel_coordinador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_coordinador.setText("Coordinador/a");

        jTextField_telefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_telefono.setText("Telefono");
        jTextField_telefono.setPreferredSize(new java.awt.Dimension(50, 20));

        jTextField_apellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_apellidos.setText("Apellidos");
        jTextField_apellidos.setPreferredSize(new java.awt.Dimension(50, 20));
        jTextField_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_apellidosActionPerformed(evt);
            }
        });

        jLabel_dni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_dni.setText("DNI");

        jComboBox_coordinador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox_coordinador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jComboBox_coordinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_coordinadorActionPerformed(evt);
            }
        });

        jLabel_datos_usuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_datos_usuario.setText("DATOS DE USUARIO");

        javax.swing.GroupLayout jPanel_datos_usuarioLayout = new javax.swing.GroupLayout(jPanel_datos_usuario);
        jPanel_datos_usuario.setLayout(jPanel_datos_usuarioLayout);
        jPanel_datos_usuarioLayout.setHorizontalGroup(
            jPanel_datos_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datos_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_datos_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_dni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_dni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_datos_usuarioLayout.createSequentialGroup()
                        .addComponent(jLabel_coordinador, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_coordinador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_datos_usuario)
                    .addComponent(jLabel_correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel_datos_usuarioLayout.setVerticalGroup(
            jPanel_datos_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_datos_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_datos_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_apellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_dni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_telefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_correo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_datos_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_coordinador)
                    .addComponent(jComboBox_coordinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jButton_consultar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_consultar.setText("Consultar");
        jButton_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_consultarActionPerformed(evt);
            }
        });

        jButton_modificar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_modificar.setText("Modificar");

        jButton_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_eliminar.setText("Eliminar");

        jButton_crear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_crear.setText("Crear");

        jPanel_usuarios.setBackground(new java.awt.Color(204, 204, 204));

        jLabel_usuarios.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_usuarios.setText("USUARIOS");

        jList_usuarios.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jList_usuarios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Jose Alvarez", "Antonio Gilberto" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList_usuarios);

        javax.swing.GroupLayout jPanel_usuariosLayout = new javax.swing.GroupLayout(jPanel_usuarios);
        jPanel_usuarios.setLayout(jPanel_usuariosLayout);
        jPanel_usuariosLayout.setHorizontalGroup(
            jPanel_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_usuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addGroup(jPanel_usuariosLayout.createSequentialGroup()
                        .addComponent(jLabel_usuarios)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_usuariosLayout.setVerticalGroup(
            jPanel_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_usuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        JButton_atras.setBackground(new java.awt.Color(102, 0, 102));
        JButton_atras.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        JButton_atras.setForeground(new java.awt.Color(255, 255, 255));
        JButton_atras.setText("ATRÁS");
        JButton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jPanel_datos_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JButton_atras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel_datos_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel_usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(131, 131, 131)
                .addComponent(JButton_atras)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jButton_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_crear)
                .addGap(18, 18, 18)
                .addComponent(jButton_eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1146, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombreActionPerformed

    private void jTextField_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_apellidosActionPerformed

    private void jComboBox_coordinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_coordinadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_coordinadorActionPerformed

    private void jButton_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_consultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_consultarActionPerformed

    private void JButton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_atrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButton_atrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_atras;
    private javax.swing.JButton jButton_consultar;
    private javax.swing.JButton jButton_crear;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_modificar;
    private javax.swing.JComboBox<String> jComboBox_coordinador;
    private javax.swing.JLabel jLabel_apellidos;
    private javax.swing.JLabel jLabel_coordinador;
    private javax.swing.JLabel jLabel_correo;
    private javax.swing.JLabel jLabel_datos_usuario;
    private javax.swing.JLabel jLabel_dni;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_telefono;
    private javax.swing.JLabel jLabel_usuarios;
    private javax.swing.JList<String> jList_usuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_datos_usuario;
    private javax.swing.JPanel jPanel_usuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_apellidos;
    private javax.swing.JTextField jTextField_correo;
    private javax.swing.JTextField jTextField_dni;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables

    private PersonalDeCoordinacion personalDeCoordinacion;
    private javax.swing.JFrame vAnterior;
}
