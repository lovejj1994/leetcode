/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * <p>
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
class MinStack {

    protected Integer[] elementData;

    int count;
    Integer min;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        elementData = new Integer[10];
        count = 0;
    }

    public void push(int x) {
        ensureCapacity();
        elementData[count] = x;
        count++;
        findMinElement();
    }

    public void pop() {
        if (count == 0) {
            return;
        }
        elementData[--count] = null;
        findMinElement();
    }

    public int top() {
        if (count == 0) {
            return elementData[count];
        }
        return elementData[count - 1];
    }

    public int getMin() {
        return this.min;
    }

    /**
     * 扩容数组
     */
    void ensureCapacity() {
        if (count >= elementData.length) {
            Integer[] tempData = new Integer[elementData.length + 10];
            for (int i = 0; i < elementData.length; i++) {
                tempData[i] = elementData[i];
            }
            elementData = tempData;
        }
    }

    /**
     * 查找数组最小数
     */
    void findMinElement() {
        if (count == 0) {
            return;
        }
        int min = elementData[0];
        for (int j = 1; j < elementData.length; j++) {
            if (null != elementData[j]) {
                if (min > elementData[j]) {
                    min = elementData[j];
                }
            }
        }
        this.min = min;
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */