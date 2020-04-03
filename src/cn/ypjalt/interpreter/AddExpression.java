package cn.ypjalt.interpreter;

import java.util.HashMap;

/**
 * 加法解释器
 */
public class AddExpression extends SymbolExpression  {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	// 处理相加
	// var 仍然是{a=10, b=20}
	public int interpreter(HashMap<String, Integer> var) {
		// super.left.interpreter(var) 返回left 表达式对应的值a=10
		return super.left.interpreter(var) + super.right.interpreter(var);
	}
}
