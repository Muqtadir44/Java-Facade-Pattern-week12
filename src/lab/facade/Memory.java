package lab.facade;

public class Memory {

    public static int loads = 0;

    public void load(long position, byte[] data) {
        loads++;
        System.out.println("Memory: loading " + data.length + " bytes at " + position);
    }
}
