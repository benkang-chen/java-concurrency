package lock.method;

public class LockMethod {
    public synchronized void busiA() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "deal with bussiness A:"+i);
        }
    }
    public synchronized void busiB() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "deal with bussiness B:"+i);
        }
    }
}
