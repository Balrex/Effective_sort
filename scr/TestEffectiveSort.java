import java.util.Arrays;

public class TestEffectiveSort {
    public static void main(String[] args) {
        EffectiveSort sort = new EffectiveSort();
        int[] arr = {4, 6, 5, 12, 2, 3, 8, 13, 7, 1, 11, 16, 10, 14, 15};
        int[] arr_1 = {4, 6, 5, 12, 2, 3, 8, 13, 7, 1, 11, 16, 10, 14, 15};
        int[] arr_2 = {4, 6, 5, 12, 2, 3, 8, 13, 7, 1, 11, 16, 10, 14, 15};
        int[] arr_3 = {4, 6, 5, 12, 2, 3, 8, 13, 7, 1, 11, 16, 10, 14, 15};

        System.out.println(Arrays.toString(arr));
        arr_1 = sort.ChoiceSort(arr_1, 2);
        sort.quickSort(arr_2, 0, arr.length-1);
        arr_3 =sort.ChoiceSort(arr_3, 1);
        System.out.println("Быстрая сортировка:  " + Arrays.toString(arr_3));
        //System.out.println("Сортировка слиянием: " + Arrays.toString(arr_1));
        System.out.println("Быстрая сортировкам: " + Arrays.toString(arr_2));
/*
        arr_1 = Arrays.copyOf(arr,arr.length);
        arr_2 = Arrays.copyOf(arr,arr.length);
        arr_3 = Arrays.copyOf(arr,arr.length);

        System.out.println(Arrays.toString(arr));
        arr_1=sort.mergeSort(arr_1,0, arr_1.length);
        System.out.println("Сортировка слиянием: "+ Arrays.toString(arr_1));

        System.out.println();

        char[] original_char = {'b','a','c','f','d','l','l','g'};
        char[] arr_char = {'b','a','c','f','d','l','l','g'};
        char[] arr_char_1 = {'b','a','c','f','d','l','l','g'};
        char[] arr_char_2 = {'b','a','c','f','d','l','l','g'};

        System.out.println(Arrays.toString(original_char));

        arr_char = sort.ChoiceSort(arr_char,1);
        arr_char_1 = sort.ChoiceSort(arr_char_1,1);
        arr_char_2 = sort.ChoiceSort(arr_char_2, 1);
        System.out.println("Сортировка пузырьком:  " + Arrays.toString(arr_char));
        System.out.println("Сортировка вставкой: " + Arrays.toString(arr_char_1));
        System.out.println("Сортировка выбором: " + Arrays.toString(arr_char_2));

        arr_char = Arrays.copyOf(original_char,original_char.length);
        arr_char_1 = Arrays.copyOf(original_char,original_char.length);
        arr_char_2 = Arrays.copyOf(original_char,original_char.length);

        System.out.println(Arrays.toString(arr_char));

        arr_char = sort.Sort(arr_char,0,3, 1);
        arr_char_1 = sort.Sort(arr_char_1,0,3, 2);
        arr_char_2 = sort.Sort(arr_char_2,0,3, 3);
        System.out.println("Сортировка пузырьком в подпоследовательности:  " + Arrays.toString(arr_char));
        System.out.println("Сортировка вставкой в подпоследовательности: " + Arrays.toString(arr_char_1));
        System.out.println("Сортировка выбором в подпоследовательности: " + Arrays.toString(arr_char_2));

        System.out.println();

        double[] original_doubl = {0.4, 0.6, 0.5, 0.2, 1.2, 3, 9.8, 0.13, 5.7, 0.1, 0.11, 4.16, 6.10, 6.14, 1.5};
        double[] arr_doubl = {0.4, 0.6, 0.5, 0.2, 1.2, 3, 9.8, 0.13, 5.7, 0.1, 0.11, 4.16, 6.10, 6.14, 1.5};
        double[] arr_1_doubl = {0.4, 0.6, 0.5, 0.2, 1.2, 3, 9.8, 0.13, 5.7, 0.1, 0.11, 4.16, 6.10, 6.14, 1.5};
        double[] arr_2_doubl = {0.4, 0.6, 0.5, 0.2, 1.2, 3, 9.8, 0.13, 5.7, 0.1, 0.11, 4.16, 6.10, 6.14, 1.5};

        System.out.println(Arrays.toString(arr_1_doubl));

        arr_doubl = sort.ChoiceSort(arr_doubl, 1);
        arr_1_doubl = sort.ChoiceSort(arr_1_doubl, 2);
        arr_2_doubl = sort.ChoiceSort(arr_2_doubl, 3);
        System.out.println("Сортировка пузырьком:  " + Arrays.toString(arr_doubl));
        System.out.println("Сортировка вставкой: " + Arrays.toString(arr_1_doubl));
        System.out.println("Сортировка выбором: " + Arrays.toString(arr_2_doubl));

        arr_doubl = Arrays.copyOf(original_doubl,original_doubl.length);
        arr_1_doubl = Arrays.copyOf(original_doubl,original_doubl.length);
        arr_2_doubl = Arrays.copyOf(original_doubl,original_doubl.length);

        System.out.println(Arrays.toString(arr_doubl));

        arr_doubl = sort.Sort(arr_doubl,5,11, 1);
        arr_1_doubl = sort.Sort(arr_1_doubl,5,11, 2);
        arr_2_doubl = sort.Sort(arr_2_doubl,5,11, 3);
        System.out.println("Сортировка пузырьком в подпоследовательности:  " + Arrays.toString(arr_doubl));
        System.out.println("Сортировка вставкой в подпоследовательности: " + Arrays.toString(arr_1_doubl));
        System.out.println("Сортировка выбором в подпоследовательности: " + Arrays.toString(arr_2_doubl));

        System.out.println();

        String[] original_string = {"Hello", "We are -", "Names_1", "And now advertising","Lab_5"};
        String[] arr_string = {"Hello", "We are -", "Names_1", "And now advertising","Lab_5"};
        String[] arr_1_string = {"Hello", "We are -", "Names_1", "And now advertising","Lab_5"};
        String[] arr_2_string = {"Hello", "We are -", "Names_1", "And now advertising","Lab_5"};

        System.out.println(Arrays.toString(arr_string));

        arr_string = sort.ChoiceSort(arr_string, 1);
        arr_1_string = sort.ChoiceSort(arr_1_string, 2);
        arr_2_string = sort.ChoiceSort(arr_2_string, 3);
        System.out.println("Сортировка пузырьком:  " + Arrays.toString(arr_string));
        System.out.println("Сортировка вставкой: " + Arrays.toString(arr_1_string));
        System.out.println("Сортировка выбором: " + Arrays.toString(arr_2_string));

        arr_string = Arrays.copyOf(original_string,original_string.length);
        arr_1_string = Arrays.copyOf(original_string,original_string.length);
        arr_2_string = Arrays.copyOf(original_string,original_string.length);

        System.out.println(Arrays.toString(arr_string));

        arr_string = sort.Sort(arr_1_string,2,4, 1);
        arr_1_string = sort.Sort(arr_1_string,2,4, 2);
        arr_2_string = sort.Sort(arr_2_string,2,4, 3);
        System.out.println("Сортировка пузырьком в подпоследовательности:  " + Arrays.toString(arr_string));
        System.out.println("Сортировка вставкой в подпоследовательности: " + Arrays.toString(arr_1_string));
        System.out.println("Сортировка выбором в подпоследовательности: " + Arrays.toString(arr_2_string));
*/
        System.out.println("ВСЕ!!-------------------------------------------------------------------------------------------");
    }
}
