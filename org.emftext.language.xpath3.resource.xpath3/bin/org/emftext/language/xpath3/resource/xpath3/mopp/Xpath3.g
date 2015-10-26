grammar Xpath3;

options {
	superClass = Xpath3ANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.emftext.language.xpath3.resource.xpath3.mopp;
	
	import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.RecognitionException;
}

@lexer::members {
	public List<RecognitionException> lexerExceptions  = new ArrayList<RecognitionException>();
	public List<Integer> lexerExceptionPositions = new ArrayList<Integer>();
	
	public void reportError(RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionPositions.add(((ANTLRStringStream) input).index());
	}
}
@header{
	package org.emftext.language.xpath3.resource.xpath3.mopp;
	
	import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.antlr.runtime3_4_0.ANTLRInputStream;
import org.antlr.runtime3_4_0.BitSet;
import org.antlr.runtime3_4_0.CommonToken;
import org.antlr.runtime3_4_0.CommonTokenStream;
import org.antlr.runtime3_4_0.IntStream;
import org.antlr.runtime3_4_0.Lexer;
import org.antlr.runtime3_4_0.RecognitionException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
}

@members{
	private org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolverFactory tokenResolverFactory = new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TokenResolverFactory();
	
	/**
	 * the index of the last token that was handled by collectHiddenTokens()
	 */
	private int lastPosition;
	
	/**
	 * A flag that indicates whether the parser should remember all expected elements.
	 * This flag is set to true when using the parse for code completion. Otherwise it
	 * is set to false.
	 */
	private boolean rememberExpectedElements = false;
	
	private Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	
	/**
	 * A list of expected elements the were collected while parsing the input stream.
	 * This list is only filled if <code>rememberExpectedElements</code> is set to
	 * true.
	 */
	private List<org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal> expectedElements = new ArrayList<org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal>();
	
	private int mismatchedTokenRecoveryTries = 0;
	/**
	 * A helper list to allow a lexer to pass errors to its parser
	 */
	protected List<RecognitionException> lexerExceptions = Collections.synchronizedList(new ArrayList<RecognitionException>());
	
	/**
	 * Another helper list to allow a lexer to pass positions of errors to its parser
	 */
	protected List<Integer> lexerExceptionPositions = Collections.synchronizedList(new ArrayList<Integer>());
	
	/**
	 * A stack for incomplete objects. This stack is used filled when the parser is
	 * used for code completion. Whenever the parser starts to read an object it is
	 * pushed on the stack. Once the element was parser completely it is popped from
	 * the stack.
	 */
	List<EObject> incompleteObjects = new ArrayList<EObject>();
	
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private int tokenIndexOfLastCompleteElement;
	
	private int expectedElementsIndexOfLastCompleteElement;
	
	/**
	 * The offset indicating the cursor position when the parser is used for code
	 * completion by calling parseToExpectedElements().
	 */
	private int cursorOffset;
	
	/**
	 * The offset of the first hidden token of the last expected element. This offset
	 * is used to discard expected elements, which are not needed for code completion.
	 */
	private int lastStartIncludingHidden;
	
	private org.emftext.language.xpath3.resource.xpath3.IXpath3LocationMap locationMap;
	
	private org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3SyntaxErrorMessageConverter syntaxErrorMessageConverter = new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3SyntaxErrorMessageConverter(tokenNames);
	
	@Override
	public void reportError(RecognitionException re) {
		addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
	}
	
	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
		postParseCommands.add(new org.emftext.language.xpath3.resource.xpath3.IXpath3Command<org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource>() {
			public boolean execute(org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new org.emftext.language.xpath3.resource.xpath3.IXpath3Problem() {
					public org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemSeverity getSeverity() {
						return org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemSeverity.ERROR;
					}
					public org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemType getType() {
						return org.emftext.language.xpath3.resource.xpath3.Xpath3EProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public Collection<org.emftext.language.xpath3.resource.xpath3.IXpath3QuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	protected void addErrorToResource(org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3LocalizedMessage message) {
		if (message == null) {
			return;
		}
		addErrorToResource(message.getMessage(), message.getColumn(), message.getLine(), message.getCharStart(), message.getCharEnd());
	}
	
	public void addExpectedElement(EClass eClass, int expectationStartIndex, int expectationEndIndex) {
		for (int expectationIndex = expectationStartIndex; expectationIndex <= expectationEndIndex; expectationIndex++) {
			addExpectedElement(eClass, org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectationConstants.EXPECTATIONS[expectationIndex]);
		}
	}
	
	public void addExpectedElement(EClass eClass, int expectationIndex) {
		addExpectedElement(eClass, org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectationConstants.EXPECTATIONS[expectationIndex]);
	}
	
	public void addExpectedElement(EClass eClass, int[] ids) {
		if (!this.rememberExpectedElements) {
			return;
		}
		int terminalID = ids[0];
		int followSetID = ids[1];
		org.emftext.language.xpath3.resource.xpath3.IXpath3ExpectedElement terminal = org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3FollowSetProvider.TERMINALS[terminalID];
		org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ContainedFeature[] containmentFeatures = new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ContainedFeature[ids.length - 2];
		for (int i = 2; i < ids.length; i++) {
			containmentFeatures[i - 2] = org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3FollowSetProvider.LINKS[ids[i]];
		}
		org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3ContainmentTrace containmentTrace = new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3ContainmentTrace(eClass, containmentFeatures);
		EObject container = getLastIncompleteElement();
		org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal expectedElement = new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal(container, terminal, followSetID, containmentTrace);
		setPosition(expectedElement, input.index());
		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
		lastStartIncludingHidden = startIncludingHiddenTokens;
		this.expectedElements.add(expectedElement);
	}
	
	protected void collectHiddenTokens(EObject element) {
	}
	
	protected void copyLocalizationInfos(final EObject source, final EObject target) {
		if (disableLocationMap) {
			return;
		}
		final org.emftext.language.xpath3.resource.xpath3.IXpath3LocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new org.emftext.language.xpath3.resource.xpath3.IXpath3Command<org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource>() {
			public boolean execute(org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource resource) {
				locationMap.setCharStart(target, locationMap.getCharStart(source));
				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
				locationMap.setColumn(target, locationMap.getColumn(source));
				locationMap.setLine(target, locationMap.getLine(source));
				return true;
			}
		});
	}
	
	protected void copyLocalizationInfos(final CommonToken source, final EObject target) {
		if (disableLocationMap) {
			return;
		}
		final org.emftext.language.xpath3.resource.xpath3.IXpath3LocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new org.emftext.language.xpath3.resource.xpath3.IXpath3Command<org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource>() {
			public boolean execute(org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource resource) {
				if (source == null) {
					return true;
				}
				locationMap.setCharStart(target, source.getStartIndex());
				locationMap.setCharEnd(target, source.getStopIndex());
				locationMap.setColumn(target, source.getCharPositionInLine());
				locationMap.setLine(target, source.getLine());
				return true;
			}
		});
	}
	
	/**
	 * Sets the end character index and the last line for the given object in the
	 * location map.
	 */
	protected void setLocalizationEnd(Collection<org.emftext.language.xpath3.resource.xpath3.IXpath3Command<org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource>> postParseCommands , final EObject object, final int endChar, final int endLine) {
		if (disableLocationMap) {
			return;
		}
		final org.emftext.language.xpath3.resource.xpath3.IXpath3LocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new org.emftext.language.xpath3.resource.xpath3.IXpath3Command<org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource>() {
			public boolean execute(org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource resource) {
				locationMap.setCharEnd(object, endChar);
				locationMap.setLine(object, endLine);
				return true;
			}
		});
	}
	
	public org.emftext.language.xpath3.resource.xpath3.IXpath3TextParser createInstance(InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new Xpath3Parser(new CommonTokenStream(new Xpath3Lexer(new ANTLRInputStream(actualInputStream))));
			} else {
				return new Xpath3Parser(new CommonTokenStream(new Xpath3Lexer(new ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (IOException e) {
			new org.emftext.language.xpath3.resource.xpath3.util.Xpath3RuntimeUtil().logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public Xpath3Parser() {
		super(null);
	}
	
	protected EObject doParse() throws RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((Xpath3Lexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((Xpath3Lexer) getTokenStream().getTokenSource()).lexerExceptionPositions = lexerExceptionPositions;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof EClass) {
			EClass type = (EClass) typeObject;
			if (type.getInstanceClass() == org.emftext.language.xpath3.Expr.class) {
				return parse_org_emftext_language_xpath3_Expr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.ForExpr.class) {
				return parse_org_emftext_language_xpath3_ForExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.QuantifiedExpr.class) {
				return parse_org_emftext_language_xpath3_QuantifiedExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.Iterator.class) {
				return parse_org_emftext_language_xpath3_Iterator();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.IfExpr.class) {
				return parse_org_emftext_language_xpath3_IfExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.OrExpr.class) {
				return parse_org_emftext_language_xpath3_OrExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.AndExpr.class) {
				return parse_org_emftext_language_xpath3_AndExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.ComparisonExpr.class) {
				return parse_org_emftext_language_xpath3_ComparisonExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.RangeExpr.class) {
				return parse_org_emftext_language_xpath3_RangeExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.GeneralComp.class) {
				return parse_org_emftext_language_xpath3_GeneralComp();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.ValueComp.class) {
				return parse_org_emftext_language_xpath3_ValueComp();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.NodeComp.class) {
				return parse_org_emftext_language_xpath3_NodeComp();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.AdditiveExpr.class) {
				return parse_org_emftext_language_xpath3_AdditiveExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.MultiplicativeExpr.class) {
				return parse_org_emftext_language_xpath3_MultiplicativeExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.UnionExpr.class) {
				return parse_org_emftext_language_xpath3_UnionExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.IntersectExceptExpr.class) {
				return parse_org_emftext_language_xpath3_IntersectExceptExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.InstanceofExpr.class) {
				return parse_org_emftext_language_xpath3_InstanceofExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.TreatExpr.class) {
				return parse_org_emftext_language_xpath3_TreatExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.CastableExpr.class) {
				return parse_org_emftext_language_xpath3_CastableExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.CastExpr.class) {
				return parse_org_emftext_language_xpath3_CastExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.UnaryExpr.class) {
				return parse_org_emftext_language_xpath3_UnaryExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.FilterExpr.class) {
				return parse_org_emftext_language_xpath3_FilterExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.FunctionCall.class) {
				return parse_org_emftext_language_xpath3_FunctionCall();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.PathExpr.class) {
				return parse_org_emftext_language_xpath3_PathExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.ChildStepExpr.class) {
				return parse_org_emftext_language_xpath3_ChildStepExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.DescOrSelfStepExpr.class) {
				return parse_org_emftext_language_xpath3_DescOrSelfStepExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.RootStepExpr.class) {
				return parse_org_emftext_language_xpath3_RootStepExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.SelfStepExpr.class) {
				return parse_org_emftext_language_xpath3_SelfStepExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.GeneralForwardStep.class) {
				return parse_org_emftext_language_xpath3_GeneralForwardStep();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.AbbrevForwardStep.class) {
				return parse_org_emftext_language_xpath3_AbbrevForwardStep();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.GeneralReverseStep.class) {
				return parse_org_emftext_language_xpath3_GeneralReverseStep();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.AbbrevReverseStep.class) {
				return parse_org_emftext_language_xpath3_AbbrevReverseStep();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.NodeKindTest.class) {
				return parse_org_emftext_language_xpath3_NodeKindTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.QNameTest.class) {
				return parse_org_emftext_language_xpath3_QNameTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.AnyWildcard.class) {
				return parse_org_emftext_language_xpath3_AnyWildcard();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.LocalNameWildcard.class) {
				return parse_org_emftext_language_xpath3_LocalNameWildcard();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.NamespaceWildcard.class) {
				return parse_org_emftext_language_xpath3_NamespaceWildcard();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.Predicate.class) {
				return parse_org_emftext_language_xpath3_Predicate();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.VarRef.class) {
				return parse_org_emftext_language_xpath3_VarRef();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.ParenthesizedExpr.class) {
				return parse_org_emftext_language_xpath3_ParenthesizedExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.ContextItemExpr.class) {
				return parse_org_emftext_language_xpath3_ContextItemExpr();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.SingleType.class) {
				return parse_org_emftext_language_xpath3_SingleType();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.EmptySequenceType.class) {
				return parse_org_emftext_language_xpath3_EmptySequenceType();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.ItemSequenceType.class) {
				return parse_org_emftext_language_xpath3_ItemSequenceType();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.ItemKindTest.class) {
				return parse_org_emftext_language_xpath3_ItemKindTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.AnyItemType.class) {
				return parse_org_emftext_language_xpath3_AnyItemType();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.AtomicItemType.class) {
				return parse_org_emftext_language_xpath3_AtomicItemType();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.AtomicType.class) {
				return parse_org_emftext_language_xpath3_AtomicType();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.OptionalAtomicType.class) {
				return parse_org_emftext_language_xpath3_OptionalAtomicType();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.AnyKindTest.class) {
				return parse_org_emftext_language_xpath3_AnyKindTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.DocumentTest.class) {
				return parse_org_emftext_language_xpath3_DocumentTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.TextTest.class) {
				return parse_org_emftext_language_xpath3_TextTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.CommentTest.class) {
				return parse_org_emftext_language_xpath3_CommentTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.PITest.class) {
				return parse_org_emftext_language_xpath3_PITest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.NCNamePITest.class) {
				return parse_org_emftext_language_xpath3_NCNamePITest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.StringLiteralPITest.class) {
				return parse_org_emftext_language_xpath3_StringLiteralPITest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.AttributeTest.class) {
				return parse_org_emftext_language_xpath3_AttributeTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.WildcardAttributeTest.class) {
				return parse_org_emftext_language_xpath3_WildcardAttributeTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.NameAttributeTest.class) {
				return parse_org_emftext_language_xpath3_NameAttributeTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.SchemaAttributeTest.class) {
				return parse_org_emftext_language_xpath3_SchemaAttributeTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.ElementTest.class) {
				return parse_org_emftext_language_xpath3_ElementTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.WildcardElementTest.class) {
				return parse_org_emftext_language_xpath3_WildcardElementTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.NameElementTest.class) {
				return parse_org_emftext_language_xpath3_NameElementTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.SchemaElementTest.class) {
				return parse_org_emftext_language_xpath3_SchemaElementTest();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.IntegerLiteral.class) {
				return parse_org_emftext_language_xpath3_IntegerLiteral();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.DecimalLiteral.class) {
				return parse_org_emftext_language_xpath3_DecimalLiteral();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.DoubleLiteral.class) {
				return parse_org_emftext_language_xpath3_DoubleLiteral();
			}
			if (type.getInstanceClass() == org.emftext.language.xpath3.StringLiteral.class) {
				return parse_org_emftext_language_xpath3_StringLiteral();
			}
		}
		throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3UnexpectedContentTypeException(typeObject);
	}
	
	public int getMismatchedTokenRecoveryTries() {
		return mismatchedTokenRecoveryTries;
	}
	
	public Object getMissingSymbol(IntStream arg0, RecognitionException arg1, int arg2, BitSet arg3) {
		mismatchedTokenRecoveryTries++;
		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
	}
	
	public Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected Object getTypeObject() {
		Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(org.emftext.language.xpath3.resource.xpath3.IXpath3Options.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public org.emftext.language.xpath3.resource.xpath3.IXpath3ParseResult parse() {
		// Reset parser state
		terminateParsing = false;
		postParseCommands = new ArrayList<org.emftext.language.xpath3.resource.xpath3.IXpath3Command<org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource>>();
		org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ParseResult parseResult = new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ParseResult();
		if (disableLocationMap) {
			locationMap = new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3DevNullLocationMap();
		} else {
			locationMap = new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3LocationMap();
		}
		// Run parser
		try {
			EObject result =  doParse();
			if (lexerExceptions.isEmpty()) {
				parseResult.setRoot(result);
				parseResult.setLocationMap(locationMap);
			}
		} catch (RecognitionException re) {
			addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
		} catch (IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				// can be caused if a null is set on EMF models where not allowed. this will just
				// happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (RecognitionException re : lexerExceptions) {
			addErrorToResource(syntaxErrorMessageConverter.translateLexicalError(re, lexerExceptions, lexerExceptionPositions));
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public List<org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal> parseToExpectedElements(EClass type, org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final CommonTokenStream tokenStream = (CommonTokenStream) getTokenStream();
		org.emftext.language.xpath3.resource.xpath3.IXpath3ParseResult result = parse();
		for (EObject incompleteObject : incompleteObjects) {
			Lexer lexer = (Lexer) tokenStream.getTokenSource();
			int endChar = lexer.getCharIndex();
			int endLine = lexer.getLine();
			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
		}
		if (result != null) {
			EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContentsInternal().add(root);
			}
			for (org.emftext.language.xpath3.resource.xpath3.IXpath3Command<org.emftext.language.xpath3.resource.xpath3.IXpath3TextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		Set<org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal> currentFollowSet = new LinkedHashSet<org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal>();
		List<org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal> newFollowSet = new ArrayList<org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 246;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			CommonToken nextToken = (CommonToken) tokenStream.get(i);
			if (nextToken.getType() < 0) {
				break;
			}
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected
				// terminals can be set
				for (org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						Collection<org.emftext.language.xpath3.resource.xpath3.util.Xpath3Pair<org.emftext.language.xpath3.resource.xpath3.IXpath3ExpectedElement, org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (org.emftext.language.xpath3.resource.xpath3.util.Xpath3Pair<org.emftext.language.xpath3.resource.xpath3.IXpath3ExpectedElement, org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ContainedFeature[]> newFollowerPair : newFollowers) {
							org.emftext.language.xpath3.resource.xpath3.IXpath3ExpectedElement newFollower = newFollowerPair.getLeft();
							EObject container = getLastIncompleteElement();
							org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3ContainmentTrace containmentTrace = new org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3ContainmentTrace(null, newFollowerPair.getRight());
							org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal newFollowTerminal = new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal(container, newFollower, followSetID, containmentTrace);
							newFollowSet.add(newFollowTerminal);
							expectedElements.add(newFollowTerminal);
						}
					}
				}
				currentFollowSet.clear();
				currentFollowSet.addAll(newFollowSet);
			}
			followSetID++;
		}
		// after the last token in the stream we must set the position for the elements
		// that were added during the last iteration of the loop
		for (org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ExpectedTerminal expectedElement, int tokenIndex) {
		int currentIndex = Math.max(0, tokenIndex);
		for (int index = lastTokenIndex; index < currentIndex; index++) {
			if (index >= input.size()) {
				break;
			}
			CommonToken tokenAtIndex = (CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
		if (!rememberExpectedElements) {
			return super.recoverFromMismatchedToken(input, ttype, follow);
		} else {
			return null;
		}
	}
	
	private void startIncompleteElement(Object object) {
		if (object instanceof EObject) {
			this.incompleteObjects.add((EObject) object);
		}
	}
	
	private void completedElement(Object object, boolean isContainment) {
		if (isContainment && !this.incompleteObjects.isEmpty()) {
			this.incompleteObjects.remove(object);
		}
		if (object instanceof EObject) {
			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
		}
	}
	
	private EObject getLastIncompleteElement() {
		if (incompleteObjects.isEmpty()) {
			return null;
		}
		return incompleteObjects.get(incompleteObjects.size() - 1);
	}
	
}

start returns [ EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getExpr(), 0, 90);
		expectedElementsIndexOfLastCompleteElement = 90;
	}
	(
		c0 = parse_org_emftext_language_xpath3_Expr{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_emftext_language_xpath3_Expr returns [org.emftext.language.xpath3.Expr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_IfExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.EXPR__EXPR, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_0_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
		|		a0_1 = parse_org_emftext_language_xpath3_ForExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createExpr();
				startIncompleteElement(element);
			}
			if (a0_1 != null) {
				if (a0_1 != null) {
					Object value = a0_1;
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.EXPR__EXPR, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_0_0_0_0, a0_1, true);
				copyLocalizationInfos(a0_1, element);
			}
		}
		|		a0_2 = parse_org_emftext_language_xpath3_QuantifiedExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createExpr();
				startIncompleteElement(element);
			}
			if (a0_2 != null) {
				if (a0_2 != null) {
					Object value = a0_2;
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.EXPR__EXPR, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_0_0_0_0, a0_2, true);
				copyLocalizationInfos(a0_2, element);
			}
		}
		|		a0_3 = parse_org_emftext_language_xpath3_OrExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createExpr();
				startIncompleteElement(element);
			}
			if (a0_3 != null) {
				if (a0_3 != null) {
					Object value = a0_3;
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.EXPR__EXPR, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_0_0_0_0, a0_3, true);
				copyLocalizationInfos(a0_3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 91, 94);
	}
	
	(
		(
			a1 = ',' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_0_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getExpr(), 95, 185);
			}
			
			(
				a2_0 = parse_org_emftext_language_xpath3_IfExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createExpr();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.EXPR__EXPR, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_0_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
				|				a2_1 = parse_org_emftext_language_xpath3_ForExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createExpr();
						startIncompleteElement(element);
					}
					if (a2_1 != null) {
						if (a2_1 != null) {
							Object value = a2_1;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.EXPR__EXPR, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_0_0_0_1_0_0_1, a2_1, true);
						copyLocalizationInfos(a2_1, element);
					}
				}
				|				a2_2 = parse_org_emftext_language_xpath3_QuantifiedExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createExpr();
						startIncompleteElement(element);
					}
					if (a2_2 != null) {
						if (a2_2 != null) {
							Object value = a2_2;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.EXPR__EXPR, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_0_0_0_1_0_0_1, a2_2, true);
						copyLocalizationInfos(a2_2, element);
					}
				}
				|				a2_3 = parse_org_emftext_language_xpath3_OrExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createExpr();
						startIncompleteElement(element);
					}
					if (a2_3 != null) {
						if (a2_3 != null) {
							Object value = a2_3;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.EXPR__EXPR, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_0_0_0_1_0_0_1, a2_3, true);
						copyLocalizationInfos(a2_3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 186, 189);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 190, 193);
	}
	
;

parse_org_emftext_language_xpath3_ForExpr returns [org.emftext.language.xpath3.ForExpr element = null]
@init{
}
:
	a0 = 'for' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createForExpr();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_1_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr(), 194);
	}
	
	(
		a1_0 = parse_org_emftext_language_xpath3_Iterator		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createForExpr();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.FOR_EXPR__ITERATOR, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_1_0_0_2, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 195, 196);
	}
	
	(
		(
			a2 = ',' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createForExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_1_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr(), 197);
			}
			
			(
				a3_0 = parse_org_emftext_language_xpath3_Iterator				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createForExpr();
						startIncompleteElement(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.FOR_EXPR__ITERATOR, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_1_0_0_3_0_0_2, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 198, 199);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, 200, 201);
	}
	
	a4 = 'return' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createForExpr();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_1_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForExpr(), 202, 1522);
	}
	
	(
		a5_0 = parse_org_emftext_language_xpath3_ExprSingle		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createForExpr();
				startIncompleteElement(element);
			}
			if (a5_0 != null) {
				if (a5_0 != null) {
					Object value = a5_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FOR_EXPR__RETURN), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_1_0_0_7, a5_0, true);
				copyLocalizationInfos(a5_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 1523, 1528);
	}
	
