package cn.helssm.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WolfgangW on 11/17/17.
 */
public class FillData {
    private int startPoint,endPoint;
    public static List<String> queue = new ArrayList<String>();
    public static void setList(List<String> list){
        StringBuilder stringBuilder = new StringBuilder("");
        for (String x : list){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            stringBuilder.append(x);
        }
        synchronized (queue){
            queue.add(stringBuilder.substring(0, stringBuilder.length()-1));
            queue.notifyAll();
        }
    }
}
