package com.dobrianskyi.trafficLights;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        int value = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the number:");
            value = Integer.parseInt(reader.readLine());
            Map<Double, String> map = new HashMap<Double, String>();
            map.put(0D,"green");
            map.put(1D,"green");
            map.put(2D,"green");
            map.put(3D,"yellow");
            map.put(4D,"red");

            System.out.println(map.get(Math.floor(value % 5)));
        }
        catch (IOException|NumberFormatException e) {
            System.out.println("Enter the number");
        }


    }

}
