package Teme.Tema_01.Exercitiul_02;

public class Carte {
    private int nrPagini;

    public Carte(int nrPagini){
        this.nrPagini = nrPagini;
    }

    public int getNrPagini(){
        return nrPagini;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Carte){
            Carte altaCarte = (Carte) obj;

            return this.nrPagini == altaCarte.nrPagini;
        }

        return false;
    }

    public static void main(String[] args) {
        Carte carte1 = new Carte(231);
        Carte carte2 = new Carte(123);
        Carte carte3 = new Carte(231);

        
        System.out.println(carte1.equals(carte2));
        System.out.println(carte1.equals(carte3));

        System.out.println(carte1.getNrPagini() == carte2.getNrPagini());
        System.out.println(carte1.getNrPagini() == carte3.getNrPagini());
    }
}
