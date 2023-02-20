package metalblocksapp;
import javax.swing.JOptionPane;
public class FrmPrincipal extends javax.swing.JFrame {    
    public FrmPrincipal() {
        initComponents();      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMensajeCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGenerarCodigo = new javax.swing.JButton();
        txtComprobar = new javax.swing.JTextField();
        btnComprobar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCodigoGenerado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 0)), "METAL BLOCKS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Engravers MT", 0, 36), new java.awt.Color(204, 204, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(204, 204, 0));

        lblMensajeCodigo.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        lblMensajeCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblMensajeCodigo.setText("CODIGO GENERADO:");
        lblMensajeCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 102, 0)));

        jLabel3.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INGRESE CÓDIGO:");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 102, 0)));

        btnGenerarCodigo.setBackground(new java.awt.Color(51, 51, 0));
        btnGenerarCodigo.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        btnGenerarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarCodigo.setText("GENERAR CODIGO");
        btnGenerarCodigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 102, 0)));
        btnGenerarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCodigoActionPerformed(evt);
            }
        });

        txtComprobar.setBackground(new java.awt.Color(0, 0, 0));
        txtComprobar.setForeground(new java.awt.Color(255, 255, 255));
        txtComprobar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtComprobar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0)));

        btnComprobar.setBackground(new java.awt.Color(51, 51, 0));
        btnComprobar.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        btnComprobar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprobar.setText("COMPROBAR");
        btnComprobar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(51, 51, 0)));
        btnComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 0), null, null));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metalblocksapp/Logo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COMPROMETIDOS CON SU SEGURIDAD");

        jLabel5.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Y COMODIDAD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        lblCodigoGenerado.setBackground(new java.awt.Color(255, 255, 255));
        lblCodigoGenerado.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigoGenerado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigoGenerado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblMensajeCodigo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoGenerado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGenerarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensajeCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnGenerarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoGenerado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarActionPerformed
        //SE CREA UNA INSTANCIA PARA USAR EL MÉTODO QUE COMPRUBA EL CÓDIGO
        Ingreso in=new Ingreso();
        //SE GUARDA EN VERIFICAR, SI SON IGUALES RETORNA UN CERO, SI SON DIFERENTES UN -1 O 1
        //SE ENVÍA LA INFORMACIÓN DE AMBOS RECUADROS DE TEXTO COMO ARGUMENTO PARA COMPARAR
        int verificar1=in.comprobarCodigo(lblCodigoGenerado.getText(), txtComprobar.getText());
        //COMPOBAR QUE SE HAYA GENERADO UN CODIGO
        int verificar2=txtComprobar.getText().compareTo("");
        //MEDIANTE UN IF PODEMOS VERIFICAR QUE EL CODIGO ES CORRECTO
        if(verificar1==0&&verificar2!=0){
            //SI EL CODIGO ES CORRECTO SE CREA EL MENU QUE PERMITE EL INGRESO DE DATOS
            FrmMenu fm=new FrmMenu();
            //HACEMOS QUE LA PANTALLA A DESPLEGAR SEA VISIBLE
            fm.setVisible(true);
            //COLOCAMOS LA PANTALLA EN LA MITAD DE LA PANTALLA
            fm.setLocationRelativeTo(null);
            //LIMPIAMOS EL LABEL Y EL TEXTO
            lblCodigoGenerado.setText("");
            txtComprobar.setText("");
        }
        //CASO CONTRARIO SE DEBE INGRESAR DE NUEVO
        else error();
    }//GEN-LAST:event_btnComprobarActionPerformed

    private void btnGenerarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCodigoActionPerformed
        //SE CREA UNA INSTANCIA CON EL MÉTODO QUE GENERA EL CÓDIGO
        Ingreso in=new Ingreso();
        //SE GUARDA EN UN INT EL CÓDIGO QUE SE GENERÓ
        int cdgGenerado=in.generarCodigo();
        //INGRESAMOS EL CODIGO GENERADO AL CUADRO DE TEXTO
        lblCodigoGenerado.setText(String.valueOf(cdgGenerado));
    }//GEN-LAST:event_btnGenerarCodigoActionPerformed
    
    public void error(){
        //CREAR STRING PARA QUE SE MUESTRE EN EL RECUADRO DE ERROR
        String mensajeError="EL CODIGO INGRESADO NO ES CORRECTO O AUN NO SE HA GENERADO UNO";
        String tituloError="ACCESO DENEGADO";
        JOptionPane.showMessageDialog(rootPane, mensajeError, tituloError, HEIGHT);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprobar;
    private javax.swing.JButton btnGenerarCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCodigoGenerado;
    private javax.swing.JLabel lblMensajeCodigo;
    private javax.swing.JTextField txtComprobar;
    // End of variables declaration//GEN-END:variables
}
