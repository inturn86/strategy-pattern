package com.example.strategycontext.manager.strategy.inventoryallocation;

import com.example.strategycontext.define.strategy.EInventoryAllocationType;
import com.example.strategycontext.manager.strategy.anno.InventoryAllocationType;
import org.springframework.stereotype.Component;

@Component
@InventoryAllocationType(EInventoryAllocationType.TRAFFIC_LINE_GRADE)
public class InventoryAllocationTrafficLineGrade implements IInventoryAllocation{
	@Override
	public void generateInventoryAllocation() {
		
	}
}
