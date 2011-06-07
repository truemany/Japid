package japidviews.templates;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import static  japidviews._javatags.JapidWebUtil.*;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import controllers.*;
import play.mvc.Http.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/templates/aTag.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class aTag extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/templates/aTag.html";
{
	headers.put("Content-Type", "text/html; charset=utf-8");
}

// - add implicit fields with Play

	final Request request = Request.current(); 
	final Response response = Response.current(); 
	final Session session = Session.current();
	final RenderArgs renderArgs = RenderArgs.current();
	final Params params = Params.current();
	final Validation validation = Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public aTag() {
		super(null);
	}
	public aTag(StringBuilder out) {
		super(out);
	}
	private List<String> strings;
	public cn.bran.japid.template.RenderResult render(List<String> strings) {
		this.strings = strings;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
;// line 1
p("\n" + 
"<p>hi: ");// line 1
p("hi:" + join(strings, "|"));// line 3
p("</p>\n" + 
"\n" + 
"<p>hi2: ");// line 3
p("hi:" + join(strings, "|"));// line 5
p("</p>\n" + 
"\n" + 
"<p>hi3: ");// line 5
p("hi:" + join(strings, "|"));// line 7
p("</p>\n" + 
"\n" + 
"\n" + 
"Note: the join() is defined in the JavaExtensions class in the Play! framework, which is automatically imported. ");// line 7

	}

}