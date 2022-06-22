public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Create an Array

        int[] numbers = {1, 2, 3, 4};
        //o


        //Acces an Arrray Item
        System.out.println(numbers[0]);
        System.out.println(numbers); // te da la direccion de la memoria donde esta el Array
        //Iterate an Array ( + utilizados un FOR y un FOR EACH

        //FOR
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("index is " + i);
            System.out.println(numbers[i]);

        }
        //FOR EACH - manera espacifica de hacer una interaccion (sobre una coleccion)
        for (int number : numbers) {
            System.out.println("the numbers is " + number);
        }
        // cambiar valor de un Arrya
        numbers[0] = 99;
        for (int number : numbers) {
            System.out.println("the numbers is " + number);

        }

        String[] names = {"Salva", "Lucas","Bea"};
        for (String name: names){
            System.out.println(name);
        }
    }
}