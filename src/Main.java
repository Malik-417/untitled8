static void main(String[] args) {

    System.out.println("Task 1");
    // Задача 1: Расчет выплат авторам контента
    int[] inputArray1 = {1000, 2500, 1500, 3000, 2000};
    double[] outputArray1 = new double[4];

    double sum = 0;
    double max = Integer.MIN_VALUE;
    double min = Integer.MAX_VALUE;

    for (int payment : inputArray1) {
        sum += payment;
        if (payment > max) max = payment;
        if (payment < min) min = payment;
    }

    double average = sum / inputArray1.length;

    outputArray1[0] = sum;
    outputArray1[1] = max;
    outputArray1[2] = min;
    outputArray1[3] = average;

    System.out.println("Входные данные: " + Arrays.toString(inputArray1));
    System.out.println("Результаты: " + Arrays.toString(outputArray1));
    System.out.println();

    System.out.println("Task 2");
    // Задача 2: Расчет налога 13%
    int[] inputArray2 = {40000, 55000, 35000, 60000, 45000};
    float[] outputArray2 = new float[inputArray2.length];

    for (int i = 0; i < inputArray2.length; i++) {
        outputArray2[i] = (float) (inputArray2[i] * 0.13);
    }

    System.out.println("Входные данные: " + Arrays.toString(inputArray2));
    System.out.println("Результаты: " + Arrays.toString(outputArray2));
    System.out.println();

    System.out.println("Task 3");
    // Задача 3: Проверка бонусов
    int[] inputArray3 = {4500, 5500, 6000, 4000, 7000};
    boolean[] outputArray3 = new boolean[inputArray3.length];

    for (int i = 0; i < inputArray3.length; i++) {
        outputArray3[i] = inputArray3[i] > 5000;
    }

    System.out.println("Входные данные: " + Arrays.toString(inputArray3));
    System.out.println("Результаты: " + Arrays.toString(outputArray3));
    System.out.println();

    System.out.println("Task 4");
    // Задача 4: Проверка просрочек по кредиту
    int[] inputArray4 = {1000, 500, -200, 800, 1200};
    boolean[] outputArray4 = new boolean[1];

    boolean hasNoDelinquency = true;
    for (int balance : inputArray4) {
        if (balance < 0) {
            hasNoDelinquency = false;
            break;
        }
    }
    outputArray4[0] = hasNoDelinquency;

    System.out.println("Входные данные: " + Arrays.toString(inputArray4));
    System.out.println("Результаты: " + Arrays.toString(outputArray4));
    System.out.println();

    System.out.println("Task 5");
    // Задача 5: Подсчет рентабельных месяцев
    int[] inputArray5 = {1500, -200, 3000, 0, 2500};
    int[] outputArray5 = new int[1];

    int profitableCount = 0;
    for (int profit : inputArray5) {
        if (profit > 0) {
            profitableCount++;
        }
    }
    outputArray5[0] = profitableCount;

    System.out.println("Входные данные: " + Arrays.toString(inputArray5));
    System.out.println("Количество рентабельных месяцев: " + Arrays.toString(outputArray5));
}

