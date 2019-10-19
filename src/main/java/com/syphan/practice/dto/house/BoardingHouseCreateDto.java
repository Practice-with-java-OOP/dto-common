package com.syphan.practice.dto.house;

import com.syphan.practice.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
public class BoardingHouseCreateDto extends BaseDto {
    @NotNull(message = "userId.must.not.be.null")
    private Integer userId;

    @NotBlank(message = "name.must.not.be.blank")
    private String name;

    @NotBlank(message = "address.must.not.be.blank")
    private String address;

    @NotNull(message = "roomNum.must.not.be.null")
    private int roomNum;
}
