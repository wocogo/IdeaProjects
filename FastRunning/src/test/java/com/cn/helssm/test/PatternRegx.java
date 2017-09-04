package com.cn.helssm.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by WolfgangW on 09/01/17.
 */
public class PatternRegx {
    public static void main(String args[]){

        String testStr = "abcede{@columnId=order_no}eefd";

        String testA = testStr.replaceAll("(\\{@columnId=)(.+?)(\\})", "$2");
        System.out.println(testA+"$$$");
        Pattern pattern = Pattern.compile("(?<=\\{@columnId=)(.+?)(?=\\})");
        //Pattern pattern = Pattern.compile("(\\{@columnId=)(.+?)(\\})");
        Matcher matcher = pattern.matcher(testStr);
        if(matcher.find()){
            System.out.println("***********"+ matcher.group());
            //System.out.println("***********"+ matcher.group(2));
        }

        testStr = "abcdddef{1}";
        String testStr1 = "{666},{222}";

//        testStr.replaceFirst()
        testStr = testStr.replaceAll("(\\{)(.+?)(\\})", "$2");
        System.out.println(testStr);
        testStr1 = testStr1.replace(testStr1.replaceFirst("(\\{)(.+?)(\\})", ""),"");
        System.out.println(testStr1);
        //testStr1 = testStr1.replaceFirst("(\\{)(.+?)(\\})", "bbb");
        //System.out.println(testStr1);


        String testStr2 = "{AAA},x{BBB},ea{CCC}";
        String testStrx = "e3{?}aaeb{?}vdfet{?}";


        //String tmpStrReplace =

        while(testStrx.indexOf("{?}")>-1){
            //remove all useless symbol between }{
            testStr2 = testStr2.replaceAll("(?<=\\})(.+?)(?=\\{)","");
            System.out.println("%%%%  "+testStr2);
            String tmpStr = testStr2.replaceFirst("(\\{)(.+?)(\\})","");
            tmpStr = testStr2.replace(tmpStr,"");
            //kick out the first matched {value}
            testStr2 = testStr2.replace(tmpStr,"");
            //remove the bracket {}
            tmpStr = tmpStr.replaceFirst("(\\{)(.+?)(\\})","$2");
            System.out.println(testStrx+"---");
            testStrx = testStrx.replaceFirst("(\\{\\?\\})", tmpStr);
            System.out.println(testStrx+"xxx");
            System.out.println(tmpStr+"***");
        }




    }
}
