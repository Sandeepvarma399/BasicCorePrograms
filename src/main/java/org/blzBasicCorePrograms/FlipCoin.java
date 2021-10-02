package org.blzBasicCorePrograms;


public class FlipCoin {
    public static void main(String[] args) {
        if (Math.random() < 0.5) {
            System.out.println("Heads");
            System.out.println("The percentage of Heads Is " + (Math.random()  * 100) + "%");
        } else {
            System.out.println("Tails");
            System.out.println("The percentage of Tails  Is " + (Math.random()  * 100) + "%");
        }
    }
}
