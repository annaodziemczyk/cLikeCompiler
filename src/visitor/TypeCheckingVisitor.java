package visitor;

import ast.Arithmetic;
import ast.Assignment;
import ast.Cast;
import ast.CharLiteral;
import ast.Comparision;
import ast.FunctionCall;
import ast.FunctionDefinition;
import ast.IfElseStatement;
import ast.IntLiteral;
import ast.Logical;
import ast.Negation;
import ast.Program;
import ast.Read;
import ast.RealLiteral;
import ast.Record;
import ast.ReturnStatement;
import ast.TypeDefinition;
import ast.VarDefinition;
import ast.Variable;
import ast.WhileStatement;
import ast.Write;

public interface TypeCheckingVisitor extends Visitor{
	
	Void visit(Arithmetic e, Void param);
	
	Void visit(Variable e, Void param);
	
	Void visit(Assignment e, Void param);
	
	Void visit(Cast e, Void param);
	
	Void visit(CharLiteral e, Void param);
	
	Void visit(Comparision e, Void param);
	
	Void visit(FunctionCall e, Void param);
	
	Void visit(FunctionDefinition e, Void param);
	
	Void visit(IfElseStatement e, Void param);
	
	Void visit(IntLiteral e, Void param);
	
	Void visit(Logical e, Void param);
	
	Void visit(Negation e, Void param);
	
	Void visit(Read e, Void param);
	
	Void visit(RealLiteral e, Void param);
	
	Void visit(Program e, Void param);
	
	Void visit(Record e, Void param);
	
	Void visit(ReturnStatement e, Void param);
	
	Void visit(TypeDefinition e, Void param);
	
	Void visit(VarDefinition e, Void param);
	
	Void visit(WhileStatement e, Void param);
	
	Void visit(Write e, Void param);

}
