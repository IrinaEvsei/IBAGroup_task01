import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vacancy {
    private int id_vacancy;
    private String name_vacancy;
    private List <Criteries> criteries;
    private Map<Candidate, Float> candidates = new HashMap<Candidate, Float>();
    public Vacancy(int id_vacancy, String name_vacancy) {
        this.id_vacancy = id_vacancy;
        this.name_vacancy = name_vacancy;
    }

    public Map<Candidate, Float> getCandidates() {
        return candidates;
    }

    public void setCandidates(Map<Candidate, Float> candidates) {
        this.candidates = candidates;
    }

    public Vacancy() { }

    public List<Criteries> getCriteries() {
        return criteries;
    }

    public void setCriteries(List<Criteries> criteries) {
        this.criteries = criteries;
    }

    public int getId_vacancy() {
        return id_vacancy;
    }

    public void setId_vacancy(int id_vacancy) {
        this.id_vacancy = id_vacancy;
    }

    public String getName_vacancy() {
        return name_vacancy;
    }

    public void setName_vacancy(String name_vacancy) {
        this.name_vacancy = name_vacancy;
    }


    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Vacancy id").append(" - ").append(getId_vacancy()).append(", ");
        builder.append("Vacancy Name").append(" - ").append(getName_vacancy()).append(" ,");

        return builder.toString();
    }
}
