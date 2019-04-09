import java.util.ArrayList;
import java.util.Arrays;
public class GenericTest{
    public static void main(String[] args){
        String[] repeatList = {"111", "222", "333", "111", "333", "444"};
        ArrayList<String> repeatArrayList = new ArrayList<>(Arrays.asList(repeatList));

        System.out.println(Generic.removeDuplicates(repeatArrayList));
        String key = new String("2323");
        //??? error  法从静态上下文中引用非静态???
        Generic<String> instance = new Generic<>(key);
        instance.getKey();
        // instance.showKey(key);
    }

    // 内部类不能有静态成员和静态方法
    // Generic 如果不加 static 编译报错
    static class Generic<T>{
        private T key;
        
        public Generic(T key){
            this.key = key;
        }

        public static <T>  void show(T o){

        }

        public void getKey(){
            System.out.println(key);
        }

        public void showKey(T o){
            System.out.println(o.toString());
        }

        public void method1(Generic<? extends Number> o){

        }

        // error 泛型方法 和 泛型类型 添加上下边界，必须和泛型申明在一起
        // public <E> void method2(Generic<E extends Number> o){ }

        public <E extends Number > void method3(Generic<E> o){

        }


        public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
            ArrayList<E> result = new ArrayList<>();
            for(int i = 0 ; i < list.size(); i++){
                if(result.indexOf(list.get(i)) == -1){
                    result.add(list.get(i));
                }
            }
            return result;
        }

    }
}