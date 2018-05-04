package cn.helssm.test;

/**
 * Created by WolfgangW on 04/11/18.
 */
public class IAddAdd {

    public static void main(String[] args) {
//        int i = 0;
//        i++;
//        System.out.println(i);
//        System.out.println(i);
//        int j = 5;
//        ++j;
//        System.out.println(j);
//        System.out.println(j);
//        ================

//        System.out.println(5.00 - 4.90);
//        System.out.println(300 - 210);
//
//        ==================
//        OverLoad o = new OverLoad();
//        o.test(null);
//
//        =================
//        System.out.println("|DF|A3".split("|").length);

        System.out.println("Length: " +  "|DF|A3".split("|").length);


        String [] xx =  "|DF|A3".split("|");
        for(int i = 0; i < xx.length; i++)
        System.out.println(xx[i]);
        System.out.println("===");
        String str="abcdefg";
        System.out.println("indexof: "+ str.substring(2,5).indexOf('d'));

//        Char c3 = 'x';
//        char c4 = '';
//        char c1='\"';
//        char c5=65;
//        System.out.println(c3);
//        System.out.println(c1);
//        System.out.println(c5);
    }


}
class OverLoad{
    public void test(Object o) {
        System.out.println("new Object");
    }

    public void test(String s){
        System.out.println("new String");
    }

//    public void modify() {
//        int I, j, k;
//        I = 100;
//        while (I > 0) {
//            j = I * 2;
//            System.out.println("Thevalueofjis" + j);
//            k = k + 1;
//            I--;
//        }
//    }

}


//class Test {
//    public static void main(String[] args) {
//        byte b = 2, e = 3; //------1
//        byte f = b + e;//------2
//        System.out.println(f);
//    }
//}
