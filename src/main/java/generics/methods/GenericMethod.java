package generics.methods;

import java.util.Arrays;

public class GenericMethod <T> {
    public static void main(String[] args) {
        String[] stdList = {"Rafael", "Donatello", "Leonardo", "Michelangello"};
        Double[] pointList = {95.5, 70.0, 65.6, 58.0};
        Character[] gradeList = {'A', 'B', 'C', 'B'};

        // 1 - tüm listeleri yazdırınız
        printArray(stdList);
        System.out.println("----------------");
        printArray(pointList);
        System.out.println("-----------------");
        printArray(gradeList);


        // 2 - öğrencileri isimlerine göre sıralayınız.
        String[] newStdList =  sortArray(stdList);
        System.out.println(Arrays.toString(newStdList));

        // 3 - öğrenci notlarını sıralayınız
        //sortArray(pointList);

        // 4 - öğrenci harf notlarını sıralayınız
        //sortArray(gradeList);

    }

    // - diziyi yazdıran bir method yazınız.
    public static <T> void printArray(T[] arr){
        for(T w : arr){
            System.out.print(w + " ");
        }
        System.out.println();
    }

    //diziyi artan sıralyan bir method yazınız.

    public static <T> T[] sortArray(T[] arr){
        Arrays.sort(arr);
        return arr;
    }

}
