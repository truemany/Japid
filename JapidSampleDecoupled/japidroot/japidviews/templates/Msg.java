//version: 0.9.36.x
package japidviews.templates;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/templates/Msg.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Msg extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/templates/Msg.html";
	 private void initHeaders() {
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}
	{
	}

// - add implicit fields with Play

	final play.mvc.Http.Request request = play.mvc.Http.Request.current(); 
	final play.mvc.Http.Response response = play.mvc.Http.Response.current(); 
	final play.mvc.Scope.Session session = play.mvc.Scope.Session.current();
	final play.mvc.Scope.RenderArgs renderArgs = play.mvc.Scope.RenderArgs.current();
	final play.mvc.Scope.Params params = play.mvc.Scope.Params.current();
	final play.data.validation.Validation validation = play.data.validation.Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public Msg() {
	super((StringBuilder)null);
	initHeaders();
	}
	public Msg(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public Msg(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.templates.Msg.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	public cn.bran.japid.template.RenderResult render() {
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 0, japidviews/templates/Msg.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new Msg().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
p("login: ");// line 1, Msg.html
		;p(getMessage("login.name"));// line 1, Msg.html
		p(", ");// line 1, Msg.html
		;p(getMessage("login.name"));// line 1, Msg.html
		p("  or ");// line 1, Msg.html
		p(i18n("login.name"));// line 1, Msg.html
		p("\n" + 
"<p/>\n" + 
"\n");// line 1, Msg.html
		 String sub = "bran";// line 4, Msg.html
		p("customer name: ");// line 4, Msg.html
		;p(getMessage("cus.name", sub));// line 5, Msg.html
		p(", ");// line 5, Msg.html
		;p(getMessage("cus.name", "冉兵冉兵"));// line 5, Msg.html
		p("  or ");// line 5, Msg.html
		p(i18n("cus.name", "Bing Ran"));// line 5, Msg.html
		p("\n" + 
"\n" + 
"<p/>\n" + 
"\n" + 
"And the full name is ");// line 5, Msg.html
		;p(getMessage("fullname", "Bing", "冉"));// line 9, Msg.html
		;// line 9, Msg.html
		
		endDoLayout(sourceTemplate);
	}

}