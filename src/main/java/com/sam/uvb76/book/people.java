package com.sam.uvb76.book;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLDecoder;

/**
 * Created by LiYangpan on 2018/7/29  4:26 PM.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class people {

    String name;

    int age;

    String ooo;

    int temp;

    int tempclass;

    static {
        //System.out.println("what ? static!");
    }

    static class Game extends WeakReference<String>{
        byte[] value;

        Game(String a, byte[] b){
            super(a);
            this.value = b;
        }
    }





    public static void main(String[] args) throws ClassNotFoundException, InterruptedException, UnsupportedEncodingException {

        ThreadLocal threadLocal = new ThreadLocal();

        threadLocal.set("11111");

//        File f1 = new File("/Users/sam/中文＋嗯嗯嗯");
//
//        f1.mkdir();
//
//        System.out.println(f1.exists());


//        URL aaa = Thread.currentThread().getContextClassLoader().getResource("");

//        System.out.println(aaa);



//        System.out.println(URLDecoder.decode("中文+123131", "utf-8"));
//        System.out.println(System.getProperty("user.dir"));






//        Game g1 = new Game("tom", new byte[1024 * 1024 * 2]);
//
//        //System.out.println(g1.get());
//
//        System.out.println(g1.value == null);
//
//        g1.clear();
//
//        g1.value = null;
//
//        g1.value = new byte[1024 * 1024 * 4];
//
//        g1.value = null;
//
//        System.gc();
//
//        System.out.println(g1.value == null);


        //0----------------------------------------------------------------------------------------


        // ClassLoader cl = ClassLoader.getSystemClassLoader();

        //cl.getParent().loadClass("com.sam.uvb76.book.Svt");
       // System.out.println(cl.getParent().getParent());
        //System.out.println(cl.getParent());

        //System.out.println(cl);

        //Class.forName("com.sam.uvb76.book.Svt");


        //Svt s1 = new Svt();


//        String aaa = "123";
//
//        int bbb = Integer.parseInt(aaa);
//
//        System.out.println(bbb);




//        SoftReference ccc = new SoftReference(new byte[1024 * 1024 * 6]);
//
//        System.out.println(ccc.get() == null);
//
//        byte[] bytes = new byte[1024 * 1024 * 5];
//
//        //System.gc();
//
//        System.out.println(ccc.get() == null);




//        WeakReference<people> wf = new WeakReference<>(new people());
//
//        System.out.println(wf.get() == null);
//
//        System.gc();
//
//        System.out.println(wf.get() == null);


//        String aaa = "{\"content\":\"66\",\"id\":\"ab6b768c-6702-44e6-8eb4-c080fd1b981d\",\"length\":2,\"msg_type\":\"text\"}";
//        Message msgRecv = JSON.parseObject(aaa,Message.class);
//
//        msgRecv.toString();
//
//
//
//        WeakReference<String> ref = new WeakReference<String>(new String("zbc"));
//
//        System.out.println(ref.get() == null);
//
//        System.gc();
//
//        System.out.println(ref.get() == null);


    }
}
