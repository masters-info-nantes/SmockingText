package org.xtext.smokingtext.diagramclass.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.smokingtext.diagramclass.diagramClass.Abstract;
import org.xtext.smokingtext.diagramclass.diagramClass.Attribute;
import org.xtext.smokingtext.diagramclass.diagramClass.Dependancy;
import org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage;
import org.xtext.smokingtext.diagramclass.diagramClass.Enumeration;
import org.xtext.smokingtext.diagramclass.diagramClass.Interface;
import org.xtext.smokingtext.diagramclass.diagramClass.Method;
import org.xtext.smokingtext.diagramclass.diagramClass.Model;
import org.xtext.smokingtext.diagramclass.diagramClass.paramIn;
import org.xtext.smokingtext.diagramclass.services.DiagramClassGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractDiagramClassSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected DiagramClassGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DiagramClassPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DiagramClassPackage.ABSTRACT:
				if(context == grammarAccess.getAbstractRule() ||
				   context == grammarAccess.getElementsRule()) {
					sequence_Abstract(context, (Abstract) semanticObject); 
					return; 
				}
				else break;
			case DiagramClassPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case DiagramClassPackage.CLASS:
				if(context == grammarAccess.getClassRule() ||
				   context == grammarAccess.getElementsRule()) {
					sequence_Class(context, (org.xtext.smokingtext.diagramclass.diagramClass.Class) semanticObject); 
					return; 
				}
				else break;
			case DiagramClassPackage.DEPENDANCY:
				if(context == grammarAccess.getDependancyRule()) {
					sequence_Dependancy(context, (Dependancy) semanticObject); 
					return; 
				}
				else break;
			case DiagramClassPackage.ENUMERATION:
				if(context == grammarAccess.getElementsRule() ||
				   context == grammarAccess.getEnumerationRule()) {
					sequence_Enumeration(context, (Enumeration) semanticObject); 
					return; 
				}
				else break;
			case DiagramClassPackage.INTERFACE:
				if(context == grammarAccess.getElementsRule() ||
				   context == grammarAccess.getInterfaceRule()) {
					sequence_Interface(context, (Interface) semanticObject); 
					return; 
				}
				else break;
			case DiagramClassPackage.METHOD:
				if(context == grammarAccess.getMethodRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case DiagramClassPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case DiagramClassPackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (org.xtext.smokingtext.diagramclass.diagramClass.Package) semanticObject); 
					return; 
				}
				else break;
			case DiagramClassPackage.PARAM_IN:
				if(context == grammarAccess.getParamInRule()) {
					sequence_paramIn(context, (paramIn) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (classname=ID extension=ID? implements=Implements* (body+=Attribute | body+=Method)*)
	 *
	 * Features:
	 *    classname[1, 1]
	 *    extension[0, 1]
	 *    implements[0, *]
	 *    body[0, *]
	 */
	protected void sequence_Abstract(EObject context, Abstract semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attributename=ID type=ID)
	 *
	 * Features:
	 *    attributename[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramClassPackage.Literals.ATTRIBUTE__ATTRIBUTENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramClassPackage.Literals.ATTRIBUTE__ATTRIBUTENAME));
			if(transientValues.isValueTransient(semanticObject, DiagramClassPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramClassPackage.Literals.ATTRIBUTE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getAttributenameIDTerminalRuleCall_2_0(), semanticObject.getAttributename());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (classname=ID extension=ID? implements=Implements* (body+=Attribute | body+=Method | body+=Dependancy)*)
	 *
	 * Features:
	 *    classname[1, 1]
	 *    extension[0, 1]
	 *    implements[0, *]
	 *    body[0, *]
	 */
	protected void sequence_Class(EObject context, org.xtext.smokingtext.diagramclass.diagramClass.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Dependancy(EObject context, Dependancy semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramClassPackage.Literals.DEPENDANCY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramClassPackage.Literals.DEPENDANCY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDependancyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     classname=ID
	 *
	 * Features:
	 *    classname[1, 1]
	 */
	protected void sequence_Enumeration(EObject context, Enumeration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramClassPackage.Literals.ENUMERATION__CLASSNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramClassPackage.Literals.ENUMERATION__CLASSNAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumerationAccess().getClassnameIDTerminalRuleCall_2_0(), semanticObject.getClassname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (methodname=ID body+=Method*)
	 *
	 * Features:
	 *    methodname[1, 1]
	 *    body[0, *]
	 */
	protected void sequence_Interface(EObject context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID param+=paramIn* returnType=ID?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    param[0, *]
	 *    returnType[0, 1]
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     greetings+=Package*
	 *
	 * Features:
	 *    greetings[0, *]
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? classType+=Elements* subPackage+=Package?)
	 *
	 * Features:
	 *    name[0, 1]
	 *    classType[0, *]
	 *    subPackage[0, 1]
	 */
	protected void sequence_Package(EObject context, org.xtext.smokingtext.diagramclass.diagramClass.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=ID)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_paramIn(EObject context, paramIn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramClassPackage.Literals.PARAM_IN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramClassPackage.Literals.PARAM_IN__NAME));
			if(transientValues.isValueTransient(semanticObject, DiagramClassPackage.Literals.PARAM_IN__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramClassPackage.Literals.PARAM_IN__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParamInAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParamInAccess().getTypeIDTerminalRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
}
