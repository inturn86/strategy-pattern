package com.example.strategycontext.manager.strategy.pickingReleaseInstructionSelection;

import com.example.strategycontext.define.strategy.EPickingReleaseInstructionSelectionType;
import com.example.strategycontext.manager.strategy.anno.PickingReleaseInstructionSelectionType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@PickingReleaseInstructionSelectionType(EPickingReleaseInstructionSelectionType.SIMILAR_PRODUCT)
public class PickingReleaseInstructionSelectSimilarProduct implements IPickingReleaseInstructionSelection{
	@Override
	public void selectPickingReleaseInstruction(String releaseWaveNum) {
		log.error("PickingReleaseInstructionSelectSimilarProduct");
	}
}
