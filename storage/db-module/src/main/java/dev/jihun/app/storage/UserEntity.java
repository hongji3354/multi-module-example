package dev.jihun.app.storage;

import javax.persistence.Entity;

@Entity
public class UserEntity extends BaseEntity {

    private String name;

    protected UserEntity() {
    }
}
