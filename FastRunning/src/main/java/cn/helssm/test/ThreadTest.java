package cn.helssm.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WolfgangW on 11/10/17.
 */
public class ThreadTest {
    public static void main(String[] args) {

//        new Thread(new ThreadObj()).start();


        ThreadFillData tf1 = new ThreadFillData(0, 100);

//        ThreadFillData tf3 = new ThreadFillData(10000, 101000);
//        List<String> l1 = tf1.generateList();
//        List<String> l2 = tf2.generateList();
//        List<String> l3 = tf3.generateList();
//        ThreadObj to1 = new ThreadObj(tf1.queue);
//        new Thread(to1).start();
        new Thread(new ThreadObj(tf1.queue)).start();
//        new Thread(new ThreadObj(tf1.queue)).start();
//        ThreadFillData tf2 = new ThreadFillData(1000, 1100);
//        new Thread(tf1).start();
//        new Thread(tf3).start();
//        new Thread(tf3).start();
        tf1.resetPoints(100, 200);
        new Thread(tf1).start();
        tf1.resetPoints(200, 300);
        new Thread(tf1).start();
        tf1.resetPoints(300, 400);
        new Thread(tf1).start();

    }
}
