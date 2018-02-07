package de.nickstrohm.stack;

public class Stack {
    private int[] _stack;

    public Stack(int size) {
        _stack = new int[size];
    }

    /**
     * Adds an element at the beginning of the stack.
     * If the amount of pushed elements is bigger then the stack size the overflowing elements will be discarded.
     * @param x {int} Value to add
     */
    public void push(int x) {
        for (int i = _stack.length - 1; i > 0; i--) {
            _stack[i] = _stack[i - 1];
        }

        _stack[0] = x;
    }

    /**
     * Removes the element at the beginning of the stack and moves every other one step forward.
     * @return {int} Value that got removed
     */
    public int pop() {
        int tmp = _stack[0];

        for (int i = 1; i < _stack.length - 1; i++) {
            _stack[i - 1] = _stack[i];
        }

        return tmp;
    }

    /**
     * Returns the first element without removing it.
     * @return {int} Value at index 0
     */
    public int top() {
        return _stack[0];
    }

    /**
     * Prints the content of the stack.
     */
    public void write() {
        System.out.println(Main.strJoin(_stack, ", "));
    }
}
