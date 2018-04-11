package cn.helssm.test;

/**
 * Created by WolfgangW on 09/12/17.
 */
public class TryCatch {

    static String getValue(String x) throws Exception {
        System.out.println(Math.round(1.3));
        System.out.println(Math.floor(1.3));
        System.out.println(Math.ceil(1.3));
        System.out.println(Math.round(-1.3));
        System.out.println(Math.floor(-1.3));
        System.out.println(Math.ceil(-1.3));

        if("".equals(x)){
            throw new Exception("");
        }
        if("x".equals(x)){
            return x;
        }

        return "init";
    }

    public static void main(String[] args) {
        String x = "new";
        try {
            x = getValue("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(x);

    }
}
