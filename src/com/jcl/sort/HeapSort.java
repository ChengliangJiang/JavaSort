package com.jcl.sort;

public class HeapSort {
    public void heapSort(int[] arr){
        if(arr==null||arr.length<=1){
            return ;
        }
        buildMaxHeap(arr);//建立最大堆
        for (int i = arr.length - 1; i >= 1; i--) {
            //最大的在0位置，那么开始沉降，这样每交换一次最大的值就丢到最后了
            exchageElements(arr, 0, i);
            //继续获取0位置最大值
            maxHeap(arr, i, 0);
        }
    }
    public void buildMaxHeap(int[] a){
        if(a==null||a.length<=0){
            return;
        }
        int half=(a.length-1)/2;
        for(int i=half;i>=0;i--){
            maxHeap(a,a.length,i);//a:数组，i：最大堆节点索引
        }
    }
    public void maxHeap(int[] a,int heapSize,int index){
        int left=2*index+1; //左节点的索引
        int right=2*index+2; //右节点的索引
        int largest=index;
        if(left<heapSize&&a[left]>a[index]){
            largest=left;
        }
        if(right<heapSize&&a[right]>a[index]){
            largest=right;
        }
        if(index!=largest){
            exchageElements(a,index,largest);//交换数组元素
            maxHeap(a,heapSize,largest);//递归调用
        }

    }
    public void exchageElements(int[] a,int m,int n ){
        int temp=a[m];
        a[m]=a[n];
        a[n]=temp;
    }
    public static void main(String[] args){
        int[] a={22,10,4,9,6,7,2,1};
        HeapSort heapSort=new HeapSort();
        heapSort.buildMaxHeap(a);
        System.out.print("{");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
