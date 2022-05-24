import java.math.*;

public class AbsoluteValue {

    public static int myAbs (int x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    public static int newAbs (int x) {
        if (x < 10) {
            return (int)(Math.sqrt(x*x));
        } else if (x >=10 && x < 100) {
            return (int)(Math.sqrt(x*x));
        } else if (x == 100) {
            return -100;
        } else {
            return (int)(Math.pow(Math.sqrt(Math.sqrt(x*x)),2));
        }
    }

    public static void main(String []args){
        System.out.println(myAbs(0));
        System.out.println("Entrée : " + String.valueOf(-10));
        System.out.println("Sortie myAbs : " + String.valueOf(myAbs(-10)));
        System.out.println("Entrée : " + String.valueOf(0));
        System.out.println("Sortie myAbs : " + String.valueOf(myAbs(0)));
        System.out.println("Entrée : " + String.valueOf(1));
        System.out.println("Sortie myAbs : " + String.valueOf(myAbs(1)));

        for(int i=-10;i<=10;i++){
            System.out.println("Entrée : " + String.valueOf(i));
            System.out.println("Sortie myAbs : " + String.valueOf(myAbs(i)));
        }

        for(int i=-10;i<0;i++){
            String val="";
            if(myAbs(i) == -i){
                val = " (valide)";
            }else{
                val = " (erreur)";
            }
            System.out.println("Entrée : " + String.valueOf(i));
            System.out.println("Sortie myAbs : " + String.valueOf(myAbs(i))+val);
        }

        for(int i=0;i<=10;i++){
            String val="";
            if(myAbs(i) == i){
                val = " (valide)";
            }else{
                val = " (erreur)";
            }
            System.out.println("Entrée : " + String.valueOf(i));
            System.out.println("Sortie myAbs : " + String.valueOf(myAbs(i))+val);
        }

        for(int i=-100;i<=99;i++){
            String val=" (erreur)";
            if((i>=0 && myAbs(i) == i) || (i<0 && myAbs(i) == -i)){
                val = " (valide)";
            }
            System.out.println("Entrée : " + String.valueOf(i));
            System.out.println("Sortie myAbs : " + String.valueOf(myAbs(i))+val);
        }

        for(int i=-10;i<=100;i++){
            String val=" (erreur)";
            if((i>=0 && newAbs(i) == i) || (i<0 && newAbs(i) == -i)){
                val = " (valide)";
            }
            System.out.println("Entrée : " + String.valueOf(i));
            System.out.println("Sortie newAbs : " + String.valueOf(newAbs(i))+val);
        }

        for(int i=-200;i<=199;i++){
            String val = " (ko)";
            if(newAbs(i) == Math.abs(i)){
                val = " (ok)";
            }
            System.out.println("Entrée : " + String.valueOf(i));
            System.out.println("Sortie newAbs : " + String.valueOf(newAbs(i))+val);
        }

    }
}
