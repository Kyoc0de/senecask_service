package com.kyo.schoolweb.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterForm {

    private String username;

//    private String nickname;

    private String password;

//    private String rePassword;

    private String email;

}
