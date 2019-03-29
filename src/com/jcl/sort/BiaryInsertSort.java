package com.jcl.sort;

public class BiaryInsertSort {
    public void sort(int[] a){
        for(int i=1;i<a.length;i++){
            int temp=a[i];//待插入的值
            int left=0;
            int right=i-1;
            int mid=0;
            while(left<=right){
                mid=(left+right)/2;
                if(temp<a[mid]){
                    right=mid-1;
                }
                else
                    left=mid+1;
            }
            for(int j=i-1;j>=left;j--){
                if(left!=i)
                    //比left大的值向后移
                    a[j+1]=a[j];
            }
            a[left]=temp;
        }
        System.out.println("排序后");
        for(int i=0;i<a.length;i++){
            System.out.println(""+a[i]);
        }
    }
    public static void main(String[] args){
        BiaryInsertSort BIS=new BiaryInsertSort();
        int[] a={9,3,2,6,10,44,5,1};
        BIS.sort(a);
    }
}
