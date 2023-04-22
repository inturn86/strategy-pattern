package com.example.strategycontext.manager.strategy;

import com.example.strategycontext.define.strategy.EInventoryAllocationType;
import com.example.strategycontext.define.strategy.EPickingReleaseInstructionSelectionType;
import com.example.strategycontext.manager.strategy.context.StrategyBeanContext;
import com.example.strategycontext.manager.strategy.inventoryallocation.IInventoryAllocation;
import com.example.strategycontext.manager.strategy.pickingReleaseInstructionSelection.IPickingReleaseInstructionSelection;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class StrategyBeanManager {

	//전략 패턴 get
	public IInventoryAllocation inventoryAllocation;
	public IPickingReleaseInstructionSelection pickingReleaseInstructionSelection;

	public void setInventoryAllocationType(String type) {
		inventoryAllocation = StrategyBeanContext.inventoryAllocationBeanMap.get(type);
	}

	public void setPickingReleaseInstructionSelection(String type) {
		pickingReleaseInstructionSelection = StrategyBeanContext.pickingReleaseInstructionSelection.get(type);
	}

	public void init(){
		//재고할당 전략 get
		this.inventoryAllocation = StrategyBeanContext.inventoryAllocationBeanMap.get(EInventoryAllocationType.LARGE_INVENTORY.name());
		this.pickingReleaseInstructionSelection = StrategyBeanContext.pickingReleaseInstructionSelection.get(EPickingReleaseInstructionSelectionType.SIMILAR_PRODUCT.name());
	}
}
