package cn.ypjalt.interpreter;

import java.util.HashMap;

/**
 * 抽象类表达式,通过hashmap键值对,可以获取到变量的值
 */
public abstract class Expression {
	// 解释公式和数值
	public abstract int interpreter(HashMap<String, Integer> var);
}
