package com.company.library.dto.auth;

import com.company.library.enums.UserStatus;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String email;
    private String name;
    private String surname;
    private UserStatus status;
}
