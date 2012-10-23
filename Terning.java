package terninggui;
//  +------------------------------------------------------------+
//  |               Made by Nikolaj E. Lauridsen                 |
//  |           Contact: nikolajlauridsenn@gmail.com             |
//  +------------------------------------------------------------+
public class Terning {
    private String farve = "hvid", materiale = "plastik";
    private int n_kanter = 6, oejne;
    
    public void kast(){  //laver et random tal mellem 1 og antal kanter og gemmer som oejne
        oejne = 1 + (int)(Math.random() * n_kanter);
    }
    
    public int getOejne (){  //Retunere værdien oejne.
        return oejne;
    }
    
    public String getFarve (){ //Retunere værdien farve.
        return farve;
    }
    
    public String getMateriale (){  //Retunere værdien materiale.
        return materiale;
    }
    
    public int getSider (){
        return n_kanter;
    }
      
    public Terning(){ //Konstruktør der danner en terning
    kast();
    //System.out.println("test: terning(): "+oejne);  //til at test med
}
    
}