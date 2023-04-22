package com.example.strategycontext.manager.strategy.context;

import com.example.strategycontext.manager.strategy.anno.InventoryAllocationType;
import com.example.strategycontext.manager.strategy.anno.PickingReleaseInstructionSelectionType;
import com.example.strategycontext.manager.strategy.inventoryallocation.IInventoryAllocation;
import com.example.strategycontext.manager.strategy.pickingReleaseInstructionSelection.IPickingReleaseInstructionSelection;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.springframework.aop.support.AopUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Slf4j
@RequiredArgsConstructor
public class StrategyBeanContext {

	private final ApplicationContext context;
	public static Map<String, IInventoryAllocation> inventoryAllocationBeanMap = new ConcurrentHashMap<>();
	public static Map<String, IPickingReleaseInstructionSelection> pickingReleaseInstructionSelection = new ConcurrentHashMap<>();
	public void init(){
		inventoryAllocationBeanMap = getBeanMap(IInventoryAllocation.class, InventoryAllocationType.class);
		pickingReleaseInstructionSelection = getBeanMap(IPickingReleaseInstructionSelection.class, PickingReleaseInstructionSelectionType.class);
	}

	public <T> Map<String, T> getBeanMap(Class<T> type, Class<? extends Annotation> annotationType) {
		Map<String, T> result = new ConcurrentHashMap<>();
		Map<String, Object> beanMap = context.getBeansWithAnnotation(annotationType);
		for(Object bean : beanMap.values()){
			//Class<?> clazz = AopUtils.isAopProxy(bean) ? AopUtils.getTargetClass(bean) : bean.getClass();
			Class<?> clazz = bean.getClass();
			try {
				result.put(MethodUtils.invokeMethod(MethodUtils.invokeMethod(clazz, "getAnnotation", annotationType), "value").toString(), type.cast(bean));
			} catch (Exception e) {
				log.error(e.getMessage(), e);
			}
		}
		return result;
	}
}
