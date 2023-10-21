/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo76_cuartelbomberos.vistas;

import grupo76_cuartelbomberos.coneccion.BomberoData;
import grupo76_cuartelbomberos.coneccion.BrigadaData;
import grupo76_cuartelbomberos.coneccion.CuartelData;
import grupo76_cuartelbomberos.entidades.Bomberos;
import grupo76_cuartelbomberos.entidades.Brigada;
import grupo76_cuartelbomberos.entidades.Cuartel;
import grupo76_cuartelbomberos.entidades.Especialidad;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eveel
 */
public class Brigadas extends javax.swing.JInternalFrame {
private DefaultTableModel tabla=new DefaultTableModel(){
    
    public boolean isCellEditable(int f, int c){
       
        return false;
        
    }
};
    /**
     * Creates new form Brigadas
     */
    public Brigadas() {
        initComponents();
        armarCabecera();
        cargarComboEsp();
        CargarCombo();
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
        jLabel3 = new javax.swing.JLabel();
        CBEspecialidades = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        TextBrigada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaIntBrigada = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        BotonAsignado = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        BAsignarsinie = new javax.swing.JButton();
        BotonNuevaBrigada = new javax.swing.JButton();
        BModiBrigada = new javax.swing.JButton();
        BLimpBrigada = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BSalirBrigada = new javax.swing.JButton();
        BotonLibre = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        CBCuartel = new javax.swing.JComboBox<>();
        BBuscarBrigada = new javax.swing.JButton();

        setTitle("Detalles Brigadas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Detalles Brigadas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Especialidad:");

        CBEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEspecialidadesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nombre de la Brigada :");

        TextBrigada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextBrigadaKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Integrantes de la Brigada :");

        TablaIntBrigada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Apellido", "Nombre", "ID"
            }
        ));
        jScrollPane1.setViewportView(TablaIntBrigada);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Asignado Accidente/Siniestro:");

        BotonAsignado.setText("ASIGNADO");
        BotonAsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAsignadoActionPerformed(evt);
            }
        });

        BAsignarsinie.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BAsignarsinie.setText("Asignar Siniestro");
        BAsignarsinie.setPreferredSize(new java.awt.Dimension(100, 20));

        BotonNuevaBrigada.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BotonNuevaBrigada.setText("Nuevo");
        BotonNuevaBrigada.setPreferredSize(new java.awt.Dimension(100, 20));
        BotonNuevaBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevaBrigadaActionPerformed(evt);
            }
        });

        BModiBrigada.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BModiBrigada.setText("Modificar");
        BModiBrigada.setPreferredSize(new java.awt.Dimension(100, 20));

        BLimpBrigada.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BLimpBrigada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/Limpiar.png"))); // NOI18N
        BLimpBrigada.setText("Limpiar");
        BLimpBrigada.setPreferredSize(new java.awt.Dimension(100, 20));
        BLimpBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpBrigadaActionPerformed(evt);
            }
        });

        BotonEliminar.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/eliminar.png"))); // NOI18N
        BotonEliminar.setText("Eliminar");
        BotonEliminar.setPreferredSize(new java.awt.Dimension(100, 20));
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BSalirBrigada.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BSalirBrigada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/salida.png"))); // NOI18N
        BSalirBrigada.setText("Salir");
        BSalirBrigada.setPreferredSize(new java.awt.Dimension(100, 20));
        BSalirBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirBrigadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BModiBrigada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BAsignarsinie, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(BLimpBrigada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BSalirBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotonNuevaBrigada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BAsignarsinie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonNuevaBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BModiBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BLimpBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(BSalirBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BotonLibre.setText("LIBRE");

        jLabel6.setText("CODIGO DE CUARTEL");

        CBCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCuartelActionPerformed(evt);
            }
        });

        BBuscarBrigada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/Buscar.png"))); // NOI18N
        BBuscarBrigada.setText("Buscar Brigada");
        BBuscarBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarBrigadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CBCuartel, 0, 185, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(BotonAsignado)
                                            .addGap(43, 43, 43)
                                            .addComponent(BotonLibre))
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextBrigada)
                                    .addComponent(CBEspecialidades, 0, 185, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(BBuscarBrigada, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BBuscarBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonAsignado)
                            .addComponent(BotonLibre))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAsignadoActionPerformed

        
    }//GEN-LAST:event_BotonAsignadoActionPerformed

    private void BotonNuevaBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevaBrigadaActionPerformed
        // Agregar nueva Brigada
        BrigadaData brig = new BrigadaData();
        Brigada bri = new Brigada();
        int briCuartel;
       
        String nomBri =TextBrigada.getText();
        if (!validarString (nomBri)) {
            JOptionPane.showMessageDialog(this, "Ingrese Nombre Completo y Valido");
            return;
        }
        bri.setNombreBrigada(nomBri);
        
    }//GEN-LAST:event_BotonNuevaBrigadaActionPerformed

    private void CBEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEspecialidadesActionPerformed
        borrarFilas();
        BotonAsignado.setSelected(false);
        BotonLibre.setSelected(false);
        BotonNuevaBrigada.setEnabled(false);
        BotonEliminar.setEnabled(false);
    }//GEN-LAST:event_CBEspecialidadesActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
  borrarCampos();        
        
        
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BSalirBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirBrigadaActionPerformed
        ViewMenu ventana = new ViewMenu();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BSalirBrigadaActionPerformed

    private void CBCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCuartelActionPerformed

        
    }//GEN-LAST:event_CBCuartelActionPerformed

    private void BLimpBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimpBrigadaActionPerformed
      limpiarCampos();
    }//GEN-LAST:event_BLimpBrigadaActionPerformed

    private void BBuscarBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarBrigadaActionPerformed
       borrarFilas();
        int cuartCd=0;
     try{
     cuartCd = (Integer) CBCuartel.getSelectedItem();
 
     }catch(Exception c){
         JOptionPane.showMessageDialog(this, "debe seleccionar un N° de Cuartel");
         return;
     }
    String nomBrig=TextBrigada.getText(); 
    
       if(nomBrig.isEmpty()||nomBrig.equals(" ")){
                 
           JOptionPane.showMessageDialog(this, "ingrese el nombre de la brigada.");
           return;}
       
       BrigadaData brigD=new BrigadaData();
       Brigada brig = brigD.buscarBrigadaNom(nomBrig);
        if (brig!=null) {
            JOptionPane.showMessageDialog(this, brig.getNombreBrigada());
            cargarTabla(brig);
        }else{
            JOptionPane.showMessageDialog(this, "Error al buscar Brigada.");
        }
       
    }//GEN-LAST:event_BBuscarBrigadaActionPerformed

    private void TextBrigadaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextBrigadaKeyReleased
       
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
        }
    }//GEN-LAST:event_TextBrigadaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAsignarsinie;
    private javax.swing.JButton BBuscarBrigada;
    private javax.swing.JButton BLimpBrigada;
    private javax.swing.JButton BModiBrigada;
    private javax.swing.JButton BSalirBrigada;
    private javax.swing.JRadioButton BotonAsignado;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JRadioButton BotonLibre;
    private javax.swing.JButton BotonNuevaBrigada;
    private javax.swing.JComboBox<Integer> CBCuartel;
    private javax.swing.JComboBox<Especialidad> CBEspecialidades;
    protected javax.swing.JTable TablaIntBrigada;
    private javax.swing.JTextField TextBrigada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

