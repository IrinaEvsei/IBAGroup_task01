import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candidate {
    private int idCandidate;
    private String nameCandidate;
    private List<Criteries> criteriesCandidate;
    private float competence;

    public Candidate(int idCandidate, String nameCandidate, List<Criteries> criteriesCandidate, float competence) {
        this.idCandidate = idCandidate;
        this.nameCandidate = nameCandidate;
        this.criteriesCandidate = criteriesCandidate;
        this.competence = competence;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "idCandidate=" + idCandidate +
                ", nameCandidate='" + nameCandidate + '\'' +
                ", criteriesCandidate=" + criteriesCandidate +
                ", competence=" + competence +
                '}';
    }


    public float getCompetence() {
        return competence;
    }

    public void addToCompetence(float value) {

    }
    public void procent(int n){
        competence = competence * 100 / n;
    }
    public void setCompetence(float competence) {
        this.competence = competence;
    }

    public int getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(int idCandidate) {
        this.idCandidate = idCandidate;
    }

    public String getNameCandidate() {
        return nameCandidate;
    }

    public void setNameCandidate(String nameCandidate) {
        this.nameCandidate = nameCandidate;
    }

    public List<Criteries> getCriteriesCandidate() {
        return criteriesCandidate;
    }

    public void setCriteriesCandidate(List<Criteries> criteriesCandidate) {
        this.criteriesCandidate = criteriesCandidate;
    }

    public void createProfile(){
        Scanner scanner = new Scanner(System.in);
        criteriesCandidate = new ArrayList<Criteries>();


    }
}
