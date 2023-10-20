

package grupo76_cuartelbomberos.vistas;
import grupo76_cuartelbomberos.coneccion.BomberoData;
import grupo76_cuartelbomberos.entidades.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;


public class GestionBomber extends javax.swing.JInternalFrame {

     
    public GestionBomber() {
        initComponents();
        cargarComboSanguineo ();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FechaNaci = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        TextDni = new javax.swing.JTextField();
        TextApeNom = new javax.swing.JTextField();
        TextCaracteristicaCel = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextCelu = new javax.swing.JTextField();
        CBSanguineo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        BBuscarBomberxID = new javax.swing.JButton();
        BNuevoBomber = new javax.swing.JButton();
        BModiBomber = new javax.swing.JButton();
        BLimpBomber = new javax.swing.JButton();
        BEliminarBomber = new javax.swing.JButton();
        BSalirBom = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        LabelEstado = new javax.swing.JLabel();

        jLabel13.setText("jLabel13");

        setTitle("Datos Bomberos");
        setPreferredSize(new java.awt.Dimension(425, 550));
        setVerifyInputWhenFocusTarget(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("ID : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 47, 15));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Datos de Bomberos Voluntarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("DNI : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Apellido y  Nombre : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Grupo Sanguineo: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 20));

        FechaNaci.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(FechaNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 162, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Celular : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 70, 17));

