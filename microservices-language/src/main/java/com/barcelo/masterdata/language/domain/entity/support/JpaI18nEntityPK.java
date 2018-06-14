package com.barcelo.masterdata.language.domain.entity.support;

import com.barcelo.masterdata.language.domain.entity.LanguageEntity;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Embeddable
@MappedSuperclass
public class JpaI18nEntityPK implements Serializable {
    private static final long serialVersionUID = -3684383281599681250L;

    @OneToOne
    @JoinColumn(name = "language_id")
    protected LanguageEntity language;

    protected JpaI18nEntityPK(){
        //empty constructor, hibernate instance
    }

    protected JpaI18nEntityPK(LanguageEntity language){
        this.language = language;
    }
}
