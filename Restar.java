public class Restar {
    private int a;
    private int b;

    public Restar (int a, int b){
        this.a = a;
        this.b = b;
        restarOperacion();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    private void restarOperacion() {
        System.out.println(this.a-this.b);
    }
}
