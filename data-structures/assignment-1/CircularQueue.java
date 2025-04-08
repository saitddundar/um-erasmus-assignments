
public class CircularQueue {

        private int[] queueArray;
        private int front;
        private int rear;
        private int currentSize;
        private int maxSize;



        public CircularQueue(int maxSize) {
            this.maxSize = maxSize;
            this.queueArray = new int[maxSize];
            this.front = -1;
            this.rear =-1;
            this.currentSize = 0;
        }

        public void enqueue(int value) {
            if(isFull()) {
                System.out.println("Queue is full"  );
                return;
            }
            if (isEmpty()){
                front = 0;
            }
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            currentSize++;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty! Cannot dequeue.");
                return -1;
            }

            int removedValue = queueArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            return removedValue;
        }
        public void printQueue() {
                if(isEmpty()) {
                    System.out.println("Queue is empty");
                    return;
                }

            for (int i = 0; i < currentSize; i++) {
                int index = (front + i) % maxSize;
                System.out.print(queueArray[index] + " ");
            }

        }

        public boolean isFull() {
            return (currentSize == maxSize);
        }
        public boolean isEmpty() {
            return (currentSize == 0);
        }


}
