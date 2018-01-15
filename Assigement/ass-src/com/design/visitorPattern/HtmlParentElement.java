package com.design.visitorPattern;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {
	
	private String tagName;
	private String startTag;
	private String endTag;
	private List<HtmlTag> childrenTag;
	
	
	
	public HtmlParentElement(String tagName) {
		super();
		
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.childrenTag = new ArrayList<>();
	}
	
	@Override
	public String getTagName() {
		// TODO Auto-generated method stub
		return tagName;
	}
	
	@Override
	public void setStartTag(String startTag) {
		this.startTag = startTag;
	}
	@Override
	public void setEndTag(String endTag) {
		this.endTag = endTag;
	}
	
	@Override
	public void addChildTag(HtmlTag htmlTag) {
		// TODO Auto-generated method stub
		childrenTag.add(htmlTag);
	}
	
	@Override
	public void removeChirdTag(HtmlTag htmlTag) {
		// TODO Auto-generated method stub
		childrenTag.remove(htmlTag);
	}
	
	@Override
	public List<HtmlTag> getChildren() {
		// TODO Auto-generated method stub
		return childrenTag;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for (HtmlTag htmlTag : childrenTag) {
			htmlTag.generateHtml();
		}
		System.out.println(endTag);
	}
	
	@Override
	public void visit(HtmlParentVisitor htmlParentVisitor) {
		htmlParentVisitor.visit(this);
	}

}