;

parse_org_emftext_language_xpath3_QuantifiedExpr returns [org.emftext.language.xpath3.QuantifiedExpr element = null]
@init{
}
:
	(
		(
			a0 = 'some' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createQuantifiedExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_2_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifierKind().getEEnumLiteral(org.emftext.language.xpath3.QuantifierKind.SOME_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__QUANTIFIER), value);
				completedElement(value, false);
			}
			|			a1 = 'every' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createQuantifiedExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_2_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifierKind().getEEnumLiteral(org.emftext.language.xpath3.QuantifierKind.EVERY_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__QUANTIFIER), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr(), 1529);
	}
	
	(
		a4_0 = parse_org_emftext_language_xpath3_Iterator		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createQuantifiedExpr();
				startIncompleteElement(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__ITERATOR, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_2_0_0_2, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 1530, 1531);
	}
	
	(
		(
			a5 = ',' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createQuantifiedExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_2_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr(), 1532);
			}
			
			(
				a6_0 = parse_org_emftext_language_xpath3_Iterator				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createQuantifiedExpr();
						startIncompleteElement(element);
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							Object value = a6_0;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__ITERATOR, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_2_0_0_3_0_0_2, a6_0, true);
						copyLocalizationInfos(a6_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 1533, 1534);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, 1535, 1536);
	}
	
	a7 = 'satisfies' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createQuantifiedExpr();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_2_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getQuantifiedExpr(), 1537, 1627);
	}
	
	(
		a8_0 = parse_org_emftext_language_xpath3_IfExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createQuantifiedExpr();
				startIncompleteElement(element);
			}
			if (a8_0 != null) {
				if (a8_0 != null) {
					Object value = a8_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__SATISFIES), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_2_0_0_6, a8_0, true);
				copyLocalizationInfos(a8_0, element);
			}
		}
		|		a8_1 = parse_org_emftext_language_xpath3_ForExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createQuantifiedExpr();
				startIncompleteElement(element);
			}
			if (a8_1 != null) {
				if (a8_1 != null) {
					Object value = a8_1;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__SATISFIES), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_2_0_0_6, a8_1, true);
				copyLocalizationInfos(a8_1, element);
			}
		}
		|		a8_2 = parse_org_emftext_language_xpath3_QuantifiedExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createQuantifiedExpr();
				startIncompleteElement(element);
			}
			if (a8_2 != null) {
				if (a8_2 != null) {
					Object value = a8_2;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__SATISFIES), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_2_0_0_6, a8_2, true);
				copyLocalizationInfos(a8_2, element);
			}
		}
		|		a8_3 = parse_org_emftext_language_xpath3_OrExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createQuantifiedExpr();
				startIncompleteElement(element);
			}
			if (a8_3 != null) {
				if (a8_3 != null) {
					Object value = a8_3;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QUANTIFIED_EXPR__SATISFIES), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_2_0_0_6, a8_3, true);
				copyLocalizationInfos(a8_3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 1628, 1633);
	}
	
;

parse_org_emftext_language_xpath3_Iterator returns [org.emftext.language.xpath3.Iterator element = null]
@init{
}
:
	a0 = '$' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIterator();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_3_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1634, 1635);
	}
	
	(
		(
			a1 = QNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIterator();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__VAR_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__VAR_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_3_0_0_1_0_0_0, resolved, true);
					copyLocalizationInfos((CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 1636);
		}
		
		
		|		(
			a2 = NCNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIterator();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__VAR_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__VAR_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_3_0_0_1_0_1_0, resolved, true);
					copyLocalizationInfos((CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 1637);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 1638);
	}
	
	a3 = 'in' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIterator();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_3_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIterator(), 1639, 1729);
	}
	
	(
		a4_0 = parse_org_emftext_language_xpath3_IfExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIterator();
				startIncompleteElement(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__LIST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_3_0_0_5, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
		|		a4_1 = parse_org_emftext_language_xpath3_ForExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIterator();
				startIncompleteElement(element);
			}
			if (a4_1 != null) {
				if (a4_1 != null) {
					Object value = a4_1;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__LIST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_3_0_0_5, a4_1, true);
				copyLocalizationInfos(a4_1, element);
			}
		}
		|		a4_2 = parse_org_emftext_language_xpath3_QuantifiedExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIterator();
				startIncompleteElement(element);
			}
			if (a4_2 != null) {
				if (a4_2 != null) {
					Object value = a4_2;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__LIST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_3_0_0_5, a4_2, true);
				copyLocalizationInfos(a4_2, element);
			}
		}
		|		a4_3 = parse_org_emftext_language_xpath3_OrExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIterator();
				startIncompleteElement(element);
			}
			if (a4_3 != null) {
				if (a4_3 != null) {
					Object value = a4_3;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITERATOR__LIST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_3_0_0_5, a4_3, true);
				copyLocalizationInfos(a4_3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 1730, 1733);
	}
	
;

