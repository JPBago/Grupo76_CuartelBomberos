/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo76_cuartelbomberos.vistas;

import grupo76_cuartelbomberos.coneccion.*;
import grupo76_cuartelbomberos.entidades.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JP
 */
public class ConcluirSiniestro extends javax.swing.JInternalFrame {

    private DefaultTableModel tabla = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ConcluirSiniestro() {
        initComponents();
        iniciarTabla();
        B_Guardar.setVisible(false);
        TF_Brigada.setEditable(false);
        TF_Tipo.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TF_CodSin = new javax.swing.JTextField();
        DC_FechaFin = new com.toedter.calendar.JDateChooser();
        P_Bomberos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_Bomberos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RBSiSiniestro = new javax.swing.JRadioButton();
        RBNoSiniestro = new javax.swing.JRadioButton();
        TF_Puntaje = new javax.swing.JTextField();
        P_Botonera = new javax.swing.JPanel();
        B_Buscar = new javax.swing.JButton();
        B_Guardar = new javax.swing.JButton();
        B_Limpiar = new javax.swing.JButton();
        B_Salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TF_Brigada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TF_Tipo = new javax.swing.JTextField();

        setTitle("Siniestros Concluidos");
        setPreferredSize(new java.awt.Dimension(650, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("ID Siniestro: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 99, 127, -1));

        TF_CodSin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_CodSin.setPreferredSize(new java.awt.Dimension(30, 25));
        TF_CodSin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_CodSinKeyReleased(evt);
            }
        });
        getContentPane().add(TF_CodSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 120, 127, -1));

