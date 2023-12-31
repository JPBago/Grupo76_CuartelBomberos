package grupo76_cuartelbomberos.vistas;

import grupo76_cuartelbomberos.coneccion.*;
import grupo76_cuartelbomberos.entidades.*;
import static grupo76_cuartelbomberos.vistas.ViewMenu.restaurarFondo;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author JPBago
 */
public class DeclaracionSiniestro extends javax.swing.JInternalFrame {

    private DefaultTableModel tabla = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public DeclaracionSiniestro() {
        initComponents();
        cargarComboEsp();
        iniciarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CB_Esp = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        DC_FechaSiniestro = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        TF_CoordX = new javax.swing.JTextField();
        TF_CoordY = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_Detalles = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        B_Cargar = new javax.swing.JButton();
        B_Limpiar = new javax.swing.JButton();
        B_Salir = new javax.swing.JButton();
        B_Buscar = new javax.swing.JButton();
        PanelTabla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_Brigadas = new javax.swing.JTable();

        setResizable(true);
        setTitle("Declaración de Siniestros");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setFrameIcon(getFrameIcon());
        setNormalBounds(new java.awt.Rectangle(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(700, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Tipo de Siniestro:");
        jLabel1.setPreferredSize(new java.awt.Dimension(14, 24));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 90, 98, 16));

        CB_Esp.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(CB_Esp, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 108, 176, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Fecha y Hora del Siniestro:");
        jLabel2.setPreferredSize(new java.awt.Dimension(14, 24));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 139, 155, 16));

        DC_FechaSiniestro.setDateFormatString("dd/MM/yyyy HH:mm:ss");
        DC_FechaSiniestro.setMaximumSize(new java.awt.Dimension(100, 100));
        DC_FechaSiniestro.setMinSelectableDate(new java.util.Date(1672545689000L));
        DC_FechaSiniestro.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(DC_FechaSiniestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 160, 176, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Coordenas X:");
        jLabel3.setPreferredSize(new java.awt.Dimension(14, 24));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 88, 109, 20));

