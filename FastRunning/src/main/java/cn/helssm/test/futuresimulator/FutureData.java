package cn.helssm.test.futuresimulator;

/**
 * Created by Administrator on 2017/11/29.
 */
public class FutureData implements Data {
    protected RealData realData = null;
    protected boolean isReady = false;
    public synchronized void setRealData(RealData realData){
        if(isReady){
            return;
        }
        this.realData = realData;
        isReady = true;
        notifyAll();
    }
    public synchronized String getResult() {
        while (!isReady){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return realData.result;
    }
}
