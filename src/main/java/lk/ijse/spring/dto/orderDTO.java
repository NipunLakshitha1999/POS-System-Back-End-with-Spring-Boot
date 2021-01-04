package lk.ijse.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class orderDTO {
    private String orderID;
    private String Orderdate;
    private String cusID;
    private String itemCode;
    private int qty;

}
