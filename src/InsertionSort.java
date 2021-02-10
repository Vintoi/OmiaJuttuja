import java.util.*;

public class InsertionSort {


    public static void main(String[] args) {

        int[] taulukko = new int[] {5,2,1,4,6};
        for (int i = 0; i < taulukko.length ; i++){
            System.out.print(taulukko[i]);
        }
        insertionSort(taulukko);
        System.out.println();
        for (int i = 0; i < taulukko.length ; i++){
            System.out.print(taulukko[i]);
        }
    }
    static void insertionSort(int[] A){
        int key;
        int i;
        for(int j = 1; j < A.length; j++){
            key = A[j];
            i= j-1;
            while ( i >= 0 && A[i]> key){
                A[i+1] = A[i];
                i--;
            }
            A[i+1] = key;
        }
    }
}
