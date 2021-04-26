public class GoodBehaviors {
    private String DOW;
    private String Chore;
    private String Tasks;
    private String Activity;
    private String behavior;

    public GoodBehaviors(){
        this.DOW = "";
        this.Chore = "";
        this.Tasks = "";
        this.Activity = "";
        this.behavior = "";

    }
    public GoodBehaviors(String DOW, String Chore, String Tasks, String Activity, String behavior){
        this.DOW = DOW;
        this.Chore = Chore;
        this.Tasks = Tasks;
        this.Activity = Activity;
        this.behavior = behavior;
    }

    public String getDOW() {
        return DOW;
    }

    public void setDOW(String DOW) {
        this.DOW = DOW;
    }

    public String getChore() {
        return Chore;
    }

    public void setChore(String chore) {
        Chore = chore;
    }

    public String getTasks() {
        return Tasks;
    }

    public void setTasks(String tasks) {
        Tasks = tasks;
    }

    public String getActivity() {
        return Activity;
    }

    public void setActivity(String activity) {
        Activity = activity;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }
}
