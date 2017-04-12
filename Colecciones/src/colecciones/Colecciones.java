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
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.JTextArea;
import java.util.StringTokenizer;
import java.util.Hashtable;
/**
 *
 * @author julio
 */
public class Colecciones extends JFrame {

    private JButton btnInsertarText,btnSalir;
    private JTextField txttexto;
    private JLabel lbltexto,lblrepetidas,lblsinRepetir;
    private JTextArea txtMuestraDatos,txtrepetidas,txtsinRepetir;
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
        txtrepetidas= new JTextArea();
        txtsinRepetir = new JTextArea();
        lblrepetidas = new JLabel();
        lblsinRepetir = new JLabel();
        
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
        
        //etiqueta de repetidas
        lblrepetidas.setText("repetidas");
        getContentPane().add(lblrepetidas);
        lblrepetidas.setBounds(350, 80, 100,100 );
        
        // muestra las palabras repetidas
        txtrepetidas.setText("");
        getContentPane().add(txtrepetidas);
        txtrepetidas.setBounds(350, 150, 300, 200);
        
        // etiqueta de palabras sin repetir
        lblsinRepetir.setText("sin repetir");
        getContentPane().add(lblsinRepetir);
        lblsinRepetir.setBounds(40, 80, 100, 100);
        
        //muesta las palabras que no estan repetidas
        txtsinRepetir.setText("");
        getContentPane().add(txtsinRepetir);
        txtsinRepetir.setBounds(40, 150, 300, 200);
        
        //funciones de los botones
        btnInsertarText.setText("insertar");
        getContentPane().add(btnInsertarText);
        btnInsertarText.setBounds(30,70,100,30);
        btnInsertarText.addActionListener((ActionEvent e) -> {
            verificarPalabras();
        });
        
        btnSalir.setText("salir");
        getContentPane().add(btnSalir);
        btnSalir.setBounds(150,70,100,30);
        btnSalir.addActionListener(new Salir());
        
        getRootPane().setDefaultButton(btnInsertarText);
    }
   
    public void verificarPalabras(){
        String texto = txttexto.getText();
        
        StringTokenizer str = new StringTokenizer(texto);
        Vector<String> palabras = new Vector<>();
        Vector<String> repetidas = new Vector<>();
        Vector<String> sinRepetir = new Vector<>();
        Hashtable<String,String> palabras1 = new Hashtable<String,String>();
        
        
       // palabras.add(texto);
        while(str.hasMoreTokens()){
           // palabras.add(str.nextToken());
           palabras1.put(str.nextToken(),"plabra");
           Enumeration<String> e = palabras1.keys();
           
           if(palabras1.keys().equals(str.nextToken())){
               
           }
        }
         
        // String [] datos;
        /* while(e.hasMoreElements()){
             palabras.add(e.nextElement());
         }
         for(int i=0;i<=palabras.size();i++){
             if(palabras.get(i).equals(e.nextElement())){
                // repetidas=palabras.get(i);
                repetidas.addElement(e.nextElement());
             }
             else
             {
                 sinRepetir.addElement(e.nextElement());
             }
         }*/
        txtsinRepetir.setText("\n"+sinRepetir);
        txtrepetidas.setText("\n"+repetidas);
    }
    static class Salir implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    private void mostrarEventoDemo(){
        setVisible(true);
    }
    
}
