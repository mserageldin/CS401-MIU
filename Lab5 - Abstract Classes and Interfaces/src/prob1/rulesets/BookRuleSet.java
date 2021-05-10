package prob1.rulesets;

import java.awt.Component;

import prob1.gui.BookWindow;



/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	private BookWindow bookWin;
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		bookWin = (BookWindow) ob;
		nonemptyRule();
		isNumericRule();
		isFloatRule() ;
		
	}
	private void nonemptyRule() throws RuleException {
		if(bookWin.getIsbnValue().trim().isEmpty() ||
				bookWin.getTitleValue().trim().isEmpty() ||
				bookWin.getPriceValue().trim().isEmpty() )
			throw new RuleException("All fields must be non-empty!");
		}
	private void isFloatRule() throws RuleException {
		String val = bookWin.getPriceValue().trim();
		try {
		   Float.parseFloat(val);
			//val is numeric
		} catch(NumberFormatException e) {
			throw new RuleException("Price must be float");
		}		
	}
private void isNumericRule() throws RuleException {
	String val = bookWin.getIsbnValue().trim();
	try {
		Integer.parseInt(val);
		//val is numeric
	} catch(NumberFormatException e) {
		throw new RuleException("ISBN must be numeric");
	}	
	
		if(val.length()<10||val.length()>13)
		{
			
			throw new RuleException("ISBN must be 10 or 13 character");
		}
		char[] isbn=val.toCharArray();
		if(val.length()==10&&isbn[0]!='0')
		{
			throw new RuleException("ISBN must of 10 characters must start by Zero");
		}
		if(val.length()==13&&val.substring(3).equals("978")||val.substring(3).equals("979"))
		{
			throw new RuleException("ISBN must of 13 characters must start by 978 or 979");
		}
}
}

