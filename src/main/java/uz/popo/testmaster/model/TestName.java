package uz.popo.testmaster.model;

import javax.persistence.*;

@Entity
@Table(name = "test_names")
public class TestName {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id")
    private Test test;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}