package com.thientvse.inventoryservice.service;

import com.thientvse.inventoryservice.dto.InventoryResponse;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface InventoryService {

    List<InventoryResponse> inStock(List<String> skuCode);

}
