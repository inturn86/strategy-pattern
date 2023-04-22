package com.example.strategycontext.manager.strategy.inventoryallocation;

import com.example.strategycontext.define.strategy.EInventoryAllocationType;
import com.example.strategycontext.manager.strategy.anno.InventoryAllocationType;
import org.springframework.stereotype.Component;

@Component
@InventoryAllocationType(EInventoryAllocationType.LARGE_INVENTORY)
public class InventoryAllocationLargeInventory implements IInventoryAllocation{
	@Override
	public void generateInventoryAllocation() {

	}
}
