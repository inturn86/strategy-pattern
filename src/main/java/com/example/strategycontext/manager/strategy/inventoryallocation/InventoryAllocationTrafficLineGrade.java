package com.example.strategycontext.manager.strategy.inventoryallocation;

import com.example.strategycontext.define.strategy.EInventoryAllocationType;
import com.example.strategycontext.manager.strategy.anno.InventoryAllocationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@InventoryAllocationType(EInventoryAllocationType.TRAFFIC_LINE_GRADE)
public class InventoryAllocationTrafficLineGrade implements IInventoryAllocation{
	@Override
	public void generateInventoryAllocation() {
		log.info("generateInventoryAllocation = " + EInventoryAllocationType.TRAFFIC_LINE_GRADE.name());
	}
}
