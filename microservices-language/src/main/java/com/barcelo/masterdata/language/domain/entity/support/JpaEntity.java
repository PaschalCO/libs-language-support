package com.barcelo.masterdata.language.domain.entity.support;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;


/**
 * The type Jpa entity.
 */
@MappedSuperclass
public abstract class JpaEntity implements Serializable {
    private static final long serialVersionUID = -1243926035916077055L;

    @Id
    @Column(name = "code")
    protected String code;

    /**
     * The Active.
     */
    @Column(name = "active")
    protected boolean active;

    protected JpaEntity() {
        //empty constructor, hibernate instance
    }

    /**
     * Instantiates a new Jpa entity.
     *
     * @param code the code
     */
    protected JpaEntity(String code) {
        this.code = code;
        this.active = Boolean.TRUE;
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
     * Is active boolean.
     *
     * @return the boolean
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets active.
     *
     * @param active the active
     */
    public void setActive(boolean active) {
        this.active = active;
    }
}
