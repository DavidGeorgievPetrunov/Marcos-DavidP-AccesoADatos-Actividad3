# Marcos-DavidP-AccesoADatos-Actividad3


# Esto es una muestra de como podemos emplear  git en el proceso de creacion de nuestro programa sumador y restador de numeros

```java
public class Sum {
    private  int a ;
    private  int b ;


    public Sum(int a, int b) {
        this.setA(a);
        this.setB(b);
        printSum();
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

    public void printSum (){
        System.out.println(this.getA() + this.getB());
    }
}

```
