package exc2;

public final class Vector {
    private int x,y,z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    double vectorLength(){
        return Math.sqrt(x*x+y*y+z*z);
    }
    int scalar(Vector vector){
        return this.x*vector.getX()+this.y*vector.getY()+this.z*vector.getZ();
    }
    void vectorProduct(Vector vector){
        System.out.println("Результирующий вектор: " +"("+
                (this.y*vector.getZ()-this.z*vector.getY())+","+
                (this.z*vector.getX()-this.x*vector.getZ())+","+
                (this.x*vector.getY()-this.y*vector.getX())+")");
    }
    double vectorCorner(Vector vector){
        return scalar(vector) / Math.abs(this.vectorLength()) / Math.abs(vector.vectorLength());
    }
    String vectorConcat(Vector vector){
        return "("+(this.x+vector.getX())+","+(this.y+vector.getY())+","+(this.z+vector.getZ())+")";
    }
    String vectorSubtract(Vector vector){
        return "("+(this.x-vector.getX())+","+(this.y-vector.getY())+","+(this.z-vector.getZ())+")";
    }
    static Vector[] vectorArray(int n){
        if(n==0){
            return null;
        }
        int a,b,c;
        Vector[] vectors = new Vector[n];
        for (int i=0;i<vectors.length;i++){
            a=(int)(Math.random()*10);
            b=(int)(Math.random()*10);
            c=(int)(Math.random()*10);
            vectors[i]=new Vector(a,b,c);
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "("+x+","+y+","+z+")";
    }
}
