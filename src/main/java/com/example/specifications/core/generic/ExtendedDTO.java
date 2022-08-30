package com.example.specifications.core.generic;

import java.util.UUID;

public abstract class ExtendedDTO {

    private UUID id;

    protected ExtendedDTO() {
    }

    protected ExtendedDTO(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
