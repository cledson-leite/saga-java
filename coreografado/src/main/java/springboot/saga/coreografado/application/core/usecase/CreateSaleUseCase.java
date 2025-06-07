package springboot.saga.coreografado.application.core.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import springboot.saga.coreografado.application.core.domain.Sale;
import springboot.saga.coreografado.application.core.domain.enums.SaleEvent;
import springboot.saga.coreografado.application.core.domain.enums.SaleStatus;
import springboot.saga.coreografado.application.ports.out.SaveSaleOutputPort;
import springboot.saga.coreografado.application.ports.out.SendCreatedSaleOutputPort;

public class CreateSaleUseCase {
    @Autowired
    private SaveSaleOutputPort output;

    @Autowired
    private SendCreatedSaleOutputPort message;

    public void create(Sale sale){
        sale.updateStatus(SaleStatus.PENDING);
        Sale response = this.output.save(sale);
        this.message.send(sale, SaleEvent.CREATED_SALE);
    }
}
