package com.yeoro.study.msa_with_hexagonal.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private Integer no;
    private String title;

    public static Item sample() {
        return new Item(10, "노인과 바다");
    }
}
