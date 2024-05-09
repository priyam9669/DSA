package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * FindMeadianFromDataStream
 */
public class FindMeadianFromDataStream {

    PriorityQueue<Integer> smallHeap;
    PriorityQueue<Integer> bigHeap;
    public void MedianFinder() {
        smallHeap= new PriorityQueue<>(Collections.reverseOrder());
        bigHeap= new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        int polled=0;
        smallHeap.add(num);
        if(bigHeap.size()>0){
            if(smallHeap.peek()>bigHeap.peek()){
                polled= smallHeap.poll();
                bigHeap.add(polled);
            }
        }
        
        //System.out.println(smallHeap);
        if(smallHeap.size()>bigHeap.size()+1){
            polled=smallHeap.poll();
            bigHeap.add(polled);
        }
        if(bigHeap.size()>smallHeap.size()+1){
            polled=bigHeap.poll();
            smallHeap.add(polled);
        }
    }
    
    public double findMedian() {
        //System.out.println(smallHeap.peek());
        if(smallHeap.size()>bigHeap.size()){
            return smallHeap.peek();
            
        }

        if(smallHeap.size()< bigHeap.size()){
            return bigHeap.peek();
            
        }

        return (smallHeap.peek()+ bigHeap.peek())/2.0;
    }
}