
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

```Java
// 新建一个 保存String的ArrayList 
ArrayList<String> list = new ArrayLIst<>(); 

// Integer ArrayList
ArrayList<Integer> list1 = new ArrayList<>();

```     

### 定义泛型类和方法

```Java
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

```Java
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

    // 简单示例
    public static <E> void print(E[] list){
        System.out.print(list.toString());
    }

    // 示例2
    // 第一个 <T> , 表示此方法为泛型方法， 只有在此声明了 <T> 才能在方法中 使用泛型类型 T
    // 使用泛型成员的方法并不一定是 泛型方法 
    public <T> T genericMethod(ArrayList<T> list){
        return list
    }

}

``` 

### 通配泛型： 非受限泛型 受限通配 下限通配

    用于给 泛型类型实参指定范围, 使类型实参只能是规定范围内的类型

``` Java
    public void method1(Generic<? extends Number> o){
        // method1 只接受 继承至 Number 的 实参类型
    }

    public void method2(Generic<? super Number> o){
        // 泛型类型必须实 Number 的父类
    }
```

### 类型消除

    编译器可以使用类型信息，但是这些信息在运行时是不可用的。
    编译器使用泛型信息来编译代码，但是随后会消除它，泛型信息在运行时是不存在的，这种方法可以是泛型代码兼容使用原始类型的遗留代码。
    编译器在 编译泛型方法 类时，会检测泛型类型是否使用正确，检测通过，就会将泛型类型转换为原始类型。

```Java
ArrayList<String> list = new ArrayList<>();
list.add("heelo");
String text = list.get(0);

// ====

ArrayLis list = new ArrayList();
list.add('Hello);
String text = (String)list.get(0);
```

```Java
public static <E> void print(E[] list){}

// ===

public static void print(Object[] list)
```

// 受限泛型转换
```Java
public static <E extends Number> boolean equal(E num1, E num2){}

// ====

public static boolean equal(Number num1, Number num2){}
```

### 注意
- 泛型类型必须是引用类型
- 不能使用使用泛型类型参数创建实例。 例如： E o = new E(); 详情见P12
- 静态上下文中不允许类的参数是泛型类型。 例如： public static E o; public static void m(E o){};
- 静态方法要使用泛型类型，需要将方法声明未泛型方法。 例如： public static <E> void m(E o){};
- 异常类不能是泛型。
- 泛型方法 和 泛型类型 添加上下边界，必须和泛型申明在一起。详情见 GenericTest 中 Generic 类的 method2 和 method3