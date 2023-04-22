package com.example.strategycontext.manager.strategy.context;

import com.example.strategycontext.manager.strategy.StrategyBeanManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class StrategyContextInitializer {

	private final StrategyBeanContext strategyBeanContext;
	private final StrategyBeanManager strategyBeanManager;

	@EventListener
	public void initializer(ContextRefreshedEvent evt){
		log.error("==== StrategyContextInitializer ====");
		strategyBeanContext.init();
		strategyBeanManager.init();
	}
}
