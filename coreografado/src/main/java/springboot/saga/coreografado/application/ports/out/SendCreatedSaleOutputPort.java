package springboot.saga.coreografado.application.ports.out;

import springboot.saga.coreografado.application.core.domain.Sale;
import springboot.saga.coreografado.application.core.domain.enums.SaleEvent;

public interface SendCreatedSaleOutputPort {
    void send(Sale sale, SaleEvent event);
}