parse_org_emftext_language_xpath3_IfExpr returns [org.emftext.language.xpath3.IfExpr element = null]
@init{
}
:
	a0 = 'if' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1734);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr(), 1735, 1916);
	}
	
	(
		a2_0 = parse_org_emftext_language_xpath3_Expr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__TEST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_3, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
		|		a2_1 = parse_org_emftext_language_xpath3_IfExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
				startIncompleteElement(element);
			}
			if (a2_1 != null) {
				if (a2_1 != null) {
					Object value = a2_1;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__TEST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_3, a2_1, true);
				copyLocalizationInfos(a2_1, element);
			}
		}
		|		a2_2 = parse_org_emftext_language_xpath3_ForExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
				startIncompleteElement(element);
			}
			if (a2_2 != null) {
				if (a2_2 != null) {
					Object value = a2_2;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__TEST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_3, a2_2, true);
				copyLocalizationInfos(a2_2, element);
			}
		}
		|		a2_3 = parse_org_emftext_language_xpath3_QuantifiedExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
				startIncompleteElement(element);
			}
			if (a2_3 != null) {
				if (a2_3 != null) {
					Object value = a2_3;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__TEST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_3, a2_3, true);
				copyLocalizationInfos(a2_3, element);
			}
		}
		|		a2_4 = parse_org_emftext_language_xpath3_OrExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
				startIncompleteElement(element);
			}
			if (a2_4 != null) {
				if (a2_4 != null) {
					Object value = a2_4;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__TEST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_3, a2_4, true);
				copyLocalizationInfos(a2_4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 1917);
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1918);
	}
	
	a4 = 'then' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_6, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr(), 1919, 2009);
	}
	
	(
		a5_0 = parse_org_emftext_language_xpath3_IfExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
				startIncompleteElement(element);
			}
			if (a5_0 != null) {
				if (a5_0 != null) {
					Object value = a5_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__THEN), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_8, a5_0, true);
				copyLocalizationInfos(a5_0, element);
			}
		}
		|		a5_1 = parse_org_emftext_language_xpath3_ForExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
				startIncompleteElement(element);
			}
			if (a5_1 != null) {
				if (a5_1 != null) {
					Object value = a5_1;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__THEN), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_8, a5_1, true);
				copyLocalizationInfos(a5_1, element);
			}
		}
		|		a5_2 = parse_org_emftext_language_xpath3_QuantifiedExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
				startIncompleteElement(element);
			}
			if (a5_2 != null) {
				if (a5_2 != null) {
					Object value = a5_2;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__THEN), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_8, a5_2, true);
				copyLocalizationInfos(a5_2, element);
			}
		}
		|		a5_3 = parse_org_emftext_language_xpath3_OrExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
				startIncompleteElement(element);
			}
			if (a5_3 != null) {
				if (a5_3 != null) {
					Object value = a5_3;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__THEN), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_8, a5_3, true);
				copyLocalizationInfos(a5_3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 2010);
	}
	
	a6 = 'else' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_10, null, true);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIfExpr(), 2011, 2101);
	}
	
	(
		a7_0 = parse_org_emftext_language_xpath3_IfExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
				startIncompleteElement(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__ELSE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_12, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
		|		a7_1 = parse_org_emftext_language_xpath3_ForExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
				startIncompleteElement(element);
			}
			if (a7_1 != null) {
				if (a7_1 != null) {
					Object value = a7_1;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__ELSE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_12, a7_1, true);
				copyLocalizationInfos(a7_1, element);
			}
		}
		|		a7_2 = parse_org_emftext_language_xpath3_QuantifiedExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
				startIncompleteElement(element);
			}
			if (a7_2 != null) {
				if (a7_2 != null) {
					Object value = a7_2;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__ELSE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_12, a7_2, true);
				copyLocalizationInfos(a7_2, element);
			}
		}
		|		a7_3 = parse_org_emftext_language_xpath3_OrExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIfExpr();
				startIncompleteElement(element);
			}
			if (a7_3 != null) {
				if (a7_3 != null) {
					Object value = a7_3;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.IF_EXPR__ELSE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_4_0_0_12, a7_3, true);
				copyLocalizationInfos(a7_3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 2102, 2107);
	}
	
;

parse_org_emftext_language_xpath3_OrExpr returns [org.emftext.language.xpath3.OrExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_AndExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createOrExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.OR_EXPR__OPERAND, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_5_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 2108, 2114);
	}
	
	(
		(
			a1 = 'or' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createOrExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_5_0_0_1_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOrExpr(), 2115, 2202);
			}
			
			(
				a2_0 = parse_org_emftext_language_xpath3_AndExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createOrExpr();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.OR_EXPR__OPERAND, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_5_0_0_1_0_0_3, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 2203, 2209);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 2210, 2216);
	}
	
;

parse_org_emftext_language_xpath3_AndExpr returns [org.emftext.language.xpath3.AndExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_ComparisonExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAndExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.AND_EXPR__OPERAND, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_6_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 2217, 2224);
	}
	
	(
		(
			a1 = 'and' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAndExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_6_0_0_1_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAndExpr(), 2225, 2312);
			}
			
			(
				a2_0 = parse_org_emftext_language_xpath3_ComparisonExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAndExpr();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.AND_EXPR__OPERAND, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_6_0_0_1_0_0_3, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 2313, 2320);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 2321, 2328);
	}
	
;

parse_org_emftext_language_xpath3_ComparisonExpr returns [org.emftext.language.xpath3.ComparisonExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_RangeExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createComparisonExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.COMPARISON_EXPR__LEFT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_7_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 2329, 2331);
		addExpectedElement(null, 2332, 2339);
	}
	
	(
		(
			(
				a1_0 = parse_org_emftext_language_xpath3_Comp				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createComparisonExpr();
						startIncompleteElement(element);
					}
					if (a1_0 != null) {
						if (a1_0 != null) {
							Object value = a1_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.COMPARISON_EXPR__OPERATOR), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_7_0_0_1_0_0_1, a1_0, true);
						copyLocalizationInfos(a1_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 2340, 2427);
			}
			
			(
				a2_0 = parse_org_emftext_language_xpath3_RangeExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createComparisonExpr();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.COMPARISON_EXPR__RIGHT), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_7_0_0_1_0_0_3, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 2428, 2435);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 2436, 2443);
	}
	
;

parse_org_emftext_language_xpath3_RangeExpr returns [org.emftext.language.xpath3.RangeExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_AdditiveExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createRangeExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.RANGE_EXPR__FROM), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_8_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 2444, 2450);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 2451, 2453);
		addExpectedElement(null, 2454, 2455);
	}
	
	(
		(
			a1 = 'to' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createRangeExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_8_0_0_1_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getRangeExpr(), 2456, 2543);
			}
			
			(
				a2_0 = parse_org_emftext_language_xpath3_AdditiveExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createRangeExpr();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.RANGE_EXPR__TO), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_8_0_0_1_0_0_3, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 2544, 2549);
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 2550, 2552);
				addExpectedElement(null, 2553, 2554);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 2555, 2560);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 2561, 2563);
		addExpectedElement(null, 2564, 2565);
	}
	
;

parse_org_emftext_language_xpath3_GeneralComp returns [org.emftext.language.xpath3.GeneralComp element = null]
@init{
}
:
	(
		(
			a0 = '=' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_9_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralCompKind().getEEnumLiteral(org.emftext.language.xpath3.GeneralCompKind.EQ_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_COMP__OPERATOR), value);
				completedElement(value, false);
			}
			|			a1 = '!=' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_9_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralCompKind().getEEnumLiteral(org.emftext.language.xpath3.GeneralCompKind.NE_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_COMP__OPERATOR), value);
				completedElement(value, false);
			}
			|			a2 = '<' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_9_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralCompKind().getEEnumLiteral(org.emftext.language.xpath3.GeneralCompKind.LT_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_COMP__OPERATOR), value);
				completedElement(value, false);
			}
			|			a3 = '<=' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_9_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a3, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralCompKind().getEEnumLiteral(org.emftext.language.xpath3.GeneralCompKind.LE_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_COMP__OPERATOR), value);
				completedElement(value, false);
			}
			|			a4 = '>' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_9_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a4, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralCompKind().getEEnumLiteral(org.emftext.language.xpath3.GeneralCompKind.GT_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_COMP__OPERATOR), value);
				completedElement(value, false);
			}
			|			a5 = '>=' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_9_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a5, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralCompKind().getEEnumLiteral(org.emftext.language.xpath3.GeneralCompKind.GE_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_COMP__OPERATOR), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 2566, 2653);
	}
	
;

parse_org_emftext_language_xpath3_ValueComp returns [org.emftext.language.xpath3.ValueComp element = null]
@init{
}
:
	(
		(
			a0 = 'eq' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createValueComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_10_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralCompKind().getEEnumLiteral(org.emftext.language.xpath3.GeneralCompKind.EQ_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VALUE_COMP__OPERATOR), value);
				completedElement(value, false);
			}
			|			a1 = 'ne' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createValueComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_10_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralCompKind().getEEnumLiteral(org.emftext.language.xpath3.GeneralCompKind.NE_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VALUE_COMP__OPERATOR), value);
				completedElement(value, false);
			}
			|			a2 = 'lt' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createValueComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_10_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralCompKind().getEEnumLiteral(org.emftext.language.xpath3.GeneralCompKind.LT_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VALUE_COMP__OPERATOR), value);
				completedElement(value, false);
			}
			|			a3 = 'le' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createValueComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_10_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a3, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralCompKind().getEEnumLiteral(org.emftext.language.xpath3.GeneralCompKind.LE_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VALUE_COMP__OPERATOR), value);
				completedElement(value, false);
			}
			|			a4 = 'gt' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createValueComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_10_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a4, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralCompKind().getEEnumLiteral(org.emftext.language.xpath3.GeneralCompKind.GT_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VALUE_COMP__OPERATOR), value);
				completedElement(value, false);
			}
			|			a5 = 'ge' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createValueComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_10_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a5, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralCompKind().getEEnumLiteral(org.emftext.language.xpath3.GeneralCompKind.GE_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VALUE_COMP__OPERATOR), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 2654, 2741);
	}
	
;

parse_org_emftext_language_xpath3_NodeComp returns [org.emftext.language.xpath3.NodeComp element = null]
@init{
}
:
	(
		(
			a0 = 'is' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNodeComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_11_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNodeCompKind().getEEnumLiteral(org.emftext.language.xpath3.NodeCompKind.IS_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NODE_COMP__OPERATOR), value);
				completedElement(value, false);
			}
			|			a1 = '<<' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNodeComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_11_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNodeCompKind().getEEnumLiteral(org.emftext.language.xpath3.NodeCompKind.PRECEDES_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NODE_COMP__OPERATOR), value);
				completedElement(value, false);
			}
			|			a2 = '>>' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNodeComp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_11_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNodeCompKind().getEEnumLiteral(org.emftext.language.xpath3.NodeCompKind.FOLLOWS_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NODE_COMP__OPERATOR), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 2742, 2829);
	}
	
;

parse_org_emftext_language_xpath3_AdditiveExpr returns [org.emftext.language.xpath3.AdditiveExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_MultiplicativeExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAdditiveExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.ADDITIVE_EXPR__OPERAND, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_12_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 2830, 2837);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 2838, 2840);
		addExpectedElement(null, 2841, 2842);
	}
	
	(
		(
			(
				(
					a1 = '+' {
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAdditiveExpr();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_12_0_0_1_0_0_1, null, true);
						copyLocalizationInfos((CommonToken)a1, element);
						// set value of enumeration attribute
						Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAdditiveOpKind().getEEnumLiteral(org.emftext.language.xpath3.AdditiveOpKind.ADDITION_VALUE).getInstance();
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.ADDITIVE_EXPR__OPERATOR, value);
						completedElement(value, false);
					}
					|					a2 = '-' {
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAdditiveExpr();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_12_0_0_1_0_0_1, null, true);
						copyLocalizationInfos((CommonToken)a2, element);
						// set value of enumeration attribute
						Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAdditiveOpKind().getEEnumLiteral(org.emftext.language.xpath3.AdditiveOpKind.SUBTRACTION_VALUE).getInstance();
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.ADDITIVE_EXPR__OPERATOR, value);
						completedElement(value, false);
					}
				)
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAdditiveExpr(), 2843, 2930);
			}
			
			(
				a5_0 = parse_org_emftext_language_xpath3_MultiplicativeExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAdditiveExpr();
						startIncompleteElement(element);
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							Object value = a5_0;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.ADDITIVE_EXPR__OPERAND, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_12_0_0_1_0_0_3, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 2931, 2938);
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 2939, 2941);
				addExpectedElement(null, 2942, 2943);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 2944, 2951);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 2952, 2954);
		addExpectedElement(null, 2955, 2956);
	}
	
;

parse_org_emftext_language_xpath3_MultiplicativeExpr returns [org.emftext.language.xpath3.MultiplicativeExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_UnionExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createMultiplicativeExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.MULTIPLICATIVE_EXPR__OPERAND, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_13_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 2957, 2965);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 2966, 2968);
		addExpectedElement(null, 2969, 2970);
	}
	
	(
		(
			(
				(
					a1 = '*' {
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createMultiplicativeExpr();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_13_0_0_1_0_0_1, null, true);
						copyLocalizationInfos((CommonToken)a1, element);
						// set value of enumeration attribute
						Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getMultiplicativeOpKind().getEEnumLiteral(org.emftext.language.xpath3.MultiplicativeOpKind.MULTIPLICATION_VALUE).getInstance();
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.MULTIPLICATIVE_EXPR__OPERATOR, value);
						completedElement(value, false);
					}
					|					a2 = 'div' {
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createMultiplicativeExpr();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_13_0_0_1_0_0_1, null, true);
						copyLocalizationInfos((CommonToken)a2, element);
						// set value of enumeration attribute
						Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getMultiplicativeOpKind().getEEnumLiteral(org.emftext.language.xpath3.MultiplicativeOpKind.DIV_VALUE).getInstance();
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.MULTIPLICATIVE_EXPR__OPERATOR, value);
						completedElement(value, false);
					}
					|					a3 = 'idiv' {
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createMultiplicativeExpr();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_13_0_0_1_0_0_1, null, true);
						copyLocalizationInfos((CommonToken)a3, element);
						// set value of enumeration attribute
						Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getMultiplicativeOpKind().getEEnumLiteral(org.emftext.language.xpath3.MultiplicativeOpKind.IDIV_VALUE).getInstance();
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.MULTIPLICATIVE_EXPR__OPERATOR, value);
						completedElement(value, false);
					}
					|					a4 = 'mod' {
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createMultiplicativeExpr();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_13_0_0_1_0_0_1, null, true);
						copyLocalizationInfos((CommonToken)a4, element);
						// set value of enumeration attribute
						Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getMultiplicativeOpKind().getEEnumLiteral(org.emftext.language.xpath3.MultiplicativeOpKind.MOD_VALUE).getInstance();
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.MULTIPLICATIVE_EXPR__OPERATOR, value);
						completedElement(value, false);
					}
				)
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getMultiplicativeExpr(), 2971, 3058);
			}
			
			(
				a7_0 = parse_org_emftext_language_xpath3_UnionExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createMultiplicativeExpr();
						startIncompleteElement(element);
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							Object value = a7_0;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.MULTIPLICATIVE_EXPR__OPERAND, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_13_0_0_1_0_0_3, a7_0, true);
						copyLocalizationInfos(a7_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 3059, 3067);
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3068, 3070);
				addExpectedElement(null, 3071, 3072);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 3073, 3081);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3082, 3084);
		addExpectedElement(null, 3085, 3086);
	}
	
;

