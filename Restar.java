public class Restar {
    private int a;
    private int b;

    public Restar (int a, int b){
        this.a = a;
        this.b = b;
        restarOperacion();
    }

    private void restarOperacion() {
        System.out.println(this.a-this.b);
    }
}