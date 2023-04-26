package com.example.strategycontext.manager.strategy;

import com.example.strategycontext.define.strategy.EInventoryAllocationType;
import com.example.strategycontext.define.strategy.EPickingReleaseInstructionSelectionType;
import com.example.strategycontext.manager.strategy.context.StrategyBeanContext;
import com.example.strategycontext.manager.strategy.inventoryallocation.IInventoryAllocation;
import com.example.strategycontext.manager.strategy.pickingReleaseInstructionSelection.IPickingReleaseInstructionSelection;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class StrategyBeanManager {

	//전략 패턴 get
	public static IInventoryAllocation inventoryAllocation;
	public static IPickingReleaseInstructionSelection pickingReleaseInstructionSelection;

	public static void setInventoryAllocationType(String type) {
		//EInventoryAllocationType.valueOf(type);
		inventoryAllocation = StrategyBeanContext.inventoryAllocationBeanMap.get(type);
	}

	public static void setPickingReleaseInstructionSelection(String type) {
		pickingReleaseInstructionSelection = StrategyBeanContext.pickingReleaseInstructionSelection.get(type);
	}

	public static void setInventoryAllocationType(EInventoryAllocationType type) {
		inventoryAllocation = StrategyBeanContext.inventoryAllocationBeanMap.get(type.name());
	}

	public static void setPickingReleaseInstructionSelection(EPickingReleaseInstructionSelectionType type) {
		pickingReleaseInstructionSelection = StrategyBeanContext.pickingReleaseInstructionSelection.get(type.name());
	}

	public void init(){
		//TODO - context 올라갈 때 DB에서 해당 변수에 대한 전략을 get
		this.inventoryAllocation = StrategyBeanContext.inventoryAllocationBeanMap.get(EInventoryAllocationType.LARGE_INVENTORY.name());
		this.pickingReleaseInstructionSelection = StrategyBeanContext.pickingReleaseInstructionSelection.get(EPickingReleaseInstructionSelectionType.SIMILAR_PRODUCT.name());
	}
}
