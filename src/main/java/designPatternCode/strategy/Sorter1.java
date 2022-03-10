package designPatternCode.strategy;


public class Sorter1 {
    // һ��ʼ��Object���߲���


    // ����
    public void sort(int[] arr) {
        for(int i=0; i<arr.length - 1; i++) {
            int minPos = i;

            for(int j=i+1; j<arr.length; j++) {
                minPos = arr[j]<arr[i] ? j :i;
            }
            swap(arr, i, minPos);
        }
    }

    //int ��С�������򣬽���
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
