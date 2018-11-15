import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList implements List {
    private static final int DEF_CAPACITY = 10;
    private int size = 0;
    private Object[] data;

    public ArrayList(int initialSize) {
        if (initialSize > 0){
            this.data = new Object[initialSize];
        }
        else throw new IllegalArgumentException();
    }

    public ArrayList() {
        this.data = new Object[DEF_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        data[size++] = o;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
       Object[] temp = c.toArray();
       int tempLength = temp.length;
       System.arraycopy(temp,0,data,size,tempLength);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        Object[] temp = c.toArray();
        int tempLength = temp.length;
        System.arraycopy(temp,0,data,index,tempLength);
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++)
            if (o.equals(data[i])) return i;
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--)
            if (o.equals(data[i]))return i;
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }
}
