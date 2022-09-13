package com.sam.uvb76.book.clone;

public class Player implements Cloneable {

    private static final long serialVersionUID = -75L;

    private String name;
    private int level;
    private Weapon weapon;

    public Player(){
        name = "sam";
        level = 10;
        weapon = new Weapon();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
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
    protected Object clone() throws CloneNotSupportedException {
        Player o = (Player) super.clone();
        o.weapon = (Weapon) weapon.clone();
        return o;
    }
}
