package Lectii.Lectia_01;

public class ClientElev {
    public static void main(String[] args) {
        // ne cream un obiect de tip Elev
        Elev elev = new Elev("Gigel", 16);

        // apelam metoda invata a obiectului elev
        elev.invata();

        // asta nu ar merge pentru ca varstaElev este privata
        // System.out.println("Varsta elevului este : " + elev.varstaElev); 

        // apelam metoda getVarstaElev a obiectului elev
        System.out.println("Varsta elevului este : " + elev.getVarstaElev());

        // apelam metoda setVarstaElev a obiectului elev

        elev.setVarstaElev(17);

        System.out.println("Varsta elevului este : " + elev.getVarstaElev());

        Elev elev2 = new Elev();

        System.out.println("Varsta elevului 2 este : " + elev2.getVarstaElev());

        Elev elev3 = new Elev("Ionel");

        elev3.invata();
        elev3.setVarstaElev(16);
        System.out.println("Varsta Ionel :" + elev3.getVarstaElev());

    }
}
