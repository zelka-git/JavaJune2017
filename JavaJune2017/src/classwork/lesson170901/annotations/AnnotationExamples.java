package classwork.lesson170901.annotations;

import java.lang.annotation.Annotation;

@MyAnno
public class AnnotationExamples {

	public static void main(String[] args) {
		
		Class<AnnotationExamples> clazz = AnnotationExamples.class;
		Annotation[] annotations = clazz.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
	}
	
}
