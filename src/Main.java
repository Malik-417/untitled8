static void main(String[] args) {
        // Задача 1: Расчет выплат авторам контента
        int[] inputArray1 = {1000, 2500, 1500, 3000, 2000};
        double[] outputArray1 = new double[4];

        // Расчет суммы
        double sum = 0;
        for (int payment : inputArray1) {
            sum += payment;
        }

        // Расчет максимума и минимума
        double max = inputArray1[0];
        double min = inputArray1[0];
        for (int payment : inputArray1) {
            if (payment > max) max = payment;
            if (payment < min) min = payment;
        }

        // Расчет среднего
        double average = sum / inputArray1.length;

        // Заполнение outputArray
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = average;

        System.out.println("Задача 1:");
        System.out.println("Входные данные: " + Arrays.toString(inputArray1));
        System.out.println("Результаты: " + Arrays.toString(outputArray1));
        System.out.println();

        // Задача 2: Расчет налога 13%
        int[] inputArray2 = {40000, 55000, 35000, 60000, 45000};
        double[] outputArray2 = new double[inputArray2.length];

        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * 0.13;
        }

        System.out.println("Задача 2:");
        System.out.println("Входные данные: " + Arrays.toString(inputArray2));
        System.out.println("Результаты: " + Arrays.toString(outputArray2));
        System.out.println();

        // Задача 3: Проверка бонусов
        int[] inputArray3 = {4500, 5500, 6000, 4000, 7000};
        boolean[] outputArray3 = new boolean[inputArray3.length];

        for (int i = 0; i < inputArray3.length; i++) {
            outputArray3[i] = inputArray3[i] > 5000;
        }

        System.out.println("Задача 3:");
        System.out.println("Входные данные: " + Arrays.toString(inputArray3));
        System.out.println("Результаты: " + Arrays.toString(outputArray3));
    }
}

