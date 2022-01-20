package oop.oop10;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public void add (T num) {
        if (isFull()) {
            resize();
        } else {
            data[size++] = num;
        }
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in new array
        for (int  i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size () {
        return size;
    }

    public void set (int index, T value) {
        data[index] = value;
    }
}
