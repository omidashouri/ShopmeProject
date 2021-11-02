package ir.omidashouri.admin.controller.bs1.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContactBS1 {

    private String firstName;
    private String lastName;
    private String email;
    private String comments;
}
