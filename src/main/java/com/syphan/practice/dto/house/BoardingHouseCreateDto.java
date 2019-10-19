package com.syphan.practice.dto.house;

import com.syphan.practice.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class BoardingHouseCreateDto extends BaseDto {
    @NotNull(message = "userId.must.not.be.null")
    private Integer userId;

    @NotBlank(message = "username.must.not.be.blank")
    private String username;

    @NotBlank(message = "userPhone.must.not.be.blank")
    private String userPhone;
}
