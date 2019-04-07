
## 类

1. 构造函数

    - 非必须
    - 必须和类的名字相同
    - 没有返回值，没有 void
    - 支持重载
    - 创建对象的时候由 new 操作符调用



2.  修饰符

    类修饰符
        无  同一个包内访问
        public  公共类
        

## 泛型

    泛型能够参数化类型，可以定义带泛型类型的类或者方法，随后编译器会使用具体的类型来替换它。
    这能使我们在编译的时候检测出错误。
    泛型不是必须的，可以将元素类型设置成 Object， 一样可以容纳任何对象。
    但是使用泛型可以使某些错误在编译阶段就被检出，提高程序的可靠性。 

```
// 新建一个 保存String的ArrayList 
ArrayList<String> list = new ArrayLIst<>(); 

// Integer ArrayList
ArrayList<Integer> list1 = new ArrayList<>();

```     

### 定义泛型类和方法

```
// 定义一个泛型栈类
    public class GenericStack<E> {
        private ArrayList<E> list = new ArrayList<>();

        public int getSize(){
            return list.size();
        }

        public E peek(){
            return list.get(list.size() - 1);
        }

        public E pop(){
            int lastIndex = getSize() - 1;
            E o = list.get(lastIndex);
            list.remove(lastIndex);
            return o;
        }

        public boolean isEmpty(){
            return list.isEmpty();
        }

        public void push(E o){
            list.add(o);
        }
    }
```

```
// 泛型方法
public class GenericMethodDemo{
    public static void main(String[] args){
        Integer[] list1 = {1,2,3,4,5};
        String[] list2 = {"1", "2", "3", "4", "5"};

        // 调用方式1
        print(list1);
        
        //调用方式2
        GenericMethodDemo.<String>print(list2);

    }

    public static <E> void print(E[] list){
        System.out.print(list.toString());
    }

}

``` 

### 注意
    - 泛型类型必须是引用类型
    - 不能使用使用泛型类型参数创建实例。 例如： E o = new E(); 详情见P12
    - 静态上下文中不允许类的参数是泛型类型。 例如： public static E o; public static void m(E o){};
    - 异常类不能是泛型。