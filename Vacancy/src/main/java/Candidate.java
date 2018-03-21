import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candidate {
    private int id_candidate;
    private String name_candidate;
    private List<Criteries> criteries_candidate;
    private float competence;

    public float getCompetence() {
        return competence;
    }

    public void addToCompetence(float value){
        competence += value;
    }
    public void procent(int n){
        competence = competence * 100 / n;
    }
    public void setCompetence(float competence) {
        this.competence = competence;
    }

    public int getId_candidate() {
        return id_candidate;
    }

    public void setId_candidate(int id_candidate) {
        this.id_candidate = id_candidate;
    }

    public String getName_candidate() {
        return name_candidate;
    }

    public void setName_candidate(String name_candidate) {
        this.name_candidate = name_candidate;
    }

    public List<Criteries> getCriteries_candidate() {
        return criteries_candidate;
    }

    public void setCriteries_candidate(List<Criteries> criteries_candidate) {
        this.criteries_candidate = criteries_candidate;
    }

    public void createProfile(){
        Scanner scanner = new Scanner(System.in);
        criteries_candidate = new ArrayList<Criteries>();


    }
}
