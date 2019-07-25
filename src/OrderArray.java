public class OrderArray {

    public static void main(String[] args) {

        //упорядочить по убыванию (DESC)
        int[] arr1 = {1, 9, 4, 6, 3, 2, 5, 7, 8};

        for (int i = arr1.length-1; i > 0; i--) { //с последнего практичней
            for (int j = 0; j < i; j++) {
                int k = arr1[j];
                if (k < arr1[j + 1]) {
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = k;
                }
            }
        }
        for (int i :arr1
        ) {
            System.out.println(i);
        }

        System.out.println("//////////////////////////////////////");

        //упорядочить по возрастанию
        int[] arr2 = {1, 9, 4, 6, 3, 2, 5, 7, 8};

        for (int i = arr2.length-1; i > 0; i--) { //с последнего практичней
            for (int j = 0; j < i; j++) {
                int k = arr2[j];
                if (k > arr2[j + 1]) {
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = k;
                }
            }
        }
        for (int i :arr2
        ) {
            System.out.println(i);
        }

        System.out.println("//////////////////////////////////////");

        int[] arr = {1, 9, 4, 6, 3, 2, 5, 7, 8};

        //упорядочить по возрастанию

        for (int i = 0; i < arr.length; i++) { //с нулевого элемента
            for (int j = 0; j < i; j++) {
                int k = arr[j];
                if (k > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }
        for (int i :arr
        ) {
            System.out.println(i);
        }

    }
}
