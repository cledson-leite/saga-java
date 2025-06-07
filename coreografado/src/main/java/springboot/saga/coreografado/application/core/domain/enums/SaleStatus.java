package springboot.saga.coreografado.application.core.domain.enums;

import java.util.Arrays;

public enum SaleStatus {
    PENDING(1), FINALIZED(2), CANCELED(3);

    private final Integer status;

    SaleStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus(){
        return status;
    }

    public static SaleStatus toEnum(Integer status){
        if(status == null) return null;
        return Arrays.stream(SaleStatus.values()).filter(item -> status.equals(item.getStatus())).findFirst().orElseThrow(() -> new IllegalArgumentException("Status inválido"));
    }
}
