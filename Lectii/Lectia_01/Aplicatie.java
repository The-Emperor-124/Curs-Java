package Lectii.Lectia_01;
// Pasii pentru compilare si rulare:
// 1. deschideti un terminal
// 2. schimbati directorul la locatia fisierului Aplicatie.java
// 3. compilati fisierul Aplicatie.java folosind comanda javac Aplicatie.java
// 4. rulati fisierul Aplicatie.class folosind comanda java Aplicatie

class Aplicatie{
    public static void main(String[] args){
        System.out.println("Primul meu program in Java");
        
        int sumaNumerePare = 0;
        
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sumaNumerePare = sumaNumerePare + i;
            }
        }

        System.out.println("Suma noastra este : " + sumaNumerePare);

        int i = 10;
        int sumaNumereImpare = 0;
        while(i != 0){
            if(i % 2 == 1){
                sumaNumereImpare += i;  // echivalenta cu sumaNumereImpare = sumaNumereImpare + i;
            }

            i--;  // sau pot sa mai scriu i = i - 1;
        }

        System.out.println("Suma noastra este : " + sumaNumereImpare);

        int c = 13;

        switch(c){
            case 13:
                System.out.println("Cazul 13");
            case 1:
                System.out.println("Cazul 1");
                break;
            case 2:
                System.out.println("Cazul 2");
                break;
        }
    }
}