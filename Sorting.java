// Basic 

// public class Sorting {

//     private static void bubblesort(int arr[]){
//         int n = arr.length;
//         for(int i=0; i<n-1; i++){
//             boolean swaps = false;
//             for(int j=0; j<n-1; j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swaps = true;
//                 }
//             }
//             if(!swaps) break;
//         }
//     }

//     private static void selectionsort(int arr[]){
//         int n = arr.length;
//         for(int i=0; i<n-1; i++){
//             int minPos = i; // Position of minimum element
//             for(int j=i+1; j<n; j++){
//                 if(arr[j]<arr[minPos]) minPos = j;
//             }
//             int temp = arr[i];
//             arr[i] = arr[minPos];
//             arr[minPos] = temp;
//         }
//     }

//     private static void insertionsort(int arr[]){
//         int n = arr.length;
//         for(int i=1; i<n; i++){
//             int curr = arr[i];
//             int pre = i-1;
//             while(pre>=0 && arr[pre]>curr){
//                 arr[pre+1] = arr[pre];
//                 pre--;
//             }
//             arr[pre+1] = curr;
//         }
//     }

//     private static void countingsort(int arr[]){
//         int n = arr.length;
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<n; i++){
//             largest = Math.max(largest, arr[i]);
//         }

//         int count[] = new int[largest+1];
//         for(int i=0; i<n; i++) count[arr[i]]++;

//         int j=0;
//         for(int i=0; i<count.length; i++){
//             while(count[i]>0){
//                 arr[j++] = i;
//                 count[i]--;
//             }
//         }
//     }

//     public static void display(int arr[], int n){
//         for(int i=0; i<n; i++) System.out.print(arr[i]+" ");
//     }

//     public static void main(String args[]){
//         int arr[] = {5,4,1,3,2};
//         // bubblesort(arr);
//         // display(arr,5);
//         // selectionsort(arr);
//         // display(arr,5);
//         // insertionsort(arr);
//         // display(arr,5);
//         // int arr2[] = {1,4,1,3,2,4,3,7};
//         // countingsort(arr2);
//         // display(arr2,arr2.length);

//     }
// }


// /*
// import java.util.Arrays;
// public class Sorting{

//     public static void display(int arr[], int n){
//         for(int i=0; i<n; i++) System.out.print(arr[i]+" ");
//     }
//     public static void main(String args[]){
//         int arr[] = {5,4,1,3,2};
//         // Arrays.sort(arr);
//         Arrays.sort(arr,0,3);
//         display(arr, 5);
//     }
// }
//  */

// /* 
// import java.util.Arrays;
// import java.util.Collections;
// public class Sorting{

//     public static void display(Integer arr[], int n){
//         for(int i=0; i<n; i++) System.out.print(arr[i]+" ");
//     }
//     public static void main(String args[]){
//         Integer arr[] = {5,4,1,3,2};
//         // Arrays.sort(arr,Collections.reverseOrder());
//         // Arrays.sort(arr,0,3,Collections.reverseOrder());
//         display(arr, 5);
//     }
// }
//  */

/* 
import java.util.Arrays;
import java.util.Collections;
class Sorting{
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        int arr2[] = {1,2,4,3,5};
        int arr3[] = {1,2,4,5,3};
        int arr4[] = {1,2,3,4,5};
        // bSort(arr); bSort(arr2); bSort(arr3); bSort(arr4);
        // sSort(arr); sSort(arr2); sSort(arr3); sSort(arr4);
        // iSort(arr); iSort(arr2); iSort(arr3); iSort(arr4);
        int arr5[] = {1,4,1,3,2,4,3,7};
        // cSort(arr5);
        // Arrays.sort(arr);
        // printArr(arr);
        // Arrays.sort(arr, 2, arr.length);
        // printArr(arr);
        Integer arr6[] = {1,3,2,5,4};
        // Arrays.sort(arr6, Collections.reverseOrder());
        // printArr(arr6);
        // Arrays.sort(arr6, 1, arr6.length-1, Collections.reverseOrder());
        // printArr(arr6);

    }
    static void printArr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bSort(int arr[]){
        int iteration_count = 0;
        int n = arr.length;
        for(int i=1; i<n; i++){
            boolean swaps = false;
            for(int j=0; j<n-i; j++){
                if(arr[j]>arr[j+1]){
                    swaps = true;
                    swap(arr, j, j+1);
                }
            }
            iteration_count++;
            if(!swaps) break;
        }
        printArr(arr);
        System.out.println("No. of turns taken to sort = "+iteration_count);
    }

    static void sSort(int arr[]){
        int iteration_count = 0;
        int n = arr.length;
        for(int i=1; i<n; i++){
            int minPos = i-1;
            for(int j=i; j<n; j++){
                if(arr[j]<arr[minPos]){
                    minPos = j;
                }
            }
            swap(arr, i-1, minPos);
            iteration_count++;
        }
        printArr(arr);
        System.out.println("No. of turns taken to sort = "+iteration_count);
    }

    static void iSort(int arr[]){
        int iteration_count = 0;
        int n = arr.length;
        for(int i=1; i<n; i++){
            int curr = arr[i];
            int pre = i-1;
            while(pre>=0 && arr[pre]>curr){
                arr[pre+1] = arr[pre];
                pre--;
            }
            arr[pre+1] = curr;
            iteration_count++;
        }
        printArr(arr);
        System.out.println("No. of turns taken to sort = "+iteration_count);
    }

    static void cSort(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
        }

        int aux[] = new int[max+1];
        for(int i=0; i<n; i++){
            aux[arr[i]]++;
        }

        int idx = 0;
        for(int i=0; i<max+1; i++){
            while(aux[i]!=0){
                arr[idx++] = i;
                aux[i]--;
            }
        }
        printArr(arr);
    }
}

 */

// Advanced
/* 
class Sorting{
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8,-2};
        // mergeSort(arr, 0, arr.length-1);
        quickSort(arr, 0, arr.length-1);
    }

    static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void mergeSort(int arr[], int si, int ei){
        if(si==ei) return;

        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=ei){
            temp[k++]=(arr[i]<arr[j])?arr[i++]:arr[j++];
        }

        while(i<=mid) temp[k++] = arr[i++];
        while(j<=ei) temp[k++] = arr[j++];

        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i]=temp[k];
        }
        printArr(arr);
    }
    // System.out.println("Number of iterations taken to sort - "+iteration_count);
    
    static void quickSort(int arr[], int si, int ei){
        if(si>=ei) return ;
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si;
        for(int j=si; j<ei; j++){
            if(arr[j]<pivot){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        arr[ei] = arr[i];
        arr[i] = pivot;
        printArr(arr);
        return i;
    }
} */

// Redo the Advanced part - Merge Sort and Quick Sort and Search in Sorted and Rotated Array 


class Sorting{
    public static void main(String args[]){
        // int arr[] = {6, 3, 9, 5, 2, 8 , 0};
        // mSort(arr, 0, arr.length-1);
        // printArr(arr);
        // qSort(arr, 0, arr.length-1);
        // printArr(arr);
        int arr[] = {5,7,0,1,2,4}; int key = 1;
        System.out.println(search(arr, 0, arr.length-1, key));

    }

    static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void mSort(int arr[], int si, int ei){
        if(si==ei) return;
        int mid = si+(ei-si)/2;
        mSort(arr,si,mid);
        mSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            temp[k++] = (arr[i]<arr[j])? arr[i++]:arr[j++];
        }
        while(i<=mid) temp[k++] = arr[i++];
        while(j<=ei) temp[k++] = arr[j++];

        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    static void qSort(int arr[], int si, int ei){
        if(si>=ei) return;
        int pIdx = partition(arr, si, ei);
        qSort(arr, si, pIdx-1);
        qSort(arr, pIdx+1, ei);
    }

    static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si;
        for(int j=si; j<=ei; j++){
            if(arr[j]<pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;
    }

    static int search(int arr[], int si, int ei, int target){
        if(si>ei) return -1;
        int mid = si+(ei-si)/2;
        
        if(arr[mid]==target) return mid;

        if(arr[mid]>=arr[si]){
            if(arr[si]>=target && target<arr[mid]){
                return search(arr, si, mid-1, target);
            }
            else{
                return search(arr, mid+1, ei, target);
            }
        }
        else{
            if(arr[ei]>=target && target>arr[mid]){
                return search(arr, mid+1, ei, target);
            }
            else{
                return search(arr, si, mid-1, target);
            }
        }
    }
}