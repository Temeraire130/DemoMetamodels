/**
 */
package edu.kit.ipd.sdq.metamodels.confidentiality4cbse.information.provider;

import edu.kit.ipd.sdq.metamodels.confidentiality4cbse.information.util.InformationAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InformationItemProviderAdapterFactory extends InformationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.metamodels.confidentiality4cbse.information.ParameterInformation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterInformationItemProvider parameterInformationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.metamodels.confidentiality4cbse.information.ParameterInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterInformationAdapter()
	{
		if (parameterInformationItemProvider == null)
		{
			parameterInformationItemProvider = new ParameterInformationItemProvider(this);
		}

		return parameterInformationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.metamodels.confidentiality4cbse.information.SizeOfInformation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SizeOfInformationItemProvider sizeOfInformationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.metamodels.confidentiality4cbse.information.SizeOfInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSizeOfInformationAdapter()
	{
		if (sizeOfInformationItemProvider == null)
		{
			sizeOfInformationItemProvider = new SizeOfInformationItemProvider(this);
		}

		return sizeOfInformationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.metamodels.confidentiality4cbse.information.ReturnValueInformation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnValueInformationItemProvider returnValueInformationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.metamodels.confidentiality4cbse.information.ReturnValueInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReturnValueInformationAdapter()
	{
		if (returnValueInformationItemProvider == null)
		{
			returnValueInformationItemProvider = new ReturnValueInformationItemProvider(this);
		}

		return returnValueInformationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.metamodels.confidentiality4cbse.information.CallInformation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallInformationItemProvider callInformationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.metamodels.confidentiality4cbse.information.CallInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallInformationAdapter()
	{
		if (callInformationItemProvider == null)
		{
			callInformationItemProvider = new CallInformationItemProvider(this);
		}

		return callInformationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.metamodels.confidentiality4cbse.information.AllInformation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllInformationItemProvider allInformationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.metamodels.confidentiality4cbse.information.AllInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllInformationAdapter()
	{
		if (allInformationItemProvider == null)
		{
			allInformationItemProvider = new AllInformationItemProvider(this);
		}

		return allInformationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory()
	{
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
	{
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type)
	{
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type)
	{
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type)
	{
		if (isFactoryForType(type))
		{
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
			{
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification)
	{
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null)
		{
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose()
	{
		if (parameterInformationItemProvider != null) parameterInformationItemProvider.dispose();
		if (sizeOfInformationItemProvider != null) sizeOfInformationItemProvider.dispose();
		if (returnValueInformationItemProvider != null) returnValueInformationItemProvider.dispose();
		if (callInformationItemProvider != null) callInformationItemProvider.dispose();
		if (allInformationItemProvider != null) allInformationItemProvider.dispose();
	}

}
