package fr.inria.diversify.statementProcessor;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import fr.inria.diversify.statement.Statement;

import spoon.reflect.code.CtAssert;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCase;
import spoon.reflect.code.CtDo;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtFor;
import spoon.reflect.code.CtForEach;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtNewArray;
import spoon.reflect.code.CtNewClass;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtSwitch;
import spoon.reflect.code.CtSynchronized;
import spoon.reflect.code.CtThrow;
import spoon.reflect.code.CtUnaryOperator;
import spoon.reflect.code.CtWhile;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.CtScanner;

public class ValidStatementVisitor extends CtScanner {
	protected boolean valid = true;
	protected CtElement root; 
	protected static Set<CtStatement> expresions  = new HashSet<CtStatement>();
	
	
	
	public boolean inExperession(CtElement elem) {
		if(expresions.contains(elem)) {
			expresions.remove(elem);
			return true;
		}
		return false;
	}
	
	public boolean isValid(){
		return valid;
	}
	
	public ValidStatementVisitor(CtElement e) {
		root = e;
	}
	
	protected Collection<CtStatement> getAllSubStatement(CtElement element) {
		SubStatementVisitor visitor = new SubStatementVisitor();
		element.accept(visitor);
		return visitor.getStatements();
	}
	
	protected void addAllSubStatement(CtElement element) {
		if(element != null)
			expresions.addAll(getAllSubStatement(element));
	}
	
	public <T> void visitCtClass(CtClass<T> ctClass) {
		valid = false;
	}
	
	public <R> void visitCtReturn(CtReturn<R> returnStatement) {
		valid = false;
	}
	
	public <T> void visitCtLiteral(CtLiteral<T> literal) {
		if(literal == root)
			valid = false;
	}
	
	public <R> void visitCtBlock(CtBlock<R> block) {
		if(block == root)
			valid = false;
		super.visitCtBlock(block);
	}
	
	public <T> void visitCtInvocation(CtInvocation<T> invocation) {
		for (CtExpression<?> i : invocation.getArguments()) 
			addAllSubStatement(i);
		super.visitCtInvocation(invocation);
	}
	
	public void visitCtFor(CtFor forLoop) {
		for (CtStatement i : forLoop.getForInit())
			addAllSubStatement(i);
		
		addAllSubStatement(forLoop.getExpression());
		for (CtStatement i : forLoop.getForUpdate()) 
			addAllSubStatement(i);
		super.visitCtFor(forLoop);
	}

	public void visitCtForEach(CtForEach foreach) {
		addAllSubStatement(foreach.getVariable());
		addAllSubStatement(foreach.getExpression());
		super.visitCtForEach(foreach);
	}


	public void visitCtIf(CtIf ifElement) {
		addAllSubStatement(ifElement.getCondition());
		super.visitCtIf(ifElement);
	}
	

	
	public <T> void visitCtNewArray(CtNewArray<T> newArray) {
		for (CtExpression<?> i : newArray.getDimensionExpressions()) 
			addAllSubStatement(i);
		super.visitCtNewArray(newArray);
	}

	public <T> void visitCtNewClass(CtNewClass<T> newClass) {
		for (CtExpression<?> i : newClass.getArguments()) 
			addAllSubStatement(i);
		super.visitCtNewClass(newClass);
	}
	
	public <T, A extends T> void visitCtAssignment(
			CtAssignment<T, A> assignement) {
		addAllSubStatement(assignement.getAssignment());
		super.visitCtAssignment(assignement);
	}

	public <T> void visitCtBinaryOperator(CtBinaryOperator<T> operator) {
		addAllSubStatement(operator.getLeftHandOperand());
		addAllSubStatement(operator.getRightHandOperand());
		super.visitCtBinaryOperator(operator);
	}
	
	public void visitCtWhile(CtWhile whileLoop) {
		addAllSubStatement(whileLoop.getLoopingExpression());
		super.visitCtWhile(whileLoop);
	}
	
	public <T> void visitCtLocalVariable(CtLocalVariable<T> localVariable) {
		addAllSubStatement(localVariable.getDefaultExpression());
		super.visitCtLocalVariable(localVariable);
	}
	
	public void visitCtThrow(CtThrow throwStatement) {
		addAllSubStatement(throwStatement.getThrownExpression());
		super.visitCtThrow(throwStatement);
	}
	
	public <S> void visitCtSwitch(CtSwitch<S> switchStatement) {
		addAllSubStatement(switchStatement.getSelector());
		super.visitCtSwitch(switchStatement);
	}

	public void visitCtSynchronized(CtSynchronized synchro) {
		addAllSubStatement(synchro.getExpression());
		super.visitCtSynchronized(synchro);
	}
	
	public <T> void visitCtUnaryOperator(CtUnaryOperator<T> operator) {
		addAllSubStatement(operator.getOperand());
		super.visitCtUnaryOperator(operator);
	}
	
	public <S> void visitCtCase(CtCase<S> caseStatement) {
		addAllSubStatement(caseStatement.getCaseExpression());
		super.visitCtCase(caseStatement);
	}
	
	public <T> void visitCtAssert(CtAssert<T> asserted) {
		addAllSubStatement(asserted.getAssertExpression());
		addAllSubStatement(asserted.getExpression());
		super.visitCtAssert(asserted);
	}
	public void visitCtDo(CtDo doLoop) {
		addAllSubStatement(doLoop.getLoopingExpression());
		super.visitCtDo(doLoop);
	}

}
