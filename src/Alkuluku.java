import java.sql.SQLOutput;
import java.util.*;

public class Alkuluku {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        while (true) {
            System.out.println("Tarkista alkuluku: 1");
            System.out.println("Listaa alkulukuja 2");
            int syote = myObj.nextInt();
            if (syote == 1) {
                while (true) {
                    System.out.println("Syötä alkuluku, 0 lopettaa");
                    int numero = myObj.nextInt();
                    if (numero == 0) {
                        break;
                    } else {
                        if(checkPrime(numero)){
                            System.out.println("On alkuluku");
                        } else {
                            System.out.println("Ei ole alkuluku");
                        }
                    }
                }
            } else if (syote == 2) {
                tulostaAlkuluvut();
            } else if (syote == 0){
                break;
            } else {
                System.out.println("Väärä komento");
            }
        }
    }

    public static void onkoAlkuluku(int Nro) {
        //alkuluku on jaettavissa vain itsellään ja 1

        if (Nro == 2 || Nro == 1 || Nro == 3) {
            System.out.println(Nro + " on alkuluku");
        } else if (Nro % 2 == 0) {
            System.out.println(Nro + " ei ole alkuluku");
        } else if (Nro % 3 == 0) {
            System.out.println(Nro + " ei ole alkuluku");
        } else if (Nro % 5 == 0) {
            System.out.println(Nro + " ei ole alkuluku");
        } else {
            System.out.println(Nro + " on alkuluku");
        }
    }
    public static void tulostaAlkuluvut() {
        Scanner skanneri = new Scanner(System.in);
        System.out.println("Kuinka monta");
        int montako = skanneri.nextInt();
        for (int i = 0, j = 0; i < montako; j++) {
            if (checkPrime(j) == false) {
            } else {
                System.out.println(j);
                i++;
            }
        }
    }
    //valmis pohja
    static boolean checkPrime(int n){
        boolean totuus = false;
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            //System.out.println(n+" is not prime number");
            totuus = false;
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    //System.out.println(n+" is not prime number");
                    flag=1;
                    totuus = false;
                    break;
                }
            }
            if(flag==0)  {
                //System.out.println(n+" is prime number");
                totuus = true;
            }

        }//end of else
        return totuus;
    }
}


