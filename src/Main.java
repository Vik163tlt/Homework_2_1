public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();

    }

    private static void task1() {
        System.out.println("Задание 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием.");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, необходимо немного подождать.");
        }
    }

    private static void task2() {
        System.out.println("Задание 2");
        int age = 8;
        if (age < 7) {
            System.out.println("Вы не подходите под критерии отбора");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Вы ходите в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Вы закончили школу и смело можете отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Вы окончили университет и пора искать первую работу");

        }
    }

    private static void task3() {
        System.out.println("Задание 3");
        int capacityTrainCar = 102;
        int seat = 60;
        int stand = seat - capacityTrainCar;
        int menAll = 5;
        if (menAll <= seat) {
            System.out.println("В вагоне есть сидячие места");
        } else if (menAll > seat && menAll <= capacityTrainCar) {
            System.out.println("В вагоне остались только стоячие места");
        } else if (menAll > capacityTrainCar) {
            System.out.println("Вагон заполнен!\nБольше мест нет");
        }
    }

    private static void task4() {
        System.out.println("Задание 4");
        int age = 20;
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        } else if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
    }

    private static void task5() {
        System.out.println("Задание 5");
        int age = 25;
        if (age < 7) {
            System.out.println("Вы не подходите под критерии отбора");
        } else if (age >= 7 && age < 18) {
            System.out.println("Вы ходите в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Вы закончили школу и смело можете отправляться в университет");
        } else if (age >= 24) {
            System.out.println("Вы окончили университет и пора искать первую работу");
        }
    }

    private static void task6() {
        System.out.println("Задание 6");
        int capacityTrainCar = 102;
        int seat = 60;
        int stand = seat - capacityTrainCar;
        int menAll = 200;
        if (menAll <= seat) {
            System.out.println("В вагоне есть сидячие места");
        } else if (menAll > seat && menAll <= capacityTrainCar) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("Вагон заполнен!\nБольше мест нет");
        }
    }

    private static void task7() {
        System.out.println("Задание 7");
        int age = 65;
        String kindergarten = "в детский сад";
        String school = "в школу";
        String university = "в университет";
        String work = "на работу";

        boolean goToKindergarten = age >= 2 && age < 7;
        boolean goToSchool = age >= 7 && age <= 18;
        boolean goToUniversity = age > 18 && age < 24;
        boolean goToWork = age >= 24 && age < 65;
        if (goToKindergarten) {
            System.out.printf("Если ваш возраст равен %d, то вам нужно ходить %s", age, kindergarten);
        }
        if (goToSchool) {
            System.out.printf("Если ваш возраст равен %d, то вам нужно ходить %s", age, school);
        }
        if (goToUniversity) {
            System.out.printf("Если ваш возраст равен %d, то вам нужно ходить %s", age, university);
        }
        if (goToWork) {
            System.out.printf("Если ваш возраст равен %d, то вам нужно ходить %s", age, work);
        } else {
            System.out.println("Вы не подходите под условия отбора");
        }
    }

    private static void task8() {
        System.out.println("Задание 8");
        int age = 13;
        boolean ageLess5 = age < 5;
        boolean age5_14 = age >= 5 && age < 14;
        boolean adult = false; // Если есть взрослый
        boolean ageMore14 = age >= 14;
        if (ageLess5) {
            System.out.println("Ребенку нельзя кататься");
        }
        else if (ageMore14) {
            System.out.println("Можно кататься");
        }
        else if (age5_14 && adult) {
            System.out.println("Ребенок может кататься в сопровождении взрослого");
        }
        else {
            System.out.println("Если нет взрослого, ребенок кататься не может");
        }

        }

    private static void task9() {
        System.out.println("Задание 9");
        int one = 100;
        int two = 100;
        int three = 120;
        if (one >= two && one >= three) {
            System.out.println("Большее значение равно " + one);
        }
        else if (two >= one && two >= three) {
            System.out.println("Большее значение равно " + two);
        }
        else {
            System.out.println("Большее значение равно " + three);
        }

    }
}