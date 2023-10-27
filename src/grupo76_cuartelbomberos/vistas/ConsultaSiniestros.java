package grupo76_cuartelbomberos.vistas;

import grupo76_cuartelbomberos.coneccion.*;
import grupo76_cuartelbomberos.entidades.*;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ConsultaSiniestros extends javax.swing.JInternalFrame {

    private DefaultTableModel tabla = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }

    };

    public ConsultaSiniestros() {
        initComponents();
        iniciarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PConsulSini = new javax.swing.JPanel();
        JSP_Tabla = new javax.swing.JScrollPane();
        Tabla_Siniestros = new javax.swing.JTable();
        PBotonesConsulta = new javax.swing.JPanel();
        BConsulSini = new javax.swing.JButton();
        BSalirConsulSini = new javax.swing.JButton();
        DC_Fecha1 = new com.toedter.calendar.JDateChooser();
        DC_Fecha2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Consultas de Siniestros");
        setPreferredSize(new java.awt.Dimension(670, 410));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Consulta de Siniestros por fecha ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, 50));

        Tabla_Siniestros.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabla_Siniestros.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        JSP_Tabla.setViewportView(Tabla_Siniestros);

        javax.swing.GroupLayout PConsulSiniLayout = new javax.swing.GroupLayout(PConsulSini);
        PConsulSini.setLayout(PConsulSiniLayout);
        PConsulSiniLayout.setHorizontalGroup(
            PConsulSiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PConsulSiniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JSP_Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );
        PConsulSiniLayout.setVerticalGroup(
            PConsulSiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PConsulSiniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JSP_Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(PConsulSini, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 610, 170));

        BConsulSini.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BConsulSini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/buscar (3).png"))); // NOI18N
        BConsulSini.setText("Consultar");
        BConsulSini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConsulSiniActionPerformed(evt);
            }
        });

        BSalirConsulSini.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BSalirConsulSini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/salida-de-emergencia.png"))); // NOI18N
        BSalirConsulSini.setText("Salir");
        BSalirConsulSini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirConsulSiniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PBotonesConsultaLayout = new javax.swing.GroupLayout(PBotonesConsulta);
        PBotonesConsulta.setLayout(PBotonesConsultaLayout);
        PBotonesConsultaLayout.setHorizontalGroup(
            PBotonesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBotonesConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BConsulSini, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 348, Short.MAX_VALUE)
                .addComponent(BSalirConsulSini, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PBotonesConsultaLayout.setVerticalGroup(
            PBotonesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBotonesConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBotonesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BConsulSini, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSalirConsulSini, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PBotonesConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 610, 60));

        DC_Fecha1.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(DC_Fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 130, -1));

        DC_Fecha2.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(DC_Fecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Desde:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Hasta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSalirConsulSiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirConsulSiniActionPerformed

        ViewMenu ventana = new ViewMenu();
        ventana.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BSalirConsulSiniActionPerformed

    private void BConsulSiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConsulSiniActionPerformed
        // Verificar q las fechas sean válidas
        LocalDateTime fecha1, fecha2;
        try {
            fecha1 = DC_Fecha1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Coloque fecha de inicio válida");
            return;
        }
        try {
            fecha2 = DC_Fecha2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Coloque fecha de fin válida");
            return;
        }

        rellenarTabla(fecha1, fecha2);
    }//GEN-LAST:event_BConsulSiniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BConsulSini;
    private javax.swing.JButton BSalirConsulSini;
    private com.toedter.calendar.JDateChooser DC_Fecha1;
    private com.toedter.calendar.JDateChooser DC_Fecha2;
    private javax.swing.JScrollPane JSP_Tabla;
    private javax.swing.JPanel PBotonesConsulta;
    private javax.swing.JPanel PConsulSini;
    private javax.swing.JTable Tabla_Siniestros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    // Metodos sin eventos
    private void iniciarTabla() {
        // Inicializar las columnas de la tabla
        tabla.addColumn("Nº");
        tabla.addColumn("TIPO");
        tabla.addColumn("FECHA INICIO");
        tabla.addColumn("FECHA FIN");
        tabla.addColumn("BRIGADA");
        tabla.addColumn("CUARTEL");
        tabla.setRowCount(0);

        // Se arma el modelo de la tabla con 
        Tabla_Siniestros.setModel(tabla);
        Tabla_Siniestros.setBackground(Color.pink);
        Tabla_Siniestros.setForeground(Color.darkGray);
        Tabla_Siniestros.setSelectionBackground(Color.orange);
        Tabla_Siniestros.setSelectionForeground(Color.black);

        // Se arma el modelo del panel contenedor de la tabla
        PConsulSini.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                "Siniestros e Incidentes", TitledBorder.CENTER, TitledBorder.TOP));
        TableColumn column = null;
        for (int i = 0; i < 6; i++) {
            column = Tabla_Siniestros.getColumnModel().getColumn(i);
            switch(i){
                case 0: column.setMinWidth(15); 
                column.setMaxWidth(20);break;
                case 1: column.setMinWidth(60); 
                column.setMaxWidth(150);break;
                case 2: column.setMinWidth(125); 
                column.setMaxWidth(130);break;
                case 3: column.setMinWidth(60); 
                column.setMaxWidth(70);break;
                case 4: column.setMinWidth(50); 
                column.setMaxWidth(60);break;
                case 5: column.setMinWidth(100); break;      
            }
        }
    }

    private void rellenarTabla(LocalDateTime fecha1, LocalDateTime fecha2) {
        // Limpiamos la tabla
        borrarFilas();
        // Inicialización de variables
        SiniestroData sinD = new SiniestroData();
        BrigadaData brigD = new BrigadaData();
        CuartelData cuarD = new CuartelData();
        Brigada brig = null;
        Cuartel cuar = null;
        String resolucion = "En Curso";
        final DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        // Carga de la tabla
        for (Siniestro sin : sinD.listarSiniestrosXFecha(fecha1, fecha2)) {
            brig = brigD.buscarBrigada(sin.getBrigada().getCodBrigada());
            cuar = cuarD.buscarCuartel(brig.getCodCuartel().getCodCuartel());
            if (sin.getFechaResoluc() != null) {
                resolucion = sin.getFechaResoluc().toString();
            } else {
                resolucion = "En Curso";
            }
            tabla.addRow(new Object[]{sin.getCodSiniestro(), sin.getTipo().name(), sin.getFechaSinietro().format(formatoFecha),
                resolucion, brig.getNombreBrigada(), cuar.getNombreCuartel()});
        }
    }

    private void borrarFilas() {
        int filas = Tabla_Siniestros.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            tabla.removeRow(filas);
        }
    }
}
