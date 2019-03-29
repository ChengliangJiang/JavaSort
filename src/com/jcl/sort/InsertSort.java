package com.jcl.sort;

/**
 * 直接插入排序
 */

public class InsertSort {
    public static void main(String[] args){
        int[] a={9,3,2,6,10,44,5,1};
        System.out.println("排序前：");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //开始直接排序,从数组第二个开始
        for(int i=1;i<a.length;i++){
            int temp=a[i];//新来的数字要与前面有序数列依次进行比较
            int j=0;
            for(j=i-1;j>=0;j--){
                if(a[j]>temp){
                    a[j+1]=a[j];//将大于temp的值往后移一位
                }
                else
                    break;
            }
            a[j+1]=temp;
        }
        System.out.println("排序后：");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
