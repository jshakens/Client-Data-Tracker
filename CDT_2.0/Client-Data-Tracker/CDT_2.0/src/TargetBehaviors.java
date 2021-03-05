public class TargetBehaviors {
private String DOW;
private String Physical;
private String Angry;
private String leaving;
private String Soar;

public TargetBehaviors(){
    this.DOW = "";
    this.Physical = "";
    this.Angry = "";
    this.leaving = "";
    this.Soar = "";
}
public TargetBehaviors(String DOW, String Physical, String Angry, String Leaving, String Soar){
    this.DOW = DOW;
    this.Physical = Physical;
    this.Angry = Angry;
    this.leaving = Leaving;
    this.Soar = Soar;
}

    public String getDOW() {
        return DOW;
    }

    public void setDOW(String DOW) {
        this.DOW = DOW;
    }

    public String getPhysical() {
        return Physical;
    }

    public void setPhysical(String physical) {
        Physical = physical;
    }

    public String getAngry() {
        return Angry;
    }

    public void setAngry(String angry) {
        Angry = angry;
    }

    public String getLeaving() {
        return leaving;
    }

    public void setLeaving(String leaving) {
        this.leaving = leaving;
    }

    public String getSoar() {
        return Soar;
    }

    public void setSoar(String soar) {
        Soar = soar;
    }
}
