package com.psl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	
	@Pointcut(value="execution(* com.psl.Performer.perform(..))")
	public void pc1(){
		
	}

	@Before(value = "pc1()")
	public void audienceTakeSeats(){
		System.out.println("Audience take seats!!!1");
	}
	@Before(value="pc1()")
	public void audienceSwitchOffPhones(){
		System.out.println("Audience switch off phone");
	}
	
	@AfterReturning(value="pc1()")
	public void audienceApplaud(){
		System.out.println("Audience Applaud.....ye....ye...clap....clap...haooo.haoooo");
	}
	

	@AfterThrowing(value="pc1()")
	public void audienceDemandRefund(){
		System.out.println("Rokdaa nikaaal wapas");
	}
	
	@After(value="pc1()")
	public void audienceGoesHome(){
		System.out.println("Ghar Chale Hum!!!!!!!!!!!");
	}
	
	
//	public void audienceEatingPopcorn(ProceedingJoinPoint pj){
//		System.out.println("khaaana yummmmmm!!!!!!!!!!!!!!!!!!1");
//		
//		audienceTakeSeats();
//		audienceSwitchOffPhones();
//		try {
//			pj.proceed();
//			audienceApplaud();
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			audienceDemandRefund();
//		
//		}
//		
//		audienceGoesHome();
//	}
}
