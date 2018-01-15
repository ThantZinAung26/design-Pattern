package com.design.visitorPattern;

public class HtmlVisitor implements HtmlParentVisitor {

	@Override
	public void visit(HtmlTag htmlVisitor) {
		System.out.println("Visiting html Tag inside");
		
	}
	
	@Override
	public void visit(HtmlElement htmlElement) {
		// TODO Auto-generated method stub
//		do nothing
		
	}

}
