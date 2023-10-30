/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.ClienteData;
import AccesoADatos.MascotaData;
import Entidades.Cliente;
import Entidades.Mascota;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gonza
 */
public class ListadoMascotas extends javax.swing.JInternalFrame {

    private ClienteData clienData = new ClienteData();
    private MascotaData mascData = new MascotaData();
    private Cliente cliente = new Cliente();
    private Mascota mascotaSeleccionada = null;
    private ArrayList<Mascota> lista = null;

    public DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int filas, int columnas) {
            return false;
        }
    };

    /**
     * Creates new form ListadoMascotas
     */
    public ListadoMascotas() {
        initComponents();
        cargarCombo();
        armarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbCliente = new javax.swing.JComboBox<>();
        jrbActivos = new javax.swing.JRadioButton();
        jrbInactivos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbActivar = new javax.swing.JButton();
        jrbMostrarTodas = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("LISTADO DE MASCOTAS");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seleccione un cliente:");

        jcbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClienteActionPerformed(evt);
            }
        });

        jrbActivos.setBackground(new java.awt.Color(204, 204, 255));
        jrbActivos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbActivos.setForeground(new java.awt.Color(0, 0, 0));
        jrbActivos.setText("Mostrar activos");
        jrbActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivosActionPerformed(evt);
            }
        });

        jrbInactivos.setBackground(new java.awt.Color(204, 204, 255));
        jrbInactivos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbInactivos.setForeground(new java.awt.Color(0, 0, 0));
        jrbInactivos.setText("Mostrar inactivos");
        jrbInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactivosActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTabla);

        jbEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbActivar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbActivar.setText("Activar");
        jbActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActivarActionPerformed(evt);
            }
        });

        jrbMostrarTodas.setBackground(new java.awt.Color(204, 204, 255));
        jrbMostrarTodas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbMostrarTodas.setForeground(new java.awt.Color(0, 0, 0));
        jrbMostrarTodas.setText("Mostrar todas");
        jrbMostrarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMostrarTodasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(145, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(127, 127, 127))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbMostrarTodas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbActivos)
                                .addGap(52, 52, 52)
                                .addComponent(jrbInactivos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbActivar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEliminar)
                                .addGap(156, 156, 156)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbActivos)
                    .addComponent(jrbInactivos)
                    .addComponent(jrbMostrarTodas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir)
                    .addComponent(jbActivar))
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void jrbInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivosActionPerformed
        try {

            if (jrbInactivos.isSelected()) {
                jrbActivos.setSelected(false);
                jrbMostrarTodas.setSelected(false);
                jbEliminar.setEnabled(false);
                jbActivar.setEnabled(true);
            }
            cliente = (Cliente) jcbCliente.getSelectedItem();
            modelo.setRowCount(0);
            for (Mascota mascota : mascData.listarMascotaPorCliente(cliente.getIdCliente())) {
                if (!mascota.isEstado()) {
                    modelo.addRow(new Object[]{mascota.getIdMascota(), mascota.getNombre(), mascota.getSexo(), mascota.getEspecie(), mascota.getRaza(), mascota.getColorPelo(), mascota.getFechaNac(), mascota.getPesoMedio(), mascota.getPesoActual(), mascota.isEstado()});
                }
            }
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_jrbInactivosActionPerformed

    private void jcbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClienteActionPerformed

//        try {
//
//            modelo.setRowCount(0);
//            cliente = (Cliente) jcbCliente.getSelectedItem();
//            for (Mascota mascota : mascData.listarMascotaPorCliente(cliente.getIdCliente())) {
//                if (jrbActivos.isSelected() && mascota.isEstado()) {
//                    modelo.addRow(new Object[]{mascota.getIdMascota(), mascota.getNombre(), mascota.getSexo(), mascota.getEspecie(), mascota.getRaza(), mascota.getColorPelo(), mascota.getFechaNac(), mascota.getPesoMedio(), mascota.getPesoActual(), mascota.isEstado()});
//                } else if (jrbInactivos.isSelected() && !mascota.isEstado()) {
//                    modelo.addRow(new Object[]{mascota.getIdMascota(), mascota.getNombre(), mascota.getSexo(), mascota.getEspecie(), mascota.getRaza(), mascota.getColorPelo(), mascota.getFechaNac(), mascota.getPesoMedio(), mascota.getPesoActual(), mascota.isEstado()});
//                }
//            }
//        } catch (NullPointerException e) {
//
//        }
        if (jrbActivos.isSelected()) {
            cliente = (Cliente) jcbCliente.getSelectedItem();
            modelo.setRowCount(0);
            for (Mascota mascota : mascData.listarMascotaPorCliente(cliente.getIdCliente())) {
                
                if (mascota.isEstado()) {
                    modelo.addRow(new Object[]{mascota.getIdMascota(), mascota.getNombre(), mascota.getSexo(), mascota.getEspecie(), mascota.getRaza(), mascota.getColorPelo(), mascota.getFechaNac(), mascota.getPesoMedio(), mascota.getPesoActual(), mascota.isEstado()});
                }
            }
        } else if (jrbInactivos.isSelected()) {
            cliente = (Cliente) jcbCliente.getSelectedItem();

            modelo.setRowCount(0);
            for (Mascota mascota : mascData.listarMascotaPorCliente(cliente.getIdCliente())) {

                if (!mascota.isEstado()) {
                    modelo.addRow(new Object[]{mascota.getIdMascota(), mascota.getNombre(), mascota.getSexo(), mascota.getEspecie(), mascota.getRaza(), mascota.getColorPelo(), mascota.getFechaNac(), mascota.getPesoMedio(), mascota.getPesoActual(), mascota.isEstado()});
                }
            }

        }

    }//GEN-LAST:event_jcbClienteActionPerformed

    private void jrbActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivosActionPerformed

        try {
            cliente = (Cliente) jcbCliente.getSelectedItem();
            if (jrbActivos.isSelected()) {
                jrbInactivos.setSelected(false);
                jrbMostrarTodas.setSelected(false);
                jbEliminar.setEnabled(true);
                jbActivar.setEnabled(false);
            }
            modelo.setRowCount(0);
            for (Mascota mascota : mascData.listarMascotaPorCliente(cliente.getIdCliente())) {
                if (mascota.isEstado()) {
                    modelo.addRow(new Object[]{mascota.getIdMascota(), mascota.getNombre(), mascota.getSexo(), mascota.getEspecie(), mascota.getRaza(), mascota.getColorPelo(), mascota.getFechaNac(), mascota.getPesoMedio(), mascota.getPesoActual(), mascota.isEstado()});
                }
            }
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_jrbActivosActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // ELIMINAR MASCOTA
        try {

            int fila = jtTabla.getSelectedRow();
            if (fila == (-1)) {
                JOptionPane.showMessageDialog(this, "Seleccione una fila.");
            } else {

                int idMascota = (Integer) modelo.getValueAt(fila, 0);

                mascData.eliminarMascota(idMascota);

                borrarFilas();
                for (Mascota mascota : mascData.listarMascotaPorCliente(cliente.getIdCliente())) {
                    if (mascota.isEstado()) {
                        modelo.addRow(new Object[]{mascota.getIdMascota(), mascota.getNombre(), mascota.getSexo(), mascota.getEspecie(), mascota.getRaza(), mascota.getColorPelo(), mascota.getFechaNac(), mascota.getPesoMedio(), mascota.getPesoActual(), mascota.isEstado()});
                    }
                }

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "ERROR: Seleccione un cliente");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jrbMostrarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMostrarTodasActionPerformed

        if (jrbMostrarTodas.isSelected()) {
            jrbActivos.setSelected(false);
            jrbInactivos.setSelected(false);
            jcbCliente.setSelectedIndex(0);
            jbEliminar.setEnabled(false);
            jbActivar.setEnabled(false);
        }
        modelo.setRowCount(0);
        for (Mascota mascota : mascData.listarMascota()) {
            modelo.addRow(new Object[]{mascota.getIdMascota(), mascota.getNombre(), mascota.getSexo(), mascota.getEspecie(), mascota.getRaza(), mascota.getColorPelo(), mascota.getFechaNac(), mascota.getPesoMedio(), mascota.getPesoActual(), mascota.isEstado()});
        }


    }//GEN-LAST:event_jrbMostrarTodasActionPerformed

    private void jbActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActivarActionPerformed

        try {

            int fila = jtTabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione una fila.");
            } else {
                
                int idMascota = (Integer) modelo.getValueAt(fila, 0);
                mascData.activarMascota(idMascota);

                borrarFilas();
                for (Mascota mascota : mascData.listarMascotaPorCliente(cliente.getIdCliente())) {
                    if (!mascota.isEstado()) {
                        modelo.addRow(new Object[]{mascota.getIdMascota(), mascota.getNombre(), mascota.getSexo(), mascota.getEspecie(), mascota.getRaza(), mascota.getColorPelo(), mascota.getFechaNac(), mascota.getPesoMedio(), mascota.getPesoActual(), mascota.isEstado()});
                    }

                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "ERROR: Seleccione un cliente");
        }

    }//GEN-LAST:event_jbActivarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void cargarCombo() {
        try {
            jcbCliente.addItem(null);
        } catch (NullPointerException e) {

        }

        for (Cliente clien : clienData.listarClientes()) {
            jcbCliente.addItem(clien);
        }

    }

    private void armarTabla() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Sexo");
        modelo.addColumn("Especie");
        modelo.addColumn("Raza");
        modelo.addColumn("Color Pelo");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Peso Medio");
        modelo.addColumn("Peso Actual");
        modelo.addColumn("Estado");
        jtTabla.setModel(modelo);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActivar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Cliente> jcbCliente;
    private javax.swing.JRadioButton jrbActivos;
    private javax.swing.JRadioButton jrbInactivos;
    private javax.swing.JRadioButton jrbMostrarTodas;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables

    private void borrarFilas() {

        int fila = jtTabla.getRowCount() - 1;
        for (int f = fila; f >= 0; f--) {
            modelo.removeRow(f);
        }

    }
}
