public class Main {
    public static void main(String[] args) {

        //Задача с цифрами от 1 до 10
        int i = 1;
        while (i<=10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        for (i = 10; i >= 1; i = i - 1){
            System.out.print(i + " ");
        }
        System.out.println(" ");

        //Задача про пятницы
        int fridayDay = 1;
        for (int j = fridayDay;  j <= 31; j = j + 7) {
            System.out.println("Сегодня пятница, " + j  + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println(" ");

        //Задача про комету
        int yearStart = 2021;
        int yearFinish = 2121;
        for (int k = 0; k <= yearStart + 100; k++) {
            if (k % 79 == 0) {
                if (k >= yearStart - 200) {
                    System.out.println(k);
                }
            }
        }

    }
}