public class Rectangle{
    private double width = 1;
    private double height = 1;

    public static void main(String[] args){

        Rectangle react1 = new Rectangle(4, 40);
        Rectangle react2 = new Rectangle(3.5, 35.9);

        react1.info();
        System.out.println(" ");
        react2.info();   
    }

    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*(width+height);
    }

    public void info(){
        System.out.printf("react width is %f , height is %f, area is %f , zhouchang is %f .", width, height, getArea(), getPerimeter());
    }

}