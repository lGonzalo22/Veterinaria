package Vistas;

import AccesoADatos.ClienteData;
import Entidades.Cliente;
import javax.swing.JOptionPane;

public class AgregarCliente extends javax.swing.JInternalFrame {

    private ClienteData clienData = new ClienteData();
    private Cliente cliente = null;

    public AgregarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtDocumento = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jtDireccion = new javax.swing.JTextField();
        jtApellidoYNombre = new javax.swing.JTextField();
        jtPersonaAlternativa = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtTelefonoAlternativo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jrbActivo = new javax.swing.JRadioButton();
        jrbInactivo = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Documento:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CLIENTE");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido y Nombre:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Direccion:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Telefono:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Persona Alternativa:");

        jtDocumento.setBackground(new java.awt.Color(255, 255, 255));
        jtDocumento.setForeground(new java.awt.Color(0, 0, 0));
        jtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDocumentoKeyTyped(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(204, 204, 255));
        jbBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Imagenes/lupa (2).png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        jtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        jtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDireccionKeyTyped(evt);
            }
        });

        jtApellidoYNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtApellidoYNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtApellidoYNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoYNombreKeyTyped(evt);
            }
        });

        jtPersonaAlternativa.setBackground(new java.awt.Color(255, 255, 255));
        jtPersonaAlternativa.setForeground(new java.awt.Color(0, 0, 0));
        jtPersonaAlternativa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPersonaAlternativaKeyTyped(evt);
            }
        });

        jtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        jtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Telefono Alternativo:");

        jtTelefonoAlternativo.setBackground(new java.awt.Color(255, 255, 255));
        jtTelefonoAlternativo.setForeground(new java.awt.Color(0, 0, 0));
        jtTelefonoAlternativo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoAlternativoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Estado:");

        jrbActivo.setBackground(new java.awt.Color(204, 204, 255));
        jrbActivo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jrbActivo.setForeground(new java.awt.Color(0, 0, 0));
        jrbActivo.setText("Activo");
        jrbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivoActionPerformed(evt);
            }
        });

        jrbInactivo.setBackground(new java.awt.Color(204, 204, 255));
        jrbInactivo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jrbInactivo.setForeground(new java.awt.Color(0, 0, 0));
        jrbInactivo.setText("Inactivo");
        jrbInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(41, 41, 41)
                                .addComponent(jrbActivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbInactivo))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbBuscar))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtTelefono))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtDireccion))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtApellidoYNombre))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtTelefonoAlternativo))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtPersonaAlternativa)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jbBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellidoYNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtPersonaAlternativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtTelefonoAlternativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbActivo)
                        .addComponent(jrbInactivo))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbNuevo))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        try {

            int documento = Integer.parseInt(jtDocumento.getText());

            cliente = clienData.buscarClientePorDni(documento);

            if (cliente != null) {
                int op = JOptionPane.showConfirmDialog(this, "Cliente encontrado. Desea cargarlo?");
                if (op == 0) {
                    jtApellidoYNombre.setText(cliente.getCabezaDeFamilia());
                    jtDireccion.setText(cliente.getDireccion());
                    jtTelefono.setText(cliente.getTelefono() + "");
                    jtPersonaAlternativa.setText(cliente.getPersonaAlternativa());
                    jtTelefonoAlternativo.setText(cliente.getTelefonoAlternativo() + "");
                    
                    jrbActivo.setSelected(cliente.isEstado());
                    jrbInactivo.setSelected(!cliente.isEstado());
                    jbEliminar.setEnabled(cliente.isEstado());
                } else {
                    jtDocumento.setText("");
                }
            }

        } catch (NullPointerException e) {

        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        jtDocumento.setText("");
        jtApellidoYNombre.setText("");
        jtDireccion.setText("");
        jtTelefono.setText("");
        jtPersonaAlternativa.setText("");
        jtTelefonoAlternativo.setText("");
        jrbActivo.setSelected(false);
        jrbInactivo.setSelected(false);

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        if (jtDocumento.getText().isEmpty() || jtApellidoYNombre.getText().isEmpty() || jtDireccion.getText().isEmpty() || jtTelefono.getText().isEmpty() || jtPersonaAlternativa.getText().isEmpty() || jtTelefonoAlternativo.getText().isEmpty() || (!jrbActivo.isSelected() && !jrbInactivo.isSelected())) {
            JOptionPane.showMessageDialog(this, "Llene los espacios vacios.");
        } else {

            int documento = Integer.parseInt(jtDocumento.getText());
            String apellidoYNombre = jtApellidoYNombre.getText();
            String direccion = jtDireccion.getText();
            int telefono = Integer.parseInt(jtTelefono.getText());
            String personaAlternativa = jtPersonaAlternativa.getText();
            int telefonoAlternativo = Integer.parseInt(jtTelefonoAlternativo.getText());
            boolean activo = jrbActivo.isSelected();
            boolean inactivo = jrbInactivo.isSelected();

            cliente = clienData.buscarClientePorDni(documento);

            if (activo && documento != cliente.getDocumento()) {
                clienData.agregarCliente(new Cliente(documento, apellidoYNombre, direccion, telefono, personaAlternativa, telefonoAlternativo, activo));
            } else if (inactivo && documento != cliente.getDocumento()) {
                clienData.agregarCliente(new Cliente(documento, apellidoYNombre, direccion, telefono, personaAlternativa, telefonoAlternativo, inactivo));
            }

            if (cliente != null) {

                cliente.setDocumento(documento);
                cliente.setCabezaDeFamilia(apellidoYNombre);
                cliente.setDireccion(direccion);
                cliente.setTelefono(telefono);
                cliente.setPersonaAlternativa(personaAlternativa);
                cliente.setTelefonoAlternativo(telefonoAlternativo);
                if (activo) {
                    cliente.setEstado(true);
                } else {
                    cliente.setEstado(false);
                }

                int op = JOptionPane.showConfirmDialog(this, "El cliente ya existe. Desea modificar el cliente?");
                if (op == 0) {
                    clienData.modificarCliente(cliente);
                    jtDocumento.setText("");
                    jtApellidoYNombre.setText("");
                    jtDireccion.setText("");
                    jtTelefono.setText("");
                    jtPersonaAlternativa.setText("");
                    jtTelefonoAlternativo.setText("");
                    jrbActivo.setSelected(false);
                    jrbInactivo.setSelected(false);
                } else {
                    jtDocumento.setText("");
                    jtApellidoYNombre.setText("");
                    jtDireccion.setText("");
                    jtTelefono.setText("");
                    jtPersonaAlternativa.setText("");
                    jtTelefonoAlternativo.setText("");
                    jrbActivo.setSelected(false);
                    jrbInactivo.setSelected(false);
                    JOptionPane.showMessageDialog(this, "El cliente no se modifico.");
                }

            }
        }

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDocumentoKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {//si el caracter no es un numero
            evt.consume();          //no permite escribir
        }


    }//GEN-LAST:event_jtDocumentoKeyTyped

    private void jtApellidoYNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoYNombreKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {//si el caracter es un numero
            evt.consume();          //no permite escribir
        }
    }//GEN-LAST:event_jtApellidoYNombreKeyTyped

    private void jtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDireccionKeyTyped

    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {//si el caracter no es un numero
            evt.consume();          //no permite escribir
        }
    }//GEN-LAST:event_jtTelefonoKeyTyped

    private void jtPersonaAlternativaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPersonaAlternativaKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {//si el caracter no es un numero
            evt.consume();          //no permite escribir
        }
    }//GEN-LAST:event_jtPersonaAlternativaKeyTyped

    private void jtTelefonoAlternativoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoAlternativoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {//si el caracter no es un numero
            evt.consume();          //no permite escribir
        }
    }//GEN-LAST:event_jtTelefonoAlternativoKeyTyped

    private void jrbInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivoActionPerformed

        if (jrbInactivo.isSelected()) {
            jrbActivo.setSelected(false);
            jbEliminar.setEnabled(false);
        } else {
            jrbInactivo.setSelected(true);

        }

    }//GEN-LAST:event_jrbInactivoActionPerformed

    private void jrbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivoActionPerformed

        if (jrbActivo.isSelected()) {
            jrbInactivo.setSelected(false);
            jbEliminar.setEnabled(true);
        } else {
            jrbActivo.setSelected(true);
        }

    }//GEN-LAST:event_jrbActivoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        if (jtDocumento.getText().isEmpty() || jtApellidoYNombre.getText().isEmpty() || jtDireccion.getText().isEmpty() || jtTelefono.getText().isEmpty() || jtPersonaAlternativa.getText().isEmpty() || jtTelefonoAlternativo.getText().isEmpty() || (!jrbActivo.isSelected() && !jrbInactivo.isSelected())) {
            JOptionPane.showMessageDialog(this, "Llene los espacios vacios.");
        } else {
            int documento = Integer.parseInt(jtDocumento.getText());
            if (documento == cliente.getDocumento()) {
                clienData.eliminarCliente(cliente.getIdCliente());
            }
            
        }


    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbActivo;
    private javax.swing.JRadioButton jrbInactivo;
    private javax.swing.JTextField jtApellidoYNombre;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtPersonaAlternativa;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JTextField jtTelefonoAlternativo;
    // End of variables declaration//GEN-END:variables
}
