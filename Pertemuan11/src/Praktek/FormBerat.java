/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author acer
 */
public class FormBerat extends Frame implements ActionListener {
    TextField tf1,tf2,tf3,tf4;
    Button b1;
    Label L1,L2,L3,L4,L5;
    
    FormBerat(){
        L1 = new Label("NIM");
        L1.setBounds(50,50,45,25);
        tf1 = new TextField();
        tf1.setBounds(130,50,150,25);
        L2 = new Label("NAMA");
        L2.setBounds(50,100,45,25);
        tf2 = new TextField();
        tf2.setBounds(130,100,150,25);
        L3 = new Label("TINGGI");
        L3.setBounds(50,150,45,25);
        tf3 = new TextField();
        tf3.setBounds(130,150,150,25);
        L4 = new Label("BERAT");
        L4.setBounds(50,200,45,25);
        tf4 = new TextField();
        tf4.setBounds(130,200,150,25);
        b1  = new Button("HITUNG");
        b1.setBounds(50,250,75,50);
        b1.addActionListener(this);
        L5 = new Label();
        L5.setBounds(50,300,250,100);
        
        add(L1);
        add(tf1);
        add(L2);
        add(tf2);
        add(L3);
        add(tf3);
        add(L4);
        add(tf4);
        add(b1);
        add(L5);
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        }); 
        setSize(450,450);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        String s3 = tf3.getText();
        String s4 = tf4.getText();
        double a = Double.parseDouble(s3);
        double b = Double.parseDouble(s4);
        double c = 0;
        
        if(e.getSource()== b1){
            c = b/(a*a/10000);
            if((c >= 18.5) && (c <= 24.9)){
                L5.setText("BERAT ANDA SUDAH IDEAL");
            }
            else{
                L5.setText("BERAT ANDA BELUM IDEAL");
            }
        }
    }
    
    public static void main(String[] args){
        new FormBerat();
    }    
}
