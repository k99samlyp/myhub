package com.sam.uvb76.book.cas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * Created by LiYangpan on 2018-12-26  10:38.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class DataCheckUtils {

    private static Logger log = LoggerFactory.getLogger(DataCheckUtils.class);

    public static final Map<String, String> PROVINCE_INFO = new HashMap<>();

    static {
        PROVINCE_INFO.put("北京","100");
        PROVINCE_INFO.put("广东","200");
        PROVINCE_INFO.put("上海","210");
        PROVINCE_INFO.put("天津","220");
        PROVINCE_INFO.put("重庆","230");
        PROVINCE_INFO.put("辽宁","240");
        PROVINCE_INFO.put("江苏","250");
        PROVINCE_INFO.put("湖北","270");
        PROVINCE_INFO.put("四川","280");
        PROVINCE_INFO.put("陕西","290");
        PROVINCE_INFO.put("河北","311");
        PROVINCE_INFO.put("山西","351");
        PROVINCE_INFO.put("河南","371");
        PROVINCE_INFO.put("吉林","431");
        PROVINCE_INFO.put("黑龙江","451");
        PROVINCE_INFO.put("内蒙古","471");
        PROVINCE_INFO.put("山东","531");
        PROVINCE_INFO.put("安徽","551");
        PROVINCE_INFO.put("浙江","571");
        PROVINCE_INFO.put("福建","591");
        PROVINCE_INFO.put("湖南","731");
        PROVINCE_INFO.put("广西","771");
        PROVINCE_INFO.put("江西","791");
        PROVINCE_INFO.put("贵州","851");
        PROVINCE_INFO.put("云南","871");
        PROVINCE_INFO.put("西藏","891");
        PROVINCE_INFO.put("海南","898");
        PROVINCE_INFO.put("甘肃","931");
        PROVINCE_INFO.put("宁夏","951");
        PROVINCE_INFO.put("青海","971");
        PROVINCE_INFO.put("新疆","991");
    }



    static final ThreadLocal<list> THREAD_LOCAL = new ThreadLocal();

    static AtomicInteger ai = new AtomicInteger(100);

    static AtomicStampedReference<Integer> asp = new AtomicStampedReference<Integer>(100,9800);

    static volatile int sum = 100;


    public static void add(){
        ai.get();

        ai.addAndGet(10);

        ai.get();
    }



    public static void main(String[] args) throws Exception {


//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                list l1 = new list();
//                l1.a = 9800;
//                THREAD_LOCAL.set(l1);
//
//                System.out.println(Thread.currentThread().getId() + "----" + THREAD_LOCAL.get().a);
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                list l2 = new list();
//                l2.a = 9900;
//                THREAD_LOCAL.set(l2);
//                System.out.println(Thread.currentThread().getId() + "----" + THREAD_LOCAL.get().a);
//
//            }
//        }).start();


        Random random = new Random();

        for (int i = 0; i< 30; i++){
//            new Thread(() -> {
//                ai.addAndGet(10);
//                System.out.println(Thread.currentThread().getId() + "----" + ai.get());
//            }).start();

            new Thread(() -> {
                try {
                    Thread.sleep(random.nextInt() & 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                System.out.println(Thread.currentThread().getId() + "----" + ai.get() + "-----" + ai.compareAndSet(100,200));
                System.out.println(Thread.currentThread().getId() + "----" + asp.getReference().toString() + "-----" + asp.compareAndSet(100,200,9800,asp.getStamp() + 1) + "----" + asp.getStamp());

            }).start();
        }

        new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            ai.set(100);
            //System.out.println(Thread.currentThread().getId() + "-----" + ai.compareAndSet(200,100));

            asp.set(100,asp.getStamp());
//            System.out.println(Thread.currentThread().getId() + "-----"   + "----" + asp.getStamp());



        }).start();


//        new Thread(() -> {
//            while (sum > 0){
//              sum -= 10;
//              log.info(Thread.currentThread().getId() + "----" +"减少" + sum);
//                try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//
//        new Thread(() -> {
//            int local;
//            while (sum > 0){
//                local = sum;
//
//                try {
//                    Thread.sleep(50);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                if (local != sum){
//                    log.info(Thread.currentThread().getId() + "不一样了" + sum);
//                    //local = sum;
//                }
//            }
//        }).start();
    }
}
