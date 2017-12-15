
package Grafica;

import Controlador.Conexion;
import Controlador.Registro;
import Modelo.Chocolate;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Agregar extends javax.swing.JFrame {


    public Agregar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextCodigo = new javax.swing.JTextField();
        TextNombre = new javax.swing.JTextField();
        TextPrecioVenta = new javax.swing.JTextField();
        TextCantidad = new javax.swing.JTextField();
        ComboTipo = new javax.swing.JComboBox<>();
        ComboSabor = new javax.swing.JComboBox<>();
        ComboMarca = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaDescripcion = new javax.swing.JTextArea();
        Button1 = new javax.swing.JRadioButton();
        Button2 = new javax.swing.JRadioButton();
        Volver = new javax.swing.JToggleButton();
        Grabar = new javax.swing.JToggleButton();
        Limpiar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresar Productos");

        jLabel2.setText("Código");

        jLabel3.setText("Nombre");

        jLabel4.setText("Descripción");

        jLabel5.setText("Precio venta");

        jLabel6.setText("Cantidad");

        jLabel7.setText("Tipo Chocolate");

        jLabel8.setText("Sabor Chocolate");

        jLabel9.setText("Marca");

        jLabel10.setText("Azúcar");

        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Blanco", "Negro", "Con Fruta" }));

        ComboSabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Chocolate Bitter", "Chocolate de Leche", "Chocolate Blanco" }));
        ComboSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboSaborActionPerformed(evt);
            }
        });

        ComboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Nestlé", "Costa", "LaFete", "Entrelagos" }));

        TextAreaDescripcion.setColumns(20);
        TextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(TextAreaDescripcion);

        buttonGroup1.add(Button1);
        Button1.setText("Si");

        buttonGroup1.add(Button2);
        Button2.setText("No");

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Grabar.setText("Grabar");
        Grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrabarActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4))))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextCodigo)
                                    .addComponent(TextNombre)
                                    .addComponent(TextPrecioVenta)
                                    .addComponent(TextCantidad)
                                    .addComponent(ComboTipo, 0, 169, Short.MAX_VALUE)
                                    .addComponent(ComboSabor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(Button1)
                                        .addGap(18, 18, 18)
                                        .addComponent(Button2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Grabar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Limpiar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Volver)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grabar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TextPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Limpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button1)
                        .addComponent(Button2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Volver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        MenuInicio menu = new MenuInicio();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VolverActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        TextAreaDescripcion.setText(null);
        TextCantidad.setText(null);
        TextCodigo.setText(null);
        TextNombre.setText(null);
        TextPrecioVenta.setText(null);
        ComboMarca.setSelectedIndex(0);
        ComboSabor.setSelectedIndex(0);
        ComboTipo.setSelectedIndex(0);
        TextAreaDescripcion.setText(null);
       
 
    }//GEN-LAST:event_LimpiarActionPerformed

    private void GrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrabarActionPerformed
        
        int codigo = Integer.parseInt(TextCodigo.getText());
        String nombre = TextNombre.getText();
        int precio = Integer.parseInt(TextPrecioVenta.getText());
        int cantidad = Integer.parseInt(TextCantidad.getText());
        String tipo = ComboTipo.getSelectedItem().toString();
        String sabor = ComboSabor.getSelectedItem().toString();
        String marca = ComboMarca.getSelectedItem().toString();
        String descripcion = TextAreaDescripcion.getText();
        boolean azucar = Button1.isSelected();
        
       //if  (Integer.parseInt(TextCodigo.getText()) >99 && Integer.parseInt(TextCodigo.getText()) <1000 ){
            //JOptionPane.showMessageDialog(null, "Codigó solo de 3 dígitos");
            //}else{
            //JOptionPane.showMessageDialog(null, "Operación realizada correctamente");}
        /*}if (TextNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Falta completar campo Nombre");
            }if (TextAreaDescripcion.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo descripción esta vació, por favor completar");        
                }if (Integer.parseInt(TextPrecioVenta.getText()) <=0){
                JOptionPane.showMessageDialog(null, "Valor tiene que ser mayor a 0");    
                    }if (Integer.parseInt(TextCantidad.getText()) <=0){
                    JOptionPane.showMessageDialog(null, "Cantidad no puede tener valor 0 o menor");     
                        }*/
        
        //Object datos [] = {codigo, nombre, descripcion, precio, cantidad, tipo, sabor, marca,azucar};
        
        Chocolate chocolate = new Chocolate(codigo, nombre, descripcion, precio, cantidad, tipo, sabor, marca,azucar);
        Connection conexion = Conexion.getConnection();
        try {
            Registro.getInstance().agregar(chocolate);
           JOptionPane.showMessageDialog(null, "Operación realizada correctamente"); 
        } catch (SQLException ex) {
            Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_GrabarActionPerformed

    private void ComboSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboSaborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboSaborActionPerformed
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Button1;
    private javax.swing.JRadioButton Button2;
    private javax.swing.JComboBox<String> ComboMarca;
    private javax.swing.JComboBox<String> ComboSabor;
    private javax.swing.JComboBox<String> ComboTipo;
    private javax.swing.JToggleButton Grabar;
    private javax.swing.JToggleButton Limpiar;
    private javax.swing.JTextArea TextAreaDescripcion;
    private javax.swing.JTextField TextCantidad;
    private javax.swing.JTextField TextCodigo;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextPrecioVenta;
    private javax.swing.JToggleButton Volver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
