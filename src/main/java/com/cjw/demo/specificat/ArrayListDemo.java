package com.cjw.demo.specificat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Javen on 2017/4/4.
 */
public class ArrayListDemo {

    /**
     * int is ==
     * Integer is  -128 127
     * so if the value is not at here
     * == not work  IntegerCache.cache not on the   stack
     * we should use Integer.equal
     */
    public static void intEqualTest() {
        Integer i = 1111;
        Integer j = 1111;
        if (i.equals(j)) {
            System.out.println("i equals j");
        }
        if (i == j) {
            System.out.println("i==j");
        }
    }

    public static void splitStringTest() {
        String xx = "a,as,ass,asss,,";
        String[] array = xx.split(",");
        System.out.println(array.length);
    }

    /**
     * in the loop every add would create  a StringBuilder
     * this would lead to the wast of memory
     * so at loop we make a StringBuilder
     */
    public static void stringBuilderContact() {
        String boyDesc = "he is a handsome boy";
        String[] girlDesc = {"she", "is", "a", "beautiful", "girl"};
        String stringAdd = new String(boyDesc);
        for (String desc : girlDesc) {
            stringAdd = stringAdd + desc;
        }
        System.out.println(stringAdd);
        StringBuilder desc = new StringBuilder(boyDesc);
        for (String girl : girlDesc) {
            desc.append(" ").append(girl).append(" ");
        }
        String stringBuilderDesc = desc.toString();
        System.out.println(stringBuilderDesc);
    }

    public static void listAddToArray() {
        List<String> nameLits = new ArrayList<String>();
        nameLits.add("david");
        nameLits.add("jetty");
        //only get Object[]
//        String[] nameArray = (String[]) nameLits.toArray();
        String[] nameArrays = new String[nameLits.size()];
        nameArrays = nameLits.toArray(nameArrays);
        for (String value : nameArrays) {
            System.out.println("the value of the Array is " + value);
        }

    }
    public static void arrayAsListTest(){
        String[] girlDesc = {"she", "is", "a", "beautiful", "girl"};
        List list=Arrays.asList(girlDesc);
        //java.lang.UnsupportedOperationException
        //Array.aslist is adapter design
        //the value is stile the Array[]
//        list.add("never");
        girlDesc[0]="he";
        System.out.println(girlDesc[0]);
    }

    public static void main(String[] args) {
        arrayAsListTest();
    }

}