parse_org_emftext_language_xpath3_UnionExpr returns [org.emftext.language.xpath3.UnionExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_IntersectExceptExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createUnionExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.UNION_EXPR__OPERAND, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_14_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 3087, 3096);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3097, 3099);
		addExpectedElement(null, 3100, 3101);
	}
	
	(
		(
			(
				(
					a1 = 'union' {
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createUnionExpr();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_14_0_0_1_0_0_1, null, true);
						copyLocalizationInfos((CommonToken)a1, element);
						// set value of enumeration attribute
						Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnionOp().getEEnumLiteral(org.emftext.language.xpath3.UnionOp.UNION_VALUE).getInstance();
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.UNION_EXPR__OPERATION, value);
						completedElement(value, false);
					}
					|					a2 = '|' {
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createUnionExpr();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_14_0_0_1_0_0_1, null, true);
						copyLocalizationInfos((CommonToken)a2, element);
						// set value of enumeration attribute
						Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnionOp().getEEnumLiteral(org.emftext.language.xpath3.UnionOp.VERTICAL_BAR_VALUE).getInstance();
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.UNION_EXPR__OPERATION, value);
						completedElement(value, false);
					}
				)
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnionExpr(), 3102, 3189);
			}
			
			(
				a5_0 = parse_org_emftext_language_xpath3_IntersectExceptExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createUnionExpr();
						startIncompleteElement(element);
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							Object value = a5_0;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.UNION_EXPR__OPERAND, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_14_0_0_1_0_0_3, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 3190, 3199);
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3200, 3202);
				addExpectedElement(null, 3203, 3204);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 3205, 3214);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3215, 3217);
		addExpectedElement(null, 3218, 3219);
	}
	
;

parse_org_emftext_language_xpath3_IntersectExceptExpr returns [org.emftext.language.xpath3.IntersectExceptExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_InstanceofExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIntersectExceptExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.INTERSECT_EXCEPT_EXPR__OPERAND, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_15_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 3220, 3230);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3231, 3233);
		addExpectedElement(null, 3234, 3235);
	}
	
	(
		(
			(
				(
					a1 = 'intersect' {
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIntersectExceptExpr();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_15_0_0_1_0_0_1, null, true);
						copyLocalizationInfos((CommonToken)a1, element);
						// set value of enumeration attribute
						Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIntersectExceptOpKind().getEEnumLiteral(org.emftext.language.xpath3.IntersectExceptOpKind.INTERSECT_VALUE).getInstance();
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.INTERSECT_EXCEPT_EXPR__OPERATOR, value);
						completedElement(value, false);
					}
					|					a2 = 'except' {
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIntersectExceptExpr();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_15_0_0_1_0_0_1, null, true);
						copyLocalizationInfos((CommonToken)a2, element);
						// set value of enumeration attribute
						Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIntersectExceptOpKind().getEEnumLiteral(org.emftext.language.xpath3.IntersectExceptOpKind.EXCEPT_VALUE).getInstance();
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.INTERSECT_EXCEPT_EXPR__OPERATOR, value);
						completedElement(value, false);
					}
				)
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getIntersectExceptExpr(), 3236, 3323);
			}
			
			(
				a5_0 = parse_org_emftext_language_xpath3_InstanceofExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIntersectExceptExpr();
						startIncompleteElement(element);
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							Object value = a5_0;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.INTERSECT_EXCEPT_EXPR__OPERAND, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_15_0_0_1_0_0_3, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 3324, 3334);
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3335, 3337);
				addExpectedElement(null, 3338, 3339);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 3340, 3350);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3351, 3353);
		addExpectedElement(null, 3354, 3355);
	}
	
;

parse_org_emftext_language_xpath3_InstanceofExpr returns [org.emftext.language.xpath3.InstanceofExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_TreatExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createInstanceofExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INSTANCEOF_EXPR__OPERAND), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_16_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 3356, 3367);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3368, 3370);
		addExpectedElement(null, 3371, 3372);
	}
	
	(
		(
			a1 = 'instance' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createInstanceofExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_16_0_0_1_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 3373);
			}
			
			a2 = 'of' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createInstanceofExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_16_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getInstanceofExpr(), 3374, 3392);
			}
			
			(
				a3_0 = parse_org_emftext_language_xpath3_SequenceType				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createInstanceofExpr();
						startIncompleteElement(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INSTANCEOF_EXPR__TYPE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_16_0_0_1_0_0_3, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 3393, 3403);
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3404, 3406);
				addExpectedElement(null, 3407, 3408);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 3409, 3419);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3420, 3422);
		addExpectedElement(null, 3423, 3424);
	}
	
;

parse_org_emftext_language_xpath3_TreatExpr returns [org.emftext.language.xpath3.TreatExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_CastableExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createTreatExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.TREAT_EXPR__OPERAND), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_17_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 3425, 3437);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3438, 3440);
		addExpectedElement(null, 3441, 3442);
	}
	
	(
		(
			a1 = 'treat' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createTreatExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_17_0_0_1_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 3443);
			}
			
			a2 = 'as' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createTreatExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_17_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getTreatExpr(), 3444, 3462);
			}
			
			(
				a3_0 = parse_org_emftext_language_xpath3_SequenceType				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createTreatExpr();
						startIncompleteElement(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.TREAT_EXPR__TYPE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_17_0_0_1_0_0_3, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 3463, 3474);
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3475, 3477);
				addExpectedElement(null, 3478, 3479);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 3480, 3491);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3492, 3494);
		addExpectedElement(null, 3495, 3496);
	}
	
;

parse_org_emftext_language_xpath3_CastableExpr returns [org.emftext.language.xpath3.CastableExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_CastExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createCastableExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CASTABLE_EXPR__OPERAND), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_18_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 3497, 3510);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3511, 3513);
		addExpectedElement(null, 3514, 3515);
	}
	
	(
		(
			a1 = 'castable' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createCastableExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_18_0_0_1_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 3516);
			}
			
			a2 = 'as' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createCastableExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_18_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getCastableExpr(), 3517, 3518);
			}
			
			(
				a3_0 = parse_org_emftext_language_xpath3_SingleType				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createCastableExpr();
						startIncompleteElement(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CASTABLE_EXPR__TYPE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_18_0_0_1_0_0_3, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 3519, 3531);
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3532, 3534);
				addExpectedElement(null, 3535, 3536);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 3537, 3549);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3550, 3552);
		addExpectedElement(null, 3553, 3554);
	}
	
;

parse_org_emftext_language_xpath3_CastExpr returns [org.emftext.language.xpath3.CastExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_UnaryExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createCastExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CAST_EXPR__OPERAND), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_19_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 3555, 3569);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3570, 3572);
		addExpectedElement(null, 3573, 3574);
	}
	
	(
		(
			a1 = 'cast' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createCastExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_19_0_0_1_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 3575);
			}
			
			a2 = 'as' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createCastExpr();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_19_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getCastExpr(), 3576, 3577);
			}
			
			(
				a3_0 = parse_org_emftext_language_xpath3_SingleType				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createCastExpr();
						startIncompleteElement(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CAST_EXPR__TYPE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_19_0_0_1_0_0_3, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 3578, 3591);
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3592, 3594);
				addExpectedElement(null, 3595, 3596);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 3597, 3610);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3611, 3613);
		addExpectedElement(null, 3614, 3615);
	}
	
;

parse_org_emftext_language_xpath3_UnaryExpr returns [org.emftext.language.xpath3.UnaryExpr element = null]
@init{
}
:
	(
		(
			(
				a0 = '+' {
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createUnaryExpr();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_20_0_0_0, null, true);
					copyLocalizationInfos((CommonToken)a0, element);
					// set value of enumeration attribute
					Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnaryOp().getEEnumLiteral(org.emftext.language.xpath3.UnaryOp.PLUS_VALUE).getInstance();
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.UNARY_EXPR__OPERATOR, value);
					completedElement(value, false);
				}
				|				a1 = '-' {
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createUnaryExpr();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_20_0_0_0, null, true);
					copyLocalizationInfos((CommonToken)a1, element);
					// set value of enumeration attribute
					Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnaryOp().getEEnumLiteral(org.emftext.language.xpath3.UnaryOp.MINUS_VALUE).getInstance();
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.UNARY_EXPR__OPERATOR, value);
					completedElement(value, false);
				}
			)
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, 3616);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getUnaryExpr(), 3617, 3703);
	}
	
	(
		a4_0 = parse_org_emftext_language_xpath3_ValueExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createUnaryExpr();
				startIncompleteElement(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.UNARY_EXPR__OPERAND), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_20_0_0_1, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 3704, 3718);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3719, 3721);
		addExpectedElement(null, 3722, 3723);
	}
	
;

parse_org_emftext_language_xpath3_FilterExpr returns [org.emftext.language.xpath3.FilterExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_PrimaryExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFilterExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FILTER_EXPR__PRIMARY_EXPR), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_21_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(), 3724);
		addExpectedElement(null, 3725, 3730);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 3731, 3732);
		addExpectedElement(null, 3733, 3741);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3742, 3744);
		addExpectedElement(null, 3745, 3746);
	}
	
	(
		(
			a1_0 = parse_org_emftext_language_xpath3_Predicate			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFilterExpr();
					startIncompleteElement(element);
				}
				if (a1_0 != null) {
					if (a1_0 != null) {
						Object value = a1_0;
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.FILTER_EXPR__PREDICATE, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_21_0_0_1, a1_0, true);
					copyLocalizationInfos(a1_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(), 3747);
		addExpectedElement(null, 3748, 3753);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 3754, 3755);
		addExpectedElement(null, 3756, 3764);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3765, 3767);
		addExpectedElement(null, 3768, 3769);
	}
	
;

parse_org_emftext_language_xpath3_FunctionCall returns [org.emftext.language.xpath3.FunctionCall element = null]
@init{
}
:
	(
		(
			a0 = QNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFunctionCall();
					startIncompleteElement(element);
				}
				if (a0 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_22_0_0_0_0_0_0, resolved, true);
					copyLocalizationInfos((CommonToken) a0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 3770);
		}
		
		
		|		(
			a1 = NCNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFunctionCall();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_22_0_0_0_0_1_0, resolved, true);
					copyLocalizationInfos((CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 3771);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 3772);
	}
	
	a2 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFunctionCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_22_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFunctionCall(), 3773, 3863);
		addExpectedElement(null, 3864);
	}
	
	(
		(
			(
				a3_0 = parse_org_emftext_language_xpath3_IfExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFunctionCall();
						startIncompleteElement(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__ARG, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_22_0_0_2_0_0_0, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
				|				a3_1 = parse_org_emftext_language_xpath3_ForExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFunctionCall();
						startIncompleteElement(element);
					}
					if (a3_1 != null) {
						if (a3_1 != null) {
							Object value = a3_1;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__ARG, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_22_0_0_2_0_0_0, a3_1, true);
						copyLocalizationInfos(a3_1, element);
					}
				}
				|				a3_2 = parse_org_emftext_language_xpath3_QuantifiedExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFunctionCall();
						startIncompleteElement(element);
					}
					if (a3_2 != null) {
						if (a3_2 != null) {
							Object value = a3_2;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__ARG, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_22_0_0_2_0_0_0, a3_2, true);
						copyLocalizationInfos(a3_2, element);
					}
				}
				|				a3_3 = parse_org_emftext_language_xpath3_OrExpr				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFunctionCall();
						startIncompleteElement(element);
					}
					if (a3_3 != null) {
						if (a3_3 != null) {
							Object value = a3_3;
							addObjectToList(element, org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__ARG, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_22_0_0_2_0_0_0, a3_3, true);
						copyLocalizationInfos(a3_3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 3865, 3866);
			}
			
			(
				(
					a4 = ',' {
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFunctionCall();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_22_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((CommonToken)a4, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFunctionCall(), 3867, 3957);
					}
					
					(
						a5_0 = parse_org_emftext_language_xpath3_IfExpr						{
							if (terminateParsing) {
								throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
							}
							if (element == null) {
								element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFunctionCall();
								startIncompleteElement(element);
							}
							if (a5_0 != null) {
								if (a5_0 != null) {
									Object value = a5_0;
									addObjectToList(element, org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__ARG, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_22_0_0_2_0_0_1_0_0_2, a5_0, true);
								copyLocalizationInfos(a5_0, element);
							}
						}
						|						a5_1 = parse_org_emftext_language_xpath3_ForExpr						{
							if (terminateParsing) {
								throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
							}
							if (element == null) {
								element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFunctionCall();
								startIncompleteElement(element);
							}
							if (a5_1 != null) {
								if (a5_1 != null) {
									Object value = a5_1;
									addObjectToList(element, org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__ARG, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_22_0_0_2_0_0_1_0_0_2, a5_1, true);
								copyLocalizationInfos(a5_1, element);
							}
						}
						|						a5_2 = parse_org_emftext_language_xpath3_QuantifiedExpr						{
							if (terminateParsing) {
								throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
							}
							if (element == null) {
								element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFunctionCall();
								startIncompleteElement(element);
							}
							if (a5_2 != null) {
								if (a5_2 != null) {
									Object value = a5_2;
									addObjectToList(element, org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__ARG, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_22_0_0_2_0_0_1_0_0_2, a5_2, true);
								copyLocalizationInfos(a5_2, element);
							}
						}
						|						a5_3 = parse_org_emftext_language_xpath3_OrExpr						{
							if (terminateParsing) {
								throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
							}
							if (element == null) {
								element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFunctionCall();
								startIncompleteElement(element);
							}
							if (a5_3 != null) {
								if (a5_3 != null) {
									Object value = a5_3;
									addObjectToList(element, org.emftext.language.xpath3.XPath3Package.FUNCTION_CALL__ARG, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_22_0_0_2_0_0_1_0_0_2, a5_3, true);
								copyLocalizationInfos(a5_3, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, 3958, 3959);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, 3960, 3961);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 3962);
	}
	
	a6 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createFunctionCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_22_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 3963, 3968);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(), 3969);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 3970, 3971);
		addExpectedElement(null, 3972, 3980);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 3981, 3983);
		addExpectedElement(null, 3984, 3985);
	}
	
;

parse_org_emftext_language_xpath3_PathExpr returns [org.emftext.language.xpath3.PathExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_PathExprChild		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createPathExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					addObjectToList(element, org.emftext.language.xpath3.XPath3Package.PATH_EXPR__STEP, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_23_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 3986, 3987);
		addExpectedElement(null, 3988, 4002);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4003, 4005);
		addExpectedElement(null, 4006, 4007);
	}
	
	(
		(
			a1_0 = parse_org_emftext_language_xpath3_ChildStepExpr			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createPathExpr();
					startIncompleteElement(element);
				}
				if (a1_0 != null) {
					if (a1_0 != null) {
						Object value = a1_0;
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.PATH_EXPR__STEP, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_23_0_0_1, a1_0, true);
					copyLocalizationInfos(a1_0, element);
				}
			}
			|			a1_1 = parse_org_emftext_language_xpath3_DescOrSelfStepExpr			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createPathExpr();
					startIncompleteElement(element);
				}
				if (a1_1 != null) {
					if (a1_1 != null) {
						Object value = a1_1;
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.PATH_EXPR__STEP, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_23_0_0_1, a1_1, true);
					copyLocalizationInfos(a1_1, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4008, 4009);
		addExpectedElement(null, 4010, 4024);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4025, 4027);
		addExpectedElement(null, 4028, 4029);
	}
	
