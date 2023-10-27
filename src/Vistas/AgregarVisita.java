/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.ClienteData;
import AccesoADatos.MascotaData;
import AccesoADatos.TratamientoData;
import AccesoADatos.VisitaData;
import Entidades.Cliente;
import Entidades.Mascota;
import Entidades.TiposTratamientos;
import Entidades.Tratamiento;
import Entidades.Visita;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author gonza
 */
public class AgregarVisita extends javax.swing.JInternalFrame {

    private VisitaData visData = new VisitaData();
    private Visita visita = null;
    private ClienteData clienData = new ClienteData();
    private MascotaData mascData = new MascotaData();
    private TratamientoData tratData = new TratamientoData();
    private Cliente cliente = null;
    private Tratamiento tratamiento = null;
    private double importe = 0;
    private double importe2 = 0;
    private AgregarCliente cl = null;
    private JDesktopPane esc = null;

    public AgregarVisita() {
        initComponents();
        cargarCombos();
        cargarCombo();
        jrbTarjeta.setSelected(true);
        jbModificar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtCodigoVisita = new javax.swing.JTextField();
        jcbCliente = new javax.swing.JComboBox<>();
        jbNuevoCliente = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jcbMascota = new javax.swing.JComboBox<>();
        jbNuevaMascota = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fechaVisita = new com.toedter.calendar.JDateChooser();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtPesoActual = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtCodigoTratamiento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtImporte = new javax.swing.JTextField();
        jrbEfectivo = new javax.swing.JRadioButton();
        jrbTarjeta = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jrbActivo = new javax.swing.JRadioButton();
        jrbInactivo = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel1FocusLost(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("VISITA");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cliente:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mascota:");

        jtCodigoVisita.setBackground(new java.awt.Color(255, 255, 255));
        jtCodigoVisita.setForeground(new java.awt.Color(0, 0, 0));

        jcbCliente.setBackground(new java.awt.Color(255, 255, 255));
        jcbCliente.setForeground(new java.awt.Color(0, 0, 0));
        jcbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClienteActionPerformed(evt);
            }
        });

        jbNuevoCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbNuevoCliente.setText("Nuevo Cliente");
        jbNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoClienteActionPerformed(evt);
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

        jcbMascota.setBackground(new java.awt.Color(255, 255, 255));
        jcbMascota.setForeground(new java.awt.Color(0, 0, 0));

        jbNuevaMascota.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbNuevaMascota.setText("Nueva Mascota");
        jbNuevaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaMascotaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha de la visita:");

        jbGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Peso actual:");

        jtPesoActual.setBackground(new java.awt.Color(255, 255, 255));
        jtPesoActual.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("TRATAMIENTO");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Codigo:");

        jtCodigoTratamiento.setBackground(new java.awt.Color(255, 255, 255));
        jtCodigoTratamiento.setForeground(new java.awt.Color(0, 0, 0));
        jtCodigoTratamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCodigoTratamientoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tipo:");

        jcbTipo.setBackground(new java.awt.Color(255, 255, 255));
        jcbTipo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Descripcion:");

        jtaDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        jtaDescripcion.setColumns(20);
        jtaDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jtaDescripcion.setLineWrap(true);
        jtaDescripcion.setRows(5);
        jtaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtaDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtaDescripcion);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Importe:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("$");

        jtImporte.setBackground(new java.awt.Color(255, 255, 255));
        jtImporte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtImporte.setForeground(new java.awt.Color(0, 0, 0));
        jtImporte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtImporteFocusLost(evt);
            }
        });
        jtImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtImporteKeyTyped(evt);
            }
        });

        jrbEfectivo.setBackground(new java.awt.Color(204, 204, 255));
        jrbEfectivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbEfectivo.setForeground(new java.awt.Color(0, 0, 0));
        jrbEfectivo.setText("Efectivo");
        jrbEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEfectivoActionPerformed(evt);
            }
        });

        jrbTarjeta.setBackground(new java.awt.Color(204, 204, 255));
        jrbTarjeta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        jrbTarjeta.setText("Tarjeta/otro");
        jrbTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTarjetaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Estado:");

        jrbActivo.setBackground(new java.awt.Color(204, 204, 255));
        jrbActivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbActivo.setForeground(new java.awt.Color(0, 0, 0));
        jrbActivo.setText("Activo");
        jrbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivoActionPerformed(evt);
            }
        });

        jrbInactivo.setBackground(new java.awt.Color(204, 204, 255));
        jrbInactivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtCodigoTratamiento)
                                    .addComponent(jcbTipo, 0, 212, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel12)
                                            .addGap(2, 2, 2)
                                            .addComponent(jtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(jrbEfectivo)
                                            .addGap(18, 18, 18)
                                            .addComponent(jrbTarjeta))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jrbActivo)
                                            .addGap(18, 18, 18)
                                            .addComponent(jrbInactivo)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(fechaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(22, 22, 22))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbCliente, 0, 216, Short.MAX_VALUE)
                            .addComponent(jtCodigoVisita)
                            .addComponent(jcbMascota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbNuevaMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbNuevoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jbBuscar)))
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtCodigoVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbNuevoCliente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbNuevaMascota)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jbBuscar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(fechaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtCodigoTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrbEfectivo)
                    .addComponent(jrbTarjeta)
                    .addComponent(jtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jrbActivo)
                    .addComponent(jrbInactivo))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbGuardar)
                    .addComponent(jbNuevo)
                    .addComponent(jbModificar))
                .addContainerGap(34, Short.MAX_VALUE))
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

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        int codigoVisita = Integer.parseInt(jtCodigoVisita.getText());
        Cliente clien = (Cliente) jcbCliente.getSelectedItem();
        Mascota masc = (Mascota) jcbMascota.getSelectedItem();
        double pesoActual = Double.parseDouble(jtPesoActual.getText());
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = formato.format(fechaVisita.getDate());
        LocalDate fechaLocal = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        int codigoTratamiento = Integer.parseInt(jtCodigoTratamiento.getText());
        TiposTratamientos tipos = (TiposTratamientos) jcbTipo.getSelectedItem();
        String descripcion = jtaDescripcion.getText();
        importe = Double.parseDouble(jtImporte.getText());
        boolean activo = jrbActivo.isSelected();
        boolean inactivo = jrbInactivo.isSelected();
        System.out.println(tipos);
        if (visita != null) {
            visita.setCliente(clien);
            visita.setMascota(masc);
            visita.setPesoActual(pesoActual);
            visita.setFechaVisita(fechaLocal);

            //tratamiento.setTipo(tipos.compareTo((TiposTratamientos) jcbTipo.getSelectedItem()));
            tratamiento.setDescripcion(descripcion);
            tratamiento.setImporte(importe);
            if (activo) {
                tratamiento.setEstado(true);
            } else {
                tratamiento.setEstado(false);
            }
            visita.setTratamiento(tratamiento);
            visData.modificarVisita(visita);
            tratData.modificarTratamiento(tratamiento);
            jbGuardar.setEnabled(true);
            jbModificar.setEnabled(false);
        }


    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {

            int codigo = Integer.parseInt(jtCodigoVisita.getText());

            visita = visData.buscarVisitaPorId(codigo);

            if (visita != null) {
                int op = JOptionPane.showConfirmDialog(this, "La visita ya existe. Desea cargarla?");
                if (op == 0) {
                    jcbCliente.setSelectedIndex(visita.getCliente().getIdCliente());
                    try {
                        jcbMascota.removeAllItems();
                        cliente = (Cliente) jcbCliente.getSelectedItem();
                        jcbMascota.addItem(null);
                        for (Mascota mascota : mascData.listarMascotaPorCliente(cliente.getIdCliente())) {
                            jcbMascota.addItem(mascota);
                            if (visita.getMascota().getIdMascota() == mascota.getIdMascota()) {
                                jcbMascota.setSelectedItem(mascota);
                            }
                        }
                        jbGuardar.setEnabled(false);
                        jbModificar.setEnabled(true);
                    } catch (NullPointerException e) {

                    }

                    jtPesoActual.setText(visita.getPesoActual() + "");
                    fechaVisita.setDate(Date.valueOf(visita.getFechaVisita()));
                    jtCodigoTratamiento.setText(visita.getTratamiento().getIdTratamiento() + "");
                    jcbTipo.setSelectedItem(visita.getTratamiento().getTipo());
                    jtaDescripcion.setText(visita.getTratamiento().getDescripcion());
                    jtImporte.setText(visita.getTratamiento().getImporte() + "");
                    importe2 = visita.getTratamiento().getImporte();
                    jrbActivo.setSelected(visita.getTratamiento().isEstado());
                    jrbInactivo.setSelected(!visita.getTratamiento().isEstado());
                } else {
                    jtCodigoVisita.setText("");
                    jcbCliente.setSelectedItem(null);
                    jcbMascota.setSelectedItem(null);
                    jtPesoActual.setText("");
                    fechaVisita.setDate(null);
                    jtCodigoTratamiento.setText("");
                    jcbTipo.setSelectedItem(null);
                    jtaDescripcion.setText("");
                    jtImporte.setText("");
                    jrbActivo.setSelected(false);
                    jrbInactivo.setSelected(false);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Llene el codigo.");
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClienteActionPerformed
        try {
            jcbMascota.removeAllItems();
            cliente = (Cliente) jcbCliente.getSelectedItem();
            jcbMascota.addItem(null);
            for (Mascota mascota : mascData.listarMascotaPorCliente(cliente.getIdCliente())) {
                jcbMascota.addItem(mascota);
            }

        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_jcbClienteActionPerformed

    private void jtCodigoTratamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoTratamientoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {//si el caracter no es un numero
            evt.consume();          //no permite escribir
        }
    }//GEN-LAST:event_jtCodigoTratamientoKeyTyped

    private void jtaDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaDescripcionKeyTyped

    }//GEN-LAST:event_jtaDescripcionKeyTyped

    private void jtImporteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtImporteFocusLost
        try {
            importe2 = Double.parseDouble(jtImporte.getText());
        } catch (NumberFormatException e) {

        }

    }//GEN-LAST:event_jtImporteFocusLost

    private void jtImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtImporteKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtImporteKeyTyped

    private void jrbEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEfectivoActionPerformed
        importe = Double.parseDouble(jtImporte.getText());
        if (jrbEfectivo.isSelected() && tratamiento != null) {
            jrbTarjeta.setSelected(false);
            importe = tratData.importeContado(tratamiento);
            jtImporte.setText(importe + "");
        } else if (jrbEfectivo.isSelected() && tratamiento == null) {
            jrbTarjeta.setSelected(false);
            double descuento = (10 * importe) / 100;
            double importeTotal = importe - descuento;
            jtImporte.setText(importeTotal + "");
        }

    }//GEN-LAST:event_jrbEfectivoActionPerformed

    private void jrbTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTarjetaActionPerformed

        if (jrbTarjeta.isSelected() && tratamiento != null) {
            jrbEfectivo.setSelected(false);
            jtImporte.setText(tratamiento.getImporte() + "");
        } else if (jrbTarjeta.isSelected() && tratamiento == null) {
            jrbEfectivo.setSelected(false);
            jtImporte.setText(importe2 + "");

        }

    }//GEN-LAST:event_jrbTarjetaActionPerformed

    private void jrbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivoActionPerformed
        if (jrbActivo.isSelected()) {
            jrbInactivo.setSelected(false);
        }
    }//GEN-LAST:event_jrbActivoActionPerformed

    private void jrbInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivoActionPerformed
        if (jrbInactivo.isSelected()) {
            jrbActivo.setSelected(false);
        }
    }//GEN-LAST:event_jrbInactivoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jtCodigoVisita.setText("");
        jcbCliente.setSelectedItem(null);
        jcbMascota.setSelectedItem(null);
        jtPesoActual.setText("");
        fechaVisita.setDate(null);
        jtCodigoTratamiento.setText("");
        jcbTipo.setSelectedItem(null);
        jtaDescripcion.setText("");
        jtImporte.setText("");
        jrbActivo.setSelected(false);
        jrbInactivo.setSelected(false);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        if (jtCodigoVisita.getText().isEmpty() || jcbCliente.getSelectedItem() == null || jcbMascota.getSelectedItem() == null || jtPesoActual.getText().isEmpty() || fechaVisita.getDate() == null || jtCodigoTratamiento.getText().isEmpty() || jcbTipo.getSelectedItem() == null || jtaDescripcion.getText().isEmpty() || jtImporte.getText().isEmpty() || (!jrbActivo.isSelected() && !jrbInactivo.isSelected())) {
            JOptionPane.showMessageDialog(this, "Llene los espacios vacios.");
        } else {

            int codigoVisita = Integer.parseInt(jtCodigoVisita.getText());
            Cliente clien = (Cliente) jcbCliente.getSelectedItem();
            Mascota masc = (Mascota) jcbMascota.getSelectedItem();
            double pesoActual = Double.parseDouble(jtPesoActual.getText());
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            String fecha = formato.format(fechaVisita.getDate());
            LocalDate fechaLocal = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            int codigoTratamiento = Integer.parseInt(jtCodigoTratamiento.getText());
            TiposTratamientos tipos = (TiposTratamientos) jcbTipo.getSelectedItem();
            String descripcion = jtaDescripcion.getText();
            importe = Double.parseDouble(jtImporte.getText());
            boolean activo = jrbActivo.isSelected();
            boolean inactivo = jrbInactivo.isSelected();

            visita = visData.buscarVisitaPorIdSinCartel(codigoVisita);
            tratamiento = tratData.buscarTratamientoSinCartel(codigoTratamiento);

            if (visita == null && tratamiento == null && activo) {
                tratamiento = new Tratamiento(tipos, descripcion, importe, activo);
                tratData.agregarTratamiento(tratamiento);
                visData.agregarVisita(new Visita(clien, masc, tratamiento, pesoActual, fechaLocal));
                jtCodigoVisita.setText("");
                jcbCliente.setSelectedItem(null);
                jcbMascota.setSelectedItem(null);
                jtPesoActual.setText("");
                fechaVisita.setDate(null);
                jtCodigoTratamiento.setText("");
                jcbTipo.setSelectedItem(null);
                jtaDescripcion.setText("");
                jtImporte.setText("");
                jrbEfectivo.setEnabled(false);
                jrbTarjeta.setEnabled(true);
                jrbActivo.setSelected(false);
                jrbInactivo.setSelected(false);
            } else {
                tratamiento = new Tratamiento(tipos, descripcion, importe, inactivo);
                tratData.agregarTratamiento(tratamiento);
                visData.agregarVisita(new Visita(clien, masc, tratamiento, pesoActual, fechaLocal));
                jtCodigoVisita.setText("");
                jcbCliente.setSelectedItem(null);
                jcbMascota.setSelectedItem(null);
                jtPesoActual.setText("");
                fechaVisita.setDate(null);
                jtCodigoTratamiento.setText("");
                jcbTipo.setSelectedItem(null);
                jtaDescripcion.setText("");
                jtImporte.setText("");
                jrbEfectivo.setEnabled(false);
                jrbTarjeta.setEnabled(true);
                jrbActivo.setSelected(false);
                jrbInactivo.setSelected(false);
            }

        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoClienteActionPerformed
        esc = getDesktopPane();
        esc.repaint();
        cl = new AgregarCliente();

        cl.setVisible(true);
        esc.add(cl);
        esc.moveToFront(cl);
        if (cl.isVisible()) {
            jbNuevoCliente.setEnabled(false);
            jbNuevaMascota.setEnabled(false);
        }


    }//GEN-LAST:event_jbNuevoClienteActionPerformed

    private void jbNuevaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaMascotaActionPerformed
        JDesktopPane esc = getDesktopPane();

        esc.repaint();
        AgregarMascota masc = new AgregarMascota();

        masc.setVisible(true);
        esc.add(masc);
        esc.moveToFront(masc);

        if (masc.isVisible()) {
            jbNuevoCliente.setEnabled(false);
            jbNuevaMascota.setEnabled(false);
        }

    }//GEN-LAST:event_jbNuevaMascotaActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

        jbNuevoCliente.setEnabled(true);
        jbNuevaMascota.setEnabled(true);
        esc.remove(cl);
        esc.repaint();
