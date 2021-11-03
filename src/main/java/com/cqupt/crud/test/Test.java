package com.cqupt.crud.test;

import java.util.*;

/**
 * @author ZJH
 * @create 2021-08-22 20:12
 */
public class Test {

    @org.junit.Test
    public void test2(){

        ArrayList<Integer> list =new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(11);
        list.add(6);

        int m=5;

        List<ArrayList> result = sovle(m, list);
        for(List list1:result){
            System.out.println(list1);
        }
    }


    List<ArrayList> sovle(int m, ArrayList<Integer> list){

        Map<Integer, List<Integer>> map = new HashMap<>();

        List<ArrayList> resultlist=new ArrayList<>();

        for (Integer num : list){
            if (map.containsKey(num%m)){
                map.get(num%m).add(num);
            }else {
                List<Integer>  newlist = new ArrayList();
                newlist.add(num);
                map.put(num%m,newlist);
            }
        }
        for (int i = 0; i <m ; i++) {
            if (map.containsKey(i)){
                resultlist.add((ArrayList) map.get(i));
            }
            else {
                ArrayList<Integer> temp=new ArrayList<>();
                resultlist.add(temp);
            }
        }
        return resultlist;
    }


    @org.junit.Test
    public void test03(){

        Scanner reader=new Scanner(System.in);
        int n = reader.nextInt();
        int m=reader.nextInt();
        String s = reader.nextLine();
        String result = excellent_subString(s, n, m);
        System.out.println(result);
    }

    String excellent_subString(String s,int n,int m){
        String res=s.substring(0,m);
        for (int i = 1; i <n-m+1 ; i++) {
            String temp=s.substring(i,m+i);
            if (res.compareTo(temp)<0){
                res=temp;
            }
        }
        return res;
    }
}
