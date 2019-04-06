## 数组

1. 定义一个数组

```
elementType[] arrayVar;
elementType attayVar[];

// explame

int[] list;
int list[];


```

2. 创建一个数组

```

new elementType[ArraySize];

int[] list = new elementType[10];

// 数组初始化

int[] list = {1,2,4,5,6,2};

```


3. Arrays 类

    常用方法：
        - sort(Array)
        - binarySearch(Array)
        - equals(Array1, Aray2)
        - toString(Array)
        - fill(Array, element)
        - asList(Array) 将 Array 转成 List



## String

    对象，不可变
    - replace(oldChar: char, newChar: char) String
    - replace(oldString: String, newString: String) String
    - replaceAll(oldString: String, newString: String) String
    - split(delimiter:String) String
    - equals(targetString: String) boolean
    - matches() boolean 支持字符串 和 正则
    - toCharArray() Array
    - getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
    - format()
    - valueOf() char charArray double float int long boolean to String


## StringBuilder StringBuffer
    可变的字符串对象
    stringBuilder 和 stringBuffer 的区别在于 StringBuffer 线程安全的，其他都一致
    
    - append(data: char[])
    - append(data: char[], offset: int, len: int)
    - append(data: aPrimitiveType) 将一个基本数据类型追加到字符串中
    - append(data: String)
    - delete(startIndex: int, endIndex: int)
    - insert()
    - replace(stratIndex: int, endIndex: int, s: String)
    - reverse()
    - setCharAt(index: int, ch: char)
    - toString() String
    - capacity() int
    - charAt(index: int) char
    - length() int
    - setLength(len: int)
    - substring(startIndex: int, endIndex: int)
    - trimToSize()
    


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
    - 