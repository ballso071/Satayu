package th.ac.kmutnb.satayu;

public class Data {
    private String mtext1;
    private String mtext2;
    private int micon;

    public Data(String mtext1, String mtext2, int micon) {
        this.mtext1 = mtext1;
        this.mtext2 = mtext2;

        this.micon = micon;
    }

    public String getMtext1() {
        return mtext1;
    }
    public void setMtext1(String mtext1) {
        this.mtext1 = mtext1;
    }

    public String getMtext2() {
        return mtext2;
    }
    public void setMtext2(String mtext2) {
        this.mtext2 = mtext2;
    }

    public int getMicon() {
        return micon;
    }
    public void setMicon(int micon) {
        this.micon = micon;
    }
}

