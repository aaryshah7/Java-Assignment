//Created By 21CE124 Aary Shah.

package Practical4;

import java.util.*;

public class Queue {
    private ArrayList<Integer> arr;
    private int size;

    Scanner sc = new Scanner(System.in);

    Queue(){
        System.out.println("Enter elements for Queue: ");
        size = 8;
        arr = new ArrayList<Integer>(size);
        for (int i=0;i<size;i++) {
            int a = sc.nextInt();
            arr.add(a);
        }
    }

    Queue(int size){
        System.out.println("Enter elements for Queue: ");
        this.size = size;
        arr = new ArrayList<Integer>(size);
        for (int i=0;i<size;i++) {
            int a = sc.nextInt();
            arr.add(a);
        }
    }

    public void enqueue(int v){
        arr.add(v);
    }

    public int dequeue(){
        arr.remove(3);
        return arr.get(3);
    }

    public boolean empty(){
        return arr.isEmpty();
    }

    public int getSize() {
        return size;
    }

    public void display(){
        System.out.println(arr);
    }
}
