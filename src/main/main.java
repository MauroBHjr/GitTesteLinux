/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mauro-bh-jr
 */
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        String message = "Hello World";
        JOptionPane.showMessageDialog(null,message,"Hello",JOptionPane.INFORMATION_MESSAGE);
        
        JLabel HelloWorldMessage = new JLabel("Hello World");
        
        JPanel painel01 = new JPanel();
        
        painel01.setLayout(new BorderLayout());
        painel01.add(HelloWorldMessage,BorderLayout.CENTER);
        
        JOptionPane.showMessageDialog(null,painel01,"Hello02",JOptionPane.PLAIN_MESSAGE);
    }
    
}
