package ru.practice_lab.hibernate.dao;

import javax.persistence.*;

/**
 * Created by a1 on 04.07.16.
 */
@Entity
@Table(name = "FestivalOrganizer", schema = "practice_lab", catalog = "")
@IdClass(FestivalOrganizerEntityPK.class)
public class FestivalOrganizerEntity {
    private String name;
    private String accreditationCountry;
    private CountryEntity countryByAccreditationCountry;

    @Id
    @Column(name = "Name", nullable = false, length = 40)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "AccreditationCountry", nullable = false, length = 40)
    public String getAccreditationCountry() {
        return accreditationCountry;
    }

    public void setAccreditationCountry(String accreditationCountry) {
        this.accreditationCountry = accreditationCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FestivalOrganizerEntity that = (FestivalOrganizerEntity) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (accreditationCountry != null ? !accreditationCountry.equals(that.accreditationCountry) : that.accreditationCountry != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (accreditationCountry != null ? accreditationCountry.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "AccreditationCountry", referencedColumnName = "Name", nullable = false)
    public CountryEntity getCountryByAccreditationCountry() {
        return countryByAccreditationCountry;
    }

    public void setCountryByAccreditationCountry(CountryEntity countryByAccreditationCountry) {
        this.countryByAccreditationCountry = countryByAccreditationCountry;
    }
}
