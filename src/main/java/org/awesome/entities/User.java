package org.awesome.entities;

import jakarta.persistence.*;
import lombok.*;
import org.awesome.constants.UserType;

@Data @Builder
@Entity
@NoArgsConstructor @AllArgsConstructor
public class User extends BaseEntity {
    @Id @GeneratedValue
    private Long userNo;

    @Column(length=45, nullable = false, unique=true)
    private String userId;
    @Column(length=65, nullable = false)
    private String userPw;
    @Column(length=45, nullable = false)
    private String userNm;

    @Enumerated(EnumType.STRING)
    private UserType userType = UserType.USER;

}
