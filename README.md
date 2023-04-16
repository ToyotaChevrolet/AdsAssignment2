# AdsAssignment2
<h1 align="center">Assignment for ADS done in <a href="https://daniilshat.ru/" target="_blank">Java</a> 
<h3 align="center">MyList Interface:</h3>
<h3 align="center">void size() - Get the size of the listv</h3> 
<h3 align="center">void add(T newItem) - Adds a new item to the end of the list.v</h3> 
<h3 align="center">T remove(int index) - Removes the item at the specified index from the list and returns it.</h3> 
  <h3 align="center">T get(int index) - Returns the item at the specified index in the list.</h3> 
  <h3 align="center">boolean contains(Object o) - Returns true if the list contains the specified element.</h3> 
  <h3 align="center">void add(T newItem, int index) - Adds the specified item at the specified position in the list.</h3> 
  <h3 align="center">boolean remove(T item) - Removes the first occurrence of the specified item from the list. Returns true if the item was found and removed.</h3> 
  <h3 align="center">void clear() - Removes all elements from the list.</h3> 
  <h3 align="center">int indexOf(Object o) - Returns the index of the first occurrence of the specified item in the list. Returns -1 if not found.</h3> 
  <h3 align="center">int lastIndexOf(Object o) - Returns the index of the last occurrence of the specified item in the list. Returns -1 if not found.</h3> 
  <h3 align="center">void sort() - Sorts the elements in the list in ascending order.</h3> 
  <h3 align="center"></h3> 
  
# Example of usage
```
MyList<String> myLinkedList = new MyLinkedList<>();
myLinkedList.add(100);
myLinkedList.add(150);
Intger ex = myLinkedList.get(1);
System.out.println(myLinkedList.contains(100));
```
