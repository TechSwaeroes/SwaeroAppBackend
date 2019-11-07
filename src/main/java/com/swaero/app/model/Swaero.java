package com.swaero.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "swearotbl")
public class Swaero {
    @Id
    @Column(name = "Id", nullable = false)
    private int id;
    @Column(name = "full_name", nullable = false)
    private String full_name;
    @Column(name = "father_name", nullable = false)
    private String father_name;
    @Column(name = "school_studied", nullable = false)
    private String school_studied;
    @Column(name = "year_of_joining_swr", nullable = false)
    private int year_of_joining_swr;
    @Column(name = "qualifation", nullable = false)
    private String qualifation;
    @Column(name = "workplace", nullable = false)
    private String workplace;
    @Column(name = "designation", nullable = false)
    private String designation;
    @Column(name = "blood_group", nullable = false)
    private String blood_group;
    @Column(name = "marital_status", nullable = false)
    private String marital_status;

    public Swaero(){
    }

    public Swaero(int id, String full_name, String father_name, String school_studied, int year_of_joining_swr, String qualifation,
                  String workplace, String designation, String blood_group, String marital_status) {
        this.id = id;
        this.full_name = full_name;
        this.father_name = father_name;
        this.school_studied = school_studied;
        this.year_of_joining_swr = year_of_joining_swr;
        this.qualifation = qualifation;
        this.workplace = workplace;
        this.designation = designation;
        this.blood_group = blood_group;
        this.marital_status = marital_status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getSchool_studied() {
        return school_studied;
    }

    public void setSchool_studied(String school_studied) {
        this.school_studied = school_studied;
    }

    public int getYear_of_joining_swr() {
        return year_of_joining_swr;
    }

    public void setYear_of_joining_swr(int year_of_joining_swr) {
        this.year_of_joining_swr = year_of_joining_swr;
    }

    public String getQualifation() {
        return qualifation;
    }

    public void setQualifation(String qualifation) {
        this.qualifation = qualifation;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Swaero)) return false;
        Swaero swaero = (Swaero) o;
        return getId() == swaero.getId() &&
                getYear_of_joining_swr() == swaero.getYear_of_joining_swr() &&
                Objects.equals(getFull_name(), swaero.getFull_name()) &&
                Objects.equals(getFather_name(), swaero.getFather_name()) &&
                Objects.equals(getSchool_studied(), swaero.getSchool_studied()) &&
                Objects.equals(getQualifation(), swaero.getQualifation()) &&
                Objects.equals(getWorkplace(), swaero.getWorkplace()) &&
                Objects.equals(getDesignation(), swaero.getDesignation()) &&
                Objects.equals(getBlood_group(), swaero.getBlood_group()) &&
                Objects.equals(getMarital_status(), swaero.getMarital_status());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFull_name(), getFather_name(), getSchool_studied(), getYear_of_joining_swr(),
                getQualifation(), getWorkplace(), getDesignation(), getBlood_group(), getMarital_status());
    }

    @Override
    public String toString() {
        return "Swaero{" +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", father_name='" + father_name + '\'' +
                ", school_studied='" + school_studied + '\'' +
                ", year_of_joining_swr=" + year_of_joining_swr +
                ", qualifation='" + qualifation + '\'' +
                ", workplace='" + workplace + '\'' +
                ", designation='" + designation + '\'' +
                ", bloodGroup='" + blood_group + '\'' +
                ", marital_status='" + marital_status + '\'' +
                '}';
    }
}
