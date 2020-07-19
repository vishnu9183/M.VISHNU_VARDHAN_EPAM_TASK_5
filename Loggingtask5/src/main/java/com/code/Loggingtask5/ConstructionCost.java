package com.code.Loggingtask5;

import java.util.logging.Logger;

public class ConstructionCost {
	// Finding the cost of construction of a house 
	final static Logger logger = Logger.getLogger("ConstructionCost.java");
		public double costForConstructionMaterial(String material,double area,boolean automation) {
			if(material==null||area<=0||automation!=(true&&false))
					{
				logger.warning("material,area and automation can't be Null");
					}

			if(material.equals("Standard") && automation==false) {

				return 1200*area;

			}

			else if(material.equals("AboveStandard") && automation==false) {

				return 1500*area;

			}

			else if(material.equals("HighStandard") && automation==false) {

				return 1800*area;

			}

			else {

				return 2500*area;

			}

		}
}
