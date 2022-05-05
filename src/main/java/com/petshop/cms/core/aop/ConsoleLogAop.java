package com.petshop.cms.core.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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
     * 以下切面表达式对应BaseService接口的所有方法
     **/
    @Pointcut("execution(* com.petshop.cms..BaseService.*(..))")
    public void petShopCmsPointCut(){};

    /**
     * 对切入点 "petShopCmsPointCut()" 注册一个前置通知
     **/
    @Before(value = "petShopCmsPointCut()")
    public void BeforeLog(JoinPoint joinPoint){
        System.out.print("前置通知：模拟进行控制台日志输出。");
        System.out.print("目标类是："+joinPoint.getTarget());
        System.out.println("被植入增强处理的目标方法为："+
                joinPoint.getSignature().getName()
                );
    }

    /**
     * 对切入点 "petShopCmsPointCut()" 注册一个后置通知
     **/
    @AfterReturning(value = "petShopCmsPointCut()")
    public void AfterReturningLog(JoinPoint joinPoint){
        System.out.print("后置通知：模拟进行控制台输出。");
        System.out.print("目标类是："+joinPoint.getTarget());
        System.out.println("被植入增强处理的目标方法为："+
                joinPoint.getSignature().getName()
        );
    }

    /**
     * 环绕通知
     * ProceedingJoinPoint是JoinPoint的子接口，表示可以执行目标方法
     * 1.返回值必须为Object类型
     * 2.必须接收一个ProceedingJoinPoint类型的参数
     * 3.必须throws Throwable
     **/
    @Around(value = "petShopCmsPointCut()")
    public Object AroundLog(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("环绕通知：模拟开启事务...");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("环绕通知：模拟关闭事务...");
        return obj;
    }

    /**
     * 异常通知
     **/
    @AfterThrowing(value = "petShopCmsPointCut()",throwing = "e")
    public void AfterThrowingLog(JoinPoint joinPoint,Throwable e){
        System.out.println("异常通知：出错了，"+e.getMessage());
    }

    /**
     * 最终通知
     **/
    @After(value = "petShopCmsPointCut()")
    public void AfterLog(JoinPoint joinPoint){
        System.out.println("最终通知：模拟结束后释放变量。");
    }
}
