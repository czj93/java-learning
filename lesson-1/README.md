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



## 类

1. 构造函数

    - 非必须
    - 必须和类的名字相同
    - 没有返回值，没有 void
    - 支持重载
    - 创建对象的时候由 new 操作符调用