public void CargarCombo(){
    CuartelData cuartD = new CuartelData();
    
    for (Cuartel cuart : cuartD.listarCuartel()) {
        CBCuartel.addItem(cuart.getCodCuartel());
    }
    CBCuartel.setSelectedIndex(-1);
    borrarFilas();
}    
    
private void armarCabecera() {

        tabla.addColumn("Nombre Completo");
        tabla.addColumn("DNI");
        tabla.addColumn("Tipo Sangre");
        tabla.addColumn("Fecha Nacimiento ");
        tabla.addColumn("Celular ");
        tabla.setRowCount(0);
        TablaIntBrigada.setModel(tabla);
    }    
    
 public void cargarComboEsp() {
  
        for (Especialidad esp : Especialidad.values()) {
            CBEspecialidades.addItem(esp);
        }
        CBEspecialidades.setSelectedIndex(-1);
    }
 
 public void cargarTabla(Brigada brig){
        tabla.setRowCount(0);
     String nomBrig=brig.getNombreBrigada();
     
     borrarFilas();
     BomberoData bomD = new BomberoData();
     
     for (Bomberos  bom : bomD.listarBomberosXBrigada(nomBrig)) {
         tabla.addRow(new Object[]{bom.getNombreApe(),bom.getDNI() ,bom.getGrupoSang(),bom.getFechaNac(),bom.getCelular()});
     }
 
 }
 
 private static boolean validarString(String s) {
        if (s == null || s.equals("")) {
            return false;
        }
        char c;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == ' ') {
                flag = true;
            } else {
                return false;
            }
        }
        return flag;
    }
 
  private void limpiarCampos() {
        CBEspecialidades.setSelectedIndex(-1);
                TextBrigada.setText("");
        borrarFilas();
    }
  
  private void borrarFilas() {
        int filas = TablaIntBrigada.getRowCount() - 1;
//        if (filas > 0) {
            for (; filas >= 0; filas--) {
                tabla.removeRow(filas);
            }
//        }
    }
  
  private void iniciarTabla() {
        //Inicializar las columnas de la tabla
        tabla.addColumn(" COD ");
        tabla.addColumn("Nombre");
        tabla.addColumn("Cuartel");
        tabla.addColumn("Distancia (Kmts)");
        tabla.setRowCount(0);

        TablaIntBrigada.setModel(tabla);
        TablaIntBrigada.setBackground(Color.gray);
        TablaIntBrigada.setForeground(Color.white);
        TablaIntBrigada.setSelectionBackground(Color.green);
        TablaIntBrigada.setSelectionForeground(Color.black);

    }  
  private void borrarCampos() {
        TextBrigada.setText("");
        
    }
}