package cn.helssm.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/12.
 */
public class T1 implements Runnable{
    public int startP,endP, sleepTime;
    public String mark;
    public T1(int startP, int endP, int sleepTime, String mark){
        this.startP = startP;
        this.endP = endP;
        this.sleepTime = sleepTime;
        this.mark = mark;
    }
    public void run() {
        try {
            Thread.sleep(sleepTime);
            List<String> list = new ArrayList<String>();
            for (int i = startP; i< endP; i++){
                Thread.sleep(1);
                list.add(mark + i + "");
            }
            ThreadFillData.setList(list);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
