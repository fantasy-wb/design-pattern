package com.study.designpattern.interpreter;

/**
 * 减法表达式类
 */
public class Subtract extends AbstractExpression{

    // 左边
    private AbstractExpression left;
    // 右边
    private AbstractExpression right;

    public Subtract(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}
