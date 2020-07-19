package com.code.Loggingtask5;
import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.*;
import static org.junit.Assert.*;
	public class ConstructionCostTest {
    final static Logger logger = Logger.getLogger("ConstructionCosTest.java");
		public void test() {
    	logger.info("material,area and automation should not be zero or null");
			ConstructionCost cc = new ConstructionCost();

			double answer = cc.costForConstructionMaterial("Standard", 500, false);

			assertEquals(600000,answer,0.001);

		}
	}

