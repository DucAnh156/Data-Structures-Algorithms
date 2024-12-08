package EncapsulationAndInformationHiding;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class EncapAndInfoHiding {

    public class Stack {
        private ArrayList<Object> stackList; // Private data member

        public Stack() {
            stackList = new ArrayList<>(); // Constructor initializes the stack
        }

        public void push(Object item) {
            stackList.add(item); // Adds an item to the stack
        }

        public Object pop() {
            if (isEmpty()) {
                throw new EmptyStackException(); // Behavior encapsulation: checks for underflow
            }
            return stackList.remove(stackList.size() - 1); // Removes and returns the top item
        }

        public Object peek() {
            if (isEmpty()) {
                throw new EmptyStackException(); // Checks for underflow
            }
            return stackList.get(stackList.size() - 1); // Returns the top item without removing it
        }

        public boolean isEmpty() {
            return stackList.isEmpty(); // Checks if the stack is empty
        }
    }
}
