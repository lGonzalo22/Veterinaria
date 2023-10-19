package Vistas;

import AccesoADatos.ClienteData;
import AccesoADatos.MascotaData;
import Entidades.Cliente;
import AccesoADatos.MascotaData;
import Entidades.Mascota;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author gonza
 */
public class AgregarMascota extends javax.swing.JInternalFrame {

    private MascotaData mascData = new MascotaData();
    private Mascota mascota = null;
    private ClienteData clienData = new ClienteData();

    public AgregarMascota() {
        initComponents();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtPesoActual = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtEspecie = new javax.swing.JTextField();
        jtRaza = new javax.swing.JTextField();
        jtColorPelo = new javax.swing.JTextField();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jrbMacho = new javax.swing.JRadioButton();
        jrbHembra = new javax.swing.JRadioButton();
        jbSalir = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jtPesoMedio = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jrbActivo = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jcbCliente = new javax.swing.JComboBox<>();
        jrbInactivos = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("MASCOTA");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sexo:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Especie:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Raza:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Peso Medio:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Color de pelo:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Peso Actual:");

        jtPesoActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPesoActualKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Fecha de nacimiento:");

        jtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCodigoKeyTyped(evt);
            }
        });

        jtNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jtEspecie.setBackground(new java.awt.Color(255, 255, 255));
        jtEspecie.setForeground(new java.awt.Color(0, 0, 0));
        jtEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtEspecieKeyTyped(evt);
            }
        });

        jtRaza.setBackground(new java.awt.Color(255, 255, 255));
        jtRaza.setForeground(new java.awt.Color(0, 0, 0));
        jtRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtRazaKeyTyped(evt);
            }
        });

        jtColorPelo.setBackground(new java.awt.Color(255, 255, 255));
        jtColorPelo.setForeground(new java.awt.Color(0, 0, 0));
        jtColorPelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtColorPeloKeyTyped(evt);
            }
        });

        jrbMacho.setBackground(new java.awt.Color(204, 204, 255));
        jrbMacho.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbMacho.setForeground(new java.awt.Color(0, 0, 0));
        jrbMacho.setText("Macho");
        jrbMacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMachoActionPerformed(evt);
            }
        });

        jrbHembra.setBackground(new java.awt.Color(204, 204, 255));
        jrbHembra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbHembra.setForeground(new java.awt.Color(0, 0, 0));
        jrbHembra.setText("Hembra");
        jrbHembra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHembraActionPerformed(evt);
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

        jtPesoMedio.setEditable(false);

        jbBuscar.setBackground(new java.awt.Color(204, 204, 255));
        jbBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Imagenes/lupa (2).png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Estado:");

        jrbActivo.setBackground(new java.awt.Color(204, 204, 255));
        jrbActivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbActivo.setForeground(new java.awt.Color(0, 0, 0));
        jrbActivo.setText("Activo");
        jrbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Cliente:");

        jcbCliente.setBackground(new java.awt.Color(255, 255, 255));
        jcbCliente.setForeground(new java.awt.Color(0, 0, 0));

        jrbInactivos.setBackground(new java.awt.Color(204, 204, 255));
        jrbInactivos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbInactivos.setForeground(new java.awt.Color(0, 0, 0));
        jrbInactivos.setText("Inactivo");
        jrbInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jtPesoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jcbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(43, 43, 43)
                                        .addComponent(jrbActivo)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbInactivos))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addComponent(jLabel2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jtNombre))))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jtEspecie))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(jtColorPelo))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel4))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(43, 43, 43)
                                                    .addComponent(jrbMacho)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jrbHembra))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(37, 37, 37)
                                                    .addComponent(jtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbBuscar)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbBuscar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jrbMacho)
                    .addComponent(jrbHembra))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtColorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPesoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jrbActivo)
                    .addComponent(jrbInactivos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbNuevo))
                .addGap(25, 25, 25))
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

        int codigo = Integer.parseInt(jtCodigo.getText());

        mascota = mascData.buscarMascota(codigo);

        if (mascota != null) {
            int op = JOptionPane.showConfirmDialog(this, "Mascota encontrada. Desea cargarla?");

            if (op == 0) {
                jcbCliente.setSelectedIndex(mascota.getCliente().getIdCliente() - 1);
                jtNombre.setText(mascota.getNombre());
                if (mascota.getSexo().equals("macho")) {
                    jrbMacho.setSelected(true);
                    jrbHembra.setSelected(false);
                } else if (mascota.getSexo().equals("hembra")) {
                    jrbHembra.setSelected(true);
                    jrbMacho.setSelected(false);
                }
                jtEspecie.setText(mascota.getEspecie());
                jtRaza.setText(mascota.getRaza());
                jtColorPelo.setText(mascota.getColorPelo());
                fechaNacimiento.setDate(Date.valueOf(mascota.getFechaNac()));
                jtPesoMedio.setText(mascota.getPesoMedio() + "");
                jtPesoActual.setText(mascota.getPesoActual() + "");
                jrbActivo.setSelected(mascota.isEstado());
                jrbInactivos.setSelected(!mascota.isEstado());
                jbEliminar.setEnabled(mascota.isEstado());
            } else {
                jtCodigo.setText("");
                jtNombre.setText("");
                jrbMacho.setSelected(false);
                jrbHembra.setSelected(false);
                jtEspecie.setText("");
                jtRaza.setText("");
                jtColorPelo.setText("");
                fechaNacimiento.setDate(null);
                jtPesoMedio.setText("");
                jtPesoActual.setText("");
                jrbActivo.setSelected(false);
                jrbInactivos.setSelected(false);
            }

        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jrbMachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMachoActionPerformed

        if (jrbMacho.isSelected()) {
            jrbHembra.setSelected(false);

        } else {
            jrbMacho.setSelected(true);
        }

    }//GEN-LAST:event_jrbMachoActionPerformed

    private void jrbHembraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbHembraActionPerformed

        if (jrbHembra.isSelected()) {
            jrbMacho.setSelected(false);

        } else {
            jrbHembra.setSelected(true);
        }

    }//GEN-LAST:event_jrbHembraActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        jtCodigo.setText("");
        jtNombre.setText("");
        jrbMacho.setSelected(false);
        jrbHembra.setSelected(false);
        jtEspecie.setText("");
        jtRaza.setText("");
        jtColorPelo.setText("");
        fechaNacimiento.setDate(null);
        jtPesoMedio.setText("");
        jtPesoActual.setText("");
        jrbActivo.setSelected(false);
        jrbInactivos.setSelected(false);

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        if (jtCodigo.getText().isEmpty() || jtNombre.getText().isEmpty() || (!jrbMacho.isSelected() && !jrbHembra.isSelected()) || jtEspecie.getText().isEmpty() || jtRaza.getText().isEmpty() || jtColorPelo.getText().isEmpty() || fechaNacimiento.getDate() == null || jtPesoActual.getText().isEmpty() || (!jrbActivo.isSelected() && !jrbInactivos.isSelected())) {
            JOptionPane.showMessageDialog(this, "Llene los espacios vacios.");
        } else {

            int codigo = Integer.parseInt(jtCodigo.getText());
            Cliente clien = (Cliente) jcbCliente.getSelectedItem();
            String nombre = jtNombre.getText();
            boolean macho = jrbMacho.isSelected();
            boolean hembra = jrbHembra.isSelected();
            String sexoM = "macho";
            String sexoF = "hembra";
            String especie = jtEspecie.getText();
            String raza = jtRaza.getText();
            String colorPelo = jtColorPelo.getText();

            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            String fecha = formato.format(fechaNacimiento.getDate());
            LocalDate fechaLocal = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            double pesoMedio = 0;
            if (!jtPesoMedio.getText().isEmpty()) {
                pesoMedio = Double.parseDouble(jtPesoMedio.getText());
            }

            double pesoActual = Double.parseDouble(jtPesoActual.getText());
            boolean activo = jrbActivo.isSelected();
            boolean inactivo = jrbInactivos.isSelected();

            mascota = mascData.buscarMascota(codigo);

            if (macho && activo && mascota == null) {
                mascData.agregarMascota(new Mascota(clien, nombre, sexoM, especie, raza, colorPelo, fechaLocal, pesoMedio, pesoActual, activo));
            } else if (macho && inactivo && mascota == null) {
                mascData.agregarMascota(new Mascota(clien, nombre, sexoM, especie, raza, colorPelo, fechaLocal, pesoMedio, pesoActual, inactivo));
            } else if (hembra && activo && mascota == null) {
                mascData.agregarMascota(new Mascota(clien, nombre, sexoF, especie, raza, colorPelo, fechaLocal, pesoMedio, pesoActual, activo));
            } else if (hembra && inactivo && mascota == null) {
                mascData.agregarMascota(new Mascota(clien, nombre, sexoF, especie, raza, colorPelo, fechaLocal, pesoMedio, pesoActual, inactivo));
            }

            if (mascota != null) {
                mascota.setCliente(mascota.getCliente());
                mascota.setNombre(nombre);
                if (macho) {
                    mascota.setSexo(sexoM);
                } else if (hembra) {
                    mascota.setSexo(sexoF);
                }
                mascota.setEspecie(especie);
                mascota.setRaza(raza);
                mascota.setColorPelo(colorPelo);
                mascota.setFechaNac(fechaLocal);
                mascota.setPesoMedio(pesoMedio);
                mascota.setPesoActual(pesoActual);
                if (activo) {
                    mascota.setEstado(true);
                } else if (inactivo) {
                    mascota.setEstado(false);
                }

                int op = JOptionPane.showConfirmDialog(this, "La mascota ya existe. Desea modificarla?");
                if (op == 0) {
                    mascData.modificarMascota(mascota);
                    jtCodigo.setText("");
                    jtNombre.setText("");
                    jrbMacho.setSelected(false);
                    jrbHembra.setSelected(false);
                    jtEspecie.setText("");
                    jtRaza.setText("");
                    jtColorPelo.setText("");
                    fechaNacimiento.setDate(null);
                    jtPesoMedio.setText("");
                    jtPesoActual.setText("");
                    jrbActivo.setSelected(false);
                    jrbInactivos.setSelected(false);
                    jbEliminar.setEnabled(true);
                } else {
                    jtCodigo.setText("");
                    jtNombre.setText("");
                    jrbMacho.setSelected(false);
                    jrbHembra.setSelected(false);
                    jtEspecie.setText("");
                    jtRaza.setText("");
                    jtColorPelo.setText("");
                    fechaNacimiento.setDate(null);
                    jtPesoMedio.setText("");
                    jtPesoActual.setText("");
                    jrbActivo.setSelected(false);
                    jrbInactivos.setSelected(false);
                    jbEliminar.setEnabled(true);
                    JOptionPane.showMessageDialog(this, "La mascota no se modifico.");
                }
            }
//            int codigo = Integer.parseInt(jtCodigo.getText());
//            String nombre = jtNombre.getText();
//            boolean macho = jrbMacho.isSelected();
//            boolean hembra = jrbHembra.isSelected();
//            String sexoM = "masculino";
//            String sexoF = "femenino";
//            String especie = jtEspecie.getText();
//            String raza = jtRaza.getText();
//            String colorPelo = jtColorPelo.getText();
//
//            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
//            String fecha = formato.format(fechaNacimiento.getDate());
//            LocalDate fechaLocal = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//
//            double pesoMedio = Double.parseDouble(jtPesoMedio.getText());
//            double pesoActual = Double.parseDouble(jtPesoActual.getText());
//
//            boolean activo = jrbActivo.isSelected();
//            boolean inactivo = jrbInactivo.isSelected();

//            mascota = mascData.buscarMascota(codigo);
//
//            if (macho && activo && codigo != mascota.getIdMascota()) {
//                mascData.agregarMascota(new Mascota(mascota.getCliente(), nombre, sexoM, especie, raza, colorPelo, fechaLocal, pesoMedio, pesoActual, activo));
//            } else if (macho && inactivo && codigo != mascota.getIdMascota()) {
//                mascData.agregarMascota(new Mascota(mascota.getCliente(), nombre, sexoM, especie, raza, colorPelo, fechaLocal, pesoMedio, pesoActual, inactivo));
//            } else if (hembra && activo && codigo != mascota.getIdMascota()) {
//                mascData.agregarMascota(new Mascota(mascota.getCliente(), nombre, sexoF, especie, raza, colorPelo, fechaLocal, pesoMedio, pesoActual, activo));
//            } else if (hembra && inactivo && codigo != mascota.getIdMascota()) {
//                mascData.agregarMascota(new Mascota(mascota.getCliente(), nombre, sexoF, especie, raza, colorPelo, fechaLocal, pesoMedio, pesoActual, inactivo));
//            }
        }


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jrbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivoActionPerformed

        if (jrbActivo.isSelected()) {
            jrbInactivos.setSelected(false);
            jbEliminar.setEnabled(true);
        } else {
            jrbActivo.setSelected(true);
            jtCodigo.setText("");
            jtNombre.setText("");
            jrbMacho.setSelected(false);
            jrbHembra.setSelected(false);
            jtEspecie.setText("");
            jtRaza.setText("");
            jtColorPelo.setText("");
            fechaNacimiento.setDate(null);
            jtPesoMedio.setText("");
            jtPesoActual.setText("");
            jrbActivo.setSelected(false);
            jrbInactivos.setSelected(false);
        }

    }//GEN-LAST:event_jrbActivoActionPerformed

    private void jrbInactivoActionPerformed(java.awt.event.ActionEvent evt) {                                            


    }                                           

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        if (jtCodigo.getText().isEmpty() || jtNombre.getText().isEmpty() || (!jrbMacho.isSelected() && !jrbHembra.isSelected()) || jtEspecie.getText().isEmpty() || jtRaza.getText().isEmpty() || jtColorPelo.getText().isEmpty() || fechaNacimiento.getDate() == null || jtPesoActual.getText().isEmpty() || (!jrbActivo.isSelected() && !jrbInactivos.isSelected())) {
            JOptionPane.showMessageDialog(this, "Llene los espacios vacios.");
        } else {
            int codigo = Integer.parseInt(jtCodigo.getText());
            if (codigo == mascota.getIdMascota()) {
                mascData.eliminarMascota(codigo);

            }
        }


    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_jtCodigoKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtEspecieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEspecieKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtEspecieKeyTyped

    private void jtRazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtRazaKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtRazaKeyTyped

    private void jtColorPeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtColorPeloKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtColorPeloKeyTyped

    private void jtPesoActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesoActualKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtPesoActualKeyTyped

    private void jrbInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivosActionPerformed
        if (jrbInactivos.isSelected()) {
            jrbActivo.setSelected(false);
            jbEliminar.setEnabled(false);
        } else {
            jrbInactivos.setSelected(true);
        }
    }//GEN-LAST:event_jrbInactivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JComboBox<Cliente> jcbCliente;
    private javax.swing.JRadioButton jrbActivo;
    private javax.swing.JRadioButton jrbHembra;
    private javax.swing.JRadioButton jrbInactivos;
    private javax.swing.JRadioButton jrbMacho;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtColorPelo;
    private javax.swing.JTextField jtEspecie;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPesoActual;
    private javax.swing.JTextField jtPesoMedio;
    private javax.swing.JTextField jtRaza;
    // End of variables declaration//GEN-END:variables

    public void cargarCombo() {

        for (Cliente cliente : clienData.listarClientes()) {
            jcbCliente.addItem(cliente);
        }

    }
}
