package domain;

public class Job {
    private String  kind;
    private String desc;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Job{" +
                "kind='" + kind + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
