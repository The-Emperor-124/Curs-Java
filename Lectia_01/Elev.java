package Lectia_01;

public class Elev {
    // atribute care sunt specifice unui elev
    // toti specificatorii de acces :
    /*
        1. public - accesul la atributele si metodele clasei este permis din orice clasa
        2. private - accesul la atributele si metodele clasei este permis doar din interiorul clasei
     
     */

    private String numeElev;  // String e o clasa infasuratoare, ar fi echivalenta cu char numeElev[100];
    private int varstaElev;


    // constructorul clasei Elev
    public Elev(String numeElev, int varstaElev){
        this.numeElev = numeElev; // puteam sa scriem si numeElev = numeElev;
        this.varstaElev = varstaElev;
    }


    // metodele clasei Elev

    public void invata(){
        System.out.println("Elevul " + numeElev + " invata");
    }

    // getter 
    public int getVarstaElev(){
        return varstaElev;
    }

    // setter
    public void setVarstaElev(int varstaNoua){
        if(varstaNoua > 0){
            varstaElev = varstaNoua;
        }
        else{
            System.out.println("Varsta introdusa este incorecta");
        }
    }
}