;

parse_org_emftext_language_xpath3_ChildStepExpr returns [org.emftext.language.xpath3.ChildStepExpr element = null]
@init{
}
:
	a0 = '/' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createChildStepExpr();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_24_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getChildStepExpr(), 4030, 4062);
	}
	
	(
		a1_0 = parse_org_emftext_language_xpath3_StepExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createChildStepExpr();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.CHILD_STEP_EXPR__STEP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_24_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 4063, 4068);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4069, 4070);
		addExpectedElement(null, 4071, 4079);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4080, 4082);
		addExpectedElement(null, 4083, 4084);
	}
	
;

parse_org_emftext_language_xpath3_DescOrSelfStepExpr returns [org.emftext.language.xpath3.DescOrSelfStepExpr element = null]
@init{
}
:
	a0 = '//' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createDescOrSelfStepExpr();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_25_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDescOrSelfStepExpr(), 4085, 4117);
	}
	
	(
		a1_0 = parse_org_emftext_language_xpath3_StepExpr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createDescOrSelfStepExpr();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DESC_OR_SELF_STEP_EXPR__STEP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_25_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 4118, 4123);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4124, 4125);
		addExpectedElement(null, 4126, 4134);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4135, 4137);
		addExpectedElement(null, 4138, 4139);
	}
	
;

parse_org_emftext_language_xpath3_RootStepExpr returns [org.emftext.language.xpath3.RootStepExpr element = null]
@init{
}
:
	a0 = '/' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createRootStepExpr();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_26_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 4140, 4145);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4146, 4147);
		addExpectedElement(null, 4148, 4156);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4157, 4159);
		addExpectedElement(null, 4160, 4161);
	}
	
;

parse_org_emftext_language_xpath3_SelfStepExpr returns [org.emftext.language.xpath3.SelfStepExpr element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_SelfStepExprChild		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createSelfStepExpr();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SELF_STEP_EXPR__STEP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_27_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 4162, 4167);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4168, 4169);
		addExpectedElement(null, 4170, 4178);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4179, 4181);
		addExpectedElement(null, 4182, 4183);
	}
	
;

parse_org_emftext_language_xpath3_GeneralForwardStep returns [org.emftext.language.xpath3.GeneralForwardStep element = null]
@init{
}
:
	(
		(
			a0 = 'child' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralForwardStep();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_28_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForwardAxisKind().getEEnumLiteral(org.emftext.language.xpath3.ForwardAxisKind.CHILD_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__AXIS), value);
				completedElement(value, false);
			}
			|			a1 = 'descendant' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralForwardStep();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_28_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForwardAxisKind().getEEnumLiteral(org.emftext.language.xpath3.ForwardAxisKind.DESCENDANT_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__AXIS), value);
				completedElement(value, false);
			}
			|			a2 = 'attribute' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralForwardStep();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_28_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForwardAxisKind().getEEnumLiteral(org.emftext.language.xpath3.ForwardAxisKind.ATTRIBUTE_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__AXIS), value);
				completedElement(value, false);
			}
			|			a3 = 'self' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralForwardStep();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_28_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a3, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForwardAxisKind().getEEnumLiteral(org.emftext.language.xpath3.ForwardAxisKind.SELF_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__AXIS), value);
				completedElement(value, false);
			}
			|			a4 = 'descendant-or-self' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralForwardStep();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_28_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a4, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForwardAxisKind().getEEnumLiteral(org.emftext.language.xpath3.ForwardAxisKind.DESCENDANT_OR_SELF_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__AXIS), value);
				completedElement(value, false);
			}
			|			a5 = 'following-sibling' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralForwardStep();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_28_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a5, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForwardAxisKind().getEEnumLiteral(org.emftext.language.xpath3.ForwardAxisKind.FOLLOWING_SIBLING_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__AXIS), value);
				completedElement(value, false);
			}
			|			a6 = 'following' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralForwardStep();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_28_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a6, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForwardAxisKind().getEEnumLiteral(org.emftext.language.xpath3.ForwardAxisKind.FOLLOWING_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__AXIS), value);
				completedElement(value, false);
			}
			|			a7 = 'namespace' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralForwardStep();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_28_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a7, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getForwardAxisKind().getEEnumLiteral(org.emftext.language.xpath3.ForwardAxisKind.NAMESPACE_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__AXIS), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 4184);
	}
	
	a10 = '::' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralForwardStep();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_28_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 4185, 4204);
	}
	
	(
		a11_0 = parse_org_emftext_language_xpath3_NodeTest		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralForwardStep();
				startIncompleteElement(element);
			}
			if (a11_0 != null) {
				if (a11_0 != null) {
					Object value = a11_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__NODE_TEST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_28_0_0_2, a11_0, true);
				copyLocalizationInfos(a11_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 4205);
		addExpectedElement(null, 4206, 4211);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4212, 4213);
		addExpectedElement(null, 4214, 4222);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4223, 4225);
		addExpectedElement(null, 4226, 4227);
	}
	
	(
		(
			a12_0 = parse_org_emftext_language_xpath3_Predicate			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralForwardStep();
					startIncompleteElement(element);
				}
				if (a12_0 != null) {
					if (a12_0 != null) {
						Object value = a12_0;
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.GENERAL_FORWARD_STEP__PREDICATE, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_28_0_0_3, a12_0, true);
					copyLocalizationInfos(a12_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 4228);
		addExpectedElement(null, 4229, 4234);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4235, 4236);
		addExpectedElement(null, 4237, 4245);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4246, 4248);
		addExpectedElement(null, 4249, 4250);
	}
	
;

parse_org_emftext_language_xpath3_AbbrevForwardStep returns [org.emftext.language.xpath3.AbbrevForwardStep element = null]
@init{
}
:
	(
		(
			a0 = '@' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAbbrevForwardStep();
					startIncompleteElement(element);
					// initialize enumeration attribute
					Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStepKind().getEEnumLiteral(org.emftext.language.xpath3.AbbrevForwardStepKind.CHILD_VALUE).getInstance();
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__KIND), value);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_29_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStepKind().getEEnumLiteral(org.emftext.language.xpath3.AbbrevForwardStepKind.ATTRIBUTE_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__KIND), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 4251, 4270);
	}
	
	(
		a3_0 = parse_org_emftext_language_xpath3_NodeTest		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAbbrevForwardStep();
				startIncompleteElement(element);
				// initialize enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStepKind().getEEnumLiteral(org.emftext.language.xpath3.AbbrevForwardStepKind.CHILD_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__KIND), value);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__NODE_TEST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_29_0_0_1, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 4271);
		addExpectedElement(null, 4272, 4277);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4278, 4279);
		addExpectedElement(null, 4280, 4288);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4289, 4291);
		addExpectedElement(null, 4292, 4293);
	}
	
	(
		(
			a4_0 = parse_org_emftext_language_xpath3_Predicate			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAbbrevForwardStep();
					startIncompleteElement(element);
					// initialize enumeration attribute
					Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStepKind().getEEnumLiteral(org.emftext.language.xpath3.AbbrevForwardStepKind.CHILD_VALUE).getInstance();
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__KIND), value);
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						Object value = a4_0;
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.ABBREV_FORWARD_STEP__PREDICATE, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_29_0_0_2, a4_0, true);
					copyLocalizationInfos(a4_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 4294);
		addExpectedElement(null, 4295, 4300);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4301, 4302);
		addExpectedElement(null, 4303, 4311);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4312, 4314);
		addExpectedElement(null, 4315, 4316);
	}
	
;

parse_org_emftext_language_xpath3_GeneralReverseStep returns [org.emftext.language.xpath3.GeneralReverseStep element = null]
@init{
}
:
	(
		(
			a0 = 'parent' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralReverseStep();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_30_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getReverseAxisKind().getEEnumLiteral(org.emftext.language.xpath3.ReverseAxisKind.PARENT_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__AXIS), value);
				completedElement(value, false);
			}
			|			a1 = 'ancestor' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralReverseStep();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_30_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getReverseAxisKind().getEEnumLiteral(org.emftext.language.xpath3.ReverseAxisKind.ANCESTOR_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__AXIS), value);
				completedElement(value, false);
			}
			|			a2 = 'preceding-sibling' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralReverseStep();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_30_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getReverseAxisKind().getEEnumLiteral(org.emftext.language.xpath3.ReverseAxisKind.PRECEDING_SIBLING_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__AXIS), value);
				completedElement(value, false);
			}
			|			a3 = 'preceding' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralReverseStep();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_30_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a3, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getReverseAxisKind().getEEnumLiteral(org.emftext.language.xpath3.ReverseAxisKind.PRECEDING_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__AXIS), value);
				completedElement(value, false);
			}
			|			a4 = 'ancestor-or-self' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralReverseStep();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_30_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a4, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getReverseAxisKind().getEEnumLiteral(org.emftext.language.xpath3.ReverseAxisKind.ANCESTOR_OR_SELF_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__AXIS), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 4317);
	}
	
	a7 = '::' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralReverseStep();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_30_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 4318, 4337);
	}
	
	(
		a8_0 = parse_org_emftext_language_xpath3_NodeTest		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralReverseStep();
				startIncompleteElement(element);
			}
			if (a8_0 != null) {
				if (a8_0 != null) {
					Object value = a8_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__NODE_TEST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_30_0_0_2, a8_0, true);
				copyLocalizationInfos(a8_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 4338);
		addExpectedElement(null, 4339, 4344);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4345, 4346);
		addExpectedElement(null, 4347, 4355);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4356, 4358);
		addExpectedElement(null, 4359, 4360);
	}
	
	(
		(
			a9_0 = parse_org_emftext_language_xpath3_Predicate			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createGeneralReverseStep();
					startIncompleteElement(element);
				}
				if (a9_0 != null) {
					if (a9_0 != null) {
						Object value = a9_0;
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.GENERAL_REVERSE_STEP__PREDICATE, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_30_0_0_3, a9_0, true);
					copyLocalizationInfos(a9_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 4361);
		addExpectedElement(null, 4362, 4367);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4368, 4369);
		addExpectedElement(null, 4370, 4378);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4379, 4381);
		addExpectedElement(null, 4382, 4383);
	}
	
;

parse_org_emftext_language_xpath3_AbbrevReverseStep returns [org.emftext.language.xpath3.AbbrevReverseStep element = null]
@init{
}
:
	(
		(
			a0 = '..' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAbbrevReverseStep();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_31_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevReverseStepKind().getEEnumLiteral(org.emftext.language.xpath3.AbbrevReverseStepKind.PARENT_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ABBREV_REVERSE_STEP__KIND), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevReverseStep(), 4384);
		addExpectedElement(null, 4385, 4390);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4391, 4392);
		addExpectedElement(null, 4393, 4401);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4402, 4404);
		addExpectedElement(null, 4405, 4406);
	}
	
	(
		(
			a3_0 = parse_org_emftext_language_xpath3_Predicate			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAbbrevReverseStep();
					startIncompleteElement(element);
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						Object value = a3_0;
						addObjectToList(element, org.emftext.language.xpath3.XPath3Package.ABBREV_REVERSE_STEP__PREDICATE, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_31_0_0_1, a3_0, true);
					copyLocalizationInfos(a3_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevReverseStep(), 4407);
		addExpectedElement(null, 4408, 4413);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4414, 4415);
		addExpectedElement(null, 4416, 4424);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4425, 4427);
		addExpectedElement(null, 4428, 4429);
	}
	
;

parse_org_emftext_language_xpath3_NodeKindTest returns [org.emftext.language.xpath3.NodeKindTest element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_KindTest		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNodeKindTest();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NODE_KIND_TEST__TEST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_32_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 4430);
		addExpectedElement(null, 4431, 4436);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4437, 4438);
		addExpectedElement(null, 4439, 4447);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4448, 4450);
		addExpectedElement(null, 4451, 4452);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 4453);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 4454);
	}
	
;

parse_org_emftext_language_xpath3_QNameTest returns [org.emftext.language.xpath3.QNameTest element = null]
@init{
}
:
	(
		(
			a0 = QNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createQNameTest();
					startIncompleteElement(element);
				}
				if (a0 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QNAME_TEST__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QNAME_TEST__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_33_0_0_0_0_0_0, resolved, true);
					copyLocalizationInfos((CommonToken) a0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 4455);
			addExpectedElement(null, 4456, 4461);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4462, 4463);
			addExpectedElement(null, 4464, 4472);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4473, 4475);
			addExpectedElement(null, 4476, 4477);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 4478);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 4479);
		}
		
		
		|		(
			a1 = NCNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createQNameTest();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QNAME_TEST__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.QNAME_TEST__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_33_0_0_0_0_1_0, resolved, true);
					copyLocalizationInfos((CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			// We've found the last token for this rule. The constructed EObject is now
			// complete.
			completedElement(element, true);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 4480);
			addExpectedElement(null, 4481, 4486);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4487, 4488);
			addExpectedElement(null, 4489, 4497);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4498, 4500);
			addExpectedElement(null, 4501, 4502);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 4503);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 4504);
		}
		
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 4505);
		addExpectedElement(null, 4506, 4511);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4512, 4513);
		addExpectedElement(null, 4514, 4522);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4523, 4525);
		addExpectedElement(null, 4526, 4527);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 4528);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 4529);
	}
	
;

parse_org_emftext_language_xpath3_AnyWildcard returns [org.emftext.language.xpath3.AnyWildcard element = null]
@init{
}
:
	a0 = '*' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAnyWildcard();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_34_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 4530);
		addExpectedElement(null, 4531, 4536);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4537, 4538);
		addExpectedElement(null, 4539, 4547);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4548, 4550);
		addExpectedElement(null, 4551, 4552);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 4553);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 4554);
	}
	
;

parse_org_emftext_language_xpath3_LocalNameWildcard returns [org.emftext.language.xpath3.LocalNameWildcard element = null]
@init{
}
:
	(
		a0 = NCNAME		
		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createLocalNameWildcard();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.LOCAL_NAME_WILDCARD__NAMESPACE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.LOCAL_NAME_WILDCARD__NAMESPACE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_35_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 4555);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createLocalNameWildcard();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_35_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 4556);
	}
	
	a2 = '*' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createLocalNameWildcard();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_35_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 4557);
		addExpectedElement(null, 4558, 4563);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4564, 4565);
		addExpectedElement(null, 4566, 4574);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4575, 4577);
		addExpectedElement(null, 4578, 4579);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 4580);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 4581);
	}
	
;

