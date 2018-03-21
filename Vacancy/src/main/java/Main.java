import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


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
                    List<Criteries> candidateCriteries = candidate.getCriteries_candidate();
                    for (Criteries candCriteria : candidateCriteries) {
                        if (criteria.equals(candCriteria)) {
                            candidate.addToCompetence(candCriteria.getPriority() / criteria.getPriority());
                        }
                    }
                    candidate.procent(NUMBER_OF_CRITERIA);
                    if (candidate.getCompetence() > 50) {
                        vacancy.getCandidates().put(candidate, candidate.getCompetence());
                        candidates.remove(candidate);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfCandidates;
        int numberOfVacancies;
        Vacancy[] vacancies;
        List<Candidate> candidates = new ArrayList<Candidate>();
        System.out.println("Enter number of candidaes");
        numberOfCandidates = scan.nextInt();
        System.out.println("Enter number of vacancies");
        numberOfVacancies = scan.nextInt();
        vacancies = new Vacancy[numberOfVacancies];

//??????????????
        for (int i = 0; i <= numberOfVacancies; i++){
            System.out.println("Input vacancies id & name:");
            vacancies[i] = new Vacancy(scan.nextInt(),scan.next());
        }

        for (int j = 0; j < numberOfCandidates; j++){
            System.out.println("hi");

        }
    }
}
