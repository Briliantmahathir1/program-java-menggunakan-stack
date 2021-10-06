/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @param <T>
 * @Briliant Mahathir
 */

public class Stack_generic <T> {
    public T[] data;
    public int top = 0;
    
    public Stack_generic(int m) {
        data = (T[])new Object[m];
    }
     
    public boolean isEmpty() {
        return top == 0;
    }
    
    public boolean isFull() {
        return top == data.length;
    }
    
    public void push(T nilai) {
        if ( !isFull()) {
            data[top] = nilai;
            top = top + 1;
        } else {
            System.out.println("Stack Penuh!");
        }
    } 
    
    public T pop() {
        if (!isEmpty()) {
            top = top - 1;
            T r = data[top];
            return r;
        }else {
            return null;
        } 
    }
    
    public T peek() {
        if( !isEmpty()) {
            return data[top-1];
        } else {
            return null;
        }
    }
}
