package queue;

public class queue {
    int max, size, front,rear;
    int q[];

    queue(int m){
        max = m;
        create();
    }

    void create(){
        q = new int [max];
        size = 0;
        front = rear =-1;
    }
    boolean isEmpty(){
        if (size == 0){
            return true;
        }else {
            return false;
        }
    }
    boolean siFull(){
        if (size == max){
            return true;
        }else {
            return false;
        }
    }
    void enqueqeu (int data){
        if (siFull()) {
            System.out.println("Antrian Sudah Penuh");
        }else {
            if (isEmpty()){
                front = rear = 0;
            }else {
                if (rear == max - 1) {
                    rear = 0;
                }else{
                    rear++;
                }
            }
            q[rear] = data;
            size++;
        }
    }
    int dequeue(){
        int data = 0;
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        }else{
            data = q[front];
            size--;
            if (isEmpty()){
                front = rear = -1;
            }else{
                if (front == max-1){
                    front = 0;
                }else {
                    front++;
                }
            }
        }
        return data;
    }
    void print (){
        if (isEmpty()) {
            System.out.println("Antrian Kosong:");
        }else{
            int i = front;
            while (1!=rear){
                System.out.print(q[i]+"-");
                i = (i+1)%max;
            }
            System.out.println(q[i]+"-");
            System.out.println("Jumlah Antrian :"+size);
        }
    }
}
