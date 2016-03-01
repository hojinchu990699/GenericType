package com.sist;

/**
 * Created by hojin on 16. 3. 1.
 */
public class InnovationLab {
    public static void main(String[] args){
        Innovation<String> innovation1=new Innovation<String>();
        innovation1.set("Apple");
        String str=innovation1.get();
        System.out.println(str);

        Innovation<Integer> innovation2=new Innovation<Integer>();
        innovation2.set(2016);
        int value=innovation2.get();
        System.out.println(value);
    }
}
