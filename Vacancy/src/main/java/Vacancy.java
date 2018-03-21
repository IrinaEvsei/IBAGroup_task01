import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vacancy {
    private int idVacancy;
    private String nameVacancy;
    private List <Criteries> criteries;
    private Map<Candidate, Float> candidates = new HashMap<Candidate, Float>();


    public Vacancy(int idVacancy, String nameVacancy, List<Criteries> criteries) {
        this.idVacancy = idVacancy;
        this.nameVacancy = nameVacancy;
        this.criteries = criteries;
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

    public int getIdVacancy() {
        return idVacancy;
    }

    public void setIdVacancy(int idVacancy) {
        this.idVacancy = idVacancy;
    }

    public String getNameVacancy() {
        return nameVacancy;
    }

    public void setNameVacancy(String nameVacancy) {
        this.nameVacancy = nameVacancy;
    }

    public void addVacancies(int idVacancy, String nameVacancy, List<Criteries> criteries){
        setIdVacancy(idVacancy);
        setNameVacancy(nameVacancy);
        setCriteries(criteries);
    }

    @Override
    public String toString() {
        return "Vacancy{" +
                "idVacancy=" + idVacancy +
                ", nameVacancy='" + nameVacancy + '\'' +
                ", criteries=" + criteries +
                ", candidates=" + candidates +
                '}';
    }
}
