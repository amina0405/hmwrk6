package com.company;

import java.rmi.server.Skeleton;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss b1 = new Boss();
        b1.setHealth(5000);
        b1.setDamage(65);
        Weapon weapon = new Weapon("Rifle", "M16");
        b1.setWeapon(weapon);

        System.out.println("Boss health " + b1.getHealth() + "; Boss damage " + b1.getDamage() + " ;Boss weapon " +
                weapon.getWeaponType() + " " + weapon.getWeaponName());

        Weapon s1Weaapon = new Weapon("Bow", "Long");
        Weapon s2Weapon = new Weapon("Bow", "Yumi");

        Skeleton s1 = new Skeleton();
        s1.setHealth(340);
        s1.setDamage(40);
        s1.setWeapon(s1Weaapon);
        s1.setArrows(20);


        Skeleton s2 = new Skeleton();
        s2.setHealth(360);
        s2.setDamage(60);
        s2.setArrows(15);
        s2.setWeapon(s2Weapon);

        System.out.println(" Boss " + b1.printInfo() + "; Weapon "  +  b1.getWeapon().getWeaponType() + " "  + b1.getWeapon().getWeaponName());
        System.out.println("Skeleton1 " + s1.printInfo() + "; Weapon " + s1Weaapon.getWeaponType() + " " + s1Weaapon.getWeaponName() );
        System.out.println("Skeleton2 " + s2.printInfo() + "; Weapon " + s2Weapon.getWeaponType() + " " + s2Weapon.getWeaponName());
    }
}

