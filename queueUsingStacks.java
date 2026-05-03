public class queueUsingStacks {
    static class Stack {
        private int stk_size = 0;
        private int capacity;
        private int[] stack;

        public Stack(int capacity) {
            if (capacity <= 0) {
                throw new IllegalArgumentException("Capacity must be positive");
            }
            this.capacity = capacity;
            stack = new int[capacity];
        }

        public boolean isFull() {
            return stk_size == capacity;
        }

        public int size() {
            return stk_size;
        }

        public boolean isEmpty() {
            return stk_size == 0;
        }

        public int peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return stack[stk_size - 1];
        }

        public int pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack underflow");
            }
            return stack[--stk_size];
        }

        public void push(int data) {
            if (isFull()) {
                throw new IllegalStateException("Stack overflow");
            }
            stack[stk_size++] = data;
        }
    }

    public void dequeue(Stack stack1, Stack stack2) {
        if (stack1.isFull()) return;
        
        if (stack1.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        else return;

        stack2.pop();

        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public void enqueue(Stack stack1, Stack stack2, int data) {
        if (!stack1.isFull()) {
            stack1.push(data);
        }
        else {
            System.out.println("Queue is full");
        }
    }
}

