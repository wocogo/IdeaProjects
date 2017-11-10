package cn.helssm.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WolfgangW on 11/10/17.
 */
public class ThreadFillData implements Runnable {
    private int startPoint,endPoint;
    public static List<String> queue = new ArrayList<String>();
    public ThreadFillData(int startPoint, int endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        for (int i = startPoint; i<endPoint; i++){
            this.queue.add(i+"");
//            System.out.println("adding: "+ i);
        }
    }

    public void generateList(){
        for (int i = startPoint; i<endPoint; i++){
            this.queue.add(i+"");
            System.out.println("adding: "+ i);
        }
//        return queue;
    }

    public void resetPoints(int startPoint, int endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public void run() {
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> list = new ArrayList<String>();
        for (int i = startPoint; i<endPoint; i++){
            list.add(i+"");
        }
        synchronized (queue) {
            queue.addAll(list);
            queue.notifyAll();
        }

    }
}
