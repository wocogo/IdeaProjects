package cn.helssm.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by WolfgangW on 11/10/17.
 */
public class ThreadObj implements Runnable{
    private List<String > queue = new ArrayList();
    static String doneMark = "";
    public ThreadObj(List<String > queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        Random random = new Random();
        String duplicate = null;
        Object s = null;
        while (true){
            synchronized (queue){
                try {
                    if (queue.isEmpty()){
                        System.out.println("waiting for new values "+ duplicate);
                        System.out.println("doneMark: "+ doneMark);
                        queue.wait();
                    }
                    s = queue.get(0);
                    int bb = random.nextInt(20);
                    Thread.sleep(bb);
                    String bbb = queue.remove(0);
                    if(!s.equals(bbb)){
                        System.out.println("!!!!!!!!!!!!!!!!!!!!"+s+" not equal "+ bbb);
                        System.out.println("!!!!!!!!!!!!!!!wait");
                        duplicate += "s: "+s+ " bbb: "+bbb;
                        queue.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            if(s != null){
                try {

                    int x = random.nextInt(3);
                    Thread.sleep(x);
                System.out.println(s);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
