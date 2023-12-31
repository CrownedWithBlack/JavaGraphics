/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Estrella;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Ferna
 */
public class MostrarEstrellaEnEstrella extends javax.swing.JFrame {

    int ancho =400,alto=400,mitad=200,cuarto=100,ajuste=2;
    
    
    ArrayList<Color> color = new ArrayList<>();
    ArrayList<Integer> vertices = new ArrayList<>();
    /**
     * Creates new form MostrarEstrellaEnEstrella
     */
    public MostrarEstrellaEnEstrella(ArrayList<Color> color, ArrayList<Integer> vertices) {
        initComponents();
        this.setSize(400,400);
        this.color=color;
        this.vertices=vertices;
    }
    public MostrarEstrellaEnEstrella(){
        
    }
    
    
    @Override
    public void paint(Graphics g){
        System.out.println(this.getSize());

        g.setColor(Color.black);
        g.fillRect(0, 0, 400, 400);
        
//        g.setColor(Color.white);
//        g.drawLine(0, 200+10, 400, 200+10);//X  main
//        g.drawLine(200, 0, 200, 400);//Y
//       
//        
//        g.drawLine(0, 100+17, 400, 100+17);//X sub1
//        g.drawLine(100, 10, 100, 400);//Y
//        
//        g.drawLine(0, 300+ajuste, 400, 300+ajuste);//X sub4
//        g.drawLine(300, 10, 300, 400);//Y

        
        g.setColor(color.get(0));
        for(int i =0;i<100;i+=100/vertices.get(0)){// el incremento  del for es la separacion de cada pixel
            g.drawLine(100, i+17, 100-i, 100+17); //sub1-1
            g.drawLine(100, i+17, 100+i, 100+17); //sub1-2
            g.drawLine(100, 200-i+(17), 100-i, 100+17); //sub1-3
            g.drawLine(100, 200-i+(17), 100+i, 100+17); //sub1-4
            
        }
        
        g.setColor(color.get(1));
        for(int i =0;i<100;i+=100/vertices.get(0)){// el incremento  del for es la separacion de cada pixel
            g.drawLine(300, i+17, 300-i, 100+17); //sub2-1
            g.drawLine(300, i+17, 300+i, 100+17); //sub2-2
            g.drawLine(300, 200-i+(17), 300-i, 100+17); //sub2-3
            g.drawLine(300, 200-i+(17), 300+i, 100+17); //sub2-4
            
        }
        
        g.setColor(color.get(2));
        for(int i =0;i<100;i+=100/vertices.get(0)){// el incremento  del for es la separacion de cada pixel
            g.drawLine(100, 200+i+2, 100-i, 300+2); //sub3-1
            g.drawLine(100, 200+i+2, 100+i, 300+2); //sub3-2
            g.drawLine(100, 400-i+(2), 100-i, 300+2); //sub3-3
            g.drawLine(100, 400-i+(2), 100+i, 300+2); //sub3-4
            
        }
        
        g.setColor(color.get(3));
        for(int i =0;i<100;i+=100/vertices.get(0)){// el incremento  del for es la separacion de cada pixel
            g.drawLine(300, 200+i+2, 300-i, 300+2); //sub4-1
            g.drawLine(300, 200+i+2, 300+i, 300+2); //sub4-2
            g.drawLine(300, 400-i+(2), 300-i, 300+2); //sub4-3
            g.drawLine(300, 400-i+(2), 300+i, 300+2); //sub4-4
            
        }
        
        
        
        for(int i =0;i<100;i+=100/vertices.get(0)){// el incremento  del for es la separacion de cada pixel
            g.setColor(color.get(0));
            g.drawLine(200, 100+i+10, 200-i, 200+10); //sub4-1
            g.setColor(color.get(1));
            g.drawLine(200, 100+i+10, 200+i, 200+10); //sub4-2
            
            g.setColor(color.get(2));
            g.drawLine(200, 300-i+(10), 200-i, 200+10); //sub4-3
            g.setColor(color.get(3));
            g.drawLine(200, 300-i+(10), 200+i, 200+10); //sub4-4
            
        }
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MostrarEstrellaEnEstrella.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarEstrellaEnEstrella.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarEstrellaEnEstrella.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarEstrellaEnEstrella.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarEstrellaEnEstrella().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
