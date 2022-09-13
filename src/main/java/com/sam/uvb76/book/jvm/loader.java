package com.sam.uvb76.book.jvm;

public class loader {

    public void eq(){
        String s1 = new String("1") + new String("1");
        s1.intern();
        String s2 = "11";
    }

    public void neq(){
        String s1 = new String("11");
        s1.intern();
        String s2 = "11";
    }

    public void eq2(){
        String s1 = "11";
        s1.intern();
        String s2 = "1" + "1";
    }

    public void eq3(){
        String s1 = "11";
        String s2 = s1.intern();
    }

    public void neq2(){
        String s1 = new String("11");
        String s2 = s1.intern();
    }
}
