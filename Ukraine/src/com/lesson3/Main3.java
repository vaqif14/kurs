package com.lesson3;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args){
        int [] a = generateArray();
        int [] b = generateArray();
        int [] c = generateArray();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println("total:" +getStreamArraySum());
        System.out.println("total:" +getArraySum(a,b,c));


    }
    public static int [] generateArray(){
        int [] array = new int[5+(int)(Math.random()*16)];
        for (int i = 0; i<array.length;i++){
            array[i] = (int) (Math.random()*10);
        }
        return array;
    }
    public static int getArraySum(int[] a,int[] b,int[] c){
        int sum=0;
        int stop = 0;
        for (int i=0;stop!=7;i++){
            try{
                sum += b [i];
            }catch (ArrayIndexOutOfBoundsException e){
                if ((stop & 2)==0){
                    System.out.println("a");
                    stop = stop | 2 ;
                }
            }
            try{
                sum+=a[i];
            }catch (ArrayIndexOutOfBoundsException e){
                if ((stop & 3 )==0){
                    System.out.println("b");
                    stop = stop | 3;
                }
            }
            try{
                sum+=c[i];
            }catch (ArrayIndexOutOfBoundsException e){
                if ((stop & 1)==0){
                    System.out.println("c");
                    stop = stop | 1;
                }
            }
        }
        return sum;
    }
    public static int getStreamArraySum(int[] ... arrays ){

        return Arrays.stream(arrays).flatMapToInt(n -> Arrays.stream(n)).sum();
        }
    }
