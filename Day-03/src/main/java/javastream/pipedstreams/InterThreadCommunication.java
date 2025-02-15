package javastream.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
    class Writer implements Runnable {
        private PipedOutputStream pos;

        public Writer(PipedOutputStream pos) {
            this.pos = pos;
        }

        @Override
        public void run() {
            try {
                String message = "Hello from Writer Thread!";
                System.out.println("Writer: Writing data...");
                pos.write(message.getBytes());
                pos.close();
            } catch (IOException e) {
                System.out.println("Writer Error: " + e.getMessage());
            }
        }
    }
    class Reader implements Runnable {
        private PipedInputStream pis;

        public Reader(PipedInputStream pis) {
            this.pis = pis;
        }

        @Override
        public void run() {
            try {
                System.out.println("Reader: Reading data...");
                byte[] buffer = new byte[1024];
                int bytesRead = pis.read(buffer);
                System.out.println("Reader received: " + new String(buffer, 0, bytesRead));
                pis.close(); // Close stream after reading
            } catch (IOException e) {
                System.out.println("Reader Error: " + e.getMessage());
            }
        }
    }
public class InterThreadCommunication {
        public static void main(String[] args) {
            try {
                PipedOutputStream pos = new PipedOutputStream();
                PipedInputStream pis = new PipedInputStream(pos);

                Thread writerThread = new Thread(new Writer(pos));
                Thread readerThread = new Thread(new Reader(pis));

                writerThread.start();
                readerThread.start();

                writerThread.join();
                readerThread.join();

            } catch (IOException | InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
}
        }

    }
