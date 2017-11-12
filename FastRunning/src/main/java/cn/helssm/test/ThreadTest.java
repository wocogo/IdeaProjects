package cn.helssm.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WolfgangW on 11/10/17.
 */
public class ThreadTest {
    public static void main(String[] args) {

        T1 tf1 = new T1(10, 1100, 5000, "#1: ");
        T1 tf2 = new T1(11000, 11100, 5000, "#2: ");
        T1 tf3 = new T1(110000, 111100, 5000, "#3: ");
        T1 tf4 = new T1(310000, 331100, 5000, "#4: ");
        T1 tf5 = new T1(210000, 221100, 6000, "#5: ");
        T1 tf6 = new T1(410000, 441100, 5000, "#6: ");
        T1 tf7 = new T1(510000, 551100, 3000, "#7: ");
        T1 tf8 = new T1(610000, 661100, 7000, "#8: ");
        T1 tf9 = new T1(710000, 771100, 8000, "#9: ");
        new Thread(new ThreadObj(ThreadFillData.queue)).start();
        new Thread(tf1).start();
        new Thread(tf2).start();
        new Thread(tf3).start();
        new Thread(tf4).start();
        new Thread(tf5).start();
        new Thread(tf6).start();
        new Thread(tf7).start();
        new Thread(tf8).start();
        new Thread(tf9).start();
    }
}
