public class Criteries {
    private int idCriteria;
    private String nameCriteria;
    private int priority;

    public Criteries(int idCriteria, String nameCriteria, int priority) {
        this.idCriteria = idCriteria;
        this.nameCriteria = nameCriteria;
        this.priority = priority;
    }

    public Criteries() {

    }

    public int getIdCriteria() {
        return idCriteria;
    }

    public void setIdCriteria(int idCriteria) {
        this.idCriteria = idCriteria;
    }

    public String getNameCriteria() {
        return nameCriteria;
    }

    public void setNameCriteria(String nameCriteria) {
        this.nameCriteria = nameCriteria;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Criteries criteries = (Criteries) o;

        return nameCriteria != null ? nameCriteria.equals(criteries.nameCriteria) : criteries.nameCriteria == null;
    }

    @Override
    public int hashCode() {
        return nameCriteria != null ? nameCriteria.hashCode() : 0;
    }

    public void addCriteries(int idCriteria, String nameCriteria, int priority){
        setIdCriteria(idCriteria);
        setNameCriteria(nameCriteria);
        setPriority(priority);
    }

    @Override
    public String toString() {
        return "Criteries{" +
                "idCriteria=" + idCriteria +
                ", nameCriteria='" + nameCriteria + '\'' +
                ", priority=" + priority +
                '}';
    }
}
