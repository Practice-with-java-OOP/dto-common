package com.syphan.practice.dto.registration;

import com.syphan.practice.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDto extends BaseDto {

    private static final long serialVersionUID = 4L;

    @NotBlank(message = "username.must.not.be.blank")
    private String username;

    @NotBlank(message = "password.must.not.be.blank")
    private String password;

    private String avatar;

    private String fullName;

    private String email;

    private String phoneNum;

    private List<Integer> roleIds;

    @Override
    public String toString() {
        return "UserCreateDto {" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", roleIds=" + roleIds +
                '}';
    }
}
