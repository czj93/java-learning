public class GenericTest{
    public static void main(String[] args){
        String key = new String("2323");
        //??? error  法从静态上下文中引用非静态???
        Generic<String> instance = new Generic<>(key);
        // instance.getKey();
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

        public void getKey(T key){
            System.out.println(key);
        }

        public void showKey(T o){
            System.out.println(o.toString());
        }

    }
}