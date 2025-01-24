
package Tuan3;

public class MyStack {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node[] arrNode;
    int cap;
    int lastIdx;

    public MyStack(int cap) {
        this.cap = cap;
        this.arrNode = new Node[cap];
        this.lastIdx = -1;
    }

    public void push(int data) {
        if (lastIdx == cap - 1) {
            increaseCap();
        }
        Node newNode = new Node(data);
        arrNode[++lastIdx] = newNode;
    }
    void increaseCap()
    {
        this.cap*=2;
        Node[] temp = new Node[cap];
        for(int i=0;i<=lastIdx;i++)
        {
            temp[i] = arrNode[i];
        }
        arrNode = temp;
    }

    public void pop() {
        if (lastIdx == -1) {
            System.out.println("Stack is empty");
            return;
        }
        lastIdx--;
    }

    public int get() {
        if (lastIdx == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arrNode[lastIdx].data;
    }


    public void print()
    {
        for(int i=0;i<=lastIdx;i++)
        {
            System.out.print(arrNode[i].data+" ");
        }
        System.out.println();
    }

}
