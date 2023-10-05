public class Restar {
    private int a;
    private int b;

    public Restar (int a, int b){
        this.a = a;
        this.b = b;
        restarOperacion();
    }

    private int restarOperacion() {
        return this.a-this.b;
    }
}