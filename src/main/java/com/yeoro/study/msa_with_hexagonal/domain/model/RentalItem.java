package com.yeoro.study.msa_with_hexagonal.domain.model;

import com.yeoro.study.msa_with_hexagonal.domain.vo.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalItem {

    private Item item;
    private LocalDate rentDate;
    private boolean overdued;
    private LocalDate overdueDate;

    public static RentalItem createRentalItem(Item item) {
        return new RentalItem(item, LocalDate.now(), false, LocalDate.now().plusDays(14));
    }

    public static RentalItem sample() {
        return RentalItem.createRentalItem(Item.sample());
    }

}
