package japidviews._tags;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import japidviews._layouts.*;
import japidviews._tags.*;
//
// NOTE: This file was generated from: japidviews/_tags/taggy.html
// Change to this file will be lost next time the template file is compiled.
//
public class taggy extends cn.bran.japid.template.JapidTemplateBaseWithoutPlay
{
	public static final String sourceTemplate = "japidviews/_tags/taggy.html";
	public taggy() {
		super(null);
	}
	public taggy(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"a",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.taggy.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String a; // line 1, japidviews/_tags/taggy.html
	public String render(String a) {
		this.a = a;
		long __t = -1;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 1, japidviews/_tags/taggy.html
		 if (__t != -1) System.out.println("[taggy] rendering time: " + __t);
		return getOut().toString();
	}

	public static String apply(String a) {
		return new taggy().render(a);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, taggy.html
		p("[");// line 1, taggy.html
		p(a);// line 2, taggy.html
		p("]-->\n");// line 2, taggy.html
		final taddy _taddy0 = new taddy(getOut()); _taddy0.setOut(getOut()); _taddy0.render(// line 3, taggy.html
new taddy.DoBody<String[]>(){ // line 3, taggy.html
public void render(final String[] ss) { // line 3, taggy.html
// line 3, taggy.html
    final Each _Each1 = new Each(getOut()); _Each1.setOut(getOut()); _Each1.render(// line 4, taggy.html
ss, new Each.DoBody<String>(){ // line 4, taggy.html
public void render(final String s, final int _size, final int _index, final boolean _isOdd, final String _parity, final boolean _isFirst, final boolean _isLast) { // line 4, taggy.html
// line 4, taggy.html
		p("    -> ");// line 4, taggy.html
		p(s);// line 5, taggy.html
		p("\n" + 
"    ");// line 5, taggy.html
		
}

StringBuilder oriBuffer;
@Override
public void setBuffer(StringBuilder sb) {
	oriBuffer = getOut();
	setOut(sb);
}

@Override
public void resetBuffer() {
	setOut(oriBuffer);
}

}
);// line 4, taggy.html

}

StringBuilder oriBuffer;
@Override
public void setBuffer(StringBuilder sb) {
	oriBuffer = getOut();
	setOut(sb);
}

@Override
public void resetBuffer() {
	setOut(oriBuffer);
}

}
);// line 3, taggy.html
		
		endDoLayout(sourceTemplate);
	}

}