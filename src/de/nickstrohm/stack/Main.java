package de.nickstrohm.stack;

public class Main {

    public static void main(String[] args) {
	    Stack stack = new Stack(10);
        stack.push(7);
        stack.push(33);
        stack.push(2);
        stack.pop();
        stack.push(123);
        stack.push(42);
        stack.write();
        stack.pop();

        System.out.println(stack.top());
    }

    public static String strJoin(int[] aArr, String sSep) {
        StringBuilder sbStr = new StringBuilder();
        for (int i = 0, il = aArr.length; i < il; i++) {
            if (i > 0)
                sbStr.append(sSep);
            sbStr.append(aArr[i]);
        }
        return sbStr.toString();
    }
}
