package com.dilara.soru3.entity;

public class BaseEntity { //değişkenleri private aldım
    private Long id;
    private Long createAt;
    private Long updateAt;
    private int state;


    //Getter setter ile encapsulation yapmış oldum.
    public BaseEntity() {
    }

    public BaseEntity(Long id, Long createAt, Long updateAt, int state) {
        this.id = id;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
