class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

int count=0;
        for (int i = 0; i < students.length; i++) {
            q1.add(students[i]);
        }
        for (int i = 0; i < sandwiches.length; i++) {
            q2.add(sandwiches[i]);
        }
        while (!q1.isEmpty() && count<q1.size()) {        
            if (q1.peek() == q2.peek()) {
                q1.poll();
                q2.poll();
                count=0;
            } else {
                q1.add(q1.poll());
                count++;
            }

        }

        return q1.size();

    }
}