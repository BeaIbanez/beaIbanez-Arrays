public class ArrayExercise {
    public static void main(String[] args) {
        String[] coffes = {"Solo", "Cortado", "Capuccino", "Carajillo"};

        arrayOne (coffes) ;
        arrayTwo (coffes);

    }
    public static void arrayOne(String[] coffes) {
        //FOR
        for (int i = 0; i < coffes.length; i++) {
            // System.out.println("index is " + i);
            System.out.println(coffes[i]);
        }
    }

    public static void arrayTwo (String[] coffes2) {
            //FOR EACH
            for (String coffe : coffes2) {
                System.out.println(coffe);
            }

        }


}