parse_org_emftext_language_xpath3_NamespaceWildcard returns [org.emftext.language.xpath3.NamespaceWildcard element = null]
@init{
}
:
	a0 = '*' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNamespaceWildcard();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_36_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 4582);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNamespaceWildcard();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_36_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 4583);
	}
	
	(
		a2 = NCNAME		
		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNamespaceWildcard();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAMESPACE_WILDCARD__LOCAL_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAMESPACE_WILDCARD__LOCAL_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_36_0_0_2, resolved, true);
				copyLocalizationInfos((CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 4584);
		addExpectedElement(null, 4585, 4590);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4591, 4592);
		addExpectedElement(null, 4593, 4601);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4602, 4604);
		addExpectedElement(null, 4605, 4606);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 4607);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 4608);
	}
	
;

parse_org_emftext_language_xpath3_Predicate returns [org.emftext.language.xpath3.Predicate element = null]
@init{
}
:
	a0 = '[' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createPredicate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_37_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPredicate(), 4609, 4699);
	}
	
	(
		a1_0 = parse_org_emftext_language_xpath3_Expr		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createPredicate();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.PREDICATE__EXPR), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_37_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 4700);
	}
	
	a2 = ']' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createPredicate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_37_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(), 4701);
		addExpectedElement(null, 4702, 4707);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4708, 4709);
		addExpectedElement(null, 4710, 4718);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4719, 4721);
		addExpectedElement(null, 4722, 4723);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 4724);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 4725);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 4726);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevReverseStep(), 4727);
	}
	
;

parse_org_emftext_language_xpath3_VarRef returns [org.emftext.language.xpath3.VarRef element = null]
@init{
}
:
	a0 = '$' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createVarRef();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_38_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 4728, 4729);
	}
	
	(
		(
			a1 = QNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createVarRef();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VAR_REF__VAR_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VAR_REF__VAR_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_38_0_0_1_0_0_0, resolved, true);
					copyLocalizationInfos((CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 4730, 4735);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(), 4736);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4737, 4738);
			addExpectedElement(null, 4739, 4747);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4748, 4750);
			addExpectedElement(null, 4751, 4752);
		}
		
		
		|		(
			a2 = NCNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createVarRef();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VAR_REF__VAR_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.VAR_REF__VAR_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_38_0_0_1_0_1_0, resolved, true);
					copyLocalizationInfos((CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			// We've found the last token for this rule. The constructed EObject is now
			// complete.
			completedElement(element, true);
			addExpectedElement(null, 4753, 4758);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(), 4759);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4760, 4761);
			addExpectedElement(null, 4762, 4770);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4771, 4773);
			addExpectedElement(null, 4774, 4775);
		}
		
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 4776, 4781);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(), 4782);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4783, 4784);
		addExpectedElement(null, 4785, 4793);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4794, 4796);
		addExpectedElement(null, 4797, 4798);
	}
	
;

parse_org_emftext_language_xpath3_ParenthesizedExpr returns [org.emftext.language.xpath3.ParenthesizedExpr element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createParenthesizedExpr();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_39_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getParenthesizedExpr(), 4799, 4889);
		addExpectedElement(null, 4890);
	}
	
	(
		(
			a1_0 = parse_org_emftext_language_xpath3_Expr			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createParenthesizedExpr();
					startIncompleteElement(element);
				}
				if (a1_0 != null) {
					if (a1_0 != null) {
						Object value = a1_0;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.PARENTHESIZED_EXPR__EXPR), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_39_0_0_1, a1_0, true);
					copyLocalizationInfos(a1_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 4891);
	}
	
	a2 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createParenthesizedExpr();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_39_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 4892, 4897);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(), 4898);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4899, 4900);
		addExpectedElement(null, 4901, 4909);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4910, 4912);
		addExpectedElement(null, 4913, 4914);
	}
	
;

parse_org_emftext_language_xpath3_ContextItemExpr returns [org.emftext.language.xpath3.ContextItemExpr element = null]
@init{
}
:
	a0 = '.' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createContextItemExpr();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_40_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 4915, 4920);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(), 4921);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 4922, 4923);
		addExpectedElement(null, 4924, 4932);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4933, 4935);
		addExpectedElement(null, 4936, 4937);
	}
	
;

parse_org_emftext_language_xpath3_SingleType returns [org.emftext.language.xpath3.SingleType element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_AtomicType		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createSingleType();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SINGLE_TYPE__OPTIONAL), value);
				}
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SINGLE_TYPE__TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_41_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 4938, 4951);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4952, 4954);
		addExpectedElement(null, 4955, 4956);
	}
	
	(
		(
			a1 = '?' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createSingleType();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SINGLE_TYPE__OPTIONAL), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_41_0_0_1, true, true);
				copyLocalizationInfos((CommonToken)a1, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SINGLE_TYPE__OPTIONAL), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 4957, 4969);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4970, 4972);
		addExpectedElement(null, 4973, 4974);
	}
	
;

parse_org_emftext_language_xpath3_EmptySequenceType returns [org.emftext.language.xpath3.EmptySequenceType element = null]
@init{
}
:
	a0 = 'empty-sequence' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createEmptySequenceType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_42_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 4975);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createEmptySequenceType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_42_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 4976);
	}
	
	a2 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createEmptySequenceType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_42_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 4977, 4987);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 4988, 4990);
		addExpectedElement(null, 4991, 4992);
	}
	
;

parse_org_emftext_language_xpath3_ItemSequenceType returns [org.emftext.language.xpath3.ItemSequenceType element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_ItemType		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createItemSequenceType();
				startIncompleteElement(element);
				// initialize enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOccurrenceIndicatorKind().getEEnumLiteral(org.emftext.language.xpath3.OccurrenceIndicatorKind.MANDATORY_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_SEQUENCE_TYPE__OCCURRENCE), value);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_SEQUENCE_TYPE__ITEM_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_43_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 4993, 5004);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5005, 5007);
		addExpectedElement(null, 5008, 5009);
	}
	
	(
		(
			a1 = '?' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createItemSequenceType();
					startIncompleteElement(element);
					// initialize enumeration attribute
					Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOccurrenceIndicatorKind().getEEnumLiteral(org.emftext.language.xpath3.OccurrenceIndicatorKind.MANDATORY_VALUE).getInstance();
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_SEQUENCE_TYPE__OCCURRENCE), value);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_43_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOccurrenceIndicatorKind().getEEnumLiteral(org.emftext.language.xpath3.OccurrenceIndicatorKind.OPTIONAL_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_SEQUENCE_TYPE__OCCURRENCE), value);
				completedElement(value, false);
			}
			|			a2 = '*' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createItemSequenceType();
					startIncompleteElement(element);
					// initialize enumeration attribute
					Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOccurrenceIndicatorKind().getEEnumLiteral(org.emftext.language.xpath3.OccurrenceIndicatorKind.MANDATORY_VALUE).getInstance();
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_SEQUENCE_TYPE__OCCURRENCE), value);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_43_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOccurrenceIndicatorKind().getEEnumLiteral(org.emftext.language.xpath3.OccurrenceIndicatorKind.STAR_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_SEQUENCE_TYPE__OCCURRENCE), value);
				completedElement(value, false);
			}
			|			a3 = '+' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createItemSequenceType();
					startIncompleteElement(element);
					// initialize enumeration attribute
					Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOccurrenceIndicatorKind().getEEnumLiteral(org.emftext.language.xpath3.OccurrenceIndicatorKind.MANDATORY_VALUE).getInstance();
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_SEQUENCE_TYPE__OCCURRENCE), value);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_43_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a3, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.xpath3.XPath3Package.eINSTANCE.getOccurrenceIndicatorKind().getEEnumLiteral(org.emftext.language.xpath3.OccurrenceIndicatorKind.PLUS_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_SEQUENCE_TYPE__OCCURRENCE), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 5010, 5020);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5021, 5023);
		addExpectedElement(null, 5024, 5025);
	}
	
;

parse_org_emftext_language_xpath3_ItemKindTest returns [org.emftext.language.xpath3.ItemKindTest element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_KindTest		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createItemKindTest();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ITEM_KIND_TEST__TEST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_44_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 5026, 5037);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5038, 5040);
		addExpectedElement(null, 5041, 5042);
	}
	
;

parse_org_emftext_language_xpath3_AnyItemType returns [org.emftext.language.xpath3.AnyItemType element = null]
@init{
}
:
	a0 = 'item' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAnyItemType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_45_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5043);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAnyItemType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_45_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5044);
	}
	
	a2 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAnyItemType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_45_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 5045, 5056);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5057, 5059);
		addExpectedElement(null, 5060, 5061);
	}
	
;

parse_org_emftext_language_xpath3_AtomicItemType returns [org.emftext.language.xpath3.AtomicItemType element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_xpath3_AtomicType		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAtomicItemType();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_ITEM_TYPE__TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_46_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 5062, 5073);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5074, 5076);
		addExpectedElement(null, 5077, 5078);
	}
	
;

parse_org_emftext_language_xpath3_AtomicType returns [org.emftext.language.xpath3.AtomicType element = null]
@init{
}
:
	(
		(
			a0 = QNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAtomicType();
					startIncompleteElement(element);
				}
				if (a0 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_TYPE__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_TYPE__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_47_0_0_0_0_0_0, resolved, true);
					copyLocalizationInfos((CommonToken) a0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 5079, 5092);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5093, 5095);
			addExpectedElement(null, 5096, 5098);
		}
		
		
		|		(
			a1 = NCNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAtomicType();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_TYPE__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.ATOMIC_TYPE__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_47_0_0_0_0_1_0, resolved, true);
					copyLocalizationInfos((CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			// We've found the last token for this rule. The constructed EObject is now
			// complete.
			completedElement(element, true);
			addExpectedElement(null, 5099, 5112);
			addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5113, 5115);
			addExpectedElement(null, 5116, 5118);
		}
		
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 5119, 5132);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5133, 5135);
		addExpectedElement(null, 5136, 5138);
	}
	
;

parse_org_emftext_language_xpath3_OptionalAtomicType returns [org.emftext.language.xpath3.OptionalAtomicType element = null]
@init{
}
:
	(
		(
			a0 = QNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createOptionalAtomicType();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__OPTIONAL), value);
					}
				}
				if (a0 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_48_0_0_0_0_0_0, resolved, true);
					copyLocalizationInfos((CommonToken) a0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 5139, 5141);
		}
		
		
		|		(
			a1 = NCNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createOptionalAtomicType();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__OPTIONAL), value);
					}
				}
				if (a1 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_48_0_0_0_0_1_0, resolved, true);
					copyLocalizationInfos((CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 5142, 5144);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 5145, 5147);
	}
	
	(
		(
			a2 = '?' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createOptionalAtomicType();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__OPTIONAL), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_48_0_0_1, true, true);
				copyLocalizationInfos((CommonToken)a2, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.OPTIONAL_ATOMIC_TYPE__OPTIONAL), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 5148, 5149);
	}
	
;

parse_org_emftext_language_xpath3_AnyKindTest returns [org.emftext.language.xpath3.AnyKindTest element = null]
@init{
}
:
	a0 = 'node' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAnyKindTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_49_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5150);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAnyKindTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_49_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5151);
	}
	
	a2 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAnyKindTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_49_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5152);
		addExpectedElement(null, 5153, 5158);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5159, 5160);
		addExpectedElement(null, 5161, 5169);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5170, 5172);
		addExpectedElement(null, 5173, 5174);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5175);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5176);
		addExpectedElement(null, 5177);
	}
	
;

parse_org_emftext_language_xpath3_DocumentTest returns [org.emftext.language.xpath3.DocumentTest element = null]
@init{
}
:
	a0 = 'document-node' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createDocumentTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_50_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5178);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createDocumentTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_50_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getDocumentTest(), 5179, 5182);
		addExpectedElement(null, 5183);
	}
	
	(
		(
			a2_0 = parse_org_emftext_language_xpath3_ElementTest			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createDocumentTest();
					startIncompleteElement(element);
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						Object value = a2_0;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DOCUMENT_TEST__TEST), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_50_0_0_2, a2_0, true);
					copyLocalizationInfos(a2_0, element);
				}
			}
			|			a2_1 = parse_org_emftext_language_xpath3_SchemaElementTest			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createDocumentTest();
					startIncompleteElement(element);
				}
				if (a2_1 != null) {
					if (a2_1 != null) {
						Object value = a2_1;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DOCUMENT_TEST__TEST), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_50_0_0_2, a2_1, true);
					copyLocalizationInfos(a2_1, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 5184);
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createDocumentTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_50_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5185);
		addExpectedElement(null, 5186, 5191);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5192, 5193);
		addExpectedElement(null, 5194, 5202);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5203, 5205);
		addExpectedElement(null, 5206, 5207);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5208);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5209);
		addExpectedElement(null, 5210);
	}
	
;

parse_org_emftext_language_xpath3_TextTest returns [org.emftext.language.xpath3.TextTest element = null]
@init{
}
:
	a0 = 'text' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createTextTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_51_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5211);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createTextTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_51_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5212);
	}
	
	a2 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createTextTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_51_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5213);
		addExpectedElement(null, 5214, 5219);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5220, 5221);
		addExpectedElement(null, 5222, 5230);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5231, 5233);
		addExpectedElement(null, 5234, 5235);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5236);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5237);
		addExpectedElement(null, 5238);
	}
	
;

parse_org_emftext_language_xpath3_CommentTest returns [org.emftext.language.xpath3.CommentTest element = null]
@init{
}
:
	a0 = 'comment' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createCommentTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_52_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5239);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createCommentTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_52_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5240);
	}
	
	a2 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createCommentTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_52_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5241);
		addExpectedElement(null, 5242, 5247);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5248, 5249);
		addExpectedElement(null, 5250, 5258);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5259, 5261);
		addExpectedElement(null, 5262, 5263);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5264);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5265);
		addExpectedElement(null, 5266);
	}
	
;

parse_org_emftext_language_xpath3_PITest returns [org.emftext.language.xpath3.PITest element = null]
@init{
}
:
	a0 = 'processing-instruction' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createPITest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_53_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5267);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createPITest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_53_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5268);
	}
	
	a2 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createPITest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_53_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5269);
		addExpectedElement(null, 5270, 5275);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5276, 5277);
		addExpectedElement(null, 5278, 5286);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5287, 5289);
		addExpectedElement(null, 5290, 5291);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5292);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5293);
		addExpectedElement(null, 5294);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_emftext_language_xpath3_NCNamePITest{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_xpath3_StringLiteralPITest{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_xpath3_NCNamePITest returns [org.emftext.language.xpath3.NCNamePITest element = null]
@init{
}
:
	a0 = 'processing-instruction' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNCNamePITest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_54_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5295);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNCNamePITest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_54_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5296);
	}
	
	(
		a2 = NCNAME		
		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNCNamePITest();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NC_NAME_PI_TEST__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NC_NAME_PI_TEST__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_54_0_0_2, resolved, true);
				copyLocalizationInfos((CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 5297);
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNCNamePITest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_54_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5298);
		addExpectedElement(null, 5299, 5304);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5305, 5306);
		addExpectedElement(null, 5307, 5315);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5316, 5318);
		addExpectedElement(null, 5319, 5320);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5321);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5322);
		addExpectedElement(null, 5323);
	}
	
