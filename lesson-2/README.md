
## 数组

1. 定义一个数组

```Java
elementType[] arrayVar;
elementType attayVar[];

// explame

int[] list;
int list[];
```

2. 创建一个数组

```Java
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

## ArrayList

可变长度列表，只接收对象，不能存储基本数据类型

构造函数

ArrayList(Collection o);

- add(E)
- size()
- remove(int index)
- remove(E)
- clear()
- indexOf(E)
- contains(E)
- set(index, E)

### 数组 -》 列表

```Java
String[] str = { "a", "b", "vvv" };

ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
```