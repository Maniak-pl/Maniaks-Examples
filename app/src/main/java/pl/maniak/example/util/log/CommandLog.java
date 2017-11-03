package pl.maniak.example.util.log;

public class CommandLog {
    private String mgs;
    private int color;

    public CommandLog(String mgs, int color) {
        this.mgs = mgs;
        this.color = color;
    }

    public String getMgs() {
        return mgs;
    }

    public void setMgs(String mgs) {
        this.mgs = mgs;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
