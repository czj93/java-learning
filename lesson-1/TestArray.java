public class TestArray {
    public static void main(String[] args){
        double[] r = new double[10];
        for(int i = 0; i < 10; i++){
            r[i] = Math.random()*10;
        }
        System.out.println(r.toString());

    }
}