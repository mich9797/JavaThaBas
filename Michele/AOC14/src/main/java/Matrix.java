public class Matrix {
    public int[][] matrice;
    private int width;
    private int length;

    public Matrix() {
        this.matrice = new int[103][101];
        this.length = matrice[0].length;
        this.width = matrice.length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