        TextId.setMinimumSize(new java.awt.Dimension(30, 25));
        TextId.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(TextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 160, -1));

        TextDni.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(TextDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 162, -1));

        TextApeNom.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(TextApeNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 162, -1));

        TextCaracteristicaCel.setPreferredSize(new java.awt.Dimension(6, 25));
        getContentPane().add(TextCaracteristicaCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 30, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 321, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("+54 (");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, 19));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText(") - 15");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 40, 20));

        TextCelu.setPreferredSize(new java.awt.Dimension(20, 25));
        getContentPane().add(TextCelu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 64, -1));

        CBSanguineo.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(CBSanguineo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 162, -1));

        BBuscarBomberxID.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BBuscarBomberxID.setText("Buscar por ID:");
        BBuscarBomberxID.setPreferredSize(new java.awt.Dimension(100, 20));
        BBuscarBomberxID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarBomberxIDActionPerformed(evt);
            }
        });

        BNuevoBomber.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BNuevoBomber.setText("Nuevo");
        BNuevoBomber.setPreferredSize(new java.awt.Dimension(100, 20));
        BNuevoBomber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoBomberActionPerformed(evt);
            }
        });

        BModiBomber.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BModiBomber.setText("Modificar");
        BModiBomber.setPreferredSize(new java.awt.Dimension(100, 20));
        BModiBomber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModiBomberActionPerformed(evt);
            }
        });

        BLimpBomber.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BLimpBomber.setText("Limpiar");
        BLimpBomber.setPreferredSize(new java.awt.Dimension(100, 20));
        BLimpBomber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpBomberActionPerformed(evt);
            }
        });

        BEliminarBomber.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BEliminarBomber.setText("Eliminar");
        BEliminarBomber.setPreferredSize(new java.awt.Dimension(100, 20));
        BEliminarBomber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarBomberActionPerformed(evt);
            }
        });

        BSalirBom.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        BSalirBom.setText("Salir");
        BSalirBom.setPreferredSize(new java.awt.Dimension(100, 20));
        BSalirBom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirBomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BLimpBomber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BModiBomber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BNuevoBomber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BBuscarBomberxID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(BEliminarBomber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BSalirBom, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BBuscarBomberxID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BNuevoBomber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BModiBomber, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BLimpBomber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BEliminarBomber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(BSalirBom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 150, 380));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Estado:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        LabelEstado.setText("Estado no asignado.");
        getContentPane().add(LabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 160, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BLimpBomberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimpBomberActionPerformed
    
          borrarCampos();
        
    }//GEN-LAST:event_BLimpBomberActionPerformed

    private void BSalirBomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirBomActionPerformed
        
        ViewMenu ventana = new ViewMenu();
        ventana.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BSalirBomActionPerformed

    private void BNuevoBomberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoBomberActionPerformed
        
        BomberoData bom = new BomberoData();
        Bomberos bomber =new Bomberos ();
        
        int bomId = 0;
        int bomDni = 0;
        
        if (TextId.getText().compareTo("")!= 0){
            
            try {
                  bomId = Integer.parseInt (TextId.getText ());
                  bomDni = Integer.parseInt (TextDni.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar solo números enteros.");  
            }
            bomber.setCodBombero(bomId);
            bomber.setDNI(bomDni);
            } else { 
            try {
                  bomDni = Integer.parseInt (TextDni.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar solo números enteros.");  
            }
            bomber.setDNI(bomDni);
        }
        String apeNom = TextApeNom.getText();
        if (!validarString(apeNom)) {
            JOptionPane.showMessageDialog(this, "Ingrese caracteres Validos.");
            return;
        }
        bomber.setNombreApe(apeNom);
        String GrupoSan = (String) CBSanguineo.getSelectedItem();
        if (GrupoSan == null){
        } else { 
            JOptionPane.showMessageDialog(this, "Debe seleccionar una opción");
            return;
        }
        bomber.setGrupoSang(GrupoSan);
        
        LocalDate cumple;
        try{
            cumple = FechaNaci.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (NullPointerException e){
            JOptionPane.showMessageDialog(this, "Ingrese una fecha válida");
            return;
        }
        bomber.setFechaNac(cumple);
        
        String celular = null ;
        validarTelefono ();
        
        if  (celular != null){
           bomber.setCelular(celular);
        }else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un Numero de Telefono.");
        }
        bom.guardarBombero(bomber);
        borrarCampos ();
        
    }//GEN-LAST:event_BNuevoBomberActionPerformed

    private void BBuscarBomberxIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarBomberxIDActionPerformed

        // Buscamos el bombero segun el ID ingresado:
        int numId;

        try {
            numId = Integer.parseInt(TextId.getText());
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número de ID valido.");
            borrarCampos();
            return;
        }

        BomberoData bombId = new BomberoData();
        Bomberos bomb = bombId.buscarBombero(numId);

        // Rellenamos el resto de los campos segun la búsqueda obtenida
       rellenarCampos(bomb);
       borrarCampos ();
    }//GEN-LAST:event_BBuscarBomberxIDActionPerformed

    private void BModiBomberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModiBomberActionPerformed
        
        BomberoData bomber = new BomberoData () ;
        Bomberos bom = new Bomberos () ;
        int bomberCod, bomDni ;
        
        
        try {
            bomberCod = Integer.parseInt(TextId.getText());
            bomDni = Integer.parseInt(TextDni.getText());
  
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Caracteres invalidos, porfavor ingrese números enteros solamente.");
            return;  
        }
         bom.setCodBombero(bomberCod);
         bom.setDNI(bomDni);
         
         String apeNom = TextApeNom.getText();
        if (!validarString(apeNom)) {
            JOptionPane.showMessageDialog(this, "Caracteres invalidos, porfavor ingrese letras unicamente.");
            return;
        }
        bom.setNombreApe(apeNom);
        String GrupoSan = (String) CBSanguineo.getSelectedItem();
        if (GrupoSan == null){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una opción");
       }
        bom.setGrupoSang(GrupoSan);
        LocalDate cumple ;
        try{
            cumple = FechaNaci.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (NullPointerException e){
            JOptionPane.showMessageDialog(this, "Ingrese una fecha válida");
            return;
        }
         bom.setFechaNac(cumple);
        String celular = null ;
        validarTelefono ();
        
        if  (celular != null){
           bom.setCelular(celular);
        }else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un Numero de Telefono.");
        }
        
        
        bomber.ActualizarBombero(bom);
        borrarCampos();
        
              
        
       
    }//GEN-LAST:event_BModiBomberActionPerformed

    private void BEliminarBomberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarBomberActionPerformed

            BomberoData bomber = new BomberoData ();
            int bomId = Integer.parseInt(TextId.getText());
            
            bomber.eliminarBombero(bomId);
            borrarCampos();
            
      
    }//GEN-LAST:event_BEliminarBomberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscarBomberxID;
    private javax.swing.JButton BEliminarBomber;
    private javax.swing.JButton BLimpBomber;
    private javax.swing.JButton BModiBomber;
    private javax.swing.JButton BNuevoBomber;
    private javax.swing.JButton BSalirBom;
    private javax.swing.JComboBox<String> CBSanguineo;
    private com.toedter.calendar.JDateChooser FechaNaci;
    private javax.swing.JLabel LabelEstado;
    private javax.swing.JTextField TextApeNom;
    private javax.swing.JTextField TextCaracteristicaCel;
    private javax.swing.JTextField TextCelu;
    private javax.swing.JTextField TextDni;
    private javax.swing.JTextField TextId;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables


    private void borrarCampos (){
        TextId.setText("");
        TextDni.setText ("");
        TextApeNom.setText("");
        CBSanguineo.setSelectedIndex(-1);
        FechaNaci.setDate(null);
        TextCaracteristicaCel.setText ("");
        TextCelu.setText("");
        LabelEstado.setText (" ------ ");
}


    private void cargarComboSanguineo(){
      
        CBSanguineo.addItem("(A+)");
        CBSanguineo.addItem("(A-)");
        CBSanguineo.addItem("(B+)");
        CBSanguineo.addItem("(B-)");
        CBSanguineo.addItem("(AB+)");
        CBSanguineo.addItem("(AB-)");
        CBSanguineo.addItem("(O+)");
        CBSanguineo.addItem("(O-)");
        
        CBSanguineo.setSelectedIndex(-1);
    }
    
    private void rellenarCampos (Bomberos bomber){
        
        if (bomber != null ) {
        TextId.setText(bomber.getCodBombero()+ "");
        TextDni.setText(bomber.getDNI()+ "");
        TextApeNom.setText(bomber.getNombreApe()+"");
        CBSanguineo.setSelectedItem(bomber.getGrupoSang()+ "");
        FechaNaci.setDate(Date.valueOf(bomber.getFechaNac() +""));
        TextCaracteristicaCel.setText(bomber.getCelular()+"");
        TextCelu.setText(bomber.getCelular()+"");
        if  (bomber.isActivo()){
            LabelEstado.setText("Bombero Activo");
        } else {
            LabelEstado.setText("Bombero Dado de Baja");
          }
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
    
    
   private String validarTelefono() {
        String[] codigos = {"11", "261", "264", "266", "280", "2901", "2920",
            "2954", "2966", "299", "342", "343", "351", "362", "370", "376",
            "379", "380", "381", "383", "385", "387", "388"};

        String codArea = TextCaracteristicaCel.getText(), cuerponum = TextCelu.getText();
        boolean valido = false;

        // Se valida el código de área en base al array con los códigos cargados
        if (codArea.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un Código de Área "
                    + "numérico", "Error Código de Area", 2, frameIcon);
        } else {
            for (String aux : codigos) {
                if (aux.equals(codArea)) {
                    valido = true;
                    break;
                }
            }
        }

        // Se valida q el largo del cuerpo del nº complete las 10 cifras según el cód. de área
        if (valido) {
            if ((codArea.length() + cuerponum.length()) == 10) {
                return codArea +"-"+ cuerponum;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un número "
                        + "telefónico válido", "Error Código de Area", 2, frameIcon);
            }
        }

        return null;
    }
}