package com.github.mateuszhorczak;

import java.util.EmptyStackException;

public class Queue {
    private final int maxSize;
    private int size;
    private int[] array;


    public Queue(int maxSize, int n) {
        this.maxSize = maxSize;
        this.size = n + 1;
        array = new int[maxSize];

        for (int i = 0; i <= n; i++) {
            array[i] = i;
        }

    }

    public void offer(int value) {
        if (isFull()) {
            throw new IllegalArgumentException(String.format("Maximum stack size: %s has been reached.", maxSize));
        }


        array[size++] = value;
    }

    public int poll() {
        if (isEmpty()) {
            throw new EmptyStackException(); //TODO printStackTrace
        }
        int value = array[0];
        size--;
        System.arraycopy(array, 1, array, 0, size);
        array[size] = 0;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException(); //TODO printStackTrace
        }
        return array[0];
    }


    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return size == maxSize;
    }

}
