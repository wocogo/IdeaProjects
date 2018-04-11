package cn.helssm.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WolfgangW on 11/10/17.
 */
public class ThreadFillData implements Runnable {
    private int startPoint,endPoint;
    public static List<String> queue = new ArrayList<String>();
    public static void setList(List<String> list){


        synchronized (queue){
            queue.addAll(list);
            queue.notifyAll();
        }
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
