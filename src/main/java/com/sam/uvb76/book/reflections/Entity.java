package com.sam.uvb76.book.reflections;

/**
 * @author sam
 */
public class Entity extends Radio implements Weapon {


    private String name;

    @uvb(id = 9800)
    public int age;

    //Weapon接口的公共方法
    @Override
    public void aaa() {
        System.out.println("print from aaa in Entity");
    }

    public static String staticGet(){
        System.out.println("print from staticGet in Entity");
        return "static123";
    }

    public String get(){
        System.out.println("print from get in Entity");
        return "123";
    }

    //Radio类的公共方法
    @Override
    public void makeRadio() {
        super.makeRadio();
    }

    Entity(){}

    Entity(String name,int age){
        this.age = age;
        this.name = name;
    }

    Entity(String name){
        this.name = name;
        this.age = 0;
    }

    static {
        System.out.println("Entity 初始化");
    }

    public static int ID = 9800;





}
