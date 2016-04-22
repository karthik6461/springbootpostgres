package org.jug.algeria.domain;

import javax.persistence.*;

@Entity
@Table(name = "`ASSET`")
public class Asset {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "accessid", nullable = false)
    private String accessId;

    public Asset() {
    }

    public Asset(String id, String accessId) {
        this.id = id;
        this.accessId = accessId;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccessId() {
        return accessId;
    }

    public void setAccessId(String accessId) {
        this.accessId = accessId;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "id=" + id +
                ", accessId='" + accessId + '\'' +
                '}';
    }
}
