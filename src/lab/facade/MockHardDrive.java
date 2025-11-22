package lab.facade;

public class MockHardDrive implements IHardDrive {
    @Override
    public byte[] read(long lba, int size) {
        byte[] fixed = new byte[size];
        for (int i = 0; i < size; i++) fixed[i] = 9;
        return fixed;
    }
}
