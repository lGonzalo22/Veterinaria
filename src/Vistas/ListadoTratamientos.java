/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.TratamientoData;
import Entidades.TiposTratamientos;
import Entidades.Tratamiento;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author gonza
 */
public class ListadoTratamientos extends javax.swing.JInternalFrame {

    private TratamientoData tratData = new TratamientoData();

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public ListadoTratamientos() {
        initComponents();
        armarTabla();
        jtaDescripcion.setEditable(false);
        jtbModificar.setEnabled(false);
        jbActivar.setEnabled(false);
        jbEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jrbActivos = new javax.swing.JRadioButton();
        jrbInactivos = new javax.swing.JRadioButton();
        jbSalir = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jbActivar = new javax.swing.JButton();
        jtbModificar = new javax.swing.JToggleButton();

        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("LISTADO DE TRATAMIENTOS");

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
        jtTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabla);

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

        jbSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setLineWrap(true);
        jtaDescripcion.setRows(5);
        jScrollPane2.setViewportView(jtaDescripcion);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripcion:");

        jbActivar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbActivar.setText("Activar");
        jbActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActivarActionPerformed(evt);
            }
        });

        jtbModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtbModificar.setText("Modificar");
        jtbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbActivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jrbInactivos))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jbEliminar)
                        .addGap(44, 44, 44)
                        .addComponent(jbActivar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtbModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(73, 73, 73)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jrbActivos)
                    .addComponent(jrbInactivos))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar)
                    .addComponent(jbActivar)
                    .addComponent(jbSalir)
                    .addComponent(jtbModificar))
                .addContainerGap(21, Short.MAX_VALUE))
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

        if (jrbInactivos.isSelected()) {
            jrbActivos.setSelected(false);
            jbEliminar.setEnabled(false);
            jbActivar.setEnabled(true);
            jtaDescripcion.setText("");
            modelo.setRowCount(0);
            for (Tratamiento tratamiento : tratData.listarTratamiento()) {
                if (!tratamiento.isEstado()) {
                    modelo.addRow(new Object[]{tratamiento.getIdTratamiento(), tratamiento.getTipo(), tratamiento.getImporte()});
                }
            }
        }

    }//GEN-LAST:event_jrbInactivosActionPerformed

    private void jrbActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivosActionPerformed

        if (jrbActivos.isSelected()) {
            jrbInactivos.setSelected(false);
            jbEliminar.setEnabled(true);
            jbActivar.setEnabled(false);

            jtaDescripcion.setText("");
            modelo.setRowCount(0);
            for (Tratamiento tratamiento : tratData.listarTratamiento()) {
                if (tratamiento.isEstado()) {
                    modelo.addRow(new Object[]{tratamiento.getIdTratamiento(), tratamiento.getTipo(), tratamiento.getImporte()});

                }
            }
        }

    }//GEN-LAST:event_jrbActivosActionPerformed

    private void jtTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaMouseClicked

        int fila = jtTabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "ERROR: Seleccione una fila");
        } else {
            jtbModificar.setEnabled(true);
            int idTratamiento = (Integer) modelo.getValueAt(fila, 0);
            Tratamiento tratamiento = tratData.buscarTratamiento(idTratamiento);
            jtaDescripcion.setText(tratamiento.getDescripcion());
        }

    }//GEN-LAST:event_jtTablaMouseClicked

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActivarActionPerformed

        int fila = jtTabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "ERROR: Seleccione una fila");
        } else {

            int idTratamiento = (Integer) modelo.getValueAt(fila, 0);
            tratData.activarTratamiento(idTratamiento);
            jtaDescripcion.setText("");
            modelo.setRowCount(0);
            for (Tratamiento tratamiento : tratData.listarTratamiento()) {
                if (!tratamiento.isEstado()) {
                    modelo.addRow(new Object[]{tratamiento.getIdTratamiento(), tratamiento.getTipo(), tratamiento.getImporte()});

                }
            }
        }

    }//GEN-LAST:event_jbActivarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int fila = jtTabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "ERROR: Seleccione una fila");
        } else {

            int idTratamiento = (Integer) modelo.getValueAt(fila, 0);
            tratData.eliminarTratamiento(idTratamiento);
            jtaDescripcion.setText("");
            modelo.setRowCount(0);
            for (Tratamiento tratamiento : tratData.listarTratamiento()) {
                if (tratamiento.isEstado()) {
                    modelo.addRow(new Object[]{tratamiento.getIdTratamiento(), tratamiento.getTipo(), tratamiento.getImporte()});

                }
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbModificarActionPerformed
        int fila = jtTabla.getSelectedRow();
        if (jtbModificar.isSelected() && fila != -1) {
            JOptionPane.showMessageDialog(this, "Puede modificar la descripcion.");
            jtaDescripcion.setEditable(true);
            jbEliminar.setEnabled(false);
            jbActivar.setEnabled(false);
            jtbModificar.setText("Finalizar");
        } else {
            
            if (fila == -1) {
                JOptionPane.showMessageDialog(this, "ERROR: Seleccione una fila");
            } else {
                int idTratamiento = (Integer) modelo.getValueAt(fila, 0);
                tratData.modificarDescripcionTratamiento(idTratamiento, jtaDescripcion.getText());
                jtaDescripcion.setEditable(false);
                jtbModificar.setText("Modificar");
                if (jrbActivos.isSelected()) {
                    jbEliminar.setEnabled(true);     
                }else{
                    jbActivar.setEnabled(true);
                }
                
                
            }

        }


    }//GEN-LAST:event_jtbModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbActivar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbActivos;
    private javax.swing.JRadioButton jrbInactivos;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JToggleButton jtbModificar;
    // End of variables declaration//GEN-END:variables

    public void armarTabla() {

        modelo.addColumn("ID");
        modelo.addColumn("Tratamiento");
        modelo.addColumn("Importe");
        jtTabla.setModel(modelo);

        TableColumn column = jtTabla.getColumnModel().getColumn(0);
        column.setPreferredWidth(20);
        column = jtTabla.getColumnModel().getColumn(1);
        column.setPreferredWidth(100);
    }
}
