package Collection.queue_interface;

  import java.util.Arrays;

 public class CircularBufferSimulation {
        private int[] buffer;
        private int head;
        private int tail;
        private int size;
        private int capacity;

        public CircularBufferSimulation(int capacity) {
            this.capacity = capacity;
            this.buffer = new int[capacity];
            this.head = 0;
            this.tail = 0;
            this.size = 0;
        }

        public void insert(int value) {
            if (size == capacity) {
                head = (head + 1) % capacity;
            } else {
                size++;
            }
            buffer[tail] = value;
            tail = (tail + 1) % capacity;
        }

        public int[] getBuffer() {
            int[] result = new int[size];
            for (int i = 0; i < size; i++) {
                result[i] = buffer[(head + i) % capacity];
            }
            return result;
        }

        public static void main(String[] args) {
            CircularBufferSimulation cbs = new CircularBufferSimulation(3);
            cbs.insert(1);
            cbs.insert(2);
            cbs.insert(3);
            System.out.println("Buffer: " + Arrays.toString(cbs.getBuffer()));

            cbs.insert(4);
            System.out.println("Buffer: " + Arrays.toString(cbs.getBuffer()));
        }
    }

