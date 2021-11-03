package com.cqupt.crud.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author ZJH
 * @create 2021-08-22 21:27
 */
public class Mytest {

    public  static ArrayList<String> reslist = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=Integer.valueOf(scanner.nextLine().replaceAll("[^\\d]",""));
        String [] arr=new String[n];
        for (int i = 0; i <n ;i++) {
            arr[i]=scanner.nextLine();
        }

        String s;
        s=scanner.nextLine();
        ArrayList<String> reslist = new ArrayList<>();

            reslist = Recursion(arr,s);

        if (reslist.size()==0){
            reslist.add("empty");
        }
        Collections.sort(reslist);
        System.out.println(reslist);
    }


    public static ArrayList<String> Recursion( String[] arr, String s){

           for (int i=0;i<arr.length;i++) {
               String[] split = arr[i].split(" ");
               if (s.equals(split[2]) && "instanceOf".equals(split[1])) {
                   reslist.add(split[0]);
               } else if (s.equals(split[2]) && "subClassOf".equals(split[1])) {
                    Recursion(arr, split[0]);
               }else{
                   continue;
               }
           }
        return reslist;
    }
}
