package cn.helssm.test.future;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2017/11/29.
 */
public class RealData implements Callable<String> {
    private String para;
    public RealData(String para){
        this.para = para;
    }
    public String call() throws Exception {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i< 10; i++){
            sb.append(para);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        FutureTask<String> future = new FutureTask<String>(new RealData("a"));
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.submit(future);
        System.out.println("finished request");
        try {
            System.out.println("result = "+ future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