        TF_CoordX.setPreferredSize(new java.awt.Dimension(30, 25));
        TF_CoordX.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_CoordXFocusLost(evt);
            }
        });
        TF_CoordX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_CoordXKeyReleased(evt);
            }
        });
        getContentPane().add(TF_CoordX, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 163, -1));

        TF_CoordY.setPreferredSize(new java.awt.Dimension(30, 25));
        TF_CoordY.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_CoordYFocusLost(evt);
            }
        });
        TF_CoordY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_CoordYKeyReleased(evt);
            }
        });
        getContentPane().add(TF_CoordY, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 163, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Coordenas Y:");
        jLabel4.setPreferredSize(new java.awt.Dimension(14, 24));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 96, 16));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Detalles del Siniestro:");
        jLabel5.setPreferredSize(new java.awt.Dimension(14, 24));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 198, 134, 25));

        TA_Detalles.setColumns(20);
        TA_Detalles.setRows(5);
        jScrollPane1.setViewportView(TA_Detalles);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 229, 415, 101));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Declaracion de Accidentes/Siniestros");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 33, -1, -1));

        B_Cargar.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        B_Cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/carga-en-la-nube.png"))); // NOI18N
        B_Cargar.setText("Cargar Siniestro");
        B_Cargar.setPreferredSize(new java.awt.Dimension(100, 20));
        B_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CargarActionPerformed(evt);
            }
        });

        B_Limpiar.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        B_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/limpieza-de-datos (1).png"))); // NOI18N
        B_Limpiar.setText("Limpiar");
        B_Limpiar.setPreferredSize(new java.awt.Dimension(123, 32));
        B_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LimpiarActionPerformed(evt);
            }
        });

        B_Salir.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        B_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/salida-de-emergencia.png"))); // NOI18N
        B_Salir.setText("Salir");
        B_Salir.setPreferredSize(new java.awt.Dimension(123, 32));
        B_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SalirActionPerformed(evt);
            }
        });

        B_Buscar.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        B_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/BUSCAR BRIG.png"))); // NOI18N
        B_Buscar.setText("Buscar Brigadas");
        B_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B_Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(B_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(B_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(B_Cargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(B_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 99, 150, 360));

        T_Brigadas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(T_Brigadas);

        javax.swing.GroupLayout PanelTablaLayout = new javax.swing.GroupLayout(PanelTabla);
        PanelTabla.setLayout(PanelTablaLayout);
        PanelTablaLayout.setHorizontalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        PanelTablaLayout.setVerticalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );

        getContentPane().add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 430, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SalirActionPerformed
        // Cerrar ventana y volver a la ventana principal
       restaurarFondo ();
        this.dispose();
    }//GEN-LAST:event_B_SalirActionPerformed

    private void B_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LimpiarActionPerformed
        // Limpiar todos los campos, CB y tabla
        limpiarCampos();
    }//GEN-LAST:event_B_LimpiarActionPerformed

    private void TF_CoordXKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_CoordXKeyReleased
        // Si la tecla ENTER es precionada se valida el campo
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                double aux = Double.parseDouble(TF_CoordX.getText());
            } catch (ClassCastException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese la COORDENADA usan decimales");
                return;
            }
        }
    }//GEN-LAST:event_TF_CoordXKeyReleased

    private void TF_CoordYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_CoordYKeyReleased
        // Si la tecla ENTER es precionada se valida el campo
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                double aux = Double.parseDouble(TF_CoordX.getText());
            } catch (ClassCastException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese la COORDENADA usan decimales");
                return;
            }
        }
    }//GEN-LAST:event_TF_CoordYKeyReleased

    private void B_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CargarActionPerformed
        // TODO add your handling code here:
        Siniestro sin = new Siniestro();

        sin.setTipo((Especialidad) CB_Esp.getSelectedItem());

        LocalDateTime fechaSin, aux = LocalDateTime.now();
        try {
            fechaSin = DC_FechaSiniestro.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Coloque fecha y hora válidos", "FECHA", 1);
            return;
        }
        if (aux.isAfter(fechaSin)) {
            int resp = JOptionPane.showConfirmDialog(this, "Esta seguro/a de ingresar una fecha "
                    + "anterior a la actual ??", null, 2, 1);
            if (resp == 0) {
                sin.setFechaSinietro(fechaSin);
            } else {
                return;
            }
        } else {
            sin.setFechaSinietro(fechaSin);
        }

        if (validarCoordenadas()) {
            sin.setCoord_X(Double.parseDouble(TF_CoordX.getText()));
            sin.setCoord_Y(Double.parseDouble(TF_CoordY.getText()));
        } else {
            return;
        }

        if (TA_Detalles.getText().equals(" ") || TA_Detalles.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe describir el siniestro !!", "DESCRIPCION", 1);
            return;
        } else {
            sin.setDetalles(TA_Detalles.getText());
        }

        Brigada brig = new Brigada();
        int codB = 0, filas = T_Brigadas.getSelectedRow();
        try {
            codB = Integer.parseInt((String) T_Brigadas.getValueAt(filas, 0));
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una brigada", "BRIGADA", 1);
            return;
        }
        brig.setCodBrigada(codB);
        sin.setBrigada(brig);

        int a = JOptionPane.showConfirmDialog(this, "¿Esta seguro de asignar la brigada " + codB + " al incidente?", null, 2, 3);
        if (a == 0) {
            SiniestroData sinD = new SiniestroData();
            int sinCod = sinD.guardarSiniestro(sin);
            JOptionPane.showMessageDialog(this, "Se genero un reporte con el codigo: " + sinCod);
        } else {
            return;
        }

        BrigadaData brigD = new BrigadaData();
        brigD.ocuparBrigada(codB);

        limpiarCampos();
    }//GEN-LAST:event_B_CargarActionPerformed

    private void B_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BuscarActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        if (CB_Esp.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de Incidente", "TIPO DE EVENTO", 1);
            return;
        }

        if (!validarCoordenadas()) {
            return;
        }
        cargarTabla();
    }//GEN-LAST:event_B_BuscarActionPerformed

    private void TF_CoordXFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_CoordXFocusLost
        // TODO add your handling code here:
        try {
            double aux = Double.parseDouble(TF_CoordX.getText());
        } catch (ClassCastException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese la COORDENADA usan decimales");
            return;
        }
    }//GEN-LAST:event_TF_CoordXFocusLost

    private void TF_CoordYFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_CoordYFocusLost
        // TODO add your handling code here:
        try {
            double aux = Double.parseDouble(TF_CoordX.getText());
        } catch (ClassCastException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese la COORDENADA usando decimales");
            return;
        }
    }//GEN-LAST:event_TF_CoordYFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Buscar;
    private javax.swing.JButton B_Cargar;
    private javax.swing.JButton B_Limpiar;
    private javax.swing.JButton B_Salir;
    private javax.swing.JComboBox<Especialidad> CB_Esp;
    private com.toedter.calendar.JDateChooser DC_FechaSiniestro;
    private javax.swing.JPanel PanelTabla;
    private javax.swing.JTextArea TA_Detalles;
    private javax.swing.JTextField TF_CoordX;
    private javax.swing.JTextField TF_CoordY;
    private javax.swing.JTable T_Brigadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    // Metodos independientes
    private void cargarComboEsp() {

        for (Especialidad esp : Especialidad.values()) {
            CB_Esp.addItem(esp);
        }
        CB_Esp.setSelectedIndex(-1);
    }

    private void iniciarTabla() {
        //Inicializar las columnas de la tabla
        tabla.addColumn(" COD ");
        tabla.addColumn("Nombre");
        tabla.addColumn("Cuartel");
        tabla.addColumn("Distancia (Kms)");
        tabla.setRowCount(0);

        T_Brigadas.setModel(tabla);
        PanelTabla.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                "BRIGADAS DISPONIBLES", TitledBorder.CENTER, TitledBorder.TOP));
        T_Brigadas.setBackground(Color.YELLOW);
        T_Brigadas.setForeground(Color.DARK_GRAY);
        T_Brigadas.setSelectionBackground(Color.orange);
        T_Brigadas.setSelectionForeground(Color.black);

        TableColumn column = null;
        for (int i = 0; i < 4; i++) {
            column = T_Brigadas.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setMinWidth(30);
                    column.setMaxWidth(50);
                    break;
                case 1:
                    column.setMinWidth(55);
                    column.setMaxWidth(70);
                    break;
                case 2:
                    column.setMinWidth(200);
                    column.setMaxWidth(300);
                    break;
                case 3:
                    column.setMinWidth(50);
                    break;
            }
        }

        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        T_Brigadas.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        T_Brigadas.getColumnModel().getColumn(1).setCellRenderer(Alinear);
        T_Brigadas.getColumnModel().getColumn(3).setCellRenderer(Alinear);
    }

    private void borrarFilas() {
        int filas = T_Brigadas.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            tabla.removeRow(filas);
        }
    }

    private void limpiarCampos() {
        CB_Esp.setSelectedIndex(-1);
        DC_FechaSiniestro.setDate(null);
        TF_CoordX.setText("");
        TF_CoordY.setText("");
        TA_Detalles.setText("");
        borrarFilas();
    }

    private void cargarTabla() {
        String esp = (String) CB_Esp.getSelectedItem().toString();
        SiniestroData sinD = new SiniestroData();
        // buscar brigadas q coincidan con la especialidad y obtener el cuartel al q pertenecen
        ArrayList<double[]> cuartelDistancia = armarCuartelesporDistacia();
        ArrayList<String[]> CuartelesXEsp = sinD.listarCuarteslesXEsp(esp);
        //
        if (CuartelesXEsp == null || CuartelesXEsp.size() == 0) {
            JOptionPane.showMessageDialog(this, "No hay Brigadas Disponibles para la especialidad: " + esp);
            return;
        }
        //
        String codigo;
        int aux; DecimalFormat df = new DecimalFormat("###.##");
        for (double[] distancias : cuartelDistancia) {
            for (String[] cuarteles : CuartelesXEsp) {
                String temp = (int) distancias[0] + "";
                if (temp.equals(cuarteles[3])) {
                    aux = Integer.parseInt(cuarteles[0]);
                    codigo = String.format("%02d", aux);
                    tabla.addRow(new Object[]{codigo, cuarteles[1], cuarteles[2], df.format(distancias[1])});
                }
            }
        }
    }

    private double calcularDistancia(double coordX1, double coordY1) {
        double dist = 0, coordX2, coordY2;
        coordX2 = Double.parseDouble(TF_CoordX.getText());
        coordY2 = Double.parseDouble(TF_CoordY.getText());
        double radioTierra = 6371;//en kilómetros  
        double dLat = Math.toRadians(coordX2 - coordX1);  
        double dLng = Math.toRadians(coordY2 - coordY1);  
        double sindLat = Math.sin(dLat / 2);  
        double sindLng = Math.sin(dLng / 2);  
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)  
                * Math.cos(Math.toRadians(coordX1)) * Math.cos(Math.toRadians(coordX2));  
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));  
        dist = radioTierra * va2;
//        dist =  Math.round(dist * 1000.0) / 1000.0;
        return dist;
    }

    private ArrayList<double[]> armarCuartelesporDistacia() {
        ArrayList<double[]> cuartelDistancia = new ArrayList<double[]>();
        double[] dist_coord = new double[2];
        CuartelData cuartelD = new CuartelData();
        // Armar una Lista de vectores con el ID_Cuartel y distancia del cuartel al siniestro
        for (Cuartel cuartel : cuartelD.listarCuartel()) {
            dist_coord[1] = calcularDistancia(cuartel.getCoord_X(), cuartel.getCoord_Y());
            dist_coord[0] = cuartel.getCodCuartel();
            cuartelDistancia.add(dist_coord.clone());
        }
        // Ordenar la Lista de menor distancia a mayor
        Collections.sort(cuartelDistancia, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o1[1], o2[1]);
            }
        });
        // Retornar la lista ordenada
        return cuartelDistancia;
    }

    private boolean validarCoordenadas() {
        double X, Y;
        try {
            X = Double.parseDouble(TF_CoordX.getText());
            Y = Double.parseDouble(TF_CoordY.getText());
        } catch (ClassCastException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese las COORDENADA usando decimales");
            return false;
        }
        return true;
    }

}
