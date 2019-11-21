package JavaCore.GB.Lesson1;

import JavaCore.GB.Lesson1.part_1.JavaCoreL1;
import java.util.Arrays;
import java.util.List;
//1. Написать метод, который меняет два элемента
// массива местами (массив может быть любого
// ссылочного типа);
// 2. Написать метод, который преобразует массив
// в ArrayList;
// 3. Большая задача:
// Есть классы Fruit -> Apple, Orange (больше фруктов не надо);
// Класс Box, в который можно складывать фрукты.
// Коробки условно сортируются по типу фрукта,
// поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
// Для хранения фруктов внутри коробки можно
// использовать ArrayList;
// Сделать метод getWeight(), который
// высчитывает вес коробки,
// зная количество фруктов и вес одного фрукта
// (вес яблока – 1.0f, апельсина – 1.5f.
// Не важно, в каких это единицах);
// Внутри класса Коробка сделать метод
// compare, который позволяет сравнить
// текущую коробку с той, которую подадут в compare
// в качестве параметра, true – если она равны по весу,
// false – в противном случае
// (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
// Написать метод, который позволяет пересыпать
// фрукты из текущей коробки в другую (помним про сортировку
// фруктов: нельзя яблоки высыпать в коробку с апельсинами).
// Соответственно, в текущей коробке фруктов
// не остается, а в другую перекидываются
// объекты, которые были в этой коробке;
// Не забываем про метод добавления фрукта в коробку.

public class Main {

    public static <T extends Number> void main(String[] args) {

        TechnicalClass technicalClass;
        technicalClass = new TechnicalClass("part", 1, 2, 3);
        technicalClass.inform();
        //далее само 1 задание
        System.out.printf("%s%d%n", technicalClass.getPart(), technicalClass.getNumber_1());
        try {
            JavaCoreL1<T> arrayOffirstPart = new JavaCoreL1<T>();
            Integer[] intArray = {1,2,3};
            display(intArray);
            arrayOffirstPart.swap(intArray,0,1);
            display(intArray);
            String[] stringArray = {"asd","fgmmn","lkofvvv"};
            display(stringArray);
            arrayOffirstPart.swap(stringArray,0,1);
            display(stringArray);

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Do later");
        }


        //Done (second part)
        technicalClass.inform();
        System.out.printf("%s%d%n", technicalClass.getPart(), technicalClass.getNumber_2());
        String[] part2 = new String[]{"Слово_1", "Слово_2", "Слово_3"};
        List<String> arrayList = Arrays.asList(part2);
        for (String e : arrayList) {
            System.out.println(e);
        }
        technicalClass.inform();
        System.out.printf("%s%d%n", technicalClass.getPart(), technicalClass.getNumber_3());
        // Will do tomorrow

    }

    private static void display(Object[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("-x-x-x-x-");
    }
}
