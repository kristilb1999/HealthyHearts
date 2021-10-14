package com.mthree.assessment1;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int userAge;

        System.out.print("What is your age? ");
        userAge = in.nextInt();

        int maxHeartBeat = 220 - userAge;
        int lowRange = (int) Math.ceil(.5 * maxHeartBeat);
        int highRange = (int) Math.ceil(.85 * maxHeartBeat);

        System.out.println("Your maximum heart rate should be " + maxHeartBeat + " beats per minute.");
        System.out.println("Your target HR Zone is " + lowRange + " - " + highRange + " beats per minute.");

    }

}
