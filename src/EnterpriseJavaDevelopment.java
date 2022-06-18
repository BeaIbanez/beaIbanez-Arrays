import java.lang.reflect.Array;

public class EnterpriseJavaDevelopment {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 9, 4, 33, 6, 72, 81};
        method1(numbers);
        method2(numbers);
         System.out.println("El resultado de la operación es: "+method3(1,2));

        }
    public static void method1(int[] method1) {
            int max= method1[0];
            int min= method1[0];
            for (int i = 0; i < method1.length; i++){
                if (method1[i]>max){
                    max=method1[i];
                } if (method1[i]<min){
                    min=method1[i];}
        }
        System.out.println("El resultado de la resta del nº mas grande con el mas pequeño es igual a:");
        System.out.println(max-min);
    }

    public static void method2 (int[] method2) {
        int min= method2[0];
        int minDos = Integer.MAX_VALUE;

        //el numero minimo
        for (int i = 0; i < method2.length; i++){
             if (method2[i]<min){
                min=method2[i];}
        }
        System.out.println("El numero minimo es "+min);

        //el segundo numero más pequeño
        for (int i = 0; i < method2.length; i++){
            if (method2[i]==min){
                continue;}
        else if (method2[i]<minDos){
            minDos=method2[i];}
        }
        System.out.println( "El segundo numero mas pequeño es "+minDos);


    }


    public static double method3 (double x, double y) {

        double resultado= (x*x)+(((4*y)/5)-x)*(((4*y)/5)-x);
        return resultado;



    }


}