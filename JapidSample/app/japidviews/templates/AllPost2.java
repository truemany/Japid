//version: 0.9.36.x
package japidviews.templates;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import	 	models.japidsample.Post;
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
// NOTE: This file was generated from: japidviews/templates/AllPost2.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class AllPost2 extends Layout
{
	public static final String sourceTemplate = "japidviews/templates/AllPost2.html";
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


	public AllPost2() {
	super((StringBuilder)null);
	initHeaders();
	}
	public AllPost2(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public AllPost2(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"blogTitle", "allPost",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "List<Post>",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.templates.AllPost2.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String blogTitle; // line 3, japidviews/templates/AllPost2.html
	private List<Post> allPost; // line 3, japidviews/templates/AllPost2.html
	public cn.bran.japid.template.RenderResult render(String blogTitle,List<Post> allPost) {
		this.blogTitle = blogTitle;
		this.allPost = allPost;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 3, japidviews/templates/AllPost2.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(String blogTitle,List<Post> allPost) {
		return new AllPost2().render(blogTitle, allPost);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
;// line 1, AllPost2.html

p("\n" + 
"\n");// line 5, AllPost2.html
		if (allPost.size() > 0 ) {// line 8, AllPost2.html
		p("	<p></p>\n" + 
"	");// line 8, AllPost2.html
		for (Post p: allPost) {// line 10, AllPost2.html
	    new Display(AllPost2.this).render( // line 11, AllPost2.html
new Display.DoBody<String>(){ // line 11, AllPost2.html
public void render(final String title) { // line 11, AllPost2.html
// line 11, AllPost2.html
		p("			<p>The real title is: ");// line 11, AllPost2.html
		p(title);// line 12, AllPost2.html
		p(";</p>\n" + 
"	    ");// line 12, AllPost2.html
		
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
, named("post", p), named("as", "home"));// line 11, AllPost2.html
	}// line 14, AllPost2.html
} else {// line 15, AllPost2.html
		p("	<p>There is no post at this moment</p>\n");// line 15, AllPost2.html
		}// line 17, AllPost2.html

new Tag2(AllPost2.this).render(named("msg", blogTitle), named("age", 1000)); // line 19, AllPost2.html// line 19, AllPost2.html
		p("\n" + 
"<p>end of it</p>");// line 19, AllPost2.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("Home");;
	}
}