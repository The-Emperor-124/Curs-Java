package Lectii.Lectia_02;

public class Tablou {
    public static void main(String[] args) {
        // tablou unidimensional sau vector
        // stocam mai multe valori de acelasi tip la adrese consecutive
        // Cum se declara? tipul de date + numele tabloului + dimensiunea tabloului
        int tablou[] = new int[10];

        // Cum se acceseaza un element din tablou?
        // indexarea incepe de la 0; primul element este tablou[0]
        // elementele le vom gasi pe pozitiile 0, 1, 2, ..., n-1

        tablou[0] = 13;

        System.out.println(tablou[0]);

        // incercam sa accesam un element care nu exista
        //System.out.println(tablou[10]); // ArrayIndexOutOfBoundsException

        // incercam sa accesam un element neinitializat
        // nu e okay sa accesam un element neinitializat
        System.out.println(tablou[1]); // 0

        // Parcurgeri de tablouri
        // 1. for
        for (int i = 0; i < 10; i++) {
            tablou[i] = i;
        }

        System.out.println("Afisare elemente tablou");

        for(int i = 0; i <= 9; i++) {
            System.out.println(tablou[i]);
        }

        System.out.println("Afisare elemente tablou cu for cu length");
        for(int i = 0; i < tablou.length; i++){
            System.out.println(tablou[i]);
        }

        // in cazul asta length este o metoda a clasei String
        String nume = new String("Daria");
        System.out.println(nume.length());

        // 2. for-each
        System.out.println("Afisare elemente tablou cu for-each");

        for(int element : tablou){
            System.out.println(element);
        }

        // 3. while
        System.out.println("Afisare elemente tablou cu while");

        int i = 0;

        while(i < tablou.length){
            System.out.println(tablou[i]);
            i++;
        }
    }
}
