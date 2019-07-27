package com.seventhree.st.aspect;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Stopwatch;

import com.seventhree.st.controller.UserController;
import com.seventhree.st.utils.MessageVO;
import com.seventhree.st.utils.ResultStatus;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @description: 在调用api的之前，作拦截处理，同时记录代码运行时间
 * @author: SY_zheng
 * @create: 2019-05-05
 */
@Aspect
@Component
@Slf4j
public class AroundControllerAspect {
    private static Logger log = LoggerFactory.getLogger(AroundControllerAspect.class);
    @Pointcut("execution(* com.seventhree.st.controller.*.*(..))")
    public void pointCut(){}

    /**
     * 参数验证，记录接口调用时间
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("pointCut()")
    public Object apiAround(ProceedingJoinPoint joinPoint) throws Throwable {

        // 计算接口时间
        Stopwatch startTime = Stopwatch.createStarted();
        // 获取request


        MessageVO messageVO = null;
        try {

            Object proceed = joinPoint.proceed(joinPoint.getArgs());

            JSONObject json = (JSONObject) JSON.toJSON(proceed);
            System.out.println(json);
            JSONObject body = json.getJSONObject("body");
            messageVO = MessageVO.builder()
                    .msgCodes(body)
                    .build();

            long endTime = startTime.stop().elapsed(TimeUnit.MILLISECONDS);
            log.info(" 方法名：{} 传参：{} 返回值: {} 调用时间：{}毫秒", joinPoint.getSignature().getName(),joinPoint.getArgs() ,json ,endTime);
        } catch (Exception e) {
            return handleException(joinPoint, e);
        }

        return messageVO;

    }

    /**
     * 捕获全局异常
     * @param e
     * @return
     */
    private MessageVO handleException(ProceedingJoinPoint joinPoint, Throwable e) {

        MessageVO messageVO = null;
        if (e instanceof Exception) {
            messageVO = MessageVO.builder().
                    msgCode(ResultStatus.API_ERROR)
                    .build();
        }
        log.error(" 方法名：{} 接口错误信息：{}", joinPoint.getSignature().getName(), e.getMessage());
        return messageVO;
    }
}