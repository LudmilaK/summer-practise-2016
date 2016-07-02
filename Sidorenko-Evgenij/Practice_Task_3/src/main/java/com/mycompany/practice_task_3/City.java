package com.mycompany.practice_task_3;
// Generated 02.07.2016 16:47:59 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * City generated by hbm2java
 */
@Entity
@Table(name="city"
    ,catalog="practice_task_2"
)
public class City  implements java.io.Serializable {


     private CityId id;
     private Integer population;
     private Integer area;

    public City() {
    }

	
    public City(CityId id) {
        this.id = id;
    }
    public City(CityId id, Integer population, Integer area) {
       this.id = id;
       this.population = population;
       this.area = area;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="name", column=@Column(name="Name", nullable=false, length=40) ), 
        @AttributeOverride(name="country", column=@Column(name="Country", nullable=false, length=40) ) } )
    public CityId getId() {
        return this.id;
    }
    
    public void setId(CityId id) {
        this.id = id;
    }

    
    @Column(name="Population")
    public Integer getPopulation() {
        return this.population;
    }
    
    public void setPopulation(Integer population) {
        this.population = population;
    }

    
    @Column(name="Area")
    public Integer getArea() {
        return this.area;
    }
    
    public void setArea(Integer area) {
        this.area = area;
    }




}

