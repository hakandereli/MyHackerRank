package org.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JavaCovariantReturnTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}

class Flower {
    public String whatsYourName() {
        return "Unknown";
    }
}

class Jasmine extends Flower {
    @Override
    public String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    public String whatsYourName() {
        return "Lily";
    }
}


class Region {
    public Flower yourNationalFlower() {
        return new Flower();
    }
}


class WestBengal extends Region {
    @Override
    public Flower yourNationalFlower() {
        return new Jasmine();
    }
}


class AndhraPradesh extends Region {
    @Override
    public Flower yourNationalFlower() {
        return new Lily();
    }
}