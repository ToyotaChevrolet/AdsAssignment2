
public class MyLinkedList<T> implements MyList<T> {

    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyLinkedList() {
    }

    public MyLinkedList(MyNode<T> newNode) {
        head = newNode;
    }

    private static class MyNode<E> {
        E data;
        MyNode<E> next;
        MyNode<E> prev;

        MyNode(E data) {
            this.data = data;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        MyNode<T> current = head;
        while (current != null) {
            if (current.data == o) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void add(T newItem) {
        MyNode<T> newNode = new MyNode<>(newItem);
        if (head == null) {
            head = tail = newNode;
            head.prev = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        tail.next = null;
        size++;
    }

    @Override
    public void add(T newItem, int index) {
        MyNode<T> current = head;
        MyNode<T> newNode = new MyNode<>(newItem);
        if (index == 0) {
            head.prev = newNode;
            newNode.next = head;
            newNode.prev = null;
            head = newNode;
            size++;
            return;
        }
        int halfLen = size / 2;
        if (index <= halfLen) {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i >= index - 1; i--) {
                current = current.prev;
            }
        }

        newNode.next = current.next;
        current.next.prev = newNode;
        current.next = newNode;
        newNode.prev = current;
        size++;
    }

    @Override
    public boolean remove(T item) {
        MyNode<T> current = head;
        int index = 0;
        while (current.next != null) {
            if (current.data == item) {
                remove(index);
                return true;
            }
            current = current.next;
            index++;
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (head == null) {
            return null;
        }
        MyNode<T> current = head;
        if (index == 0) {
            T removed = current.data;
            head = current.next;
            size--;
            return removed;
        }
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        T removed = current.data;
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        size--;
        return removed;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }


    @Override
    public int indexOf(Object o) {
        MyNode<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.data == o) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        MyNode<T> current = tail;
        int index = size - 1;
        while (current.prev != null) {
            if (current.data == o) {
                return index;
            }
            current = current.prev;
            index--;
        }
        return -1;
    }

    @Override
    public void sort() {
        MyNode<T> current = head;
        MyNode<T> wholeList = head;
        while(wholeList != null) {
            while (current.next != null) {
                if (((Comparable<T>) current.data).compareTo(current.next.data) > 0) {
                    T temp = current.next.data;
                    current.next.data = current.data;
                    current.data = temp;
                }
                current = current.next;
            }
            current = head;
            wholeList = wholeList.next;
        }
    }

}
