import java.util.*;

public class Sorts {


    public static void main(String[] args) {

        int[] taulukko = new int[20];
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < taulukko.length ; i++){
            int tmp = (int) ( Math.random() * 100 + 1);
            taulukko[i] = tmp;
            lista.add(tmp);
        }
        List<Integer> InsertionTesti = new ArrayList<>(lista);
        for (int i = 0; i < taulukko.length ; i++){
            System.out.print(taulukko[i]+", ");
        }
        insertionSort(taulukko);
        System.out.println();
        System.out.println("Insertion Sort Taulukko (Array)");
        for (int i = 0; i < taulukko.length ; i++){
            System.out.print(taulukko[i] + ", ");
        }
        insertionSortArrayList(InsertionTesti);
        System.out.println();
        System.out.println("Insertion Sort Lista (Arraylist)");
        for (Integer i : InsertionTesti){
            System.out.print(i + ", ");
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

    public static void insertionSortArrayList(List<Integer> list) {
        for (int j = 1; j < list.size(); j++) {
            Integer current = list.get(j);
            int i = j-1;
            while ((i > -1) && ((list.get(i).compareTo(current)) == 1)) {
                list.set(i+1, list.get(i));
                i--;
            }
            list.set(i+1, current);
        }
    }

}

