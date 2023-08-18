package com.sky.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author LiangJin
 * @date 2023/08/16 14:37
 **/
@Component
public class MyClass {
    public void myMethod() {
        System.out.println("Executing myMethod...");

    }
}

//    @Aspect
//    @Component
//    public class AopTest {
//        @Autowired
//        private MyClass myClass;
//
//        @Pointcut("execution(* com.sky.aspect.MyClass.myMethod(..))")
//        private void myMethodPointcut() {
//        }
//
//        @Before("myMethodPointcut()")
//        public void beforeAdvice(JoinPoint joinPoint) {
//            System.out.println("Before advice: Logging before method execution");
//        }
//
//        @AfterReturning(pointcut = "myMethodPointcut()", returning = "result")
//        public void afterReturningAdvice(JoinPoint joinPoint, Object result) {
//            System.out.println("After returning advice: Logging after method execution. Result: " + result);
//        }
//
//        @AfterReturning("myMethodPointcut()")
//        public void afterReturningAdvice(JoinPoint joinPoint) {
//            System.out.println("After returning advice: Logging after method execution");
//        }
//
//        @AfterThrowing(pointcut = "myMethodPointcut()", throwing = "ex")
//        public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex) {
//            System.out.println("After throwing advice: Exception occurred. Exception: " + ex);
//        }
//
//        @Around("myMethodPointcut()")
//        public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
//            System.out.println("Around advice: Before method execution");
//            Object result = joinPoint.proceed();
//            System.out.println("Around advice: After method execution");
//            return result;
//        }
//
//        public void testMyMethod() {
//            System.out.println("Executing testMyMethod...");
//
//            myClass.myMethod();
//
//            System.out.println("testMyMethod executed.");
//        }
//    }

// 这里可以加入一些业务逻辑

//        System.out.println("Executing myMethod...");
//        // 测试前置通知
//        System.out.println("Before advice - Additional logic");
//
//        // 测试环绕通知
//        try {
//            System.out.println("Around advice - Before method execution");
//            // 在这里可以加入更多的业务逻辑
//            int result = divideNumbers(10, 2);
//            System.out.println("Result of divideNumbers: " + result);
//            System.out.println("Around advice - After method execution");
//        } catch (ArithmeticException e) {
//            System.out.println("Around advice - Exception occurred: " + e.getMessage());
//        }
//
//        // 测试返回通知
//        System.out.println("After returning advice - Additional logic");
//
//        System.out.println("myMethod executed.");
//
//    private int divideNumbers(int num1, int num2) {
//        return num1 / num2;
//    }
//}


