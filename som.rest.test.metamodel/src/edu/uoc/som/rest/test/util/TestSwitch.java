/**
 */
package edu.uoc.som.rest.test.util;

import edu.uoc.som.rest.test.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.rest.test.TestPackage
 * @generated
 */
public class TestSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TestPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSwitch() {
		if (modelPackage == null) {
			modelPackage = TestPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TestPackage.TEST_SUITE: {
				TestSuite testSuite = (TestSuite)theEObject;
				T result = caseTestSuite(testSuite);
				if (result == null) result = caseNamedElement(testSuite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.TEST_CASE: {
				TestCase testCase = (TestCase)theEObject;
				T result = caseTestCase(testCase);
				if (result == null) result = caseNamedElement(testCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.TEST: {
				Test test = (Test)theEObject;
				T result = caseTest(test);
				if (result == null) result = caseNamedElement(test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.REQUEST: {
				Request request = (Request)theEObject;
				T result = caseRequest(request);
				if (result == null) result = caseTest(request);
				if (result == null) result = caseNamedElement(request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.HEADER_FIELD: {
				HeaderField headerField = (HeaderField)theEObject;
				T result = caseHeaderField(headerField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.COMPLIANCE_ASSERTION: {
				ComplianceAssertion complianceAssertion = (ComplianceAssertion)theEObject;
				T result = caseComplianceAssertion(complianceAssertion);
				if (result == null) result = caseAssertion(complianceAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.PERFORMANCE_ASSERTION: {
				PerformanceAssertion performanceAssertion = (PerformanceAssertion)theEObject;
				T result = casePerformanceAssertion(performanceAssertion);
				if (result == null) result = caseAssertion(performanceAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.RESPONSE_MESSAGE_ASSERTION: {
				ResponseMessageAssertion responseMessageAssertion = (ResponseMessageAssertion)theEObject;
				T result = caseResponseMessageAssertion(responseMessageAssertion);
				if (result == null) result = caseAssertion(responseMessageAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.CONTAINS_ASSERTION: {
				ContainsAssertion containsAssertion = (ContainsAssertion)theEObject;
				T result = caseContainsAssertion(containsAssertion);
				if (result == null) result = caseResponseMessageAssertion(containsAssertion);
				if (result == null) result = caseAssertion(containsAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.EQUALS_ASSERTION: {
				EqualsAssertion equalsAssertion = (EqualsAssertion)theEObject;
				T result = caseEqualsAssertion(equalsAssertion);
				if (result == null) result = caseResponseMessageAssertion(equalsAssertion);
				if (result == null) result = caseAssertion(equalsAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.SCHEMA_COMPLIANCE_ASSERTION: {
				SchemaComplianceAssertion schemaComplianceAssertion = (SchemaComplianceAssertion)theEObject;
				T result = caseSchemaComplianceAssertion(schemaComplianceAssertion);
				if (result == null) result = caseComplianceAssertion(schemaComplianceAssertion);
				if (result == null) result = caseAssertion(schemaComplianceAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.SLA_ASSERTION: {
				SLAAssertion slaAssertion = (SLAAssertion)theEObject;
				T result = caseSLAAssertion(slaAssertion);
				if (result == null) result = casePerformanceAssertion(slaAssertion);
				if (result == null) result = caseAssertion(slaAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.HEADER_ASSERTION: {
				HeaderAssertion headerAssertion = (HeaderAssertion)theEObject;
				T result = caseHeaderAssertion(headerAssertion);
				if (result == null) result = caseAssertion(headerAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.HEADER_EQUALS_ASSERTION: {
				HeaderEqualsAssertion headerEqualsAssertion = (HeaderEqualsAssertion)theEObject;
				T result = caseHeaderEqualsAssertion(headerEqualsAssertion);
				if (result == null) result = caseHeaderAssertion(headerEqualsAssertion);
				if (result == null) result = caseAssertion(headerEqualsAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.HEADER_EXISTS_ASSERTION: {
				HeaderExistsAssertion headerExistsAssertion = (HeaderExistsAssertion)theEObject;
				T result = caseHeaderExistsAssertion(headerExistsAssertion);
				if (result == null) result = caseHeaderAssertion(headerExistsAssertion);
				if (result == null) result = caseAssertion(headerExistsAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.HTTP_STATUS_ASSERTION: {
				HTTPStatusAssertion httpStatusAssertion = (HTTPStatusAssertion)theEObject;
				T result = caseHTTPStatusAssertion(httpStatusAssertion);
				if (result == null) result = caseAssertion(httpStatusAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.INVALID_STATUS_CODES_ASSERTION: {
				InvalidStatusCodesAssertion invalidStatusCodesAssertion = (InvalidStatusCodesAssertion)theEObject;
				T result = caseInvalidStatusCodesAssertion(invalidStatusCodesAssertion);
				if (result == null) result = caseHTTPStatusAssertion(invalidStatusCodesAssertion);
				if (result == null) result = caseAssertion(invalidStatusCodesAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.VALID_STATUS_CODES_ASSERTION: {
				ValidStatusCodesAssertion validStatusCodesAssertion = (ValidStatusCodesAssertion)theEObject;
				T result = caseValidStatusCodesAssertion(validStatusCodesAssertion);
				if (result == null) result = caseHTTPStatusAssertion(validStatusCodesAssertion);
				if (result == null) result = caseAssertion(validStatusCodesAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.OPEN_API_COMPLIANCE_ASSERTION: {
				OpenAPIComplianceAssertion openAPIComplianceAssertion = (OpenAPIComplianceAssertion)theEObject;
				T result = caseOpenAPIComplianceAssertion(openAPIComplianceAssertion);
				if (result == null) result = caseComplianceAssertion(openAPIComplianceAssertion);
				if (result == null) result = caseAssertion(openAPIComplianceAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.AUTHORIZATION: {
				Authorization authorization = (Authorization)theEObject;
				T result = caseAuthorization(authorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.BASIC: {
				Basic basic = (Basic)theEObject;
				T result = caseBasic(basic);
				if (result == null) result = caseAuthorization(basic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.OAUTH2: {
				OAuth2 oAuth2 = (OAuth2)theEObject;
				T result = caseOAuth2(oAuth2);
				if (result == null) result = caseAuthorization(oAuth2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestSuite(TestSuite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestCase(TestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTest(Test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequest(Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderField(HeaderField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compliance Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compliance Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplianceAssertion(ComplianceAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceAssertion(PerformanceAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Message Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Message Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseMessageAssertion(ResponseMessageAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contains Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainsAssertion(ContainsAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equals Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equals Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualsAssertion(EqualsAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Compliance Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Compliance Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaComplianceAssertion(SchemaComplianceAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SLA Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SLA Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSLAAssertion(SLAAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderAssertion(HeaderAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Equals Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Equals Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderEqualsAssertion(HeaderEqualsAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Exists Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Exists Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderExistsAssertion(HeaderExistsAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Status Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Status Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPStatusAssertion(HTTPStatusAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Status Codes Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Status Codes Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidStatusCodesAssertion(InvalidStatusCodesAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Status Codes Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Status Codes Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidStatusCodesAssertion(ValidStatusCodesAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open API Compliance Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open API Compliance Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenAPIComplianceAssertion(OpenAPIComplianceAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorization(Authorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasic(Basic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OAuth2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OAuth2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOAuth2(OAuth2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TestSwitch
