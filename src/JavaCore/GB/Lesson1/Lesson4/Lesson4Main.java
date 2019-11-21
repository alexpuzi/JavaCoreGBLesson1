package JavaCore.GB.Lesson1.Lesson4;

//1. Создать три потока, каждый из которых выводит определенную букву (A, B и C)
//5 раз (порядок – ABСABСABС). Используйте wait/notify/notifyAll.
public class Lesson4Main {


    public static void main(String[] args) {
        ThreadMy A = new ThreadMy("А");
        ThreadMy B = new ThreadMy("Б");
        ThreadMy C = new ThreadMy("В");
        for (int i = 0; i < 2; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("FIN");


    }


}

class ThreadMy implements Runnable {
    Thread nameOfThread;

    ThreadMy(String name) {
        nameOfThread = new Thread(this, name);
        nameOfThread.start();
    }


    @Override
    public void run() {
        System.out.println(nameOfThread + " start");
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(400);
                System.out.println(nameOfThread.getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

