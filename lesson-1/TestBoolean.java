public class TestBoolean {
    public static void main(String[] args){
        // boolean 无法转换成 int 类型
        // boolean b = true;
        // i = (int) b;
        // System.out.print(i);

        int n1 = 1;
        int n2 = 0;
        int n3 = -1;

        //int 类型无法转成 boolean 类型
        // boolean b1 = (boolean)n1;
        // boolean b2 = (boolean)n2;
        // boolean b3 = (boolean)n3;

        // System.out.println("int 1 to boolean " + b1);
        // System.out.println("int 0 to boolean " + b2);
        // System.out.println("int -1 to boolean " + b3);
        
        //error
        // System.out.println("int 1 to boolean " + Boolean.parseBoolean(n1));
        // System.out.println("int 0 to boolean " + Boolean.parseBoolean(n2));
        // System.out.println("int -1 to boolean " + Boolean.parseBoolean(n3));
    
    }
}