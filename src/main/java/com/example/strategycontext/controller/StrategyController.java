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

	private final StrategyBeanManager strategyBeanManager;

	@GetMapping("/inventoryAllocationType/{strategy}")
	public void setInventoryAllocationTypeStrategy(@PathVariable String strategy) {
		strategyBeanManager.setInventoryAllocationType(strategy);
	}

	@GetMapping("/pickingReleaseInstructionSelectPriority/{strategy}")
	public void setPickingReleaseInstructionSelectPriority(@PathVariable String strategy) {
		strategyBeanManager.setPickingReleaseInstructionSelection(strategy);
	}

	@GetMapping("/pickingReleaseInstructionSelectPriority/check")
	public void getPickingReleaseInstructionSelectPriority(){
		strategyBeanManager.getPickingReleaseInstructionSelection().selectPickingReleaseInstruction("s");
	}
}
