/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garisdda;

/**
 *
 * @author RIZAL
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class GarisDDA extends JPanel {
    
    @Override
    public void paintComponent(Graphics g){
        Garis baru= new Garis();
        g.setColor(Color.ORANGE);
        baru.Garisku(g, 300, 200, 300, 200);
    
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garis baru = new Garis();
        JFrame frame  = new JFrame("Gambar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GarisDDA());
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBackground(Color.black);
        
    }
    
}
