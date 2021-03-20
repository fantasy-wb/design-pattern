package com.study.designpattern.interpreter;

/**
 * 抽象表达式类
 */
public abstract class AbstractExpression {

    abstract int interpret(Context context);
}
