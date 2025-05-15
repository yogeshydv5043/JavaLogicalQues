package Collection;

import java.util.LinkedList;

public class CompleteLinkedList {

        public static void main(String[] args) {
            // Create a LinkedList
            LinkedList<String> list = new LinkedList<>();

            // 1. Adding Elements
            list.add("Apple");          // Add to end
            list.addFirst("Banana");     // Add to beginning
            list.addLast("Cherry");      // Add to end (same as add())
            list.add(1, "Blueberry");    // Add at specific index
            System.out.println("After adding elements: " + list);

            // 2. Accessing Elements
            System.out.println("\nAccessing elements:");
            System.out.println("get(2): " + list.get(2));
            System.out.println("getFirst(): " + list.getFirst());
            System.out.println("getLast(): " + list.getLast());
            System.out.println("peek(): " + list.peek());       // Retrieves head
            System.out.println("peekFirst(): " + list.peekFirst());
            System.out.println("peekLast(): " + list.peekLast());
            System.out.println("element(): " + list.element()); // Same as getFirst()

            // 3. Checking Elements
            System.out.println("\nChecking elements:");
            System.out.println("contains('Apple'): " + list.contains("Apple"));
            System.out.println("indexOf('Blueberry'): " + list.indexOf("Blueberry"));
            System.out.println("lastIndexOf('Cherry'): " + list.lastIndexOf("Cherry"));
            System.out.println("size(): " + list.size());
            System.out.println("isEmpty(): " + list.isEmpty());

            // 4. Removing Elements
            System.out.println("\nRemoving elements:");
            System.out.println("remove(): " + list.remove());       // Removes head
            System.out.println("remove(1): " + list.remove(1));     // Remove at index
            System.out.println("remove('Apple'): " + list.remove("Apple")); // Remove by object
            System.out.println("removeFirst(): " + list.removeFirst());
            System.out.println("removeLast(): " + list.removeLast());
            System.out.println("After removals: " + list);

            // 5. Queue Operations (FIFO)
            list.clear();
            list.add("One");
            list.add("Two");
            list.add("Three");
            System.out.println("\nQueue operations:");
            System.out.println("offer('Four'): " + list.offer("Four")); // Add to end
            System.out.println("poll(): " + list.poll());               // Remove head
            System.out.println("After queue ops: " + list);

            // 6. Stack Operations (LIFO)
            System.out.println("\nStack operations:");
            list.push("Five");    // Push to head
            System.out.println("After push: " + list);
            System.out.println("pop(): " + list.pop()); // Remove from head
            System.out.println("After pop: " + list);

            // 7. Other Operations
            System.out.println("\nOther operations:");
            LinkedList<String> clone = (LinkedList<String>) list.clone();
            System.out.println("Cloned list: " + clone);

            Object[] array = list.toArray();
            System.out.println("Array conversion: " + array[0]);

            list.set(0, "Updated");
            System.out.println("After set(0): " + list);

            list.clear();
            System.out.println("After clear(): " + list);
        }

}
