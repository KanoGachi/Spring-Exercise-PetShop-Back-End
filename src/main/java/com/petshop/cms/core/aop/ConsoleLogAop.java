package com.petshop.cms.core.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: petshop-back-end
 * @BelongsPackage: com.petshop.cms.core.aop
 * @Author: LostKIKI
 * @CreateTime: 2022-04-29  15:48
 * @Description: 对于基础服务的终端输出切面~
 * @Version: 1.0
 */
@Aspect
@Component
public class ConsoleLogAop {
    /**
     * 定义一个切面表达式，并使用一个方法签名对其命名
     * 使用下面的切面表达式 "petShopCmsPointCut()" ，
     * 会使通知对 com.petshop.cms包下的所有类的所有方法生效
     **/
    @Pointcut("execution(* com.petshop.cms.*.*(..))")
    public void petShopCmsPointCut(){};

    /**
     * 对切入点 "petShopCmsPointCut()" 注册一个前置通知
     **/
    @Before(value = "petShopCmsPointCut()")
    public void BeforeLog(JoinPoint joinPoint){
        System.out.println("前置通知：模拟进行控制台日志输出");
        System.out.println("目标类是："+joinPoint.getTarget());
        System.out.println("被植入增强处理的目标方法为："+
                joinPoint.getSignature().getName()
                );
    }

    /**
     * 对切入点 "petShopCmsPointCut()" 注册一个后置通知
     **/
    @AfterReturning(value = "petShopCmsPointCut()")
    public void AfterReturningLog(JoinPoint joinPoint){

    }
}
