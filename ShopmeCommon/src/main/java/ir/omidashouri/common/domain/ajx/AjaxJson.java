package ir.omidashouri.common.domain.ajx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AjaxJson {

    private String page;
    private String header;
    private TopJson top;
    private List<ContentJson> contents = new ArrayList<>();
}
