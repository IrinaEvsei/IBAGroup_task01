public class Criteries {
    private int id_criteria;
    private String name_criteria;
    private int priority;

    Criteries(){}
    public int getId_criteria() {
        return id_criteria;
    }

    public void setId_criteria(int id_criteria) {
        this.id_criteria = id_criteria;
    }

    public String getName_criteria() {
        return name_criteria;
    }

    public void setName_criteria(String name_criteria) {
        this.name_criteria = name_criteria;
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

        return name_criteria != null ? name_criteria.equals(criteries.name_criteria) : criteries.name_criteria == null;
    }

    @Override
    public int hashCode() {
        return name_criteria != null ? name_criteria.hashCode() : 0;
    }
}
