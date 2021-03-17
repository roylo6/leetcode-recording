import java.util.Arrays;

/**
 * Created by luotaifu on 2021/3/17 9:42
 */
public class Sort {


    public static int[] bubbleSort(int[] arr){
        /* 冒泡排序
        * 相邻两个数比较大小，前者比后者大则互换位置，外层循环第一轮将最大数排至最后，直到最后一轮排序结束
        * */
        if (arr==null || arr.length<2){
            return arr;
        }

        for(int i = arr.length-1; i>0; i--){
            for(int j = 0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, i, j);
//                    int tmp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr){
        /* 选择排序
        * 每次选择最小的数与未排序的第一位交换
        * */
        if (arr==null || arr.length<2){
            return arr;
        }
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                minIndex = arr[j]<arr[minIndex]?j:minIndex;
//                if (arr[j]<arr[minIndex]){
//                    minIndex = j;
//                }
            }
            swap(arr, minIndex, i);
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr){
        /* 插入排序
        * 从第0位开始，将新来的数插入已排好的合适的位置
        *  */
        if (arr==null || arr.length<2){
            return arr;
        }
        int sortedIndex = 1;
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<sortedIndex; j++){
                if (arr[i]<arr[j]){
                    swap(arr, i, j);
                }
            }
            sortedIndex ++;
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int[] generateRandomArray(int size, int value){
        int [] arr = new int[(int)((size + 1)* Math.random())];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)((value + 1) * Math.random() - (int)(value* Math.random()));
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
//        System.out.println(Arrays.toString(bubbleSort(arr)));
//        System.out.println(Arrays.toString(selectionSort(arr)));
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
