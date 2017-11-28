package cn.helssm.test.futuresimulator;

/**
 * Created by Administrator on 2017/11/29.
 */
public class RealData implements Data {
    protected final String result;
    public RealData(String para){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i< 10; i++){
            sb.append(para);
            try {
                Thread.sleep(100);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        result = sb.toString();
    }
    public String getResult() {
        return result;
    }
}
