package com.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Input {
    int n;
    int k;
    Queue<Integer> queue;

    public Input(int n, int k, Queue<Integer> queue) {
        this.queue = queue;
        this.n = n;
        this.k = k;
    }

}

public class ReverseFirstKElements {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Input takeInput() throws NumberFormatException, IOException {
        String[] n_k = br.readLine().trim().split(" ");

        int n = Integer.parseInt(n_k[0]);
        int k = Integer.parseInt(n_k[1]);

        String[] values = br.readLine().trim().split(" ");

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(values[i]));
        }

        return new Input(n, k, queue);

    }

    public static void reverseQueue(Queue<Integer> input, int iter, int max) {
        if (input.isEmpty() || iter==max){
            return;
        }
        int data=input.peek();
        input.remove();
        reverseQueue(input, ++iter, max);
        input.add(data);
    }

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        reverseQueue(input, 0, k);
        int size=input.size();
        for (int i=0;i<size-k;i++){
            input.add(input.remove());
        }
        return input;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Input input = takeInput();

        int n = input.n;
        int k = input.k;
        Queue<Integer> queue = input.queue;

        queue = reverseKElements(queue, k);


        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
