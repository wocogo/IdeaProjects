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
            StringBuffer s = new StringBuffer();
            try {
                for (int i = startP; i< startP+endP; i++){
                    s.append(mark);
                    Thread.sleep(1);
                    s.append(" --- ");
                    Thread.sleep(1);
                    s.append(i+"");
                    list.add(s.toString());
                    Thread.sleep(3);
                    if((i > 110500) && mark.equals("#3: ")){
                        throw new Exception("try exception");
                    }
                    s.setLength(0);
                }
                FillData.setList(list);
                ThreadObj.doneMark += mark;
            }catch (Exception e){
                e.printStackTrace();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