//        AgregarVisita vis = new AgregarVisita();
//        esc.moveToFront(vis);

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained

//        
//        cl.addInternalFrameListener(new InternalFrameAdapter() {
//            @Override
//            public void internalFrameClosed(InternalFrameEvent e) {
//                vis.toFront(); // Pone el foco en internalFrame2 al cerrar internalFrame1
//            }
//        });
    }//GEN-LAST:event_jPanel1FocusGained

    private void jPanel1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusLost

    }//GEN-LAST:event_jPanel1FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fechaVisita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevaMascota;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbNuevoCliente;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Cliente> jcbCliente;
    private javax.swing.JComboBox<Mascota> jcbMascota;
    private javax.swing.JComboBox<TiposTratamientos> jcbTipo;
    private javax.swing.JRadioButton jrbActivo;
    private javax.swing.JRadioButton jrbEfectivo;
    private javax.swing.JRadioButton jrbInactivo;
    private javax.swing.JRadioButton jrbTarjeta;
    private javax.swing.JTextField jtCodigoTratamiento;
    private javax.swing.JTextField jtCodigoVisita;
    private javax.swing.JTextField jtImporte;
    private javax.swing.JTextField jtPesoActual;
    private javax.swing.JTextArea jtaDescripcion;
    // End of variables declaration//GEN-END:variables

    public void cargarCombos() {

        jcbCliente.addItem(null);
        for (Cliente cliente : clienData.listarClientes()) {
            jcbCliente.addItem(cliente);
        }

    }

    public void cargarCombo() {
        jcbTipo.addItem(null);
        jcbTipo.addItem(TiposTratamientos.BAÑOYCORTE);
        jcbTipo.addItem(TiposTratamientos.CIRUGIA);
        jcbTipo.addItem(TiposTratamientos.CONTROL);
        jcbTipo.addItem(TiposTratamientos.CURACIONES);
        jcbTipo.addItem(TiposTratamientos.ENFERMEDAD);
        jcbTipo.addItem(TiposTratamientos.MEDICACION);
        jcbTipo.addItem(TiposTratamientos.URGENCIA);
        jcbTipo.addItem(TiposTratamientos.VACUNACION);

    }
}
