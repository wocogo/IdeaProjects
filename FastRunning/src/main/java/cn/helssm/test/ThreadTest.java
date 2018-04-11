package cn.helssm.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by WolfgangW on 11/10/17.
 */
public class ThreadTest {
    public static void main(String[] args) {
        new Thread(new ThreadObj(FillData.queue)).start();
        int seed = 2;
        Random random = new Random();
        for (int i = 0; i< 80; i++){
            new Thread(new T1(10 + i * seed, seed, random.nextInt(20), "#"+ i +": ")).start();
        }
        new Thread(new T1(10 + 1000 * seed, seed, 9000, "#"+ 1000 +": ")).start();
    }
}
