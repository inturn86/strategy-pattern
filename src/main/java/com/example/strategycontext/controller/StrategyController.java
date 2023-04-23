package com.example.strategycontext.controller;

import com.example.strategycontext.manager.strategy.StrategyBeanManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RequiredArgsConstructor
public class StrategyController {


	@GetMapping("/inventoryAllocationType/{strategy}")
	public void setInventoryAllocationTypeStrategy(@PathVariable String strategy) {
		StrategyBeanManager.setInventoryAllocationType(strategy);
	}

	@GetMapping("/pickingReleaseInstructionSelectPriority/{strategy}")
	public void setPickingReleaseInstructionSelectPriority(@PathVariable String strategy) {
		StrategyBeanManager.setPickingReleaseInstructionSelection(strategy);
	}

	@GetMapping("/pickingReleaseInstructionSelectPriority/check")
	public void getPickingReleaseInstructionSelectPriority(){
		StrategyBeanManager.pickingReleaseInstructionSelection.selectPickingReleaseInstruction("s");
	}
	@GetMapping("/inventoryAllocationType/check")
	public void getInventoryAllocationType(){
		StrategyBeanManager.inventoryAllocation.generateInventoryAllocation();
	}
}
