/**
 */
package test.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import test.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see test.TestPackage
 * @generated
 */
public class TestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TestPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSwitch<Adapter> modelSwitch =
		new TestSwitch<Adapter>() {
			@Override
			public Adapter caseTestSuite(TestSuite object) {
				return createTestSuiteAdapter();
			}
			@Override
			public Adapter caseTestCase(TestCase object) {
				return createTestCaseAdapter();
			}
			@Override
			public Adapter caseTest(Test object) {
				return createTestAdapter();
			}
			@Override
			public Adapter caseRequest(Request object) {
				return createRequestAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseHeaderField(HeaderField object) {
				return createHeaderFieldAdapter();
			}
			@Override
			public Adapter caseAssertion(Assertion object) {
				return createAssertionAdapter();
			}
			@Override
			public Adapter caseComplianceAssertion(ComplianceAssertion object) {
				return createComplianceAssertionAdapter();
			}
			@Override
			public Adapter casePerformanceAssertion(PerformanceAssertion object) {
				return createPerformanceAssertionAdapter();
			}
			@Override
			public Adapter caseResponseMessageAssertion(ResponseMessageAssertion object) {
				return createResponseMessageAssertionAdapter();
			}
			@Override
			public Adapter caseContainsAssertion(ContainsAssertion object) {
				return createContainsAssertionAdapter();
			}
			@Override
			public Adapter caseEqualsAssertion(EqualsAssertion object) {
				return createEqualsAssertionAdapter();
			}
			@Override
			public Adapter caseSchemaComplianceAssertion(SchemaComplianceAssertion object) {
				return createSchemaComplianceAssertionAdapter();
			}
			@Override
			public Adapter caseSLAAssertion(SLAAssertion object) {
				return createSLAAssertionAdapter();
			}
			@Override
			public Adapter caseHeaderAssertion(HeaderAssertion object) {
				return createHeaderAssertionAdapter();
			}
			@Override
			public Adapter caseHeaderEqualsAssertion(HeaderEqualsAssertion object) {
				return createHeaderEqualsAssertionAdapter();
			}
			@Override
			public Adapter caseHeaderExistsAssertion(HeaderExistsAssertion object) {
				return createHeaderExistsAssertionAdapter();
			}
			@Override
			public Adapter caseHTTPStatusAssertion(HTTPStatusAssertion object) {
				return createHTTPStatusAssertionAdapter();
			}
			@Override
			public Adapter caseInvalidStatusCodesAssertion(InvalidStatusCodesAssertion object) {
				return createInvalidStatusCodesAssertionAdapter();
			}
			@Override
			public Adapter caseValidStatusCodesAssertion(ValidStatusCodesAssertion object) {
				return createValidStatusCodesAssertionAdapter();
			}
			@Override
			public Adapter caseOpenAPIComplianceAssertion(OpenAPIComplianceAssertion object) {
				return createOpenAPIComplianceAssertionAdapter();
			}
			@Override
			public Adapter caseAuthorization(Authorization object) {
				return createAuthorizationAdapter();
			}
			@Override
			public Adapter caseBasic(Basic object) {
				return createBasicAdapter();
			}
			@Override
			public Adapter caseOAuth2(OAuth2 object) {
				return createOAuth2Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link test.TestSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.TestSuite
	 * @generated
	 */
	public Adapter createTestSuiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.TestCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.TestCase
	 * @generated
	 */
	public Adapter createTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.HeaderField <em>Header Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.HeaderField
	 * @generated
	 */
	public Adapter createHeaderFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.ComplianceAssertion <em>Compliance Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.ComplianceAssertion
	 * @generated
	 */
	public Adapter createComplianceAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.PerformanceAssertion <em>Performance Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.PerformanceAssertion
	 * @generated
	 */
	public Adapter createPerformanceAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.ResponseMessageAssertion <em>Response Message Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.ResponseMessageAssertion
	 * @generated
	 */
	public Adapter createResponseMessageAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.ContainsAssertion <em>Contains Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.ContainsAssertion
	 * @generated
	 */
	public Adapter createContainsAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.EqualsAssertion <em>Equals Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.EqualsAssertion
	 * @generated
	 */
	public Adapter createEqualsAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.SchemaComplianceAssertion <em>Schema Compliance Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.SchemaComplianceAssertion
	 * @generated
	 */
	public Adapter createSchemaComplianceAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.SLAAssertion <em>SLA Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.SLAAssertion
	 * @generated
	 */
	public Adapter createSLAAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.HeaderAssertion <em>Header Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.HeaderAssertion
	 * @generated
	 */
	public Adapter createHeaderAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.HeaderEqualsAssertion <em>Header Equals Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.HeaderEqualsAssertion
	 * @generated
	 */
	public Adapter createHeaderEqualsAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.HeaderExistsAssertion <em>Header Exists Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.HeaderExistsAssertion
	 * @generated
	 */
	public Adapter createHeaderExistsAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.HTTPStatusAssertion <em>HTTP Status Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.HTTPStatusAssertion
	 * @generated
	 */
	public Adapter createHTTPStatusAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.InvalidStatusCodesAssertion <em>Invalid Status Codes Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.InvalidStatusCodesAssertion
	 * @generated
	 */
	public Adapter createInvalidStatusCodesAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.ValidStatusCodesAssertion <em>Valid Status Codes Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.ValidStatusCodesAssertion
	 * @generated
	 */
	public Adapter createValidStatusCodesAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.OpenAPIComplianceAssertion <em>Open API Compliance Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.OpenAPIComplianceAssertion
	 * @generated
	 */
	public Adapter createOpenAPIComplianceAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.Authorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.Authorization
	 * @generated
	 */
	public Adapter createAuthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.Basic
	 * @generated
	 */
	public Adapter createBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.OAuth2 <em>OAuth2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.OAuth2
	 * @generated
	 */
	public Adapter createOAuth2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TestAdapterFactory
