package J12_5;

public class IllegalTriangleExeption extends Exception {
    public IllegalTriangleExeption(String error){
        super(error);
    }

    @Override
    public String toString() {
        return this.getMessage();
    }
}
