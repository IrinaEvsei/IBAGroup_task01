import java.util.ArrayList;
import java.util.List;


public class Main {

    public final static int NUMBER_OF_CRITERIA = 4;

    public static void selectCandidate(Vacancy[] vacancies, List<Candidate> candidates){
        for (Vacancy vacancy: vacancies) {
            selectForVacancy(vacancy,candidates);
        }
    }
    private static void selectForVacancy(Vacancy vacancy,  List<Candidate> candidates) {
        if (candidates.isEmpty()) {
            return;
        }
        else {
            List<Criteries> vacancyCriteries = vacancy.getCriteries();
            for (Criteries criteria : vacancyCriteries) {
                for (Candidate candidate : candidates) {
                    List<Criteries> candidateCriteries = candidate.getCriteriesCandidate();
                    for (Criteries candCriteria : candidateCriteries) {
                        if (criteria.equals(candCriteria)) {
                            candidate.addToCompetence(candCriteria.getPriority() / criteria.getPriority());
                        }
                    }
                    candidate.procent(NUMBER_OF_CRITERIA);
                    if (candidate.getCompetence() > 50) {
                        vacancy.getCandidates().put(candidate, candidate.getCompetence());
                       // candidates.remove(candidate);
                    }
                    else{
                        candidate.setCompetence(0.0f);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        int numberOfCandidates;
        int numberOfVacancies;
        Vacancy[] vacancies;
        List<Candidate> candidates = new ArrayList<Candidate>();
        //System.out.println("Enter number of candidaes");
        numberOfCandidates = 2;
        //System.out.println("Enter number of vacancies");
        numberOfVacancies = 1;
        vacancies = new Vacancy[numberOfVacancies];
        List<Criteries> candidateCriteries = new ArrayList<Criteries>();
        List<Criteries> vacancyCriteries = new ArrayList<Criteries>();

        Criteries cr1 = new Criteries();
        Criteries cr2 = new Criteries();
        cr1.addCriteries(1,"Java",5);
        cr2.addCriteries(2,"Logic",7);

        candidateCriteries.add(cr1);
        candidateCriteries.add(cr2);
        vacancyCriteries.add(cr1);
        vacancyCriteries.add(cr2);

        //System.out.println(vacancies.toString());
        for(int i=0 ; i< numberOfVacancies; i++){
            vacancies[i] = new Vacancy();
            vacancies[0].addVacancies(1,"DEV", vacancyCriteries);
        }

//        for (int i = 0; i <= numberOfVacancies; i++) {
//            System.out.println("Input vacancies id & name & criteries:");
//            System.out.println(vacancies);
//        }

        for (int j = 0; j < numberOfCandidates; j++) {
            candidates.add(new Candidate(1, "First",candidateCriteries,0));
            candidates.add(new Candidate(2, "Second",candidateCriteries,3));
        }
        System.out.println(candidates.toString());

        selectCandidate(vacancies,candidates);
        for (Vacancy v: vacancies){
            System.out.println(v.toString());
        }
    }
}
