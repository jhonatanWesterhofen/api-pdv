package dev.or.infra.database.panache;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 *
 * @author Jhonatan
 */
@Entity
@Table(name = "PD_STUDENT")
public class PanacheStudent extends PanacheEntityBase {

    @Id
    @SequenceGenerator(name = "ID", sequenceName = "GEN_ID_STUDENT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_STUDENT")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DOCUMENT")
    private String document;

    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "BIRTHDAY")
    private String birthday;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "PROFILE_IMG", columnDefinition = "BYTEA")
    private byte[] profileImg;

    @CreationTimestamp
    @Column(name = "CREATED_AT", updatable = false)
    private LocalDateTime createdAt;

    @JoinColumn(name = "ID_ADDRESS", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.LAZY)
    private PanacheAddress address;

}