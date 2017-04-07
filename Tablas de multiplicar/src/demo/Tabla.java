/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author julio
 */
public class Tabla extends JFrame {
        private javax.swing.JLabel lblNumero;//control etiqueta
	private static javax.swing.JTextField txtNumero;//control campo de texto
	private javax.swing.JButton btnCalcular;//control boton
	private javax.swing.JButton btnSalir;
        
        public static void main(String[] args) {
		// crear un objeto formulaio
		Tabla formulaioDemo = new Tabla();

		formulaioDemo.mostrarEventoDemo();
		//new Tabla().setVisible(true);
	}
	//metodo para definir algunas propiedades del formulario
	private Tabla(){
		setSize(300,150);//tamano del formulairo
		setTitle("Tablas de multiplicar");//titulo de la aplicacion
		inicializarComponentes();//iniciar los controles o componentes
	}
	private void inicializarComponentes(){
            lblNumero = new javax.swing.JLabel();
            txtNumero = new javax.swing.JTextField();
            btnCalcular = new javax.swing.JButton();
            btnSalir = new javax.swing.JButton();
            
            //definiendo disenador nulo
            getContentPane().setLayout(null);
            //configuracion del boton cerrar ventana
            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent evt){
                    System.exit(0);
                }
            });
            //configurar etiqueta
            lblNumero.setText("Digite un numero");
            getContentPane().add(lblNumero);
            lblNumero.setBounds(25,15,100,25);
            
            //configurar campo de texto
            txtNumero.setText("");
            getContentPane().add(txtNumero);
            txtNumero.setBounds(140,15,50,25);
            
            //configurar boton mostrar
            btnCalcular.setText("Calcular");
            btnCalcular.setToolTipText("Mostrar tabla de multiplicar");
            btnCalcular.setMnemonic('c');
            getContentPane().add(btnCalcular);
            btnCalcular.setBounds(30,60,100, 30);
            btnCalcular.addActionListener(new AccionCalcular());
            
            //configurar boton salir
            btnSalir.setText("salir");
            btnSalir.setToolTipText("salir de la aplicacion");
            btnSalir.setMnemonic('c');
            getContentPane().add(btnSalir);
            btnSalir.setBounds(150,60,100,30);
            btnSalir.addActionListener(new AccionSalir());
            //presionar boton mostrar usando la tecla enter
            getRootPane().setDefaultButton(btnCalcular);
            //colocar formulario al centro de la pantalla
            setLocationRelativeTo(null);
            
        }
        
        static class AccionCalcular implements ActionListener{
            public void actionPerformed(ActionEvent e){
                double numero=0;//variable para guardar numero digitado en la caja de texto
                try{
                    //intentar guardar el valor de la caja de texto
                    numero = Double.parseDouble(txtNumero.getText());
                }catch(Exception ex){//mostrar mensaje de error
                    JOptionPane.showMessageDialog(null,"tipo de datos incorrento","ATENCION!!!",JOptionPane.ERROR_MESSAGE);
                    reiniciar();//invoca al metoo para limpiar la caja
                    return;
                }
                //variable para contruir el mensaje de la ventana emergentes
                String cad="";
                
                //imagen para mostrar en la ventana emergente
                ImageIcon icono = new ImageIcon(Tabla.class.getResource("/imagenes/thumb-1920-345058.jpg"));
                
                if(numero==0){
                    //revisar que le numero no sea cero
                    cad="no se puede generar la tabla de multiplicar de cero";
                    JOptionPane.showMessageDialog(null,cad,"Respcto al cero",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    //contruir la tabla de multiplicar
                    JOptionPane.showMessageDialog(null,cad,"tabla del "+numero,JOptionPane.INFORMATION_MESSAGE,icono);
                }
                //invocar metodo para limpiar caja de texto
                reiniciar();
            }
        }
        //metodo para limpar caja de texto
        static void reiniciar(){
            txtNumero.setText("");
            txtNumero.requestFocus();//colocar foco dento de la caja de texto
        }
        static class AccionSalir implements ActionListener{
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        }
        private void salirDeAplicacion(java.awt.event.WindowEvent evt){
            System.exit(0);
        }
        //metodo para mostrar formulario
        private void mostrarEventoDemo(){
            setVisible(true);
        }
	 	
	}
