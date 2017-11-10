package cn.helssm.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WolfgangW on 11/10/17.
 */
public class ThreadObj implements Runnable{
    private List<String > queue = new ArrayList();

    public ThreadObj(List<String > queue){
        this.queue = queue;
    }

    public void run() {
        String s = null;
        while (true){
            synchronized (queue){
                try {
                    if (queue.isEmpty()){
                        queue.wait();
                        System.out.println("waiting for new values");
                    }
                    s = queue.get(0);
                    Thread.sleep(20);
                    String bbb = queue.remove(0);
                    if(!s.equals(bbb)){
                        System.out.println("!!!!!!!!!!!!!!!!!!!!"+s+" not equal "+ bbb);
                        System.out.println("!!!!!!!!!!!!!!!wait");
                        queue.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            if(s != null){
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(s);
            }
        }
    }
}