package com.syphan.practice.dto.registration;

import com.syphan.practice.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserSignIn extends BaseDto {
    @NotBlank(message = "username.must.not.be.blank")
    private String username;

    @NotBlank(message = "password.must.not.be.blank")
    private String password;
}
