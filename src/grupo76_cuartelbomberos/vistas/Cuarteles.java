/*
 se identifica con un código de cuartel, nombre de cuartel, domicilio de funcionamiento, 
entre coordenadas 1 y 2 que se ubica, así como su teléfono, y correo electrónico. 
Muchas brigadas pertenecen a un único cuartel de bomberos, quien se encarga de asignarlas a los 
diversos siniestros que acontezcan.
 */
package grupo76_cuartelbomberos.vistas;

import grupo76_cuartelbomberos.coneccion.CuartelData;
import grupo76_cuartelbomberos.entidades.Cuartel;
import static grupo76_cuartelbomberos.vistas.ViewMenu.restaurarFondo;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author JPBago
 */
public class Cuarteles extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cuarteles
     */
    public Cuarteles() {
        initComponents();
        inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextNomCuar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextDomicilio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextCoordX = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextCoordY = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TextCorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TextCaracteristicaCel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TextCelu = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        BNuevoCuartel = new javax.swing.JButton();
        BSalirCuar = new javax.swing.JButton();
        BModifCuartel = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();
        BBuscarCuartel = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();
        BLimpiar = new javax.swing.JButton();

        setTitle("Detalles Cuarteles");
        setPreferredSize(new java.awt.Dimension(550, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Detalles Cuartel");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Codigo Cuartel : ");

        TextId.setEditable(false);
        TextId.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nombre del Cuartel : ");

        TextNomCuar.setEditable(false);
        TextNomCuar.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Domicilio:");

        TextDomicilio.setEditable(false);
        TextDomicilio.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Coordenada X:");

        TextCoordX.setEditable(false);
        TextCoordX.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Coordenada Y : ");

        TextCoordY.setEditable(false);
        TextCoordY.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Correo : ");

        TextCorreo.setEditable(false);
        TextCorreo.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Celular : ");

        TextCaracteristicaCel.setEditable(false);
        TextCaracteristicaCel.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("+54 (");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText(") - 15");

        TextCelu.setEditable(false);
        TextCelu.setOpaque(false);
        TextCelu.setPreferredSize(new java.awt.Dimension(30, 25));

        BNuevoCuartel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BNuevoCuartel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/Nuevo cuartel.png"))); // NOI18N
        BNuevoCuartel.setText("  Nuevo ");
        BNuevoCuartel.setEnabled(false);
        BNuevoCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoCuartelActionPerformed(evt);
            }
        });

        BSalirCuar.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BSalirCuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/salida-de-emergencia.png"))); // NOI18N
        BSalirCuar.setText("   Salir");
        BSalirCuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirCuarActionPerformed(evt);
            }
        });

        BModifCuartel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BModifCuartel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/Guardar.png"))); // NOI18N
        BModifCuartel.setText("  Modificar");
        BModifCuartel.setEnabled(false);
        BModifCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModifCuartelActionPerformed(evt);
            }
        });

        BEliminar.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/papelera-de-reciclaje.png"))); // NOI18N
        BEliminar.setText("  Eliminar ");
        BEliminar.setEnabled(false);
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });

        BBuscarCuartel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BBuscarCuartel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/buscar (3).png"))); // NOI18N
        BBuscarCuartel.setText("   Buscar");
        BBuscarCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarCuartelActionPerformed(evt);
            }
        });

        BCancelar.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/Cancelar1.png"))); // NOI18N
        BCancelar.setText("  Cancelar");
        BCancelar.setEnabled(false);
        BCancelar.setMaximumSize(new java.awt.Dimension(139, 33));
        BCancelar.setMinimumSize(new java.awt.Dimension(139, 33));
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });

        BLimpiar.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/limpieza-de-datos (1).png"))); // NOI18N
        BLimpiar.setText("  Limpiar");
        BLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BSalirCuar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BBuscarCuartel, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(BNuevoCuartel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BModifCuartel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BBuscarCuartel)
                .addGap(18, 18, 18)
                .addComponent(BNuevoCuartel)
                .addGap(18, 18, 18)
                .addComponent(BModifCuartel)
                .addGap(18, 18, 18)
                .addComponent(BEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(BCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(BSalirCuar)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                .addGap(104, 104, 104))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TextCoordY, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextCoordX, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextDomicilio, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TextCaracteristicaCel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextCelu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TextNomCuar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(TextNomCuar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addComponent(TextCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextCelu, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextCaracteristicaCel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSalirCuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirCuarActionPerformed

//        restaurarFondo();
//        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_BSalirCuarActionPerformed

    private void BBuscarCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarCuartelActionPerformed
        // Activamos botones adicionales
        BLimpiar.setEnabled(true);
        BLimpiar.setVisible(true);
        BCancelar.setVisible(true);
        BCancelar.setEnabled(true);

        // Buscamos el cuartel segun el ID y/o nombre ingresado:
        CuartelData cuarD = new CuartelData();
        Cuartel cuar = new Cuartel();
        String nombre = null;
        int ID = 0;

        nombre = TextNomCuar.getText();
        try {
            ID = Integer.parseInt(TextId.getText());
        } catch (Exception e) {
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Escriba el ID de forma numerica.\n");
                return;
            }
        }

        if (ID != 0 && !nombre.isEmpty()) {
            cuar = cuarD.buscarCuartel(ID, nombre);
        } else if (!nombre.isEmpty()) {
            cuar = cuarD.buscarCuartel(nombre);
        } else {
            cuar = cuarD.buscarCuartel(ID);
        }

        if (cuar != null) {
            rellenarCampos(cuar);
            BModifCuartel.setEnabled(true);
            BModifCuartel.setVisible(true);
            BEliminar.setEnabled(true);
            BEliminar.setVisible(true);
            BNuevoCuartel.setEnabled(false);
            BNuevoCuartel.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "No hay un cuartel con esos datos, \npuede ingresar uno nuevo");
            TextDomicilio.setText("");
            TextCaracteristicaCel.setText("");
            TextCelu.setText("");
            TextCorreo.setText(" ");
            TextCoordX.setText("");
            TextCoordY.setText("");
            BModifCuartel.setEnabled(false);
            BModifCuartel.setVisible(false);
            BEliminar.setEnabled(false);
            BEliminar.setVisible(false);
            BNuevoCuartel.setEnabled(true);
            BNuevoCuartel.setVisible(true);
            habilitarCampos();
        }
    }//GEN-LAST:event_BBuscarCuartelActionPerformed

    private void BNuevoCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoCuartelActionPerformed
        CuartelData cuarD = new CuartelData();
        Cuartel cuar = new Cuartel();
        String nombre, dir, mail, tel;
        int ID = 0;
        try {
            ID = Integer.parseInt(TextId.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba el ID de forma numérica.",
                    "Error ID", 2, frameIcon);
            return;
        }

        if ((cuar = cuarD.buscarCuartel(ID)) != null) {
            JOptionPane.showMessageDialog(this, "Ya existe un cuartel con ID = " + ID,
                    "Error ID", 2, frameIcon);
            return;
        }

        nombre = TextNomCuar.getText();
        if (validarNombre(nombre)) {
            if ((cuar = cuarD.buscarCuartel(nombre)) != null) {
                JOptionPane.showMessageDialog(this, "El cuartel " + nombre + " ya "
                        + "está registrado.\n", "Error Nombre", 2, frameIcon);
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un Nombre válido.",
                    "Error Nombre", 2, frameIcon);
            return;
        }

        dir = TextDomicilio.getText();
        if (!validarDir(dir)) {
            JOptionPane.showMessageDialog(this, "Ingrese un Domicilio válido.",
                    "Error Domicilio", 2, frameIcon);
            return;
        }

        double X = 0, Y = 0;
        try {
            X = Double.parseDouble(TextCoordX.getText());
            Y = Double.parseDouble(TextCoordY.getText());
        } catch (ClassCastException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese las Coordenadas usando decimales.",
                    "Error Coordenadas", 2, frameIcon);
            return;
        }

        tel = validarTelefono();
        if (tel == null) {
            return;
        }

        mail = TextCorreo.getText();
        if (!validarEmail(mail)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un Email válido.",
                    "Error Correo", 2, frameIcon);
            return;
        }

        cuar.setNombreCuartel(nombre);
        cuar.setDireccion(dir);
        cuar.setCoord_X(X);
        cuar.setCoord_Y(Y);
        cuar.setTelefono(tel);
        cuar.setEmail(mail);
        ID = cuarD.guardarCuartel(cuar);

        JOptionPane.showMessageDialog(this, "El ID de los cuarteles se genera automáticamente.\n"
                + "Se genero el Cuartel nuevo con cód: "+ID,
                "EXITO !!", 2, frameIcon);
        inicializar();
        return;
    }//GEN-LAST:event_BNuevoCuartelActionPerformed

    private void BModifCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModifCuartelActionPerformed

    }//GEN-LAST:event_BModifCuartelActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        inicializar();
    }//GEN-LAST:event_BCancelarActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
