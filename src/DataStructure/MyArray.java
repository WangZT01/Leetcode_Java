package DataStructure;

import java.util.NoSuchElementException;

public class MyArray<E> {

    private E[] data;
    // number of current data
    private int size;
    private static final int INIT_CAP = 1;

    public MyArray(){
        this(INIT_CAP);
    }
    public MyArray(int initCapacity){
        data = (E[]) new Object[initCapacity];
        size = 0;
    }
    public E get(int index){
        checkElementIndex(index);
        return data[index];
    }
    public E set(int index, E e){
        checkElementIndex(index);
        E oldvalue = data[index];
        data[index] = e;
        return oldvalue;
    }
    public void addLast(E e){
        int cap = data.length;
        if(cap == size){
            resize(cap * 2);
        }
        data[size] = e;
        size += 1;
    }

    public void add(E e, int index){
        checkPositionIndex(index);
        int cap = data.length;
        if(cap == size){
            resize(cap * 2);
        }
        //System.arraycopy(data, index, data, index +1, size - index);
        for(int i = size; i > index; i--){
            data[i] = data[i - 1];
        }
        data[index] = e;
        size += 1;

    }

    public E removeLast(E e){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if (size < data.length /4){
            resize(data.length /2);
        }
        E deleteVal = data[size - 1];
        data[size - 1] = null;
        size -= 1;
        return deleteVal;
    }
    public E remove(int index){
        checkElementIndex(index);
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        E deleteVal = data[size - 1];
        data[size - 1] = null;
        size -= 1;
        return deleteVal;
    }

    private boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    private boolean isElementIndex(int index){
        return index >= 0 && index < size;
    }
    private boolean isPositionIndex(int index){
        return index >= 0 && index <=size;
    }

    private void checkElementIndex(int index){
        if (!isElementIndex(index)){
            throw new IndexOutOfBoundsException("Index: " + index + ", size:" + size);
        }
    }

    private void checkPositionIndex(int index){
        if (!isPositionIndex(index)){
            throw new IndexOutOfBoundsException("Index: " + index + ", size:" + size);
        }
    }

    private void resize(int newCap){
        E[] temp = (E[]) new Object[newCap];

        System.arraycopy(data, 0, temp, 0, size);
        data = temp;
    }
}