        DC_FechaFin.setEnabled(false);
        DC_FechaFin.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(DC_FechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 184, 149, -1));

        T_Bomberos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(T_Bomberos);

        javax.swing.GroupLayout P_BomberosLayout = new javax.swing.GroupLayout(P_Bomberos);
        P_Bomberos.setLayout(P_BomberosLayout);
        P_BomberosLayout.setHorizontalGroup(
            P_BomberosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        P_BomberosLayout.setVerticalGroup(
            P_BomberosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        getContentPane().add(P_Bomberos, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 284, 410, 140));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Fecha de Resolución:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 163, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Siniestros concluidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Puntuacion Resolutiva");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 227, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Fue resulto el siniestro ?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 163, -1, -1));

        RBSiSiniestro.setText("SI");
        RBSiSiniestro.setEnabled(false);
        RBSiSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBSiSiniestroActionPerformed(evt);
            }
        });
        getContentPane().add(RBSiSiniestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 180, -1, -1));

        RBNoSiniestro.setText("NO");
        RBNoSiniestro.setEnabled(false);
        RBNoSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBNoSiniestroActionPerformed(evt);
            }
        });
        getContentPane().add(RBNoSiniestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 180, -1, -1));

        TF_Puntaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Puntaje.setEnabled(false);
        TF_Puntaje.setPreferredSize(new java.awt.Dimension(30, 25));
        TF_Puntaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_PuntajeFocusLost(evt);
            }
        });
        TF_Puntaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_PuntajeKeyReleased(evt);
            }
        });
        getContentPane().add(TF_Puntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 248, 119, -1));

        B_Buscar.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        B_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/buscar (3).png"))); // NOI18N
        B_Buscar.setText("Buscar ID");
        B_Buscar.setPreferredSize(new java.awt.Dimension(100, 20));
        B_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BuscarActionPerformed(evt);
            }
        });

        B_Guardar.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        B_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/Guardar.png"))); // NOI18N
        B_Guardar.setLabel("Guardar");
        B_Guardar.setPreferredSize(new java.awt.Dimension(77, 32));
        B_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_GuardarActionPerformed(evt);
            }
        });

        B_Limpiar.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        B_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/limpieza-de-datos (1).png"))); // NOI18N
        B_Limpiar.setText("Limpiar");
        B_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LimpiarActionPerformed(evt);
            }
        });

        B_Salir.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        B_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/salida-de-emergencia.png"))); // NOI18N
        B_Salir.setText("Salir");
        B_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_BotoneraLayout = new javax.swing.GroupLayout(P_Botonera);
        P_Botonera.setLayout(P_BotoneraLayout);
        P_BotoneraLayout.setHorizontalGroup(
            P_BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_BotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(B_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        P_BotoneraLayout.setVerticalGroup(
            P_BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_BotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(B_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(P_Botonera, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 90, 130, 320));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Brigada a Cargo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 99, -1, -1));

        TF_Brigada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Brigada.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(TF_Brigada, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 120, 123, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Tipo de Siniestro:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 227, 111, -1));

        TF_Tipo.setForeground(new java.awt.Color(0, 0, 102));
        TF_Tipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Tipo.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(TF_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 248, 149, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SalirActionPerformed
        // TODO add your handling code here:
        ViewMenu ventana = new ViewMenu();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_B_SalirActionPerformed

    private void B_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_B_LimpiarActionPerformed

    private void RBSiSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBSiSiniestroActionPerformed
        // Si se elegi opsion SI, la opcion NO se des-selecciona
        RBNoSiniestro.setSelected(false);
        TF_Puntaje.setEnabled(true);
        DC_FechaFin.setEnabled(true);
    }//GEN-LAST:event_RBSiSiniestroActionPerformed

    private void RBNoSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBNoSiniestroActionPerformed
        // Si se elegi opsion NO, la opcion SI se des-selecciona
        RBSiSiniestro.setSelected(false);
        TF_Puntaje.setEnabled(false);
        DC_FechaFin.setEnabled(false);
    }//GEN-LAST:event_RBNoSiniestroActionPerformed

    private void TF_PuntajeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_PuntajeFocusLost
        // TODO add your handling code here:
        try {
            int a = Integer.parseInt(TF_Puntaje.getText());
            if (a < 1 || a > 10) {
                a = Integer.parseInt(TF_Brigada.getText());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un Nº entero entre 1 y 10");
        }
    }//GEN-LAST:event_TF_PuntajeFocusLost

    private void TF_PuntajeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_PuntajeKeyReleased
        // Si la tecla ENTER es precionada se valida el campo
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                int a = Integer.parseInt(TF_Puntaje.getText());
                if (a < 1 || a > 10) {
                    a = Integer.parseInt(TF_Brigada.getText());
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un Nº entero entre 1 y 10");
            }
        }
    }//GEN-LAST:event_TF_PuntajeKeyReleased

    private void B_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BuscarActionPerformed
        // El boton ejecuta la busqueda de un siniestro
        borrarFilas();
        buscarSiniestro();
    }//GEN-LAST:event_B_BuscarActionPerformed

    private void B_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_GuardarActionPerformed
        // Se actualiza el Siniestro en la DB

        LocalDate fechaFin;
        try {
            fechaFin = DC_FechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Debe indicar la fecha de resolución del incidente");
            return;
        }

        int puntaje = 0, codigo = 0;
        try {
            puntaje = Integer.parseInt(TF_Puntaje.getText());
            codigo = Integer.parseInt(TF_CodSin.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor aceptable");
        }

        SiniestroData sinD = new SiniestroData();
        Siniestro sin = sinD.buscarSiniestro(codigo);

        // verificar q la fecha de resolucion no sea anterior a la de inicio
        LocalDateTime aux = fechaFin.atTime(LocalTime.now());
        if (sin.getFechaSinietro().isBefore(aux)) {
            sin.setFechaResoluc(fechaFin);
            sin.setPuntuacion(puntaje);
            sin.setCodSiniestro(codigo);
        } else {
            JOptionPane.showMessageDialog(this, "La Fecha de Resolución no puede "
                    + "ser anterior a la del Inicio del Reporte", "ERROR CRITICO", 0);
            return;
        }

        int resp = JOptionPane.showConfirmDialog(this, "Esta seguro de Finalizar "
                + "el Reporte " + codigo + " ??", "CONFIRMAR", 0, 3);
        if (resp == 0) {
            sinD.concluirSiniestro(sin);
            liberarBrigada();
        } else {
            return;
        }

        limpiarCampos();
    }//GEN-LAST:event_B_GuardarActionPerformed

    private void TF_CodSinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_CodSinKeyReleased
        // Si se presiona la tecla ENTER se ejecuta la busqueda
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarSiniestro();
        }
    }//GEN-LAST:event_TF_CodSinKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Buscar;
    private javax.swing.JButton B_Guardar;
    private javax.swing.JButton B_Limpiar;
    private javax.swing.JButton B_Salir;
    private com.toedter.calendar.JDateChooser DC_FechaFin;
    private javax.swing.JPanel P_Bomberos;
    private javax.swing.JPanel P_Botonera;
    private javax.swing.JRadioButton RBNoSiniestro;
    private javax.swing.JRadioButton RBSiSiniestro;
    private javax.swing.JTextField TF_Brigada;
    private javax.swing.JTextField TF_CodSin;
    private javax.swing.JTextField TF_Puntaje;
    private javax.swing.JTextField TF_Tipo;
    private javax.swing.JTable T_Bomberos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    // Inicio metodos independientes
    private void limpiarCampos() {
        DC_FechaFin.setDate(null);
        TF_CodSin.setText("");
        TF_Puntaje.setText("");
        TF_Brigada.setText("");
        TF_Tipo.setText("");
        RBNoSiniestro.setSelected(false);
        RBSiSiniestro.setSelected(false);
        borrarFilas();
        B_Guardar.setVisible(false);
    }

    private void iniciarTabla() {
        //Inicializar las columnas de la tabla
        tabla.addColumn(" COD ");
        tabla.addColumn("Nombre y Apellido");
        tabla.setRowCount(0);

        T_Bomberos.setModel(tabla);
        P_Bomberos.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                "Miembros de la Brigada", TitledBorder.CENTER, TitledBorder.TOP));
        T_Bomberos.setBackground(Color.gray);
        T_Bomberos.setForeground(Color.white);
        T_Bomberos.setSelectionBackground(Color.green);
        T_Bomberos.setSelectionForeground(Color.black);

        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        T_Bomberos.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        T_Bomberos.getColumnModel().getColumn(1).setCellRenderer(Alinear);
    }

    private void borrarFilas() {
        int filas = T_Bomberos.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            tabla.removeRow(filas);
        }
    }

    private void llenarTabla(int cod) {
        BomberoData bombD = new BomberoData();
        String aux;
        for (Bomberos bomb : bombD.listarBomberosXBrigada(cod)) {
            aux = String.format("%05d", bomb.getCodBombero());
            tabla.addRow(new Object[]{aux, bomb.getNombreApe()});
        }
    }

    private void nombreBrigada(int cod) {
        BrigadaData brigD = new BrigadaData();
        Brigada brig = brigD.buscarBrigada(cod);
        TF_Brigada.setText(brig.getCodBrigada() + " | " + brig.getNombreBrigada());
    }

    private void buscarSiniestro() {

        int cod = 0;
        // validar codigo de siniestro
        try {
            cod = Integer.parseInt(TF_CodSin.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un código de Reporte válido");
            return;
        }
        // Buscar SINIESTRO por CODIGO
        SiniestroData sinD = new SiniestroData();
        Siniestro sin = sinD.buscarSiniestro(cod);

        // Rellenar campos requeridos
        limpiarCampos();
        if (sin != null) {
            TF_CodSin.setText(sin.getCodSiniestro() + "");
            RBSiSiniestro.setEnabled(true);
            DC_FechaFin.setEnabled(true);
            TF_Puntaje.setEnabled(true);
            TF_Tipo.setText(sin.getTipo().name());
            nombreBrigada(sin.getBrigada().getCodBrigada());
            llenarTabla(sin.getBrigada().getCodBrigada());
            if (sin.getFechaResoluc() != null) {
                B_Guardar.setVisible(false);
                RBSiSiniestro.setSelected(true);
                RBNoSiniestro.setEnabled(false);
                TF_Puntaje.setText(sin.getPuntuacion() + "");
                DC_FechaFin.setDate(Date.valueOf(sin.getFechaResoluc()));
            } else {
                B_Guardar.setVisible(true);
                RBNoSiniestro.setEnabled(true);
                RBSiSiniestro.setSelected(false);
            }
        }
    }

    private void liberarBrigada() {
        BrigadaData brigD = new BrigadaData();
        String text = TF_Brigada.getText();
        String[] separar = text.split(" ");
        int codigo = Integer.parseInt(separar[0]);
        brigD.liberarBrigada(codigo);
    }
    //
}
