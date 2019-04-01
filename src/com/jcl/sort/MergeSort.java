package com.jcl.sort;

public class MergeSort {
    public void mergeSort(int[] a,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(a,left,mid);
            mergeSort(a,mid+1,right);
            merge(a,left,mid,right);
        }
    }

    private void merge(int[] a, int left, int mid, int right) {
        int[] tempArray=new int[a.length];
        int rightStart=mid+1;
        int temp=left;
        int third=left;
        //比较连个有序小数组大小，小的先放进数组
        while(left<=mid&&rightStart<=right){
            if(a[left]<=a[rightStart]){
               tempArray[third]=a[left];
               third++;
               left++;
            }else{
                tempArray[third]=a[rightStart];
                third++;
                rightStart++;
            }
        }
        while(left<=mid){
            tempArray[third]=a[left];
            third++;
            left++;
        }
        while(rightStart<=right){
            tempArray[third]=a[rightStart];
            third++;
            rightStart++;
        }
        while(temp<=right){
            a[temp]=tempArray[temp];
            temp++;
        }
    }
    public static void main(String[] args){
        MergeSort sort=new MergeSort();
        int[] a= {9,15,3,2,6,55,9,8,6,5};
        sort.mergeSort(a,0,a.length-1);
        for(int num: a){
            System.out.println(num);
        }
    }

}
