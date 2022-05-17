/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cifradocesar;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dlaur
 */
public class CifradoCesar extends JFrame implements ActionListener{
 
    String letras = "abcdefghijklmnñopqrstuvwxyz";
    
    private JTextField cDesplazar;    
    private JTextField cMensaje;     
    private JTextField cMensajeD;      
    private JLabel etiDesp;          
    private JLabel etIngresar;      
    private JLabel etiMensaje;         
    private JButton btn;               

    public CifradoCesar() throws HeadlessException {

        setTitle("Cifrado César");

        setSize(500, 450);
                
        setLayout(null);

        
        
        etiDesp = new JLabel("Número de desplazamiento:");
        etiDesp.setBounds(25, 20, 400, 50);

        cDesplazar = new JTextField();
        cDesplazar.setBounds(25, 55, 35, 25);
        cDesplazar.setToolTipText("Por favor de introducir el número de desplazamiento");

        
        etIngresar = new JLabel("Introduce el texto: ");
        etIngresar.setBounds(25, 80, 400, 50);


        cMensaje = new JTextField();
        cMensaje.setBounds(25, 100, 200, 250);
        cMensaje.setToolTipText("Por favor de introducir el texto a cifrar");


        etiMensaje = new JLabel("Mensaje cifrado: ");
        etiMensaje.setBounds(250, 1, 200, 200);


        cMensajeD = new JTextField();
        cMensajeD.setBounds(250, 110, 200, 250);
        cMensajeD.setToolTipText("Este es el texto cifrado");


        btn = new JButton("CIFRAR");
        btn.setBounds(195, 380, 75, 30);
        btn.setToolTipText("Hacer clic para cifrar el texto");

        
        this.getContentPane().add(cDesplazar);
        this.getContentPane().add(cMensajeD);
        this.getContentPane().add(cMensaje);
        this.getContentPane().add(etiDesp);
        this.getContentPane().add(etIngresar);
        this.getContentPane().add(etiMensaje);
        this.getContentPane().add(btn);
        btn.addActionListener(this);

        this.validate();
        this.setVisible(true);


        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn) {


            char caracter;
            String texto;
            String textoCodificado = "";


            try {

                texto = cMensaje.getText();
                texto = texto.toLowerCase();
                int clave = Integer.parseInt(cDesplazar.getText());

               
                for (int i = 0; i < texto.length(); i++) {
                   
                    caracter = texto.charAt(i);
                    
                    int posicion = letras.indexOf(caracter);

                     if (posicion == -1) {
                        textoCodificado += caracter;
                    } else {
                       
                        textoCodificado += letras.charAt((posicion + clave) % letras.length());
                    }
                }
                cMensajeD.setText("" + textoCodificado);

            } catch (Exception ex) {
                System.out.println(ex.toString());
                JOptionPane.showMessageDialog(null,
                        "Error",
                        "Introducir los datos correctamente",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}