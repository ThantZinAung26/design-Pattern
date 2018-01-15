package com.design.visitorPattern;

public class HtmlElement extends HtmlTag {

	private String tagName;
	private String startTag;
	private String endTag;
	private String tagBody;

	public HtmlElement(String tagName) {
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.tagBody = "";
	}

	@Override
	public String getTagName() {
		// TODO Auto-generated method stub
		return tagName;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
	}

	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}

	@Override
	public void setTagBody(String tagBody) {
		this.tagBody = tagBody;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag + " " + tagBody + " " + endTag);
	}
	
	@Override
	public void visit(HtmlParentVisitor htmlParentVisitor) {
		// TODO Auto-generated method stub
		htmlParentVisitor.visit(this);
	}

}
