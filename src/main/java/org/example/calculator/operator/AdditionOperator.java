package org.example.calculator.operator;

import org.example.calculator.operator.vo.PositiveNumber;

public class AdditionOperator implements NewArithmeticOperator {

    @Override
    public boolean supports(String operator) {
        return "+".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
        return operand1.toInt() + operand2.toInt();
    }
}
