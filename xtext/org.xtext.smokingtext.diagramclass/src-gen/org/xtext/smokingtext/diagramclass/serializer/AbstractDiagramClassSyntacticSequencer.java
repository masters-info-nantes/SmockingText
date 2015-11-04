package org.xtext.smokingtext.diagramclass.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.smokingtext.diagramclass.services.DiagramClassGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractDiagramClassSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DiagramClassGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Abstract_ColonKeyword_3_q;
	protected AbstractElementAlias match_Attribute___LeftSquareBracketKeyword_5_0_NumberTerminalRuleCall_5_1_q_RightSquareBracketKeyword_5_2__q;
	protected AbstractElementAlias match_Attribute___LessThanSignExclamationMarkGreaterThanSignKeyword_1_1_or_LessThanSignGreaterThanSignKeyword_1_0__q;
	protected AbstractElementAlias match_Class_ColonKeyword_2_q;
	protected AbstractElementAlias match_Enumeration_____IDTerminalRuleCall_4_0_p_or___IDTerminalRuleCall_4_0_p_CommaKeyword_4_1_____or_____IDTerminalRuleCall_4_0_p_CommaKeyword_4_1__p___IDTerminalRuleCall_4_0_p_or___IDTerminalRuleCall_4_0_p_CommaKeyword_4_1________q;
	protected AbstractElementAlias match_Package___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a;
	protected AbstractElementAlias match_paramIn_CommaKeyword_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DiagramClassGrammarAccess) access;
		match_Abstract_ColonKeyword_3_q = new TokenAlias(true, false, grammarAccess.getAbstractAccess().getColonKeyword_3());
		match_Attribute___LeftSquareBracketKeyword_5_0_NumberTerminalRuleCall_5_1_q_RightSquareBracketKeyword_5_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0()), new TokenAlias(true, false, grammarAccess.getAttributeAccess().getNumberTerminalRuleCall_5_1()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5_2()));
		match_Attribute___LessThanSignExclamationMarkGreaterThanSignKeyword_1_1_or_LessThanSignGreaterThanSignKeyword_1_0__q = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getLessThanSignExclamationMarkGreaterThanSignKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getLessThanSignGreaterThanSignKeyword_1_0()));
		match_Class_ColonKeyword_2_q = new TokenAlias(true, false, grammarAccess.getClassAccess().getColonKeyword_2());
		match_Enumeration_____IDTerminalRuleCall_4_0_p_or___IDTerminalRuleCall_4_0_p_CommaKeyword_4_1_____or_____IDTerminalRuleCall_4_0_p_CommaKeyword_4_1__p___IDTerminalRuleCall_4_0_p_or___IDTerminalRuleCall_4_0_p_CommaKeyword_4_1________q = new AlternativeAlias(true, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getEnumerationAccess().getIDTerminalRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getEnumerationAccess().getCommaKeyword_4_1())), new TokenAlias(false, true, grammarAccess.getEnumerationAccess().getIDTerminalRuleCall_4_0())), new GroupAlias(false, false, new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getEnumerationAccess().getIDTerminalRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getEnumerationAccess().getCommaKeyword_4_1())), new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getEnumerationAccess().getIDTerminalRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getEnumerationAccess().getCommaKeyword_4_1())), new TokenAlias(false, true, grammarAccess.getEnumerationAccess().getIDTerminalRuleCall_4_0()))));
		match_Package___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPackageAccess().getFullStopKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getPackageAccess().getIDTerminalRuleCall_1_1()));
		match_paramIn_CommaKeyword_3_q = new TokenAlias(true, false, grammarAccess.getParamInAccess().getCommaKeyword_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBodyVisibilityRule())
			return getBodyVisibilityToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getClassVisibilityRule())
			return getClassVisibilityToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNumberRule())
			return getnumberToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getBodyVisibilityToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	protected String getClassVisibilityToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	protected String getnumberToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Abstract_ColonKeyword_3_q.equals(syntax))
				emit_Abstract_ColonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Attribute___LeftSquareBracketKeyword_5_0_NumberTerminalRuleCall_5_1_q_RightSquareBracketKeyword_5_2__q.equals(syntax))
				emit_Attribute___LeftSquareBracketKeyword_5_0_NumberTerminalRuleCall_5_1_q_RightSquareBracketKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Attribute___LessThanSignExclamationMarkGreaterThanSignKeyword_1_1_or_LessThanSignGreaterThanSignKeyword_1_0__q.equals(syntax))
				emit_Attribute___LessThanSignExclamationMarkGreaterThanSignKeyword_1_1_or_LessThanSignGreaterThanSignKeyword_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Class_ColonKeyword_2_q.equals(syntax))
				emit_Class_ColonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Enumeration_____IDTerminalRuleCall_4_0_p_or___IDTerminalRuleCall_4_0_p_CommaKeyword_4_1_____or_____IDTerminalRuleCall_4_0_p_CommaKeyword_4_1__p___IDTerminalRuleCall_4_0_p_or___IDTerminalRuleCall_4_0_p_CommaKeyword_4_1________q.equals(syntax))
				emit_Enumeration_____IDTerminalRuleCall_4_0_p_or___IDTerminalRuleCall_4_0_p_CommaKeyword_4_1_____or_____IDTerminalRuleCall_4_0_p_CommaKeyword_4_1__p___IDTerminalRuleCall_4_0_p_or___IDTerminalRuleCall_4_0_p_CommaKeyword_4_1________q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Package___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a.equals(syntax))
				emit_Package___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_paramIn_CommaKeyword_3_q.equals(syntax))
				emit_paramIn_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ':'?
	 */
	protected void emit_Abstract_ColonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' number? ']')?
	 */
	protected void emit_Attribute___LeftSquareBracketKeyword_5_0_NumberTerminalRuleCall_5_1_q_RightSquareBracketKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('<>' | '<!>')?
	 */
	protected void emit_Attribute___LessThanSignExclamationMarkGreaterThanSignKeyword_1_1_or_LessThanSignGreaterThanSignKeyword_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ':'?
	 */
	protected void emit_Class_ColonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (((ID+ ',')+ (ID+ | (ID+ ','))) | (ID+ | (ID+ ',')))?
	 */
	protected void emit_Enumeration_____IDTerminalRuleCall_4_0_p_or___IDTerminalRuleCall_4_0_p_CommaKeyword_4_1_____or_____IDTerminalRuleCall_4_0_p_CommaKeyword_4_1__p___IDTerminalRuleCall_4_0_p_or___IDTerminalRuleCall_4_0_p_CommaKeyword_4_1________q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('.' ID)*
	 */
	protected void emit_Package___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_paramIn_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
