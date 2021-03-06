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
// NOTE: This file was generated from: japidviews/templates/ImplicitObjects.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class ImplicitObjects extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/templates/ImplicitObjects.html";
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


	public ImplicitObjects() {
	super((StringBuilder)null);
	initHeaders();
	}
	public ImplicitObjects(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public ImplicitObjects(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.templates.ImplicitObjects.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	public cn.bran.japid.template.RenderResult render() {
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 0, japidviews/templates/ImplicitObjects.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply() {
		return new ImplicitObjects().render();
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
p("\n" + 
"\n" + 
"<p>request: ");// line 1, ImplicitObjects.html
		p(request);// line 3, ImplicitObjects.html
		p("</p>\n" + 
"<p>response: ");// line 3, ImplicitObjects.html
		p(response);// line 4, ImplicitObjects.html
		p("</p>\n" + 
"<p>flash: ");// line 4, ImplicitObjects.html
		p(flash);// line 5, ImplicitObjects.html
		p("</p>\n" + 
"<p>errors: ");// line 5, ImplicitObjects.html
		p(errors);// line 6, ImplicitObjects.html
		p("</p>\n" + 
"<p>session: ");// line 6, ImplicitObjects.html
		p(session);// line 7, ImplicitObjects.html
		p("</p>\n" + 
"<p>renderArgs: ");// line 7, ImplicitObjects.html
		p(renderArgs);// line 8, ImplicitObjects.html
		p("</p>\n" + 
"<p>params: ");// line 8, ImplicitObjects.html
		p(params);// line 9, ImplicitObjects.html
		p("</p>\n" + 
"<p>validation: ");// line 9, ImplicitObjects.html
		p(validation);// line 10, ImplicitObjects.html
		p("</p>\n" + 
"<p>play: ");// line 10, ImplicitObjects.html
		p(_play);// line 11, ImplicitObjects.html
		p("</p>");// line 11, ImplicitObjects.html
		
		endDoLayout(sourceTemplate);
	}

}