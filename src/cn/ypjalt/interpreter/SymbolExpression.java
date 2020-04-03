package cn.ypjalt.interpreter;

import java.util.HashMap;


/**
 * 抽象运算符号解析器,每个运算符号,都只和自己左右两个数字有关系
 * 但左右两个数字有可能也是一个解析结果,=
 */

public class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	// 让其子类实现
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}
}
