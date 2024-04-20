package com.api.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

public class AbstractEntity {
    
    @Column(name = "CREATED_BY")
    private String createdBy;
    
    @Column(name = "CREATED_DATE")
    private LocalDateTime createdDate;
    
    @Column(name = "MODIFIED_BY")
    private String modifiedBy;
    
    @Column(name = "MODIFIED_DATE")
    private LocalDateTime modifiedDate;
    
    @PrePersist
    protected void created() {createdDate = LocalDateTime.now();}
    
    @PreUpdate
    protected void updated() { modifiedDate = LocalDateTime.now();}
    
}
