package uz.gita.infoapp;

public class ModelItem{
    private int name;
    private int info;
    private int image;
    public ModelItem(int name, int info, int image) {
        this.name = name;
        this.info = info;
        this.image = image;
    }

    public int getName() {
        return name;
    }

    public int getInfo() {
        return info;
    }

    public int getImage() {
        return image;
    }
}
