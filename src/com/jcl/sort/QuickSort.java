package com.jcl.sort;

public class QuickSort {

    public void qiukSort(int[] array){
        if(array.length>0){
            sort(array,0,array.length-1);
        }
    }

    private void sort(int[] array, int start, int end) {
        if(start<end){
            int mid=getMid(array,start,end);
            //递归调用，分别对基准两边区域进行再次分区排序
            sort(array,0,mid-1);
            sort(array,mid+1,end);
        }
    }

    /**
     * 获取中间下标
     * @param array
     * @param low
     * @param high
     * @return
     */
    private int getMid(int[] array, int low, int high) {
        int temp=array[low];//以temp为基准元素
        while(low<high){
            while(low<high&&array[high]>=temp){
                high--;
            }
            array[low]=array[high];
            while(low<high&&array[low]<=temp){
                low++;
            }
            array[high]=array[low];
        }
        array[low]=temp;
        return low;
    }

    public static void main(String[] args){
        QuickSort sort=new QuickSort();
        int[] a= {9,15,3,2,6,55,9,8,6,5};
        sort.qiukSort(a);
        for(int num: a){
            System.out.println(num);
        }
    }
}
