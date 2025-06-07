package springboot.saga.coreografado.application.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import springboot.saga.coreografado.application.core.domain.enums.SaleStatus;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sale {

    private Long id;
    private Long productId;
    private Long useId;
    private Integer quantity;
    private BigDecimal value;
    private SaleStatus status;

    public void updateStatus(SaleStatus newStatus) {
        this.status = newStatus;
    }
}
