package Queue;

public class Main {

    public static void main(String[] args){
        Queue myQueue = new Queue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);

        myQueue.deQueue();

        myQueue.getTop();
        myQueue.getBottom();
        myQueue.getHeigth();
        myQueue.getQueue();
    }
}
