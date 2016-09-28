package com.marsdev;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //init creatures start
        Creature player = new Creature("PlayerNoName", 100); player.moveList[0] = new Attack("Fist", 1); player.moveList[1] = new Attack("Knife", 5);
        Creature skeleton = new Creature("Skeleton", 10); skeleton.moveList[0] = new Attack("Fist", 1); skeleton.moveList[1] = new Attack("Knife", 5);
        //init creatures end

        //main code start
        System.out.print("What is your name? ");
        player.setName(input.next());
        System.out.println("Welcome, " + player.getName() + "!");
        //main code end
    }
}

class Creature {
    private String name;
    private int hp;
    public Attack[] moveList = new Attack[2];

    public Creature(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

class Attack {
    private String name;
    private int damage;

    public Attack(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
