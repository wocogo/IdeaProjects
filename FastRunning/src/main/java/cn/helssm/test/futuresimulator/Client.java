package cn.helssm.test.futuresimulator;

/**
 * Created by Administrator on 2017/11/29.
 */
public class Client {
    public Data request(final String queryStr){
        final FutureData future = new FutureData();
        new Thread(){
            public void run(){
                RealData realData = new RealData(queryStr);
                future.setRealData(realData);
            }
        }.start();
        return future;
    }
}
