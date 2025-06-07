package springboot.saga.coreografado.application.ports.out;

import springboot.saga.coreografado.application.core.domain.Sale;

public interface SaveSaleOutputPort {

    Sale save(Sale sale);
}
