public class Main {
    static public void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    static public void task1(){
        System.out.println("Задание 1");
        for(int i = 0;i<10;i++){
            System.out.println(i+1);
        }
    }
    static public void task2(){
        System.out.println("Задание 2");
        for(int i = 10;i !=0;i--){
            System.out.println(i);
        }
    }
    static public void task3(){
        System.out.println("Задание 3");
        for(int i = 0; i<17;i=i+2){
            System.out.println(i);
        }
    }
    static public void task4(){
        System.out.println("Задание 4");
        for(int i = 10;i>-11;i--){
            System.out.println(i);
        }
    }
    static public void task5(){
        System.out.println("Задание 5");
        for (int i =1904;i<=2096;i=i+4){
            System.out.println("Весокосный год: " + i);
        }
    }
    static public void task6(){
        System.out.println("Задание 6");
        for(int i = 7; i<=98;i=i+7){
            System.out.println("число "+ i);
        }
    }
    static public void task7(){
        System.out.println("Задание 7");
        for(int i = 1; i<=512;i=i*2){
            System.out.println("число "+ i);
        }
    }
    static public void task8(){
        System.out.println("Задание 8");
        int sum = 0;
        for (int i =1;i<=12;i++){
            sum = sum + 29_000;
            System.out.println("Месяц "+i+", сумма накоплений равна"+sum+" рублей");
        }
    }
    static public void task9(){
        System.out.println("Задание 9");
        int sum = 0;
        for (int i =1;i<=12;i++){
            sum = sum + 29_000;
            sum = sum + (sum/100*12);
            System.out.println("Месяц "+i+", сумма накоплений равна"+sum+" рублей");
        }
    }
    static public void task10(){
        System.out.println("Задание 10");
        int num1=2;
        for(int i = 1;i<=10;i++){
            int res = num1*i;
            System.out.println(num1+"*"+i+"="+ res);
        }
    }
}