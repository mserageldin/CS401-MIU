package prob1.rulesets;

import java.awt.Component;

import prob1.gui.CDWindow;


/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	
	private CDWindow cdWin;
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		cdWin=new CDWindow();
		nonemptyRule();
		 isFloatRule();
	}
	private void nonemptyRule() throws RuleException {
		if(cdWin.getArtistValue().trim().isEmpty() ||
				cdWin.getTitleValue().trim().isEmpty() ||
				cdWin.getPriceValue().trim().isEmpty() 
				) {
			throw new RuleException("All fields must be non-empty!");
		}
	}
	private void isFloatRule() throws RuleException {
		String val = cdWin.getPriceValue().trim();
		try {
		   Float.parseFloat(val);
			//val is numeric
		} catch(NumberFormatException e) {
			throw new RuleException("Price must be float");
		}		
		String[] splitter = val.split("\\.");
		if(splitter[1].length()!=2)
		{
			
			throw new RuleException("Price decimal point must be 2");
		}
		if(Float.parseFloat(cdWin.getPriceValue())<0.49)
		{
			
			throw new RuleException("Price  must be greater than 0.49 ");
		}
	}
	
}