;

parse_org_emftext_language_xpath3_StringLiteralPITest returns [org.emftext.language.xpath3.StringLiteralPITest element = null]
@init{
}
:
	a0 = 'processing-instruction' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createStringLiteralPITest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_55_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5324);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createStringLiteralPITest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_55_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5325);
	}
	
	(
		a2 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createStringLiteralPITest();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.STRING_LITERAL_PI_TEST__LITERAL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.emftext.language.xpath3.StringLiteral proxy = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createStringLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3ContextDependentURIFragmentFactory<org.emftext.language.xpath3.StringLiteralPITest, org.emftext.language.xpath3.StringLiteral>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getStringLiteralPITestLiteralReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.STRING_LITERAL_PI_TEST__LITERAL), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.STRING_LITERAL_PI_TEST__LITERAL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_55_0_0_2, proxy, true);
				copyLocalizationInfos((CommonToken) a2, element);
				copyLocalizationInfos((CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 5326);
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createStringLiteralPITest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_55_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5327);
		addExpectedElement(null, 5328, 5333);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5334, 5335);
		addExpectedElement(null, 5336, 5344);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5345, 5347);
		addExpectedElement(null, 5348, 5349);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5350);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5351);
		addExpectedElement(null, 5352);
	}
	
;

parse_org_emftext_language_xpath3_AttributeTest returns [org.emftext.language.xpath3.AttributeTest element = null]
@init{
}
:
	a0 = 'attribute' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAttributeTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_56_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5353);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAttributeTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_56_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5354);
	}
	
	a2 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createAttributeTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_56_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5355);
		addExpectedElement(null, 5356, 5361);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5362, 5363);
		addExpectedElement(null, 5364, 5372);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5373, 5375);
		addExpectedElement(null, 5376, 5377);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5378);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5379);
		addExpectedElement(null, 5380);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_emftext_language_xpath3_WildcardAttributeTest{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_xpath3_NameAttributeTest{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_xpath3_WildcardAttributeTest returns [org.emftext.language.xpath3.WildcardAttributeTest element = null]
@init{
}
:
	a0 = 'attribute' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createWildcardAttributeTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_57_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5381);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createWildcardAttributeTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_57_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5382);
	}
	
	a2 = '*' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createWildcardAttributeTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_57_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5383, 5384);
	}
	
	(
		(
			a3 = ',' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createWildcardAttributeTest();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_57_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 5385, 5386);
			}
			
			(
				(
					a4 = QNAME					
					{
						if (terminateParsing) {
							throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
						}
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createWildcardAttributeTest();
							startIncompleteElement(element);
						}
						if (a4 != null) {
							org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
							tokenResolver.setOptions(getOptions());
							org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
							tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ATTRIBUTE_TEST__TYPE), result);
							Object resolvedObject = result.getResolvedToken();
							if (resolvedObject == null) {
								addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
							}
							javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
							if (resolved != null) {
								Object value = resolved;
								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ATTRIBUTE_TEST__TYPE), value);
								completedElement(value, false);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_57_0_0_3_0_0_2_0_0_0, resolved, true);
							copyLocalizationInfos((CommonToken) a4, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 5387);
				}
				
				
				|				(
					a5 = NCNAME					
					{
						if (terminateParsing) {
							throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
						}
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createWildcardAttributeTest();
							startIncompleteElement(element);
						}
						if (a5 != null) {
							org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
							tokenResolver.setOptions(getOptions());
							org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
							tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ATTRIBUTE_TEST__TYPE), result);
							Object resolvedObject = result.getResolvedToken();
							if (resolvedObject == null) {
								addErrorToResource(result.getErrorMessage(), ((CommonToken) a5).getLine(), ((CommonToken) a5).getCharPositionInLine(), ((CommonToken) a5).getStartIndex(), ((CommonToken) a5).getStopIndex());
							}
							javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
							if (resolved != null) {
								Object value = resolved;
								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ATTRIBUTE_TEST__TYPE), value);
								completedElement(value, false);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_57_0_0_3_0_0_2_0_1_0, resolved, true);
							copyLocalizationInfos((CommonToken) a5, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 5388);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 5389);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 5390);
	}
	
	a6 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createWildcardAttributeTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_57_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5391);
		addExpectedElement(null, 5392, 5397);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5398, 5399);
		addExpectedElement(null, 5400, 5408);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5409, 5411);
		addExpectedElement(null, 5412, 5413);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5414);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5415);
		addExpectedElement(null, 5416);
	}
	
;

parse_org_emftext_language_xpath3_NameAttributeTest returns [org.emftext.language.xpath3.NameAttributeTest element = null]
@init{
}
:
	a0 = 'attribute' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameAttributeTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_58_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5417);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameAttributeTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_58_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5418, 5419);
	}
	
	(
		(
			a2 = QNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameAttributeTest();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_58_0_0_2_0_0_0, resolved, true);
					copyLocalizationInfos((CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 5420, 5421);
		}
		
		
		|		(
			a3 = NCNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameAttributeTest();
					startIncompleteElement(element);
				}
				if (a3 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_58_0_0_2_0_1_0, resolved, true);
					copyLocalizationInfos((CommonToken) a3, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 5422, 5423);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 5424, 5425);
	}
	
	(
		(
			a4 = ',' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameAttributeTest();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_58_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 5426, 5427);
			}
			
			(
				(
					a5 = QNAME					
					{
						if (terminateParsing) {
							throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
						}
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameAttributeTest();
							startIncompleteElement(element);
						}
						if (a5 != null) {
							org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
							tokenResolver.setOptions(getOptions());
							org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
							tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__TYPE), result);
							Object resolvedObject = result.getResolvedToken();
							if (resolvedObject == null) {
								addErrorToResource(result.getErrorMessage(), ((CommonToken) a5).getLine(), ((CommonToken) a5).getCharPositionInLine(), ((CommonToken) a5).getStartIndex(), ((CommonToken) a5).getStopIndex());
							}
							javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
							if (resolved != null) {
								Object value = resolved;
								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__TYPE), value);
								completedElement(value, false);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_58_0_0_3_0_0_2_0_0_0, resolved, true);
							copyLocalizationInfos((CommonToken) a5, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 5428);
				}
				
				
				|				(
					a6 = NCNAME					
					{
						if (terminateParsing) {
							throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
						}
						if (element == null) {
							element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameAttributeTest();
							startIncompleteElement(element);
						}
						if (a6 != null) {
							org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
							tokenResolver.setOptions(getOptions());
							org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
							tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__TYPE), result);
							Object resolvedObject = result.getResolvedToken();
							if (resolvedObject == null) {
								addErrorToResource(result.getErrorMessage(), ((CommonToken) a6).getLine(), ((CommonToken) a6).getCharPositionInLine(), ((CommonToken) a6).getStartIndex(), ((CommonToken) a6).getStopIndex());
							}
							javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
							if (resolved != null) {
								Object value = resolved;
								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ATTRIBUTE_TEST__TYPE), value);
								completedElement(value, false);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_58_0_0_3_0_0_2_0_1_0, resolved, true);
							copyLocalizationInfos((CommonToken) a6, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 5429);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 5430);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 5431);
	}
	
	a7 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameAttributeTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_58_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5432);
		addExpectedElement(null, 5433, 5438);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5439, 5440);
		addExpectedElement(null, 5441, 5449);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5450, 5452);
		addExpectedElement(null, 5453, 5454);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5455);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5456);
		addExpectedElement(null, 5457);
	}
	
;

parse_org_emftext_language_xpath3_SchemaAttributeTest returns [org.emftext.language.xpath3.SchemaAttributeTest element = null]
@init{
}
:
	a0 = 'schema-attribute' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createSchemaAttributeTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_59_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5458);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createSchemaAttributeTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_59_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5459, 5460);
	}
	
	(
		(
			a2 = QNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createSchemaAttributeTest();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ATTRIBUTE_TEST__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ATTRIBUTE_TEST__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_59_0_0_2_0_0_0, resolved, true);
					copyLocalizationInfos((CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 5461);
		}
		
		
		|		(
			a3 = NCNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createSchemaAttributeTest();
					startIncompleteElement(element);
				}
				if (a3 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ATTRIBUTE_TEST__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ATTRIBUTE_TEST__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_59_0_0_2_0_1_0, resolved, true);
					copyLocalizationInfos((CommonToken) a3, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 5462);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 5463);
	}
	
	a4 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createSchemaAttributeTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_59_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5464);
		addExpectedElement(null, 5465, 5470);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5471, 5472);
		addExpectedElement(null, 5473, 5481);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5482, 5484);
		addExpectedElement(null, 5485, 5486);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5487);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5488);
		addExpectedElement(null, 5489);
	}
	
;

parse_org_emftext_language_xpath3_ElementTest returns [org.emftext.language.xpath3.ElementTest element = null]
@init{
}
:
	a0 = 'element' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createElementTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_60_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5490);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createElementTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_60_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5491);
	}
	
	a2 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createElementTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_60_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5492);
		addExpectedElement(null, 5493, 5498);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5499, 5500);
		addExpectedElement(null, 5501, 5509);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5510, 5512);
		addExpectedElement(null, 5513, 5514);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5515);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5516);
		addExpectedElement(null, 5517, 5518);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_emftext_language_xpath3_WildcardElementTest{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_xpath3_NameElementTest{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_xpath3_WildcardElementTest returns [org.emftext.language.xpath3.WildcardElementTest element = null]
@init{
}
:
	a0 = 'element' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createWildcardElementTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_61_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5519);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createWildcardElementTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_61_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5520);
	}
	
	a2 = '*' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createWildcardElementTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_61_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5521, 5522);
	}
	
	(
		(
			a3 = ',' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createWildcardElementTest();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_61_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getWildcardElementTest(), 5523, 5524);
			}
			
			(
				a4_0 = parse_org_emftext_language_xpath3_OptionalAtomicType				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createWildcardElementTest();
						startIncompleteElement(element);
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							Object value = a4_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.WILDCARD_ELEMENT_TEST__TYPE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_61_0_0_3_0_0_2, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 5525);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 5526);
	}
	
	a5 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createWildcardElementTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_61_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5527);
		addExpectedElement(null, 5528, 5533);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5534, 5535);
		addExpectedElement(null, 5536, 5544);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5545, 5547);
		addExpectedElement(null, 5548, 5549);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5550);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5551);
		addExpectedElement(null, 5552, 5553);
	}
	
;

parse_org_emftext_language_xpath3_NameElementTest returns [org.emftext.language.xpath3.NameElementTest element = null]
@init{
}
:
	a0 = 'element' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameElementTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_62_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5554);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameElementTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_62_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5555, 5556);
	}
	
	(
		(
			a2 = QNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameElementTest();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_62_0_0_2_0_0_0, resolved, true);
					copyLocalizationInfos((CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 5557, 5558);
		}
		
		
		|		(
			a3 = NCNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameElementTest();
					startIncompleteElement(element);
				}
				if (a3 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_62_0_0_2_0_1_0, resolved, true);
					copyLocalizationInfos((CommonToken) a3, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 5559, 5560);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 5561, 5562);
	}
	
	(
		(
			a4 = ',' {
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameElementTest();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_62_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getNameElementTest(), 5563, 5564);
			}
			
			(
				a5_0 = parse_org_emftext_language_xpath3_OptionalAtomicType				{
					if (terminateParsing) {
						throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameElementTest();
						startIncompleteElement(element);
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							Object value = a5_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.NAME_ELEMENT_TEST__TYPE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_62_0_0_3_0_0_2, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 5565);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 5566);
	}
	
	a6 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createNameElementTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_62_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5567);
		addExpectedElement(null, 5568, 5573);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5574, 5575);
		addExpectedElement(null, 5576, 5584);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5585, 5587);
		addExpectedElement(null, 5588, 5589);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5590);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5591);
		addExpectedElement(null, 5592, 5593);
	}
	
;

parse_org_emftext_language_xpath3_SchemaElementTest returns [org.emftext.language.xpath3.SchemaElementTest element = null]
@init{
}
:
	a0 = 'schema-element' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createSchemaElementTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_63_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5594);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createSchemaElementTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_63_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 5595, 5596);
	}
	
	(
		(
			a2 = QNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createSchemaElementTest();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ELEMENT_TEST__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ELEMENT_TEST__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_63_0_0_2_0_0_0, resolved, true);
					copyLocalizationInfos((CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 5597);
		}
		
		
		|		(
			a3 = NCNAME			
			{
				if (terminateParsing) {
					throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createSchemaElementTest();
					startIncompleteElement(element);
				}
				if (a3 != null) {
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NCNAME");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ELEMENT_TEST__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
					}
					javax.xml.namespace.QName resolved = (javax.xml.namespace.QName) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.SCHEMA_ELEMENT_TEST__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_63_0_0_2_0_1_0, resolved, true);
					copyLocalizationInfos((CommonToken) a3, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 5598);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 5599);
	}
	
	a4 = ')' {
		if (element == null) {
			element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createSchemaElementTest();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_63_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralForwardStep(), 5600);
		addExpectedElement(null, 5601, 5606);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5607, 5608);
		addExpectedElement(null, 5609, 5617);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5618, 5620);
		addExpectedElement(null, 5621, 5622);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getAbbrevForwardStep(), 5623);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getGeneralReverseStep(), 5624);
		addExpectedElement(null, 5625, 5626);
	}
	
;

parse_org_emftext_language_xpath3_IntegerLiteral returns [org.emftext.language.xpath3.IntegerLiteral element = null]
@init{
}
:
	(
		a0 = INTEGER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createIntegerLiteral();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INTEGER_LITERAL__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.INTEGER_LITERAL__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_64_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 5627, 5632);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(), 5633);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5634, 5635);
		addExpectedElement(null, 5636, 5644);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5645, 5647);
		addExpectedElement(null, 5648, 5649);
	}
	
;

parse_org_emftext_language_xpath3_DecimalLiteral returns [org.emftext.language.xpath3.DecimalLiteral element = null]
@init{
}
:
	(
		a0 = DECIMAL_LITERAL		
		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createDecimalLiteral();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DECIMAL_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DECIMAL_LITERAL__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Float resolved = (java.lang.Float) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DECIMAL_LITERAL__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_65_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 5650, 5655);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(), 5656);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5657, 5658);
		addExpectedElement(null, 5659, 5667);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5668, 5670);
		addExpectedElement(null, 5671, 5672);
	}
	
;

