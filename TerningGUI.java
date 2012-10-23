package terninggui;
import javax.swing.*;
//  +------------------------------------------------------------+
//  |               Made by Nikolaj E. Lauridsen                 |
//  |           Contact: nikolajlauridsenn@gmail.com             |
//  +------------------------------------------------------------+
public class TerningGUI {
    public static void main(String[] args) {
        JFrame Vindue = new JFrame("Terning");
        Vindue.add( new GUI());
        Vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Vindue.setSize(625,210);
        Vindue.setVisible(true);
        
        
    }
}
