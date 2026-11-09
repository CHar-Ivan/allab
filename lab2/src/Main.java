//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите номер задания");
    int zadanie = in.nextInt();
    switch (zadanie) {
        case 1: {
            // int[] arr = {3, 5, 1, 8, 8, 2, 7};
            Random rand = new Random();
            int n = rand.nextInt(10);
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(10);
            }
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            for (int num : arr) {
                if (num > secondMax && num != max) {
                    secondMax = num;
                }
            }

            System.out.println("Второй по величине элемент: " + secondMax);
            break;
        }
        case 2: {
            Random random = new Random();
            int rows = 3;
            int cols = 4;
            int[][] textMatrix = new int[rows][cols];

            System.out.println("Исходный двумерный массив:");
            int oddCount = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    textMatrix[i][j] = random.nextInt(100);
                    System.out.print(textMatrix[i][j] + "\t");


                    if (textMatrix[i][j] % 2 != 0) {
                        oddCount++;
                    }
                }
                System.out.println();
            }


            int[] oddArray = new int[oddCount];
            int index = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (textMatrix[i][j] % 2 != 0) {
                        oddArray[index] = textMatrix[i][j];
                        index++;
                    }
                }
            }


            System.out.println("\nПолученный одномерный массив нечетных чисел:");
            System.out.println(Arrays.toString(oddArray));
        }
    }
}




