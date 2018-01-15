package com.design.visitorPattern;

import java.util.List;

public abstract class HtmlTag {
	
	public abstract void visit(HtmlParentVisitor htmlParentVisitor);
	
	public abstract String getTagName();

	public abstract void setStartTag(String tag);

	public abstract void setEndTag(String tag);

	public void setTagBody(String tagBody) {
		throw new UnsupportedOperationException("Current Operation is not support for this Object");
	}

	public void addChildTag(HtmlTag htmlTag) {
		throw new UnsupportedOperationException("Current Operation is not support for this Object");
	}
	
	public void removeChirdTag(HtmlTag htmlTag) {
		throw new UnsupportedOperationException("Current Operation is not support for this Object");

	}
	
	public List<HtmlTag> getChildren(){
		throw new UnsupportedOperationException("Current Operation is not support for this Object");

	}
	
	public abstract void generateHtml();
}
