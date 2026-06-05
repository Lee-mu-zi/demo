package com.leemuzi.springaopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    public LogAspect() {
        System.out.println("Common LogAspect");
    }

    private final static Logger LOG = LoggerFactory.getLogger(LogAspect.class);

    /**
     * 定义一个切点
     */
    @Pointcut("execution(public * com.leemuzi.springaopdemo..*Controller.*(..))")
    public void controllerPointcut() {
    }

    @Before("controllerPointcut()")
    public void doBefore(JoinPoint joinPoint) {
        LOG.info("Before 执行成功");
    }

    @After("controllerPointcut()")
    public void doAfter(JoinPoint joinPoint) {
        LOG.info("After 执行成功");
    }

    @Around("controllerPointcut()")
    public void doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LOG.info("Around 执行成功");
    }

    @AfterReturning("controllerPointcut()")
    public void doAfterReturning(JoinPoint joinPoint) {
        LOG.info("AfterReturning 执行成功");
    }


    @AfterThrowing("controllerPointcut()")
    public void doAfterThrowing(JoinPoint joinPoint) {
        LOG.info("AfterThrowing 执行成功");
    }
}
