package model;

public class Preferance_model {

    String tv1;
    Integer image1;

    public String getTv1() {
        return tv1;
    }

    public void setTv1(String tv1) {
        this.tv1 = tv1;
    }

    public Integer getImage1() {
        return image1;
    }

    public void setImage1(Integer image1) {
        this.image1 = image1;
    }

    public Preferance_model(String tv1, Integer image1) {
        this.tv1 = tv1;
        this.image1 = image1;
    }
}
