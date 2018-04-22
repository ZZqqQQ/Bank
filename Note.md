# JAVA集合框架
- 1.HashSet不能保证元素的排列顺序，顺序有可能发生变化，LinkedHashSet使用链表来维护元素的次序，使得元素看起来是以插入的顺序保存的，TreeSet是默认以升序排列元素的。
- 2.向TreeSet中添加的应该是同一个类的对象，否则会引起ClassCastException异常。
- 3.如果向TreeSet中添加了一个可变对象，并在后面程序修改了该可变对象的Field，但是TreeSet不会调整它的顺序。
- 4.TreeSet可以删除没有被修改的Field，且不与其他被修改Field的对象重复的对象.
- 5.推荐HashSet和TreeSet集合中只放入不可变对象（final）。
- 6.HashSet的性能总是要比TreeSet好（特别是最常用的添加、查询元素等操作），因为TreeSet需要额外的红黑树算法来维持集合元素的次序。只有当需要一个保持次序的Set时，才会用到TreeSet。
- 7.List判断两个对象相等只要通过equals（）方法比较返回true即可。
- 9.ListIterator与普通的Iterator相比，增加了向前迭代的功能，而且还可以通过add方法向List集合中添加元素。
- 10.PriorityQueue是比较标准的队列实现，而不是绝对标准的队列实现，因为它保存队列元素时会将队列元素按大小重新排列。
- 11.LinkedList与ArrayList，ArrayDeque的实现机制完全不同，后两者的内部以数组的形式来保存集合中的元素，因此随机访问集合元素时有较好的性能，前者在插入、删除元素时的性能非常出色。
- 12.在Java中除了RuntimeException及其任何子类，其他异常类都被Java的异常强制处理机制强制异常处理。
    关于那些被强制异常处理的代码块，必须进行异常处理，否则编译器会提示“Unhandled exception type Exception”错误警告。     
