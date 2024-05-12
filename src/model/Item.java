package model;

public class Item {
    private int nom;
    private int quality;

    // public void upperQuality();
    public Item(int x) {
        nom = x;
    }

    public String getNom() {
        return "Item " + nom;
    }

    public int getNomInt() {
        return nom;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int x) {
        quality = x;
    }

    public void upperQuality() {
        quality++;
    }

}
