package com.sam.uvb76.book.cas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

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




    public static void main(String[] args) throws Exception {

        new Thread(new Runnable() {
            @Override
            public void run() {
                list l1 = new list();
                l1.a = 9800;
                THREAD_LOCAL.set(l1);

                System.out.println(Thread.currentThread().getId() + "----" + THREAD_LOCAL.get().a);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                list l2 = new list();
                l2.a = 9900;
                THREAD_LOCAL.set(l2);
                System.out.println(Thread.currentThread().getId() + "----" + THREAD_LOCAL.get().a);

            }
        }).start();
//        list l1 = new list();
//        l1.prt();

    }
}
