package Teme.Tema_01.Exercitiul_03;

public class Patrat {
    private double laturaPatrat;

    public Patrat(){
        this.laturaPatrat = 10;
    }
    
    public Patrat(double laturaPatrat){
        this.laturaPatrat = laturaPatrat;
    }

    public double calculeazaAria(){
        return laturaPatrat * laturaPatrat;
    }

    public void afiseazaInformatii(){
        System.out.println("Patrat " + this.laturaPatrat + " Aria " + this.calculeazaAria());
    }

    public static void main(String[] args) {
        Patrat patrat1 = new Patrat(); 
        Patrat patrat2 = new Patrat(12);

        patrat1.afiseazaInformatii();   
        patrat2.afiseazaInformatii();
    }
}
