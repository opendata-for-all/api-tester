/**
 */
package som.rest.test.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import som.rest.test.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see som.rest.test.TestPackage
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
			public Adapter caseTestStep(TestStep object) {
				return createTestStepAdapter();
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
			public Adapter caseHeader(Header object) {
				return createHeaderAdapter();
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
			public Adapter caseBody(Body object) {
				return createBodyAdapter();
			}
			@Override
			public Adapter casePropertyTransfer(PropertyTransfer object) {
				return createPropertyTransferAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseHeaderProperty(HeaderProperty object) {
				return createHeaderPropertyAdapter();
			}
			@Override
			public Adapter caseParameterProperty(ParameterProperty object) {
				return createParameterPropertyAdapter();
			}
			@Override
			public Adapter caseResponseProperty(ResponseProperty object) {
				return createResponsePropertyAdapter();
			}
			@Override
			public Adapter caseBodyProperty(BodyProperty object) {
				return createBodyPropertyAdapter();
			}
			@Override
			public Adapter caseComplexProperty(ComplexProperty object) {
				return createComplexPropertyAdapter();
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
	 * Creates a new adapter for an object of class '{@link som.rest.test.TestSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.TestSuite
	 * @generated
	 */
	public Adapter createTestSuiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.TestCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.TestCase
	 * @generated
	 */
	public Adapter createTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.TestStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.TestStep
	 * @generated
	 */
	public Adapter createTestStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.ComplianceAssertion <em>Compliance Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.ComplianceAssertion
	 * @generated
	 */
	public Adapter createComplianceAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.PerformanceAssertion <em>Performance Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.PerformanceAssertion
	 * @generated
	 */
	public Adapter createPerformanceAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.ResponseMessageAssertion <em>Response Message Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.ResponseMessageAssertion
	 * @generated
	 */
	public Adapter createResponseMessageAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.ContainsAssertion <em>Contains Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.ContainsAssertion
	 * @generated
	 */
	public Adapter createContainsAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.EqualsAssertion <em>Equals Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.EqualsAssertion
	 * @generated
	 */
	public Adapter createEqualsAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.SchemaComplianceAssertion <em>Schema Compliance Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.SchemaComplianceAssertion
	 * @generated
	 */
	public Adapter createSchemaComplianceAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.SLAAssertion <em>SLA Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.SLAAssertion
	 * @generated
	 */
	public Adapter createSLAAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.HeaderAssertion <em>Header Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.HeaderAssertion
	 * @generated
	 */
	public Adapter createHeaderAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.HeaderEqualsAssertion <em>Header Equals Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.HeaderEqualsAssertion
	 * @generated
	 */
	public Adapter createHeaderEqualsAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.HeaderExistsAssertion <em>Header Exists Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.HeaderExistsAssertion
	 * @generated
	 */
	public Adapter createHeaderExistsAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.HTTPStatusAssertion <em>HTTP Status Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.HTTPStatusAssertion
	 * @generated
	 */
	public Adapter createHTTPStatusAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.InvalidStatusCodesAssertion <em>Invalid Status Codes Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.InvalidStatusCodesAssertion
	 * @generated
	 */
	public Adapter createInvalidStatusCodesAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.ValidStatusCodesAssertion <em>Valid Status Codes Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.ValidStatusCodesAssertion
	 * @generated
	 */
	public Adapter createValidStatusCodesAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.OpenAPIComplianceAssertion <em>Open API Compliance Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.OpenAPIComplianceAssertion
	 * @generated
	 */
	public Adapter createOpenAPIComplianceAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.Authorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.Authorization
	 * @generated
	 */
	public Adapter createAuthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.Basic
	 * @generated
	 */
	public Adapter createBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.OAuth2 <em>OAuth2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.OAuth2
	 * @generated
	 */
	public Adapter createOAuth2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.Body
	 * @generated
	 */
	public Adapter createBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.PropertyTransfer <em>Property Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.PropertyTransfer
	 * @generated
	 */
	public Adapter createPropertyTransferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.HeaderProperty <em>Header Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.HeaderProperty
	 * @generated
	 */
	public Adapter createHeaderPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.ParameterProperty <em>Parameter Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.ParameterProperty
	 * @generated
	 */
	public Adapter createParameterPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.ResponseProperty <em>Response Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.ResponseProperty
	 * @generated
	 */
	public Adapter createResponsePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.BodyProperty <em>Body Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.BodyProperty
	 * @generated
	 */
	public Adapter createBodyPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link som.rest.test.ComplexProperty <em>Complex Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see som.rest.test.ComplexProperty
	 * @generated
	 */
	public Adapter createComplexPropertyAdapter() {
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
