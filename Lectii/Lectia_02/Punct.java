package Lectii.Lectia_02;

public class Punct {
    // coordonatele unui punct in plan
    private int x;
    private int y;

    public Punct(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "Punctul are coordonatele: " + x + " " + y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public static void main(String[] args) {
        Punct p = new Punct(0,0);
        System.out.println(p.toString());
        //System.out.println(p);

        PunctColorat pc = new PunctColorat(1, 1, "rosu");
        System.out.println(pc.toString());
    }
}

class PunctColorat extends Punct{
    // adaugam o culoare unui punct
    private String culoare;

    public PunctColorat(int x, int y, String culoare){
        // super va fi mereu apelat primul in constructor
        super(x, y);
        this.culoare = culoare;
    }

    @Override
    public String toString(){
        return super.toString() + " si culoarea: " + culoare;
        // sau
        // return "Punctul are coordonatele: " + getX() + " " + getY() + " si culoarea: " + culoare;
    }
}
