/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refrigeradorav2;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author grupo 11
 */
public class RefrigeradoraVisual extends javax.swing.JFrame implements ActionListener {

    private javax.swing.JLabel lblvalor1;
    private javax.swing.JButton btnMostrarDatos,btnEncender;
    private javax.swing.JTextField txtvalor1;
    
    public RefrigeradoraVisual(){
        super("Refrigeradoras");
        setSize(300,400);
        iniciaComponentes();
        
    }
    private void iniciaComponentes(){
        lblvalor1 = new javax.swing.JLabel();
        btnMostrarDatos = new javax.swing.JButton();
        getContentPane().setLayout(null);
         addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowClosing(java.awt.event.WindowEvent evt) {

               System.exit(0);

            }

        }

        );
         lblvalor1.setText("Refrigeradoras");
         lblvalor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         lblvalor1.setFont(new java.awt.Font("Dialog",1,18));
         getContentPane().add(lblvalor1);
         
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
