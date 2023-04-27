public class Morcego implements Voador{

    boolean modoVampiro = false;

    public void transformaEmVampiro(){
        modoVampiro = true;
    }

    public boolean getModoVampiro() {
        return modoVampiro;
    }

    @Override
    public double voar(){
        System.out.println("Morcego voa");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Morcego plana");
    }

    @Override
    public boolean pousar() {
        System.out.println("Morcego pousa");
        return true;
    }
}
