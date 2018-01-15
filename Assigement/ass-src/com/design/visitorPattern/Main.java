package com.design.visitorPattern;

public class Main {

	public static void main(String[] args) {
		HtmlTag parent = new HtmlParentElement("<html>");
		parent.setStartTag("<html>");
		parent.setEndTag("</html>");

		HtmlTag p1 = new HtmlParentElement("<body>");
		p1.setStartTag("<body>");
		p1.setEndTag("</body>");

		parent.addChildTag(p1);

		HtmlTag child = new HtmlElement("<p>");
		child.setStartTag("<p>");
		child.setTagBody("Paragraph 2 is the Let go");
		child.setEndTag("</p>");

		p1.addChildTag(child);

		child = new HtmlElement("<p>");
		child.setStartTag("<p>");
		child.setTagBody("Paragraph 1 is the next one");
		child.setEndTag("</p>");

		p1.addChildTag(child);

		parent.generateHtml();

		System.out.println();
		parent.visit(new HtmlVisitor());
		System.out.println();
		child.visit(new HtmlElementVisitor());

	}

}
