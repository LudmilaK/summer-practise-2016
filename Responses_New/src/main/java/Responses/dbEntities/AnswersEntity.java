package Responses.dbEntities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "answers", schema = "database", catalog = "")
public class AnswersEntity {
    private int id;
    private String value;
    private Collection<FormsEntity> formsesById;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Value", nullable = true, length = 4096)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnswersEntity that = (AnswersEntity) o;

        if (id != that.id) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "answersByAnswerId")
    public Collection<FormsEntity> getFormsesById() {
        return formsesById;
    }

    public void setFormsesById(Collection<FormsEntity> formsesById) {
        this.formsesById = formsesById;
    }
}
