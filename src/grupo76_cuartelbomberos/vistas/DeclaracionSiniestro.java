package grupo76_cuartelbomberos.vistas;

import grupo76_cuartelbomberos.coneccion.*;
import grupo76_cuartelbomberos.entidades.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JP
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
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        B_Cargar = new javax.swing.JButton();
        B_Limpiar = new javax.swing.JButton();
        B_Salir = new javax.swing.JButton();
        PanelTabla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_Brigadas = new javax.swing.JTable();

        setResizable(true);
        setTitle("Declaración de Siniestros");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setFrameIcon(getFrameIcon());
        setNormalBounds(new java.awt.Rectangle(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(650, 650));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Tipo de Siniestro:");
        jLabel1.setPreferredSize(new java.awt.Dimension(14, 24));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Fecha del Siniestro:");
        jLabel2.setPreferredSize(new java.awt.Dimension(14, 24));

        DC_FechaSiniestro.setMaximumSize(new java.awt.Dimension(100, 100));
        DC_FechaSiniestro.setMinSelectableDate(new java.util.Date(1672545689000L));
        DC_FechaSiniestro.setPreferredSize(new java.awt.Dimension(60, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Coordenas X:");
        jLabel3.setPreferredSize(new java.awt.Dimension(14, 24));

        TF_CoordX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_CoordXKeyReleased(evt);
            }
        });

        TF_CoordY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_CoordYKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Coordenas Y:");
        jLabel4.setPreferredSize(new java.awt.Dimension(14, 24));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Detalles del Siniestro:");
        jLabel5.setPreferredSize(new java.awt.Dimension(14, 24));

        TA_Detalles.setColumns(20);
        TA_Detalles.setRows(5);
        jScrollPane1.setViewportView(TA_Detalles);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Declaracion de Accidentes/Siniestros");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Hora del Siniestro:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Brigada Asignada:");

        B_Cargar.setText("Cargar Siniestro");
        B_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CargarActionPerformed(evt);
            }
        });

        B_Limpiar.setText("Limpiar");
        B_Limpiar.setPreferredSize(new java.awt.Dimension(123, 32));
        B_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LimpiarActionPerformed(evt);
            }
        });

        B_Salir.setText("Salir");
        B_Salir.setPreferredSize(new java.awt.Dimension(123, 32));
        B_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B_Cargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(B_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(B_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTablaLayout.setVerticalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(DC_FechaSiniestro, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                                .addComponent(jLabel7)
                                                .addComponent(jTextField1))
                                            .addComponent(CB_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(88, 88, 88)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TF_CoordX, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TF_CoordY, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                            .addComponent(jLabel8)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(PanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CB_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_CoordX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(DC_FechaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(13, 13, 13)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(TF_CoordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addGap(1, 1, 1)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SalirActionPerformed
        // Cerrar ventana y volver a la ventana principal
        ViewMenu ventana = new ViewMenu();
        ventana.setVisible(true);
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

        LocalDate fechaSin;
        try {
            fechaSin = DC_FechaSiniestro.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Coloque una fecha válida");
            return;
        }
        sin.setFechaSinietro(fechaSin);

        double X, Y;
        try {
            X = Double.parseDouble(TF_CoordX.getText());
            Y = Double.parseDouble(TF_CoordY.getText());
        } catch (ClassCastException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese la COORDENADA usan decimales");
            return;
        }
        sin.setCoord_X(X);
        sin.setCoord_Y(Y);

        if (TA_Detalles.getText() == null) {
            JOptionPane.showMessageDialog(this, "Debe describir el siniestro !!");
        } else {
            sin.setDetalles(TA_Detalles.getText());
        }

        Brigada brig = new Brigada();
        int codB =(Integer) T_Brigadas.getValueAt(T_Brigadas.getSelectedRow(), 1);
        brig.setCodBrigada(codB);
        sin.setBrigada(brig);

        SiniestroData sinD = new SiniestroData();
        sinD.guardarSiniestro(sin);
        limpiarCampos();
    }//GEN-LAST:event_B_CargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
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
        tabla.addColumn("Distancia (Kmts)");
        tabla.setRowCount(0);

        T_Brigadas.setModel(tabla);
        PanelTabla.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                "Table Title", TitledBorder.CENTER, TitledBorder.TOP));
        T_Brigadas.setBackground(Color.gray);
        T_Brigadas.setForeground(Color.white);
        T_Brigadas.setSelectionBackground(Color.green);
        T_Brigadas.setSelectionForeground(Color.black);

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
        String esp = (String) CB_Esp.getSelectedItem();

        // buscar brigadas q coincidan con la especialidad y obtener el cuartel al q pertenecen
    }

    private double calcularDistancia(double coordX2, double coordY2) {
        double dist = 0, coordX, coordX1, coordY, coordY1;
        coordX1 = Double.parseDouble(TF_CoordX.getText());
        coordY1 = Double.parseDouble(TF_CoordY.getText());
        coordX = coordX2 - coordX1;
        coordY = coordY2 - coordY1;
        dist = Math.sqrt((coordX * coordX) + (coordY * coordY));
        return dist;
    }

    private ArrayList<double[]> armarCuartelesporDistacia() {
        ArrayList<double[]> cuarteDistancia = new ArrayList<double[]>();
        double[] dist_coord = new double[2];
        CuartelData cuartelD = new CuartelData();

        for (Cuartel cuartel : cuartelD.listarCuartel()) {
            dist_coord[1] = calcularDistancia(cuartel.getCoord_X(), cuartel.getCoord_Y());
            dist_coord[0] = cuartel.getCodCuartel();
            cuarteDistancia.add(dist_coord);
        }
        return cuarteDistancia;
    }
}
