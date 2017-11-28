package cn.helssm.test.futuresimulator;

/**
 * Created by Administrator on 2017/11/29.
 */
public class MainEntry {
    public static void main(String[] args) {
        Client client = new Client();
        Data data = client.request("name");
        System.out.println("finished request");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("result = " + data.getResult());
    }
}
