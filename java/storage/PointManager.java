package storage;

public interface PointManager {
    public boolean open();
    public boolean close();
    public boolean isActive();
}
