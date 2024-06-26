package com.api.entity;

import java.time.*;
import jakarta.persistence.*;
import lombok.*;

/**
 * @apiNote, ABstractEntity class acts as super mapped class,
 */

@Data
@MappedSuperclass
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