//        CuartelData cuaData = new CuartelData();
//        Cuartel cua = new Cuartel();
//        int confirmacion = JOptionPane.showConfirmDialog(null, "¿De verdad querés remover este cuartel?", "Confirma", JOptionPane.YES_NO_OPTION);
//        if (confirmacion == JOptionPane.YES_OPTION) {
//            int cuaId = Integer.parseInt(TextId.getText());
//            cuaData.eliminarCuartel(cuaId);
//            inicializar();
//        }
    }//GEN-LAST:event_BEliminarActionPerformed

    private void BLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_BLimpiarActionPerformed

    private void limpiarCampos() {
        TextId.setText("");
        TextNomCuar.setText("");
        TextDomicilio.setText("");
        TextCaracteristicaCel.setText("");
        TextCelu.setText("");
        TextCorreo.setText(" ");
        TextCoordX.setText("");
        TextCoordY.setText("");
    }

    private void dividirCel(String cel) {
        try {
            String[] division = cel.split("-");
            TextCaracteristicaCel.setText(division[0]);
            TextCelu.setText(division[1]);
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        }
    }

    private void rellenarCampos(Cuartel cuartel) {
        limpiarCampos();

        TextId.setText(cuartel.getCodCuartel() + "");
        TextNomCuar.setText(cuartel.getNombreCuartel() + "");
        dividirCel(cuartel.getTelefono() + "");
        TextDomicilio.setText(cuartel.getDireccion() + "");
        TextCoordX.setText(String.valueOf(cuartel.getCoord_X()));
        TextCoordY.setText(String.valueOf(cuartel.getCoord_Y()));
        TextCorreo.setText(cuartel.getEmail());

    }

    private static boolean validarNombre(String s) {
        if (s == null) {
            return false;
        }
        char c;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isLetter(c) || c == ' ') {
                flag = true;
            } else {
                return false;
            }
        }
        return flag;
    }

    private static boolean validarDir(String s) {
        if (s == null) {
            return false;
        }
        char c;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isLetter(c) || Character.isDigit(c) || c == ' ' || c == '.') {
                flag = true;
            } else {
                return false;
            }
        }
        return flag;
    }

    private boolean validarEmail(String s) {
        if (s == null || s.equals("")) {
            return false;
        }
        char c;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == '@' || c == '.') {
                flag = true;
            } else {
                return false;
            }
        }
        return flag;
    }

    private String validarTelefono() {
        String[] codigos = {"11", "261", "264", "266", "280", "2901", "2920",
            "2954", "2966", "299", "342", "343", "351", "362", "370", "376",
            "379", "380", "381", "383", "385", "387", "388"};

        String codArea = TextCaracteristicaCel.getText(), cuerpoNum = TextCelu.getText();

        // Se verifican q los campos no esten vacios
        if (codArea.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un Código de Área",
                    "Error Código de Area", 2, frameIcon);
            return null;
        } else if (cuerpoNum.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un Número de Teléfono",
                    "Error Número Telefónico", 2, frameIcon);
            return null;
        }

        // Se valida el código de área en base al array con los códigos cargados 
        if (!Arrays.asList(codigos).contains(codArea)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un Código de Área"
                    + " válido", "Error Código de Area", 2, frameIcon);
            return null;
        }

        // Se valida los campos como numéricos
        try {
            Integer.parseInt(codArea);
            Integer.parseInt(cuerpoNum);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No puede ingresar carácteres",
                    "Error Número Telefónico", 2, frameIcon);
            return null;
        }

        // Verificar si la longitud total es igual a 10
        int longitudTotal = codArea.length() + cuerpoNum.length();
        if (longitudTotal != 10) {
            JOptionPane.showMessageDialog(this, "Verifique el Número Telefónico",
                    "Error Número Telefónico", 2, frameIcon);
            return null;
        }

        // Si pasa todas las verificaciones, el número es válido
        return codArea + "-" + cuerpoNum;
    }

    private void inicializar() {
        limpiarCampos();

        TextId.setEditable(true);
        TextNomCuar.setEditable(true);
        TextDomicilio.setEditable(false);
        TextCaracteristicaCel.setEditable(false);
        TextCelu.setEditable(false);
        TextCorreo.setEditable(false);
        TextCoordX.setEditable(false);
        TextCoordY.setEditable(false);

        TextId.setOpaque(true);
        TextNomCuar.setOpaque(true);
        TextDomicilio.setOpaque(false);
        TextCaracteristicaCel.setOpaque(false);
        TextCelu.setOpaque(false);
        TextCorreo.setOpaque(false);
        TextCoordX.setOpaque(false);
        TextCoordY.setOpaque(false);

        BBuscarCuartel.setEnabled(true);
        BNuevoCuartel.setEnabled(true);
        BModifCuartel.setEnabled(false);
        BEliminar.setEnabled(false);
        BLimpiar.setEnabled(false);
        BCancelar.setEnabled(false);

        BBuscarCuartel.setVisible(true);
        BNuevoCuartel.setVisible(true);
        BModifCuartel.setVisible(false);
        BLimpiar.setVisible(false);
        BEliminar.setVisible(false);
        BCancelar.setVisible(false);
    }

    private void habilitarCampos() {
        TextDomicilio.setEditable(true);
        TextCaracteristicaCel.setEditable(true);
        TextCelu.setEditable(true);
        TextCorreo.setEditable(true);
        TextCoordX.setEditable(true);
        TextCoordY.setEditable(true);

        TextDomicilio.setOpaque(true);
        TextCaracteristicaCel.setOpaque(true);
        TextCelu.setOpaque(true);
        TextCorreo.setOpaque(true);
        TextCoordX.setOpaque(true);
        TextCoordY.setOpaque(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscarCuartel;
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BLimpiar;
    private javax.swing.JButton BModifCuartel;
    private javax.swing.JButton BNuevoCuartel;
    private javax.swing.JButton BSalirCuar;
    private javax.swing.JTextField TextCaracteristicaCel;
    private javax.swing.JTextField TextCelu;
    private javax.swing.JTextField TextCoordX;
    private javax.swing.JTextField TextCoordY;
    private javax.swing.JTextField TextCorreo;
    private javax.swing.JTextField TextDomicilio;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextField TextNomCuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
