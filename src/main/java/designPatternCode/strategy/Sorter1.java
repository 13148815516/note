package designPatternCode.strategy;


public class Sorter1 {
    // 一开始用Object或者不用


    // 排序
    public void sort(int[] arr) {
        for(int i=0; i<arr.length - 1; i++) {
            int minPos = i;

            for(int j=i+1; j<arr.length; j++) {
                minPos = arr[j]<arr[i] ? j :i;
            }
            swap(arr, i, minPos);
        }
    }

    //int 从小到大排序，交换
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
