package domínio;

public class Vetor {
    //Array de inteiros
    private int[] arr;

    //Int de diferença entre inteiros de arr.
    private int x;

    //Constructor de arr e x
    public Vetor(int[] arr, int x) {
        this.arr = arr;
        this.x = x;
    }

    //Getters de arr e x
    public int[] getArr() {return this.arr;}
    public int getX() {return this.x;}
}
