public abstract class Spiller {
    protected String navn;
    protected int point;

    public Spiller(String navn) {
        this.navn = navn;
        this.point = 0;
    }

    public String getNavn() {
        return navn;
    }

    public int getPoint() {
        return point;
    }

    abstract Håndtegn håndtegnSpillet();

    //metode til at sætte point op mod én
    public void pointTæller(){
        point++; //lægger en til ligesom point + point+1
    }
}
