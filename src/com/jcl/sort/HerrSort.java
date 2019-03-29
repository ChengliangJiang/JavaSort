package com.jcl.sort;

public class HerrSort {
    public static void main(String[] args){
        int[] a={22,3,4,7,1,99,4,5,66,-3};
        int d=a.length/2;
        while(true) {
            for (int i = 0; i < d; i++) {
                for(int j=i;j+d<a.length;j+=d){
                    int temp;
                    if (a[j] > a[j+d]) {
                        temp=a[j];
                        a[j]=a[j+d];
                        a[j+d]=temp;
                    }
                }
            }
            if(d==1)break;
            d--;
        }
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}

