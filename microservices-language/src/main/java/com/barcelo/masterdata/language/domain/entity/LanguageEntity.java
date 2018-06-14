package com.barcelo.masterdata.language.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * The type Language entity.
 */
@Entity
@Table(name = "language")
public class LanguageEntity implements Serializable {
    private static final long serialVersionUID = -2226421349956989423L;

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "active")
    private Boolean active;

    private LanguageEntity() {
        //empty constructor, hibernate instance
    }

    /**
     * Instantiates a new Language entity.
     *
     * @param code the code
     */
    public LanguageEntity(String code) {
        this.code = code;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets active.
     *
     * @return the active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * Sets active.
     *
     * @param active the active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }
}
