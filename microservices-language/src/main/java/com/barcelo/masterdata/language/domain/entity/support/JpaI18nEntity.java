package com.barcelo.masterdata.language.domain.entity.support;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * The type Jpa i 18 n entity.
 */
@MappedSuperclass
public abstract class JpaI18nEntity implements Serializable {
    private static final long serialVersionUID = 5533209631634894119L;

    /**
     * The Description.
     */
    @Column(name = "description")
    protected String description;

    /**
     * Instantiates a new Jpa i 18 n entity.
     */
    protected JpaI18nEntity() {
        //empty constructor, hibernate instance
    }

    /**
     * Instantiates a new Jpa i 18 n entity.
     *
     * @param description the description
     */
    protected JpaI18nEntity(String description) {
        this.description = description;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }
}
