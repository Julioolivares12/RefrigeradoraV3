/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JTextArea;
import java.util.StringTokenizer;
/**
 *
 * @author julio
 */
public class Colecciones extends JFrame {

    private JButton btnInsertarText,btnSalir;
    private JTextField txttexto;
    private JLabel lbltexto;
    private JTextArea txtMuestraDatos;
    Vector<String> datos = new Vector<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        Colecciones colecciones= new Colecciones();
        colecciones.mostrarEventoDemo();
    }
    private Colecciones(){
        setSize(800,600);
        setTitle("programa frases");
        inicializarComponentes();
        
    }
    
    private void inicializarComponentes(){
        btnInsertarText= new JButton();
        btnSalir = new JButton();
        txttexto= new JTextField();
        lbltexto = new  JLabel();
        txtMuestraDatos = new JTextArea();
        
        
        getContentPane().setLayout(null);
        
        addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowClosing(java.awt.event.WindowEvent evt){
            System.exit(0);
        }
        });
        lbltexto.setText("escribe una frase");
        getContentPane().add(lbltexto);
        lbltexto.setBounds(25,15,400,25);
        
        txttexto.setText("");
        getContentPane().add(txttexto);
        txttexto.setBounds(140,40,500,25);
        
        txtMuestraDatos.setText("");
        getContentPane().add(txtMuestraDatos);
        txtMuestraDatos.setBounds(150,150, 600, 400);
        
        btnInsertarText.setText("insertar");
        getContentPane().add(btnInsertarText);
        btnInsertarText.setBounds(30,70,100,30);
        btnInsertarText.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                llenarVector();
            }
        });
        
        btnSalir.setText("salir");
        getContentPane().add(btnSalir);
        btnSalir.setBounds(150,70,100,30);
        btnSalir.addActionListener(new Salir());
        
        getRootPane().setDefaultButton(btnInsertarText);
    }
   
    public void llenarVector(){
        String texto = txttexto.getText().toString();
        
        StringTokenizer str = new StringTokenizer(texto);
        Vector<String> palabras = new Vector<>();
       // palabras.add(texto);
        while(str.hasMoreTokens()){
            palabras.add(str.nextToken());
            
        }
        while(str.hasMoreTokens()){
            
        }
    }
    static class Salir implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    private void mostrarEventoDemo(){
        setVisible(true);
    }
    
}
