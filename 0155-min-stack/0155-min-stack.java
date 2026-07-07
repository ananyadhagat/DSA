class MinStack {

    private Stack<Long> st;
    private long min;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {

        if (st.isEmpty()) {
            min = val;
            st.push((long) val);
        } 
        else if (val >= min) {
            st.push((long) val);
        } 
        else {
            st.push(2L * val - min);
            min = val;
        }
    }

    public void pop() {

        if (st.isEmpty()) return;

        long x = st.pop();

        if (x < min) {
            min = 2 * min - x;
        }
    }

    public int top() {

        if (st.isEmpty()) return -1;

        long x = st.peek();

        if (x >= min)
            return (int) x;

        return (int) min;
    }

    public int getMin() {
        return (int) min;
    }
}
