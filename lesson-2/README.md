
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

···
String[] str = { "a", "b", "vvv" };

ArrayList<String> list = new ArrayList<>(Arrays.asList(str));

···