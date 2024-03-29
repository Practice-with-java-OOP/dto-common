package com.syphan.practice.dto.house;

import com.syphan.practice.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardingHouseCreateDto extends BaseDto {
    @NotBlank(message = "name.must.not.be.blank")
    private String name;

    @NotBlank(message = "address.must.not.be.blank")
    private String address;

    @NotNull(message = "roomNum.must.not.be.null")
    private int roomNum;
}
