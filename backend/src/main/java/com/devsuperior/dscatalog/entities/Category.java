package com.devsuperior.dscatalog.entities;

import java.io.Serializable;

public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }

        if (o == null) { return false; }

        if(getClass() != o.getClass()){ return false; }

        Category otherCategory = (Category) o;

        if(this.id != null){
            if(otherCategory.id != null){
                return false;
            } else if (!this.id.equals(otherCategory.id)){
                return false;
            }
        }
        return true;
    }
}
