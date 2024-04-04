public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("задание 6");
        var fighter_1 = 78.2;
        var fighter_2 = 82.7;
        var sumWeight = fighter_1 + fighter_2;
        System.out.println("Общая масса двух бойцов составляет " + sumWeight + " кг");
        var difWeight = fighter_2 - fighter_1;
        System.out.println("Разница в весе между бойцами составляет " + difWeight + " кг");

        System.out.println("задание 7");
        var ostDel = sumWeight % difWeight;
        System.out.println(ostDel);

        System.out.println("Задание 8");
        var allHours_1 = 640;                   // В данной задаче обозначения переменных имеют _1 и _2 для обозначениях двух случаев. В целом в работе задаю ко всему переменные
        var workerPerHour = 8;
        var workers_1 = allHours_1 / workerPerHour;
        System.out.println("Всего работников в компании - " + workers_1 + " человек");
        var workers_2 = 94;
        var allHours_2 = workers_2 * workerPerHour;
        System.out.println("Если в компании работает " + workers_2 + " человек, то всего " + allHours_2 + "часов работы может быть поделено между сотрудниками");
    }
}