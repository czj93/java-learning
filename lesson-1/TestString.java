public class TestString {
    private String text;

    public TestString(String s){
        String text = s;
        // text = s;
    }

    public static void main(String[] args){
        TestString test = new TestString("Abc");
        System.out.println(test.text.toLowerCase());
    }

}