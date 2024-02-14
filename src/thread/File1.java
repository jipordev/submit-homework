package thread;

public class File1 {
    public static void main(String[] args) {
        char[] chars = {'W','E','l','C','O','M','E',' ','T','O',' ','C','S','T','A','D','!'};
        char[] charsStar = {'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'};
        char[] dotted = {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'};
        char[] message = {'P','L','E','A','S','E',' ','G','I','V','E',' ','U','P','!','!','!'};
        char[] download = {'D','O','W','N','L','O','A','D','.','.','.'};
        String success = "completed!!";
        Thread thread = new Thread(()->{
            Define define = new Define();
            define.read(chars);
        });
        Thread thread2 = new Thread(()->{
            Define define = new Define();
            define.read(charsStar);
        });
        Thread thread3 = new Thread(()->{
            Define define = new Define();
            define.read(message);
        });
        Thread thread4 = new Thread(()->{
            Define define = new Define();
            define.read(dotted);
        });
        Thread thread5 = new Thread(()->{
            Define define = new Define();
            define.read(download);
            System.out.println(success);
        });

        try {
            thread.start();
            thread.join();
            thread2.start();
            thread2.join();
            thread3.start();
            thread3.join();
            thread4.start();
            thread4.join();
            thread5.start();
            thread5.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Define extends Thread {
    void read(char[] chars) {
        for (char c : chars) {
            System.out.print(c);
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
    }

    @Override
    public void run() {
        super.run();
    }
}

