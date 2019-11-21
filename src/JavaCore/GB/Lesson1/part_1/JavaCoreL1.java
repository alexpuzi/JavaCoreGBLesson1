package JavaCore.GB.Lesson1.part_1;


public class JavaCoreL1<T> {
    public static <T> void method1(T[] array, int index_1, int index_2){
        if (array == null)
            throw new IllegalArgumentException("Array is recured");
        checkIndex(array, index_1);
        checkIndex(array, index_2);
        swap(array, index_1, index_2);
    }
    public static <T> void swap(T[] array, int index_1, int index_2) {
    T temp = array[index_1];
    array[index_1] = array[index_2];
    array[index_2] = temp;
    }
    private static <T> void checkIndex(T[] array, int index){
        if(index < 0 || index >=array.length)
            throw new IllegalArgumentException("Invalid index");
    }


}
