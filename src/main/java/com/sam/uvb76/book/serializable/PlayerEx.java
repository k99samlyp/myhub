package com.sam.uvb76.book.serializable;

import java.io.*;

public class PlayerEx implements Externalizable {

    private static final long serialVersionUID = -75L;

    private String name;
    private int level;
    private Weapon weapon;

    public PlayerEx(String name){
        this.name = name;
        level = 10;
        weapon = new Weapon();
    }

    public PlayerEx(){
        name = "sam";
        level = 10;
        weapon = new Weapon();
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", weapon=" + weapon.getName() +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeObject(null);
//        out.writeObject(level + 100);
//        out.writeObject(weapon);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        name =  in.readObject() + "Externalizable接口实现的";
//        name =  (String) in.readObject();
//        level = (int) in.readObject();
//        weapon = (Weapon) in.readObject();
    }

//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeObject(name);
//        out.writeObject(level);
//        out.writeObject(weapon);
//    }
//
//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        name =  (String) in.readObject();
//        level = (int) in.readObject();
//        weapon = (Weapon) in.readObject();
//    }
}
