package com.company;

public class Boss {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return " Health " + this.getHealth() +"; Damage " + this.getDamage() ;
    }
}

