package com.kyo.schoolweb.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {

    private Long id;

    private String username;

    private String email;

    private String token;

}
