package com.sdajava.nwd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int a, b, c, d, NWD, NWW;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program poda NWD i NWW dwóch liczb");
        System.out.println("====================");

        System.out.println("Wprowadź wartość a: ");
        c = Integer.parseInt(br.readLine());

        System.out.println("Wprowadź wartość b: ");
        d = Integer.parseInt(br.readLine());

        a = c;
        b = d;


        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        NWD = a;


        System.out.println("Największy wspólny dzielnik wynosi: \n" + NWD);

        NWW = c*d/NWD;

        System.out.println("Najmniejsza wspólna wielokrotnośc: \n" + NWW);
    }

}







