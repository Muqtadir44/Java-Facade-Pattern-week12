package lab.facade;

public class Ssd implements IHardDrive {


    public static int reads = 0;
    @Override
    public byte[] read(long lba, int size) {
        reads++;
        System.out.println("SSD: fast read of " + size + " bytes from LBA " + lba);
        byte[] data = new byte[size];
        for (int i = 0; i < size; i++) data[i] = 1;
        return data;
    }
}