parse_org_emftext_language_xpath3_DoubleLiteral returns [org.emftext.language.xpath3.DoubleLiteral element = null]
@init{
}
:
	(
		a0 = DOUBLE_LITERAL		
		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createDoubleLiteral();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DOUBLE_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DOUBLE_LITERAL__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.DOUBLE_LITERAL__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_66_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 5673, 5678);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(), 5679);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5680, 5681);
		addExpectedElement(null, 5682, 5690);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5691, 5693);
		addExpectedElement(null, 5694, 5695);
	}
	
;

parse_org_emftext_language_xpath3_StringLiteral returns [org.emftext.language.xpath3.StringLiteral element = null]
@init{
}
:
	(
		a0 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.emftext.language.xpath3.resource.xpath3.mopp.Xpath3TerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.xpath3.XPath3Factory.eINSTANCE.createStringLiteral();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.xpath3.resource.xpath3.IXpath3TokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.STRING_LITERAL__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.xpath3.XPath3Package.STRING_LITERAL__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.xpath3.resource.xpath3.grammar.Xpath3GrammarInformationProvider.XPATH3_67_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 5696, 5701);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getFilterExpr(), 5702);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getPathExpr(), 5703, 5704);
		addExpectedElement(null, 5705, 5713);
		addExpectedElement(org.emftext.language.xpath3.XPath3Package.eINSTANCE.getComparisonExpr(), 5714, 5716);
		addExpectedElement(null, 5717, 5718);
	}
	
;

parse_org_emftext_language_xpath3_ExprSingle returns [org.emftext.language.xpath3.ExprSingle element = null]
:
	c0 = parse_org_emftext_language_xpath3_ForExpr{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_xpath3_QuantifiedExpr{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_xpath3_IfExpr{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_emftext_language_xpath3_OrExpr{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_emftext_language_xpath3_AndExpr{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_org_emftext_language_xpath3_ComparisonExpr{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_org_emftext_language_xpath3_RangeExpr{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_org_emftext_language_xpath3_AdditiveExpr{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_org_emftext_language_xpath3_MultiplicativeExpr{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_org_emftext_language_xpath3_UnionExpr{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_org_emftext_language_xpath3_IntersectExceptExpr{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_org_emftext_language_xpath3_InstanceofExpr{ element = c11; /* this is a subclass or primitive expression choice */ }
	|	c12 = parse_org_emftext_language_xpath3_TreatExpr{ element = c12; /* this is a subclass or primitive expression choice */ }
	|	c13 = parse_org_emftext_language_xpath3_CastableExpr{ element = c13; /* this is a subclass or primitive expression choice */ }
	|	c14 = parse_org_emftext_language_xpath3_CastExpr{ element = c14; /* this is a subclass or primitive expression choice */ }
	|	c15 = parse_org_emftext_language_xpath3_UnaryExpr{ element = c15; /* this is a subclass or primitive expression choice */ }
	|	c16 = parse_org_emftext_language_xpath3_FilterExpr{ element = c16; /* this is a subclass or primitive expression choice */ }
	|	c17 = parse_org_emftext_language_xpath3_FunctionCall{ element = c17; /* this is a subclass or primitive expression choice */ }
	|	c18 = parse_org_emftext_language_xpath3_PathExpr{ element = c18; /* this is a subclass or primitive expression choice */ }
	|	c19 = parse_org_emftext_language_xpath3_ChildStepExpr{ element = c19; /* this is a subclass or primitive expression choice */ }
	|	c20 = parse_org_emftext_language_xpath3_DescOrSelfStepExpr{ element = c20; /* this is a subclass or primitive expression choice */ }
	|	c21 = parse_org_emftext_language_xpath3_RootStepExpr{ element = c21; /* this is a subclass or primitive expression choice */ }
	|	c22 = parse_org_emftext_language_xpath3_SelfStepExpr{ element = c22; /* this is a subclass or primitive expression choice */ }
	|	c23 = parse_org_emftext_language_xpath3_GeneralForwardStep{ element = c23; /* this is a subclass or primitive expression choice */ }
	|	c24 = parse_org_emftext_language_xpath3_AbbrevForwardStep{ element = c24; /* this is a subclass or primitive expression choice */ }
	|	c25 = parse_org_emftext_language_xpath3_GeneralReverseStep{ element = c25; /* this is a subclass or primitive expression choice */ }
	|	c26 = parse_org_emftext_language_xpath3_AbbrevReverseStep{ element = c26; /* this is a subclass or primitive expression choice */ }
	|	c27 = parse_org_emftext_language_xpath3_VarRef{ element = c27; /* this is a subclass or primitive expression choice */ }
	|	c28 = parse_org_emftext_language_xpath3_ParenthesizedExpr{ element = c28; /* this is a subclass or primitive expression choice */ }
	|	c29 = parse_org_emftext_language_xpath3_ContextItemExpr{ element = c29; /* this is a subclass or primitive expression choice */ }
	|	c30 = parse_org_emftext_language_xpath3_IntegerLiteral{ element = c30; /* this is a subclass or primitive expression choice */ }
	|	c31 = parse_org_emftext_language_xpath3_DecimalLiteral{ element = c31; /* this is a subclass or primitive expression choice */ }
	|	c32 = parse_org_emftext_language_xpath3_DoubleLiteral{ element = c32; /* this is a subclass or primitive expression choice */ }
	|	c33 = parse_org_emftext_language_xpath3_StringLiteral{ element = c33; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_xpath3_Comp returns [org.emftext.language.xpath3.Comp element = null]
:
	c0 = parse_org_emftext_language_xpath3_GeneralComp{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_xpath3_ValueComp{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_xpath3_NodeComp{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_xpath3_SequenceType returns [org.emftext.language.xpath3.SequenceType element = null]
:
	c0 = parse_org_emftext_language_xpath3_EmptySequenceType{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_xpath3_ItemSequenceType{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_xpath3_ValueExpr returns [org.emftext.language.xpath3.ValueExpr element = null]
:
	c0 = parse_org_emftext_language_xpath3_PathExpr{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_xpath3_PrimaryExpr returns [org.emftext.language.xpath3.PrimaryExpr element = null]
:
	c0 = parse_org_emftext_language_xpath3_FunctionCall{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_xpath3_VarRef{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_xpath3_ParenthesizedExpr{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_emftext_language_xpath3_ContextItemExpr{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_emftext_language_xpath3_IntegerLiteral{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_org_emftext_language_xpath3_DecimalLiteral{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_org_emftext_language_xpath3_DoubleLiteral{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_org_emftext_language_xpath3_StringLiteral{ element = c7; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_xpath3_PathExprChild returns [org.emftext.language.xpath3.PathExprChild element = null]
:
	c0 = parse_org_emftext_language_xpath3_FilterExpr{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_xpath3_FunctionCall{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_xpath3_ChildStepExpr{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_emftext_language_xpath3_DescOrSelfStepExpr{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_emftext_language_xpath3_RootStepExpr{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_org_emftext_language_xpath3_SelfStepExpr{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_org_emftext_language_xpath3_GeneralForwardStep{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_org_emftext_language_xpath3_AbbrevForwardStep{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_org_emftext_language_xpath3_GeneralReverseStep{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_org_emftext_language_xpath3_AbbrevReverseStep{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_org_emftext_language_xpath3_VarRef{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_org_emftext_language_xpath3_ParenthesizedExpr{ element = c11; /* this is a subclass or primitive expression choice */ }
	|	c12 = parse_org_emftext_language_xpath3_ContextItemExpr{ element = c12; /* this is a subclass or primitive expression choice */ }
	|	c13 = parse_org_emftext_language_xpath3_IntegerLiteral{ element = c13; /* this is a subclass or primitive expression choice */ }
	|	c14 = parse_org_emftext_language_xpath3_DecimalLiteral{ element = c14; /* this is a subclass or primitive expression choice */ }
	|	c15 = parse_org_emftext_language_xpath3_DoubleLiteral{ element = c15; /* this is a subclass or primitive expression choice */ }
	|	c16 = parse_org_emftext_language_xpath3_StringLiteral{ element = c16; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_xpath3_StepExpr returns [org.emftext.language.xpath3.StepExpr element = null]
:
	c0 = parse_org_emftext_language_xpath3_FilterExpr{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_xpath3_GeneralForwardStep{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_xpath3_AbbrevForwardStep{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_emftext_language_xpath3_GeneralReverseStep{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_emftext_language_xpath3_AbbrevReverseStep{ element = c4; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_xpath3_SelfStepExprChild returns [org.emftext.language.xpath3.SelfStepExprChild element = null]
:
	c0 = parse_org_emftext_language_xpath3_FilterExpr{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_xpath3_FunctionCall{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_xpath3_GeneralForwardStep{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_emftext_language_xpath3_AbbrevForwardStep{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_emftext_language_xpath3_GeneralReverseStep{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_org_emftext_language_xpath3_AbbrevReverseStep{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_org_emftext_language_xpath3_VarRef{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_org_emftext_language_xpath3_ParenthesizedExpr{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_org_emftext_language_xpath3_ContextItemExpr{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_org_emftext_language_xpath3_IntegerLiteral{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_org_emftext_language_xpath3_DecimalLiteral{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_org_emftext_language_xpath3_DoubleLiteral{ element = c11; /* this is a subclass or primitive expression choice */ }
	|	c12 = parse_org_emftext_language_xpath3_StringLiteral{ element = c12; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_xpath3_NodeTest returns [org.emftext.language.xpath3.NodeTest element = null]
:
	c0 = parse_org_emftext_language_xpath3_NodeKindTest{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_xpath3_QNameTest{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_xpath3_AnyWildcard{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_emftext_language_xpath3_LocalNameWildcard{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_emftext_language_xpath3_NamespaceWildcard{ element = c4; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_xpath3_KindTest returns [org.emftext.language.xpath3.KindTest element = null]
:
	c0 = parse_org_emftext_language_xpath3_AnyKindTest{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_xpath3_DocumentTest{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_xpath3_TextTest{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_emftext_language_xpath3_CommentTest{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_emftext_language_xpath3_PITest{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_org_emftext_language_xpath3_NCNamePITest{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_org_emftext_language_xpath3_StringLiteralPITest{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_org_emftext_language_xpath3_AttributeTest{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_org_emftext_language_xpath3_WildcardAttributeTest{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_org_emftext_language_xpath3_NameAttributeTest{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_org_emftext_language_xpath3_SchemaAttributeTest{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_org_emftext_language_xpath3_ElementTest{ element = c11; /* this is a subclass or primitive expression choice */ }
	|	c12 = parse_org_emftext_language_xpath3_WildcardElementTest{ element = c12; /* this is a subclass or primitive expression choice */ }
	|	c13 = parse_org_emftext_language_xpath3_NameElementTest{ element = c13; /* this is a subclass or primitive expression choice */ }
	|	c14 = parse_org_emftext_language_xpath3_SchemaElementTest{ element = c14; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_xpath3_ItemType returns [org.emftext.language.xpath3.ItemType element = null]
:
	c0 = parse_org_emftext_language_xpath3_ItemKindTest{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_xpath3_AnyItemType{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_xpath3_AtomicItemType{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

INTEGER_LITERAL:
	(('0'..'9')+)
;
DECIMAL_LITERAL:
	(('.'('0'..'9')+)|(('0'..'9')+'.'('0'..'9')*))
;
DOUBLE_LITERAL:
	((('.'('0'..'9')+)|(('0'..'9')+('.'('0'..'9')*)?))('e'|'E')('+'|'-')?('0'..'9')+)
;
QNAME:
	(('A'..'Z'|'_'|'a'..'z'|'\u00C0'..'\u00D6'|'\u00D8'..'\u00F6'|'\u00F8'..'\u02FF'|'\u0370'..'\u037D'|'\u037F'..'\u1FFF'|'\u200C'..'\u200D'|'\u2070'..'\u218F'|'\u2C00'..'\u2FEF'|'\u3001'..'\uD7FF'|'\uF900'..'\uFDCF'|'\uFDF0'..'\uFFFD')('A'..'Z'|'_'|'a'..'z'|'\u00C0'..'\u00D6'|'\u00D8'..'\u00F6'|'\u00F8'..'\u02FF'|'\u0370'..'\u037D'|'\u037F'..'\u1FFF'|'\u200C'..'\u200D'|'\u2070'..'\u218F'|'\u2C00'..'\u2FEF'|'\u3001'..'\uD7FF'|'\uF900'..'\uFDCF'|'\uFDF0'..'\uFFFD'|'-'|'.'|'0'..'9'|'\u00B7'|'\u0300'..'\u036F'|'\u203F'..'\u2040')*':'('A'..'Z'|'_'|'a'..'z'|'\u00C0'..'\u00D6'|'\u00D8'..'\u00F6'|'\u00F8'..'\u02FF'|'\u0370'..'\u037D'|'\u037F'..'\u1FFF'|'\u200C'..'\u200D'|'\u2070'..'\u218F'|'\u2C00'..'\u2FEF'|'\u3001'..'\uD7FF'|'\uF900'..'\uFDCF'|'\uFDF0'..'\uFFFD')('A'..'Z'|'_'|'a'..'z'|'\u00C0'..'\u00D6'|'\u00D8'..'\u00F6'|'\u00F8'..'\u02FF'|'\u0370'..'\u037D'|'\u037F'..'\u1FFF'|'\u200C'..'\u200D'|'\u2070'..'\u218F'|'\u2C00'..'\u2FEF'|'\u3001'..'\uD7FF'|'\uF900'..'\uFDCF'|'\uFDF0'..'\uFFFD'|'-'|'.'|'0'..'9'|'\u00B7'|'\u0300'..'\u036F'|'\u203F'..'\u2040')*)
;
NCNAME:
	(('A'..'Z'|'_'|'a'..'z'|'\u00C0'..'\u00D6'|'\u00D8'..'\u00F6'|'\u00F8'..'\u02FF'|'\u0370'..'\u037D'|'\u037F'..'\u1FFF'|'\u200C'..'\u200D'|'\u2070'..'\u218F'|'\u2C00'..'\u2FEF'|'\u3001'..'\uD7FF'|'\uF900'..'\uFDCF'|'\uFDF0'..'\uFFFD')('A'..'Z'|'_'|'a'..'z'|'\u00C0'..'\u00D6'|'\u00D8'..'\u00F6'|'\u00F8'..'\u02FF'|'\u0370'..'\u037D'|'\u037F'..'\u1FFF'|'\u200C'..'\u200D'|'\u2070'..'\u218F'|'\u2C00'..'\u2FEF'|'\u3001'..'\uD7FF'|'\uF900'..'\uFDCF'|'\uFDF0'..'\uFFFD'|'-'|'.'|'0'..'9'|'\u00B7'|'\u0300'..'\u036F'|'\u203F'..'\u2040')*)
;
STRING_LITERAL:
	(('\"')('\"\"'|~('\"'))*('\"')|('\'')('\'\''|~('\''))*('\''))
;
WHITESPACE:
	((' '|'\t'|'\f'|'\r'|'\n')+)
	{ _channel = 99; }
;

