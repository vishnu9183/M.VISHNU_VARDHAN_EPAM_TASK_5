package com.code.Loggingtask5;

import java.util.logging.Logger;
import java.util.logging.*; 
public class SimpleandCompound {
	// Simple Interest
	final static Logger logger = Logger.getLogger("SimpleandCompound.java");
			public double simpleInterest(double principal,double rate,double time) {
				logger.info("Principal,rate,and time of Interest should be greater than zero");
				if(principal<0||rate<0||time<0)
				{
					logger.warning("Principal,rate and Time can't be less than Zero");
				}

				double simpleInterest=(principal*rate*time)/100;
				if(simpleInterest<0)
				{
					logger.warning("SimpleInterest can't be zero");
				}
				return simpleInterest;

			}

			

			// Compound Interest

			public double compoundInterest(double principal,double rate,double time) {
				logger.info("Principal,rate,and time of Interest should be greater than zero");
				if(principal<0||rate<0||time<0)
				{
					logger.warning("Principal,rate and Time can't be less than Zero");
				}
				double CompoundInterest=principal*(Math.pow(1+rate/100, time)-1);
				if(CompoundInterest<0)
				{
					logger.warning("SimpleInterest can't be zero");
				}
				return CompoundInterest;

			}
}
