package com.design.visitorPattern;

public class HtmlElementVisitor implements HtmlParentVisitor {

	@Override
	public void visit(HtmlTag htmlVisitor) {
		// TODO Auto-generated method stub
//		do nothing

	}

	@Override
	public void visit(HtmlElement htmlElement) {
		System.out.println("Html Element Visiting inside");
	}

}
