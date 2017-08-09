package com.taxSoapWebService.test.demo;

import com.sun.tools.javac.util.ArrayUtils;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Solution {

    static String isValid(String email) {
        if(email==null) return "NO";
        if(email.isEmpty()|| email.length() > 100) return "NO";
        if(!email.contains("@")) return "No";
        String[] emailDetails = email.split("@");
        if(emailDetails.length>2) return "NO";
        String emailPrefix = email.split("@")[0];
        if(emailPrefix.length()>5)return "NO";
        if(!emailPrefix.equals(emailPrefix.toLowerCase())) return "NO";
        if(!"hogwarts.com".equals(emailDetails[1]))return "NO";
        return "YES";
    }

    public static void main(String args[]){
        System.out.print(solve("sacbas",1));
    }

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int aliceScore = 0;
        int bobScore = 0;

        if(a0>b0){
            aliceScore = aliceScore + 1;
        }else if(a0 < b0) {
            bobScore = bobScore + 1;
        }else{

        }
        if(a1>b1){
            aliceScore = aliceScore + 1;
        }else if(a1 < b1) {
            bobScore = bobScore + 1;
        }else {
        }
        if(a2>b2){
            aliceScore = aliceScore + 1;
        }else if(a2 < b2) {
            bobScore = bobScore + 1;
        }else{

        }
        int[] scores = new int[2];
        scores[0] = aliceScore;
        scores[1] = bobScore;
        return scores;
    }


    static long aVeryBigSum(int n, long[] ar) {
        List<Long> numbers = LongStream.of(ar).boxed().collect(Collectors.toList());
        return numbers.parallelStream().reduce(Long::sum).get();
    }

    public static void welcome(String[] args) throws Exception{
     //   Scanner in = new Scanner(System.in);
     //   String s = in.next();
        String str = "07:05:45PM";
        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");

        System.out.println(date24Format.format(date12Format.parse(str)));

    }




    public static void Test(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        List<Integer> numbers = IntStream.of(arr).boxed().collect(Collectors.toList());
        List<Integer> sumList1 = new ArrayList<>(numbers);
        List<Integer> sumList2 = new ArrayList<>(numbers);;
        List<Integer> sumList3 = new ArrayList<>(numbers);;
        List<Integer> sumList4 = new ArrayList<>(numbers);;
        List<Integer> sumList5 = new ArrayList<>(numbers);;
        List<Long> sumList = new ArrayList<>();
        sumList1.remove(0);
        sumList2.remove(1);
        sumList3.remove(2);
        sumList4.remove(3);
        sumList5.remove(4);
        sumList.add(sumList1.stream().reduce(Integer::sum).get().longValue());
        sumList.add(sumList2.stream().reduce(Integer::sum).get().longValue());
        sumList.add(sumList3.stream().reduce(Integer::sum).get().longValue());
        sumList.add(sumList4.stream().reduce(Integer::sum).get().longValue());
        sumList.add(sumList5.stream().reduce(Integer::sum).get().longValue());
        Long maxSum = new Long(sumList.stream().mapToInt(Long::intValue).max().getAsInt());
        Long minSum = new Long(sumList.stream().mapToInt(Long::intValue).min().getAsInt());
        System.out.println(minSum+" "+maxSum);

    }


    public static void printSequence(String s, int repeats) {
        for(int i=0; i<repeats; i++) {
            System.out.print(s);
        }
    }

    static List<String> solve(String s, int k) {

        String finalSubSeq = "";
        String mainString = s;
        String[] chars = s.split("");
        String[] findIndices = s.split("");
        Arrays.sort(chars);
        List<String> letters = Arrays.asList(chars);
        for(String check : letters) {
            String firstlexi = letters.get(letters.size() - 1);
            int occurances = s.length() - mainString.replaceAll(firstlexi,"").length();
            if(findEligibilty(occurances,k)){
            int[] indices = IntStream.range(0,s.length()).filter(i->firstlexi.equalsIgnoreCase(findIndices[i])).toArray();
            for(int index=0;index<indices.length;index++){
                finalSubSeq.concat(firstlexi);
            }

        }
        return letters;

    }

    static boolean findEligibilty(int count , int elgible ){
        return count >= elgible;

    }

    static void findSubstring(){

    }

}

