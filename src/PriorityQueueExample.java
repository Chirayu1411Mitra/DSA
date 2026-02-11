import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        // 1. MIN-HEAP (Default Behavior)
        // Stores elements in natural ascending order. The smallest element has the highest priority.
        System.out.println("--- Min-Heap Example (Numbers) ---");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements to the queue using offer(). Complexity: O(log n)
        minHeap.offer(30);
        minHeap.offer(10);
        minHeap.offer(50);
        minHeap.offer(20);

        // View the top element (the minimum) without removing it using peek(). Complexity: O(1)
        System.out.println("Top element (peek): " + minHeap.peek()); // Expected: 10

        // Remove and print elements. They will be polled in ascending order.
        System.out.println("Polling elements from min-heap:");
        while (!minHeap.isEmpty()) {
            // poll() removes and returns the highest-priority element. Complexity: O(log n)
            System.out.println(minHeap.poll()); // Prints 10, 20, 30, 50
        }
        System.out.println();


        // 2. MAX-HEAP (Using a custom comparator)
        // We provide a comparator to reverse the natural order. The largest element has the highest priority.
        System.out.println("--- Max-Heap Example (Strings) ---");
        // For numbers: new PriorityQueue<>((a, b) -> b - a) or new PriorityQueue<>(Collections.reverseOrder())
        PriorityQueue<String> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements
        maxHeap.offer("Banana");
        maxHeap.offer("Apple");
        maxHeap.offer("Date");
        maxHeap.offer("Cherry");

        // View the top element (the maximum, lexicographically)
        System.out.println("Top element (peek): " + maxHeap.peek()); // Expected: Date

        // Remove and print elements. They will be polled in descending lexicographical order.
        System.out.println("Polling elements from max-heap:");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll()); // Prints Date, Cherry, Banana, Apple
        }
    }
}