package terninggui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//  +------------------------------------------------------------+
//  |               Made by Nikolaj E. Lauridsen                 |
//  |           Contact: nikolajlauridsenn@gmail.com             |
//  +------------------------------------------------------------+

public class GUI extends JPanel 
{
    Image en = Toolkit.getDefaultToolkit().getImage("ener.png");
    Image to = Toolkit.getDefaultToolkit() .getImage("to.png");
    Image tre = Toolkit.getDefaultToolkit() .getImage("tre.png");
    Image fire = Toolkit.getDefaultToolkit() .getImage("fire.png");
    Image fem = Toolkit.getDefaultToolkit() .getImage("fem.png");
    Image seks = Toolkit.getDefaultToolkit() .getImage("seks.png");
    
  //  ImageIcon test = new ImageIcon("ener.png");
    
    Terning Terning1 = new Terning();
    Terning Terning2 = new Terning();
    Terning Terning3 = new Terning();
    Terning Terning4 = new Terning();
    Terning Terning5 = new Terning();
    Terning Terning6 = new Terning();
    
    String boxnavn = "Gem";
    
    JButton knap = new JButton("Kast!");
    
    JCheckBox Antal = new JCheckBox("6 terninger");
    JCheckBox check1 = new JCheckBox(boxnavn);
    JCheckBox check2 = new JCheckBox(boxnavn);
    JCheckBox check3 = new JCheckBox(boxnavn);
    JCheckBox check4 = new JCheckBox(boxnavn);
    JCheckBox check5 = new JCheckBox(boxnavn);
    JCheckBox check6 = new JCheckBox(boxnavn);
    
    boolean state, hold1, hold2, hold3,hold4,hold5,hold6;
    
    public void paintComponent(Graphics g){ 
        
      //  knap.setIcon(test);
       
        knap.setIgnoreRepaint(true);
        Antal.setIgnoreRepaint(true);
        check1.setIgnoreRepaint(true);
        check2.setIgnoreRepaint(true);
        check3.setIgnoreRepaint(true);
        check4.setIgnoreRepaint(true);
        check5.setIgnoreRepaint(true);
        check6.setIgnoreRepaint(true);
        
        check1.setLocation(5,150);
        check2.setLocation(105,150);
        check3.setLocation(205,150);
        check4.setLocation(305,150);
        check5.setLocation(405,150);
        check6.setLocation(505,150);
        
        state = Antal.isSelected();
        hold1 = check1.isSelected();
        hold2 = check2.isSelected();
        hold3 = check3.isSelected();
        hold4 = check4.isSelected();
        hold5 = check5.isSelected();
        hold6 = check6.isSelected();
        
        add(knap);
        add(Antal);
        add(check1);
        add(check2);
        add(check3);
        add(check4);
        add(check5);
        add(check6);
        

        
        
        
        knap.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                Terning6.kast();
                Terning5.kast();
                Terning4.kast();
                Terning3.kast();
                Terning2.kast();
                Terning1.kast();
                repaint();
            }
        });     
        
        if (hold1 == false){
        switch(Terning1.getOejne()){
        case 1:
        g.drawImage(en,5,50,this);
        break;
        case 2:
        g.drawImage(to,5,50,this);
        break;
        case 3:
        g.drawImage(tre,5,50,this);
        break;
        case 4:
        g.drawImage(fire,5,50,this);
        break;
        case 5:
        g.drawImage(fem,5,50,this);
        break;    
        case 6:
        g.drawImage(seks,5,50,this);
        break;
        }
        }
        
        if(state == true){        
            
        if(hold2 == false){           
        switch(Terning2.getOejne()){
        case 1:
        g.drawImage(en,105,50,this);
        break;
        case 2:
        g.drawImage(to,105,50,this);
        break;
        case 3:
        g.drawImage(tre,105,50,this);
        break;
        case 4:
        g.drawImage(fire,105,50,this);
        break;
        case 5:
        g.drawImage(fem,105,50,this);
        break;    
        case 6:
        g.drawImage(seks,105,50,this);
        break;
        }
        }
        
        if(hold3 == false){
        switch(Terning3.getOejne()){
        case 1:
        g.drawImage(en,205,50,this);
        break;
        case 2:
        g.drawImage(to,205,50,this);
        break;
        case 3:
        g.drawImage(tre,205,50,this);
        break;
        case 4:
        g.drawImage(fire,205,50,this);
        break;
        case 5:
        g.drawImage(fem,205,50,this);
        break;    
        case 6:
        g.drawImage(seks,205,50,this);
        break;
        }
        }
        
        if(hold4 == false){
        switch(Terning4.getOejne()){
        case 1:
        g.drawImage(en,305,50,this);
        break;
        case 2:
        g.drawImage(to,305,50,this);
        break;
        case 3:
        g.drawImage(tre,305,50,this);
        break;
        case 4:
        g.drawImage(fire,305,50,this);
        break;
        case 5:
        g.drawImage(fem,305,50,this);
        break;    
        case 6:
        g.drawImage(seks,305,50,this);
        break;
        }
        }
        
        if(hold5 == false){
        switch(Terning5.getOejne()){
        case 1:
        g.drawImage(en,405,50,this);
        break;
        case 2:
        g.drawImage(to,405,50,this);
        break;
        case 3:
        g.drawImage(tre,405,50,this);
        break;
        case 4:
        g.drawImage(fire,405,50,this);
        break;
        case 5:
        g.drawImage(fem,405,50,this);
        break;    
        case 6:
        g.drawImage(seks,405,50,this);
        break;
        }
        }
        
        if(hold6 == false){
        switch(Terning6.getOejne()){
        case 1:
        g.drawImage(en,505,50,this);
        break;
        case 2:
        g.drawImage(to,505,50,this);
        break;
        case 3:
        g.drawImage(tre,505,50,this);
        break;
        case 4:
        g.drawImage(fire,505,50,this);
        break;
        case 5:
        g.drawImage(fem,505,50,this);
        break;    
        case 6:
        g.drawImage(seks,505,50,this);
        break;
        }
        }
        
        }            
    }
    
}