package com.design.visitorPattern;

public interface HtmlParentVisitor {
	public void visit(HtmlTag htmlVisitor);
	void visit(HtmlElement htmlElement);
}
