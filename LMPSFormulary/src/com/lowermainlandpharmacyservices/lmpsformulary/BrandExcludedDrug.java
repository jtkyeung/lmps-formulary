package com.lowermainlandpharmacyservices.lmpsformulary;

public class BrandExcludedDrug extends BrandDrug {
	public StringBuilder criteria;
	
	public BrandExcludedDrug(String genericName, String brandName, String criteria){
		super(genericName, brandName, "Excluded");
		this.criteria = new StringBuilder(criteria);
	}
	
	public String getCriteria(){
		return criteria.toString();
	}
	
	 public void additionalCriteria(String extraCriteria){
//	    	System.out.println(genericName+ " "+criteria +" "+ extraCriteria);
	    	char character;
	    	StringBuilder extraAddition = new StringBuilder();
	    	for (int i = 0; i < extraCriteria.length();i++){
	    		character = extraCriteria.charAt(i);
//	    		if(!(Character.isAlphabetic(character) || (Character.isDigit(character))))
	    		if(!(Character.isDefined(character) || Character.isIdentifierIgnorable(character)))
	    			extraAddition.append(' ');
	    		else{
	    			extraAddition.append(extraCriteria.charAt(i));
	    		}
	    	}
	    	this.criteria.insert(criteria.length(), ("\n "+extraAddition.toString()));	
	    }

}
