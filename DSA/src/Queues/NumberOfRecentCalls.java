package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    Queue<Integer> q = new LinkedList<>();

    

    public int ping(int t) {


        while(!q.isEmpty() && t-3000 > q.peek()){
            q.poll();
        }

        q.offer(t);

        return q.size();
    }
}
