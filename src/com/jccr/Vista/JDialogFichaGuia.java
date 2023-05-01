/*
 * JDialogFichaGuia.java
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jccr.Vista;

import Complementos.*;

/**
 * Formulario de Guias de envios de productos
 * @author Grupo 4 Plataformas de Desarrollo de Software
 * Version 1.0
 */
public class JDialogFichaGuia extends javax.swing.JDialog {

    private FormPrincipal myPrincipalForm;
    private IFormGuias myIFormGuias;
    private String nom = "";
    private int id = 0;
    private boolean editar = false; 
    
    /** Creates new form JDialogFichaProducto */
    public JDialogFichaGuia(FormPrincipal myPrincipalForm, boolean modal, 
            IFormGuias myIFormGuias, int id, boolean editar) {
        super(myPrincipalForm, modal);
        initComponents();
        this.myPrincipalForm = myPrincipalForm;
        this.myIFormGuias = myIFormGuias;
        this.id = id;
        this.editar = editar;
        this.setLocation();
        this.inicio();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProducto1 = new javax.swing.JPanel();
        apellido = new javax.swing.JLabel();
        precioComp = new javax.swing.JLabel();
        dir = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        txtOrigen = new javax.swing.JTextField();
        idnun3 = new javax.swing.JLabel();
        txtNomProducto = new javax.swing.JTextField();
        txtCantActual = new javax.swing.JTextField();
        apellido1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        idnun4 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox();
        apellido3 = new javax.swing.JLabel();
        idnun5 = new javax.swing.JLabel();
        txtComprador = new javax.swing.JTextField();
        cmdGuardarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Producto");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlProducto1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guia del Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        pnlProducto1.setName("Datos del propietario"); // NOI18N

        apellido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        apellido.setText("Fecha Compra");
        apellido.setRequestFocusEnabled(false);

        precioComp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        precioComp.setText("Origen");
        precioComp.setRequestFocusEnabled(false);

        dir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dir.setText("Destino");

        txtDestino.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDestinoKeyTyped(evt);
            }
        });

        txtOrigen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrigenKeyTyped(evt);
            }
        });

        idnun3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        idnun3.setText("Producto");
        idnun3.setRequestFocusEnabled(false);

        txtNomProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomProductoKeyPressed(evt);
            }
        });

        txtCantActual.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCantActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantActualActionPerformed(evt);
            }
        });
        txtCantActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantActualKeyTyped(evt);
            }
        });

        apellido1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        apellido1.setText("Fecha Entrega");

        txtMarca.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        idnun4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        idnun4.setText("No. Guia");
        idnun4.setRequestFocusEnabled(false);

        txtIdProducto.setEnabled(false);

        cmbEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Activo", "Inactivo" }));

        apellido3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        apellido3.setText("Estado");

        idnun5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        idnun5.setText("Comprador");
        idnun5.setRequestFocusEnabled(false);

        txtComprador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCompradorKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlProducto1Layout = new javax.swing.GroupLayout(pnlProducto1);
        pnlProducto1.setLayout(pnlProducto1Layout);
        pnlProducto1Layout.setHorizontalGroup(
            pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProducto1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProducto1Layout.createSequentialGroup()
                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantActual, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProducto1Layout.createSequentialGroup()
                        .addGroup(pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idnun4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idnun3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(precioComp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idnun5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProducto1Layout.createSequentialGroup()
                                .addComponent(txtIdProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(apellido3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtOrigen)
                            .addComponent(txtNomProducto)
                            .addComponent(txtDestino)
                            .addComponent(txtComprador))))
                .addContainerGap())
        );
        pnlProducto1Layout.setVerticalGroup(
            pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProducto1Layout.createSequentialGroup()
                .addGroup(pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnun4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnun3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnun5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioComp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmdGuardarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Guardar.png"))); // NOI18N
        cmdGuardarProducto.setText("Guardar");
        cmdGuardarProducto.setEnabled(false);
        cmdGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(cmdGuardarProducto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdGuardarProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void setLocation(){
    int height = (this.myPrincipalForm.getjdpHeight());
    int width = (this.myPrincipalForm.getjdpWidth());
    this.setLocation ((width - this.getWidth ()) / 2,(height - this.getHeight ()) / 2);
}

public final void inicio(){
    if(this.editar == false){
        this.txtIdProducto.setText(String.valueOf(this.id));
    }
    else{
        this.txtIdProducto.setText(String.valueOf(this.id));
        this.txtNomProducto.setText(this.nom);
        this.consultarProducto();
    }
}
    
public void habilitarCampos(){
    this.txtNomProducto.setEditable(false);
    //this.cmdVerificarProducto.setEnabled(false);
    this.txtDestino.setEnabled(true);
    this.cmdGuardarProducto.setEnabled(true);
    this.txtDestino.grabFocus();
}

public void deshabilitarCampos(){
    this.txtNomProducto.setEditable(true);
    //this.cmdVerificarProducto.setEnabled(true);
    this.txtDestino.setEnabled(false);
    this.cmdGuardarProducto.setEnabled(false);
}

public void limpiarCampos(){
    this.txtNomProducto.setText("");
}

public void consultarProducto(){
    /*int idProd = Integer.parseInt(this.txtIdProducto.getText());
    if(this.myPrincipalForm.getmyEmpresaVentas().verificarProductoId(idProd)){
        this.habilitarCampos();
        this.txtNomProducto.setEditable(true);
        int val = this.myPrincipalForm.getmyEmpresaVentas().buscarPrecioVentaProducto(idProd);
        int estado = this.myPrincipalForm.getmyEmpresaVentas().buscarEstadoProducto(idProd);
        this.txtPrecioVenta.setText(String.valueOf(val));
        if(estado == 1){
            this.cmbEstado.setActionCommand("A");
        }
        else{
            this.cmbEstado.setSelectedItem("I");
        }
    }
    else
        Ventana.imp("El Producto no ha sido registrado.", "SISTEMA");*/
}

private void editarProducto(){
    /*if(this.verificarCampos()){
        int tipo = 1;
        int cantMinima = 0;
        int activo = 1;
        String referencia = "";
        int idProd = Integer.parseInt(this.txtIdProducto.getText());
        String nombreProducto = this.txtNomProducto.getText();
        int precioVenta = Integer.parseInt(this.txtPrecioVenta.getText());
        int precioCompra = 0;
        int cantActual = 0;
        int cantCompra = 0;
        cantActual = cantActual + cantCompra;
        String estado = this.cmbEstado.getSelectedItem().toString();
        if(estado.equalsIgnoreCase("Activo"))
            activo = 1;
        else 
            if(estado.equalsIgnoreCase("Inactivo"))
                activo = 0;
        String msg = this.myPrincipalForm.getmyEmpresaVentas().modProductoBD(idProd, referencia, nombreProducto.toUpperCase(), 
                precioCompra, precioVenta, cantActual, cantMinima, tipo, activo);
        this.myIFormProductos.cargarTablaProductos("where activo = '1' ");
        if(msg.equalsIgnoreCase("La informacion del Producto ha sido modificada exitosamente.")){
            Ventana.imp(msg, "SISTEMA");
            this.dispose();
        }
        else
            Ventana.imp(msg, "SISTEMA");
    }*/
}

private void agregarProducto(){
    /*if(this.verificarCampos()){
        int tipoVenta = 1;
        int cantMinima = 0;
        int activo = 1;
        int idProd = Integer.parseInt(this.txtIdProducto.getText());
        String referencia = "";
        String nombreProducto = this.txtNomProducto.getText();
        int precioCompra = 0;
        int precioVenta = Integer.parseInt(this.txtPrecioVenta.getText());
        int cantActual = 0;
        String estado = this.cmbEstado.getSelectedItem().toString();
        if(estado.equalsIgnoreCase("Activo"))
            activo = 1;
        else 
            if(estado.equalsIgnoreCase("Inactivo"))
                activo = 0;
        String msg = this.myPrincipalForm.getmyEmpresaVentas().registrarProductoBD(idProd, referencia, 
                nombreProducto.toUpperCase(), precioCompra, precioVenta, cantActual, cantMinima, tipoVenta, activo);
        if(msg.equalsIgnoreCase("Producto ingresado exitosamente.")){
            Ventana.imp(msg, "SISTEMA");
            this.limpiarCampos();
            this.deshabilitarCampos();
            this.myIFormProductos.cargarTablaProductos("where activo = '1' ");
            this.dispose();
        }
        else
            Ventana.imp(msg, "SISTEMA");
    }*/
}

private boolean verificarCampos(){
    String estado = this.cmbEstado.getSelectedItem().toString();
    if(estado.equalsIgnoreCase("Seleccione")){
        Ventana.err("Seleccione el estado del producto.", "SISTEMA");
        this.cmbEstado.grabFocus();
        return false;
    }
    return true;
}

private void cmdGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarProductoActionPerformed
// TODO add your handling code here:
    if(this.editar == false){
        this.agregarProducto();
    }
    else{
        this.editarProducto();
    }
}//GEN-LAST:event_cmdGuardarProductoActionPerformed

    private void txtDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoKeyTyped

    private void txtOrigenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrigenKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrigenKeyTyped

    private void txtNomProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomProductoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomProductoKeyPressed

    private void txtCantActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantActualKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantActualKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtCompradorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCompradorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompradorKeyPressed

    private void txtCantActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantActualActionPerformed
   
    /**
    * @param args the command line arguments
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogFichaProducto dialog = new JDialogFichaProducto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel apellido1;
    private javax.swing.JLabel apellido3;
    private javax.swing.JComboBox cmbEstado;
    private javax.swing.JButton cmdGuardarProducto;
    private javax.swing.JLabel dir;
    private javax.swing.JLabel idnun3;
    private javax.swing.JLabel idnun4;
    private javax.swing.JLabel idnun5;
    private javax.swing.JPanel pnlProducto1;
    private javax.swing.JLabel precioComp;
    private javax.swing.JTextField txtCantActual;
    private javax.swing.JTextField txtComprador;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNomProducto;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables

}