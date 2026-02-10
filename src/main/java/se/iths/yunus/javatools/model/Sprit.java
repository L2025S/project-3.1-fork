package se.iths.yunus.javatools.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Sprit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String titel;
    private double apv;
    private int ageInMonth;
    private double prise;

    public Sprit() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public double getApv() {
        return apv;
    }

    public void setApv(double apv) {
        this.apv = apv;
    }

    public int getAgeInMonth() {
        return ageInMonth;
    }

    public void setAgeInMonth(int ageInMonth) {
        this.ageInMonth = ageInMonth;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }
}
