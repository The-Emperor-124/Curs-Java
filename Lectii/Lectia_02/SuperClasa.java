package Lectii.Lectia_02;

// Ce inseamna mostenirea?
// O clasa poate mosteni de la o alta clasa

public class SuperClasa {
    public int super_x;     // accesibil din orice clasa
    private int super_y;    // accesibil doar din aceasta clasa
    protected int super_z;  // accesibil din aceasta clasa si din clasele mostenitoare
    int super_t;            // accesibil doar in acelasi pachet
}

// cuvant cheie extends
class SubClasa extends SuperClasa{
    
    public void metoda(SuperClasa obiectSuperClasa){
        super_x = 10; // accesibil
        // super_y = 20; // nu e accesibil -> eroare de compilare
        super_z = 30; // accesibil
        super_t = 40; // accesibil

        obiectSuperClasa.super_x = 10; // accesibil
        // obiectSuperClasa.super_y = 20; // nu e accesibil -> eroare de compilare
        obiectSuperClasa.super_z = 30; // accesibil -> trebuie avuta grija sa fie in acelasi pachet
        obiectSuperClasa.super_t = 40; // accesibil
    }

    public static void main(String[] args) {
        SuperClasa obiectSuperClasa = new SuperClasa();
        SubClasa obiectSubClasa = new SubClasa();

        obiectSubClasa.metoda(obiectSuperClasa);

        obiectSuperClasa.super_x = 10; // accesibil
    }
} 

