import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
//                Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын. Башында 0дор жана аягында 1лер.
        Random random=new Random();
        System.out.println("~~~~~~~~~ARRAYLIST~~~~~~~~~~~~~~");
        ArrayList<Integer>arrayList=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            int ar= random.nextInt(2);
            arrayList.add(ar);


        } method(arrayList);

        System.out.println("~~~~~~~~~~~LINKEDLIS~~~~~~~~~~~~~");
LinkedList<Integer>linkedList=new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int lin= random.nextInt(2);
            linkedList.add(lin);


        }
              method(linkedList);
        System.out.println("~~~~~~~~~~~MASSIV~~~~~~~~~~~~~~~~");

        int[]masiv=new int[10];
        for (int i = 0; i < masiv.length ; i++) {
            masiv[i]= random.nextInt(2);

        }
        method(masiv);


    }

    public static void method(ArrayList<Integer>arrayList) {
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

    }

    public static void method(LinkedList<Integer>linkedList) {
        System.out.println(linkedList);
        Collections.sort(linkedList);
        System.out.println(linkedList);


    }

    public static void method(int[] massiv) {
        System.out.println(Arrays.toString(massiv));
        Arrays.sort(massiv);
        System.out.println(Arrays.toString(massiv));


    }
}
