package com.spring.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.Expression;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/spel/spelConfig.xml");
		Demo d=context.getBean("demo",Demo.class);
		System.out.println(d);
		SpelExpressionParser expressionParser=new SpelExpressionParser();
		Expression expression=expressionParser.parseExpression("22+2");
		System.out.println(expression.getValue());

	}

}
