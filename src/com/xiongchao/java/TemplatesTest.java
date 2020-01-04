package com.xiongchao.java;

import java.util.ArrayList;

/**
 * @author xiong
 * @date 2020/1/2 - 23:31
 *
 * 1、IDEA中代码模板所处的位置：settings-editor-Live Templates
 *2、常用的模板
 */
public class TemplatesTest {
    //模板六：prsf
    private static final int num=1;

    //模板一：main
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("helloword");
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("TemplatesTest.main");
        System.out.println("args = [" + args + "]");
        int s1=10;
        System.out.println("s1 = " + s1);
        System.out.println(s1);
        //模板三：fori
        String arr[]=new String[]{"math","english","geology","phylosophy"};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);

        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            System.out.println(list);
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list);
        }
        //变形：list.forr(倒序遍历)
        for (int i = list.size() - 1; i >= 0; i--) {

            System.out.println(list);
        }
    }

    public void method(){
        System.out.println("TemplatesTest.method");
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        //模板五：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }


    }

}
